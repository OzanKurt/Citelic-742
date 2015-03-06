package com.citelic.game.entity.npc.combat.impl;

import com.citelic.game.engine.Engine;
import com.citelic.game.entity.Animation;
import com.citelic.game.entity.Entity;
import com.citelic.game.entity.Graphics;
import com.citelic.game.entity.npc.NPC;
import com.citelic.game.entity.npc.combat.CombatScript;
import com.citelic.game.entity.npc.combat.NPCCombatDefinitions;
import com.citelic.game.entity.player.Player;
import com.citelic.game.entity.player.content.actions.skills.slayer.Slayer;
import com.citelic.utility.Utilities;

public class CockatriceCombat extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { 1620 };
    }

    @Override
    public int attack(NPC npc, final Entity target) {
	NPCCombatDefinitions def = npc.getCombatDefinitions();
	if (!Slayer.hasReflectiveEquipment(target)) {
	    Player targetPlayer = (Player) target;
	    int randomSkill = Utilities.random(0, 6);
	    int currentLevel = targetPlayer.getSkills().getLevel(randomSkill);
	    targetPlayer.getSkills().set(randomSkill, currentLevel < 3 ? 0 : currentLevel / 4);
	    delayHit(npc, 1, target, getMagicHit(npc, targetPlayer.getMaxHitpoints() / 10));
	    npc.setNextAnimation(new Animation(7766));
	    npc.setNextGraphics(new Graphics(1467));
	    Engine.sendProjectile(npc, target, 1468, 34, 16, 30, 35, 16, 0);
	} else
	    delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, npc.getMaxHit(), def.getAttackStyle(), target)));
	npc.setNextAnimation(new Animation(def.getAttackEmote()));
	return def.getAttackDelay();
    }
}
