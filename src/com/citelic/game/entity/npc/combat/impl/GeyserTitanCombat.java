package com.citelic.game.entity.npc.combat.impl;

import com.citelic.game.engine.Engine;
import com.citelic.game.entity.Animation;
import com.citelic.game.entity.Entity;
import com.citelic.game.entity.Graphics;
import com.citelic.game.entity.npc.NPC;
import com.citelic.game.entity.npc.combat.CombatScript;
import com.citelic.game.entity.npc.combat.NPCCombatDefinitions;
import com.citelic.game.entity.npc.impl.familiar.Familiar;
import com.citelic.utility.Utilities;

public class GeyserTitanCombat extends CombatScript {

	@Override
	public int attack(NPC npc, Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		int distanceX = target.getX() - npc.getX();
		int distanceY = target.getY() - npc.getY();
		boolean distant = false;
		int size = npc.getSize();
		Familiar familiar = (Familiar) npc;
		boolean usingSpecial = familiar.hasSpecialOn();
		int damage = 0;
		if (distanceX > size || distanceX < -1 || distanceY > size
				|| distanceY < -1)
			distant = true;
		if (usingSpecial) {// priority over regular attack
			npc.setNextAnimation(new Animation(7883));
			npc.setNextGraphics(new Graphics(1373));
			if (distant) {// range hit
				if (Utilities.getRandom(2) == 0)
					delayHit(
							npc,
							1,
							target,
							getRangeHit(
									npc,
									getRandomMaxHit(npc, 300,
											NPCCombatDefinitions.RANGE, target)));
				else
					delayHit(
							npc,
							1,
							target,
							getMagicHit(
									npc,
									getRandomMaxHit(npc, 300,
											NPCCombatDefinitions.MAGE, target)));
			} else {// melee hit
				delayHit(
						npc,
						1,
						target,
						getMeleeHit(
								npc,
								getRandomMaxHit(npc, 300,
										NPCCombatDefinitions.MELEE, target)));
			}
			Engine.sendProjectile(npc, target, 1376, 34, 16, 30, 35, 16, 0);
		} else {
			if (distant) {// range
				damage = getRandomMaxHit(npc, 244, NPCCombatDefinitions.RANGE,
						target);
				npc.setNextAnimation(new Animation(7883));
				npc.setNextGraphics(new Graphics(1375));
				Engine.sendProjectile(npc, target, 1374, 34, 16, 30, 35, 16, 0);
				delayHit(npc, 2, target, getRangeHit(npc, damage));
			} else {// melee
				damage = getRandomMaxHit(npc, 244, NPCCombatDefinitions.MELEE,
						target);
				npc.setNextAnimation(new Animation(7879));
				delayHit(npc, 1, target, getMeleeHit(npc, damage));
			}
		}
		return defs.getAttackDelay();
	}

	@Override
	public Object[] getKeys() {
		return new Object[] { 7340, 7339 };
	}
}
