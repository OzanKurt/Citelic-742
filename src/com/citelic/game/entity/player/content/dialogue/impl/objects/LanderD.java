package com.citelic.game.entity.player.content.dialogue.impl.objects;

import com.citelic.game.entity.player.content.dialogue.Dialogue;

public class LanderD extends Dialogue {

	@Override
	public void finish() {

	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == -1) {
			stage = 0;
			sendOptionsDialogue("Select an option", "Yes, get me out of here!",
					"No, I want to stay.");
		} else if (stage == 0) {
			if (componentId == OPTION_1)
				player.getControllerManager().forceStop();
			end();
		}
	}

	@Override
	public void start() {
		sendDialogue("Are you sure you would like to leave the lander?");
	}

}
