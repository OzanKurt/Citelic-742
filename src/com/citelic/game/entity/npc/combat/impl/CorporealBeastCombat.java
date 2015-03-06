package com.citelic.game.entity.npc.combat.impl;

import java.util.ArrayList;

import com.citelic.game.engine.Engine;
import com.citelic.game.engine.task.EngineTask;
import com.citelic.game.engine.task.EngineTaskManager;
import com.citelic.game.entity.Animation;
import com.citelic.game.entity.Entity;
import com.citelic.game.entity.Graphics;
import com.citelic.game.entity.npc.NPC;
import com.citelic.game.entity.npc.combat.CombatScript;
import com.citelic.game.entity.npc.combat.NPCCombatDefinitions;
import com.citelic.game.entity.npc.impl.corp.CorporealBeast;
import com.citelic.game.entity.player.Player;
import com.citelic.game.entity.player.content.actions.skills.Skills;
import com.citelic.game.map.tile.Tile;
import com.citelic.utility.Utilities;

public class CorporealBeastCombat extends CombatScript {

	@Override
	public int attack(final NPC npc, final Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		if (Utilities.getRandom(40) == 0) {
			CorporealBeast beast = (CorporealBeast) npc;
			beast.spawnDarkEnergyCore();
		}
		int size = npc.getSize();
		final ArrayList<Entity> possibleTargets = npc.getPossibleTargets();
		boolean stomp = false;
		for (Entity t : possibleTargets) {
			int distanceX = t.getX() - npc.getX();
			int distanceY = t.getY() - npc.getY();
			if (distanceX < size && distanceX > -1 && distanceY < size
					&& distanceY > -1) {
				stomp = true;
				delayHit(
						npc,
						0,
						t,
						getRegularHit(
								npc,
								getRandomMaxHit(npc, defs.getMaxHit(),
										NPCCombatDefinitions.MELEE, t)));
			}
		}
		if (stomp) {
			npc.setNextAnimation(new Animation(10496));
			npc.setNextGraphics(new Graphics(1834));
			return defs.getAttackDelay();
		}
		int attackStyle = Utilities.getRandom(4);
		if (attackStyle == 0 || attackStyle == 1) { // melee
			int distanceX = target.getX() - npc.getX();
			int distanceY = target.getY() - npc.getY();
			if (distanceX > size || distanceX < -1 || distanceY > size
					|| distanceY < -1)
				attackStyle = 2 + Utilities.getRandom(2); // set mage
			else {
				npc.setNextAnimation(new Animation(attackStyle == 0 ? defs
						.getAttackEmote() : 10058));
				delayHit(
						npc,
						0,
						target,
						getMeleeHit(
								npc,
								getRandomMaxHit(npc, defs.getMaxHit(),
										NPCCombatDefinitions.MELEE, target)));
				return defs.getAttackDelay();
			}
		}
		if (attackStyle == 2) { // powerfull mage spiky ball
			npc.setNextAnimation(new Animation(10410));
			delayHit(
					npc,
					1,
					target,
					getMagicHit(
							npc,
							getRandomMaxHit(npc, 650,
									NPCCombatDefinitions.MAGE, target)));
			Engine.sendProjectile(npc, target, 1825, 41, 16, 41, 0, 16, 0);
		} else if (attackStyle == 3) { // translucent ball of energy
			npc.setNextAnimation(new Animation(10410));
			delayHit(
					npc,
					1,
					target,
					getMagicHit(
							npc,
							getRandomMaxHit(npc, 550,
									NPCCombatDefinitions.MAGE, target)));
			if (target instanceof Player) {
				EngineTaskManager.schedule(new EngineTask() {
					@Override
					public void run() {
						int skill = Utilities.getRandom(2);
						skill = skill == 0 ? Skills.MAGIC
								: (skill == 1 ? Skills.SUMMONING
										: Skills.PRAYER);
						Player player = (Player) target;
						if (skill == Skills.PRAYER)
							player.getPrayer().drainPrayer(
									10 + Utilities.getRandom(40));
						else {
							int lvl = player.getSkills().getLevel(skill);
							lvl -= 1 + Utilities.getRandom(4);
							player.getSkills().set(skill, lvl < 0 ? 0 : lvl);
						}
						player.getPackets().sendGameMessage(
								"Your " + Skills.SKILL_NAME[skill]
										+ " has been slighly drained!");
					}

				}, 1);
				Engine.sendProjectile(npc, target, 1823, 41, 16, 41, 0, 16, 0);
			}
		} else if (attackStyle == 4) {
			npc.setNextAnimation(new Animation(10410));
			final Tile tile = new Tile(target);
			Engine.sendProjectile(npc, tile, 1824, 41, 16, 30, 0, 16, 0);
			EngineTaskManager.schedule(new EngineTask() {
				@Override
				public void run() {
					for (int i = 0; i < 6; i++) {
						final Tile newTile = new Tile(tile, 3);
						if (!Engine.canMoveNPC(newTile.getZ(), newTile.getX(),
								newTile.getY(), 1))
							continue;
						Engine.sendProjectile(npc, tile, newTile, 1824, 0, 0,
								25, 0, 30, 0);
						for (Entity t : possibleTargets) {
							if (Utilities.getDistance(newTile.getX(),
									newTile.getY(), t.getX(), t.getY()) > 1
									|| !t.clipedProjectile(newTile, false))
								continue;
							delayHit(
									npc,
									0,
									t,
									getMagicHit(
											npc,
											getRandomMaxHit(npc, 350,
													NPCCombatDefinitions.MAGE,
													t)));
						}
						EngineTaskManager.schedule(new EngineTask() {
							@Override
							public void run() {
								Engine.sendGraphics(npc, new Graphics(1806),
										newTile);
							}

						});
					}
				}
			}, 1);
		}
		return defs.getAttackDelay();
	}

	@Override
	public Object[] getKeys() {
		return new Object[] { 8133 };
	}
}
