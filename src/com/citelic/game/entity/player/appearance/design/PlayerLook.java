package com.citelic.game.entity.player.appearance.design;

import com.citelic.cache.impl.ClientScriptMap;
import com.citelic.game.entity.Animation;
import com.citelic.game.entity.player.Player;

public final class PlayerLook {

	public static void handleCharacterCustomizingButtons(Player player,
			int buttonId) {
		if (buttonId == 117) { // confirm
			player.getPackets().sendWindowsPane(
					player.getInterfaceManager().hasRezizableScreen() ? 746
							: 548, 0);
		}
	}

	public static void handleHairdresserSalonButtons(Player player,
			int buttonId, int slotId) {// Hair
		// and
		// color
		// match
		// button
		// count
		// so
		// just
		// loop
		// and
		// do
		// ++,
		// but
		// cant
		// find
		// button
		// ids
		if (buttonId == 6)
			player.getTemporaryAttributtes().put("hairSaloon", true);
		else if (buttonId == 7)
			player.getTemporaryAttributtes().put("hairSaloon", false);
		else if (buttonId == 18) {
			player.closeInterfaces();
		} else if (buttonId == 10) {
			Boolean hairSalon = (Boolean) player.getTemporaryAttributtes().get(
					"hairSaloon");
			if (hairSalon != null && hairSalon)
				player.getGlobalPlayerUpdate().setHairStyle(
						(int) ClientScriptMap.getMap(
								player.getGlobalPlayerUpdate().isMale() ? 2339
										: 2342).getKeyForValue(slotId / 2));
			else if (player.getGlobalPlayerUpdate().isMale())
				player.getGlobalPlayerUpdate().setBeardStyle(
						ClientScriptMap.getMap(703).getIntValue(slotId / 2));
		} else if (buttonId == 16)
			player.getGlobalPlayerUpdate().setHairColor(
					ClientScriptMap.getMap(2345).getIntValue(slotId / 2));
	}

	public static void handleMageMakeOverButtons(Player player, int buttonId) {
		if (buttonId == 14 || buttonId == 16 || buttonId == 15
				|| buttonId == 17)
			player.getTemporaryAttributtes().put("MageMakeOverGender",
					buttonId == 14 || buttonId == 16);
		else if (buttonId >= 20 && buttonId <= 31) {

			int skin;
			if (buttonId == 31)
				skin = 11;
			else if (buttonId == 30)
				skin = 10;
			else if (buttonId == 20)
				skin = 9;
			else if (buttonId == 21)
				skin = 8;
			else if (buttonId == 22)
				skin = 7;
			else if (buttonId == 29)
				skin = 6;
			else if (buttonId == 28)
				skin = 5;
			else if (buttonId == 27)
				skin = 4;
			else if (buttonId == 26)
				skin = 3;
			else if (buttonId == 25)
				skin = 2;
			else if (buttonId == 24)
				skin = 1;
			else
				skin = 0;
			player.getTemporaryAttributtes().put("MageMakeOverSkin", skin);
		} else if (buttonId == 33) {
			Boolean male = (Boolean) player.getTemporaryAttributtes().remove(
					"MageMakeOverGender");
			Integer skin = (Integer) player.getTemporaryAttributtes().remove(
					"MageMakeOverSkin");
			player.closeInterfaces();
			if (male == null || skin == null)
				return;
			if (male == player.getGlobalPlayerUpdate().isMale()
					&& skin == player.getGlobalPlayerUpdate().getSkinColor())
				player.getDialogueManager().startDialogue("MakeOverMage", 2676,
						1);
			else {
				player.getDialogueManager().startDialogue("MakeOverMage", 2676,
						2);
				if (player.getGlobalPlayerUpdate().isMale() != male) {
					if (player.getEquipment().wearingArmour()) {
						player.getDialogueManager()
								.startDialogue("SimpleMessage",
										"You cannot have armor on while changing your gender.");
						return;
					}
					if (male)
						player.getGlobalPlayerUpdate().resetAppearence();
					else
						player.getGlobalPlayerUpdate().female();
				}
				player.getGlobalPlayerUpdate().setSkinColor(skin);
				player.getGlobalPlayerUpdate().generateAppearenceData();
			}
		}
	}

