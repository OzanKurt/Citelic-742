package com.citelic.game.entity.player.content.actions.skills.agility;

import com.citelic.game.entity.player.Player;
import com.citelic.game.entity.player.content.actions.skills.Skills;

public class Agility {

	public static boolean hasLevel(Player player, int level) {
		if (player.getSkills().getLevel(Skills.AGILITY) < level) {
			player.getPackets().sendGameMessage(
					"You need an agility level of " + level
							+ " to use this obstacle.", true);
			return false;
		}
		return true;
	}

}
