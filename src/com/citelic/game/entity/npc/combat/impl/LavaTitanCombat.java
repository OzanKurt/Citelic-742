package com.citelic.game.entity.npc.combat.impl;

import com.citelic.game.entity.Animation;
import com.citelic.game.entity.Entity;
import com.citelic.game.entity.Graphics;
import com.citelic.game.entity.npc.NPC;
import com.citelic.game.entity.npc.combat.CombatScript;
import com.citelic.game.entity.npc.combat.NPCCombatDefinitions;
import com.citelic.game.entity.npc.impl.familiar.Familiar;
import com.citelic.game.entity.player.Player;
import com.citelic.utility.Utilities;

public class LavaTitanCombat extends CombatScript {

	@Override
	public int attack(NPC npc, Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		Familiar familiar = (Familiar) npc;
		boolean usingSpecial = familiar.hasSpecialOn();
		int damage = 0;
		if (usingSpecial) {// priority over regular attack
			npc.setNextAnimation(new Animation(7883));
			npc.setNextGraphics(new Graphics(1491));
			delayHit(
					npc,
					1,
					target,
					getMeleeHit(
							npc,
							getRandomMaxHit(npc, 140,
									NPCCombatDefinitions.MELEE, target)));
			if (damage <= 4 && target instanceof Player) {
				Player player = (Player) target;
				player.getCombatDefinitions().desecreaseSpecialAttack(
						(player.getCombatDefinitions()
								.getSpecialAttackPercentage() / 10));
			}
		} else {
			damage = getRandomMaxHit(npc, 140, NPCCombatDefinitions.MELEE,
					target);
			npc.setNextAnimation(new Animation(7980));
			npc.setNextGraphics(new Graphics(1490));
			delayHit(npc, 1, target, getMeleeHit(npc, damage));
		}
		if (Utilities.getRandom(10) == 0)// 1/10 chance of happening
			delayHit(npc, 1, target, getMeleeHit(npc, Utilities.getRandom(50)));
		return defs.getAttackDelay();
	}

	@Override
	public Object[] getKeys() {
		return new Object[] { 7342, 7341 };
	}
}
