package com.citelic.game.entity.player.content.dialogue.impl.objects;

import com.citelic.game.engine.Engine;
import com.citelic.game.entity.Animation;
import com.citelic.game.entity.player.content.dialogue.Dialogue;
import com.citelic.game.map.objects.GameObject;

public class PickupFlower extends Dialogue {

	GameObject flowerObject;

	@Override
	public void finish() {

	}

	public int getFlowerId(int objectId) {
		return 2460 + (objectId - 2980) * 2;
	}

	public void start() {
		flowerObject = (GameObject) parameters[0];
		sendOptionsDialogue("What do you want to do with the flowers?",
				"Pick the flowers.", "Leave the flowers.");
		stage = 1;
	}

	@Override
	public void run(int interfaceId, int componentId) {
		if (stage == 1) {
			if (componentId == 11) {
				player.setNextAnimation(new Animation(827));
				player.getInventory().addItem(
						getFlowerId(flowerObject.getId()), 1);
				player.getInventory().refresh();
				Engine.removeObject(flowerObject, false);
				Engine.getRegion(player.getRegionId()).removeObject(
						flowerObject);
			}
			end();
		}
	}

}