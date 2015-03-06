package com.citelic.game.entity.player.managers;

import com.citelic.game.entity.player.Player;
import com.citelic.game.entity.player.content.actions.Action;

public final class ActionManager {

	private Player player;
	private Action action;
	private int actionDelay;

	public ActionManager(Player player) {
		this.player = player;
	}

	public void addActionDelay(int skillDelay) {
		this.actionDelay += skillDelay;
	}

	public void forceStop() {
		if (action == null)
			return;
		action.stop(player);
		action = null;
	}

	public Action getAction() {
		return action;
	}

	public int getActionDelay() {
		return actionDelay;
	}

	public boolean hasSkillWorking() {
		return action != null;
	}

	public void process() {
		if (action != null) {
			if (player.isDead()) {
				forceStop();
			} else if (!action.process(player)) {
				forceStop();
			}
		}
		if (actionDelay > 0) {
			actionDelay--;
			return;
		}
		if (action == null)
			return;
		int delay = action.processWithDelay(player);
		if (delay == -1) {
			forceStop();
			return;
		}
		actionDelay += delay;
	}

	public boolean setAction(Action skill) {
		forceStop();
		if (!skill.start(player))
			return false;
		this.action = skill;
		return true;
	}

	public void setActionDelay(int skillDelay) {
		this.actionDelay = skillDelay;
	}
}