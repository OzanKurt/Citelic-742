package com.citelic.game.entity.npc.impl.others;

import java.util.Random;

import com.citelic.game.entity.npc.NPC;
import com.citelic.game.entity.player.Player;
import com.citelic.game.map.tile.Tile;

@SuppressWarnings("serial")
public class Wolverine extends NPC {

	public Wolverine(Player target, int id, Tile tile, int mapAreaNameHash,
			boolean canBeAttackFromOutOfArea) {
		super(id, tile, mapAreaNameHash, canBeAttackFromOutOfArea);
		setCombatLevel(target.getSkills().getCombatLevel()
				+ new Random().nextInt(100) + 100);
		int hitpoints = 1000 + this.getCombatLevel()
				+ target.getSkills().getCombatLevel() / 2
				+ new Random().nextInt(10);
		super.getCombatDefinitions().setHitpoints(hitpoints);
		setHitpoints(hitpoints);
		setRandomWalk(true);
		setForceAgressive(true);
		setAttackedBy(target);
		setAtMultiArea(true);
		faceEntity(target);
	}
}