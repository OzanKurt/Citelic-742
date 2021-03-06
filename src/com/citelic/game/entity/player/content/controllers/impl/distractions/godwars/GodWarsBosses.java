package com.citelic.game.entity.player.content.controllers.impl.distractions.godwars;

import com.citelic.game.entity.npc.impl.godwars.GodWarMinion;

public final class GodWarsBosses {

	public static final GodWarMinion[] graardorMinions = new GodWarMinion[3];
	public static final GodWarMinion[] commanderMinions = new GodWarMinion[3];
	public static final GodWarMinion[] zamorakMinions = new GodWarMinion[3];
	public static final GodWarMinion[] armadylMinions = new GodWarMinion[3];

	private GodWarsBosses() {

	}

	public static void respawnArmadylMinions() {
		for (GodWarMinion minion : GodWarsBosses.armadylMinions) {
			if (minion.hasFinished() || minion.isDead()) {
				minion.respawn();
			}
		}
	}

	public static void respawnBandosMinions() {
		for (GodWarMinion minion : GodWarsBosses.graardorMinions) {
			if (minion.hasFinished() || minion.isDead()) {
				minion.respawn();
			}
		}
	}

	public static void respawnSaradominMinions() {
		for (GodWarMinion minion : GodWarsBosses.commanderMinions) {
			if (minion.hasFinished() || minion.isDead()) {
				minion.respawn();
			}
		}
	}

	public static void respawnZammyMinions() {
		for (GodWarMinion minion : GodWarsBosses.zamorakMinions) {
			if (minion.hasFinished() || minion.isDead()) {
				minion.respawn();
			}
		}
	}
}
