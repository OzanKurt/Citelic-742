package com.citelic.game.entity.npc.combat.impl;

import java.util.Random;

import com.citelic.game.entity.Animation;
import com.citelic.game.entity.Entity;
import com.citelic.game.entity.npc.NPC;
import com.citelic.game.entity.npc.combat.CombatScript;
import com.citelic.game.entity.npc.combat.NPCCombatDefinitions;
import com.citelic.game.entity.player.Player;

public class WolverineCombat extends CombatScript {

	@Override
	public int attack(final NPC npc, final Entity target) {
		final NPCCombatDefinitions defs = npc.getCombatDefinitions();
		final Player player = (Player) target;
		npc.setNextAnimation(new Animation(10961));
		int damage = player.getSkills().getCombatLevel() / 3
				+ new Random().nextInt(20) + 40;
		int dclaw1 = damage / 2;
		int dclaw2 = damage / 3;
		int dclaw3 = damage / 3;
		delayHit(npc, 2, target, getMeleeHit(npc, damage));
		delayHit(npc, 2, target, getMeleeHit(npc, dclaw1));
		delayHit(npc, 2, target, getMeleeHit(npc, dclaw2 / 10));
		delayHit(npc, 2, target, getMeleeHit(npc, dclaw3 / 10));
		return defs.getAttackDelay();
	}

	@Override
	public Object[] getKeys() {
		return new Object[] { 14899 };
	}
}