package com.citelic.game.entity.npc.combat.impl;

import com.citelic.game.engine.Engine;
import com.citelic.game.entity.Animation;
import com.citelic.game.entity.Entity;
import com.citelic.game.entity.npc.NPC;
import com.citelic.game.entity.npc.combat.CombatScript;
import com.citelic.game.entity.npc.combat.NPCCombatDefinitions;
import com.citelic.game.entity.player.Player;
import com.citelic.game.entity.player.content.actions.skills.slayer.Slayer;
import com.citelic.utility.Utilities;

public class AberrantSpectre extends CombatScript {

    @Override
    public Object[] getKeys() {
	return new Object[] { "Aberrant spectre" };
    }

    @Override
    public int attack(NPC npc, Entity target) {
	NPCCombatDefinitions def = npc.getCombatDefinitions();
	if (!Slayer.hasNosepeg(target)) {
	    Player targetPlayer = (Player) target;
	    if (!targetPlayer.getPrayer().isMageProtecting()) {
		int randomSkill = Utilities.random(0, 6);
		int currentLevel = targetPlayer.getSkills().getLevel(randomSkill);
		targetPlayer.getSkills().set(randomSkill, currentLevel < 5 ? 0 : currentLevel - 5);
		targetPlayer.getPackets().sendGameMessage("The smell of the abberrant spectre make you feel slightly weaker.");
	    }
	    delayHit(npc, 1, target, getMagicHit(npc, targetPlayer.getMaxHitpoints() / 10));
	    // TODO player emote hands on ears
	} else
	    delayHit(npc, 1, target, getMagicHit(npc, getRandomMaxHit(npc, npc.getMaxHit(), def.getAttackStyle(), target)));
	Engine.sendProjectile(npc, target, def.getAttackProjectile(), 18, 18, 50, 25, 0, 0);
	npc.setNextAnimation(new Animation(def.getAttackEmote()));
	return def.getAttackDelay();
    }
}