	public static void handleThessaliasMakeOverButtons(Player player,
			int buttonId, int slotId) {
		if (buttonId == 6)
			player.getTemporaryAttributtes().put("ThessaliasMakeOver", 0);
		else if (buttonId == 7) {
			if (ClientScriptMap.getMap(
					player.getGlobalPlayerUpdate().isMale() ? 690 : 1591)
					.getKeyForValue(
							player.getGlobalPlayerUpdate().getTopStyle()) >= 32) {
				player.getTemporaryAttributtes().put("ThessaliasMakeOver", 1);
			} else
				player.getPackets().sendGameMessage(
						"You can't select different arms to go with that top.");
		} else if (buttonId == 8) {
			if (ClientScriptMap.getMap(
					player.getGlobalPlayerUpdate().isMale() ? 690 : 1591)
					.getKeyForValue(
							player.getGlobalPlayerUpdate().getTopStyle()) >= 32) {
				player.getTemporaryAttributtes().put("ThessaliasMakeOver", 2);
			} else
				player.getPackets()
						.sendGameMessage(
								"You can't select different wrists to go with that top.");
		} else if (buttonId == 9)
			player.getTemporaryAttributtes().put("ThessaliasMakeOver", 3);
		else if (buttonId == 19) { // confirm
			player.closeInterfaces();
		} else if (buttonId == 12) { // set part
			Integer stage = (Integer) player.getTemporaryAttributtes().get(
					"ThessaliasMakeOver");
			if (stage == null || stage == 0) {
				player.getGlobalPlayerUpdate().setTopStyle(
						ClientScriptMap.getMap(
								player.getGlobalPlayerUpdate().isMale() ? 690
										: 1591).getIntValue(slotId / 2));
				if (!player.getGlobalPlayerUpdate().isMale())
					player.getGlobalPlayerUpdate().setBeardStyle(
							player.getGlobalPlayerUpdate().getTopStyle());
				player.getGlobalPlayerUpdate().setArmsStyle(
						player.getGlobalPlayerUpdate().isMale() ? 26 : 65); // default
				player.getGlobalPlayerUpdate().setWristsStyle(
						player.getGlobalPlayerUpdate().isMale() ? 34 : 68); // default
			} else if (stage == 1) // arms
				player.getGlobalPlayerUpdate().setArmsStyle(
						ClientScriptMap.getMap(
								player.getGlobalPlayerUpdate().isMale() ? 711
										: 693).getIntValue(slotId / 2));
			else if (stage == 2) // wrists
				player.getGlobalPlayerUpdate().setWristsStyle(
						ClientScriptMap.getMap(751).getIntValue(slotId / 2));
			else
				player.getGlobalPlayerUpdate().setLegsStyle(
						ClientScriptMap.getMap(
								player.getGlobalPlayerUpdate().isMale() ? 1586
										: 1607).getIntValue(slotId / 2));

		} else if (buttonId == 17) {// color
			Integer stage = (Integer) player.getTemporaryAttributtes().get(
					"ThessaliasMakeOver");
			if (stage == null || stage == 0 || stage == 1)
				player.getGlobalPlayerUpdate().setTopColor(
						ClientScriptMap.getMap(3282).getIntValue(slotId / 2));
			else if (stage == 3)
				player.getGlobalPlayerUpdate().setLegsColor(
						ClientScriptMap.getMap(3284).getIntValue(slotId / 2));
		}
	}

	public static void openCharacterCustomizing(Player player) {
		player.getPackets().sendWindowsPane(1028, 0); // character customizing
	}

	public static void openHairdresserSalon(final Player player) {
		if (player.getEquipment().getHatId() != -1) {
			player.getDialogueManager()
					.startDialogue(
							"SimpleNPCMessage",
							598,
							"I'm afraid I can't see your head at the moment. Please remove your headgear first.");
			return;
		}
		if (player.getEquipment().getWeaponId() != -1
				|| player.getEquipment().getShieldId() != -1) {
			player.getDialogueManager()
					.startDialogue(
							"SimpleNPCMessage",
							598,
							"I don't feel comfortable cutting hair when you are wielding something. Please remove what you are holding first.");
			return;
		}
		player.setNextAnimation(new Animation(11623));
		player.getInterfaceManager().sendInterface(309);
		player.getPackets().sendUnlockIComponentOptionSlots(
				309,
				10,
				0,
				ClientScriptMap.getMap(
						player.getGlobalPlayerUpdate().isMale() ? 2339 : 2342)
						.getSize() * 2, 0);
		player.getPackets().sendUnlockIComponentOptionSlots(309, 16, 0,
				ClientScriptMap.getMap(2345).getSize() * 2, 0);
		player.getPackets().sendIComponentText(309, 20, "Free!");
		player.getTemporaryAttributtes().put("hairSaloon", true);
		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				player.getDialogueManager()
						.startDialogue(
								"SimpleNPCMessage",
								598,
								"An excellent choise, "
										+ (player.getGlobalPlayerUpdate()
												.isMale() ? "sir" : "lady")
										+ ".");
				player.setNextAnimation(new Animation(-1));
				player.getGlobalPlayerUpdate().getAppeareanceData();
				player.getTemporaryAttributtes().remove("hairSaloon");
			}

		});
	}

	public static void openMageMakeOver(Player player) {
		player.getInterfaceManager().sendInterface(900);
		player.getPackets().sendIComponentText(900, 33, "Confirm");
		player.getPackets().sendConfigByFile(6098,
				player.getGlobalPlayerUpdate().isMale() ? 0 : 1);
		player.getPackets().sendConfigByFile(6099,
				player.getGlobalPlayerUpdate().getSkinColor());
		player.getTemporaryAttributtes().put("MageMakeOverGender",
				player.getGlobalPlayerUpdate().isMale());
		player.getTemporaryAttributtes().put("MageMakeOverSkin",
				player.getGlobalPlayerUpdate().getSkinColor());
	}

	public static void openThessaliasMakeOver(final Player player) {
		if (player.getEquipment().wearingArmour()) {
			player.getDialogueManager()
					.startDialogue(
							"SimpleNPCMessage",
							548,
							"You're not able to try on my clothes with all that armour. Take it off and then speak to me again.");
			return;
		}
		player.setNextAnimation(new Animation(11623));
		player.getInterfaceManager().sendInterface(729);
		player.getPackets().sendIComponentText(729, 21, "Free!");
		player.getTemporaryAttributtes().put("ThessaliasMakeOver", 0);
		player.getPackets().sendUnlockIComponentOptionSlots(729, 12, 0, 100, 0);
		player.getPackets().sendUnlockIComponentOptionSlots(729, 17, 0,
				ClientScriptMap.getMap(3282).getSize() * 2, 0);
		player.setCloseInterfacesEvent(new Runnable() {

			@Override
			public void run() {
				player.getDialogueManager().startDialogue("SimpleNPCMessage",
						548, "A marvellous choise. You look splendid!");
				player.setNextAnimation(new Animation(-1));
				player.getGlobalPlayerUpdate().getAppeareanceData();
				player.getTemporaryAttributtes().remove("ThessaliasMakeOver");
			}

		});
	}

	private PlayerLook() {

	}

}
