package com.citelic.game.entity.player.content.miscellaneous;

import com.citelic.game.entity.player.Player;
import com.citelic.game.entity.player.content.controllers.impl.dungeons.UndergroundDungeon;
import com.citelic.game.entity.player.item.Item;

public class LightSource {

    private static final int[][] LIGHT_SOURCES = {{596, 36, 4529, 4522, 4537, 7051, 4548, 5014}, {594, 33, 4534, 4524, 4539, 7053, 4550, 5013}};

    public static boolean extinguishSource(Player player, int itemSlot, boolean forceExtinguish) {
        Item item = player.getInventory().getItem(itemSlot);
        if (item == null)
            return false;
        int slot = LightSource.getSlot(item.getId(), false);
        if (slot == -1)
            return false;
        else if (!forceExtinguish && player.getControllerManager().getController() != null && player.getControllerManager().getController() instanceof UndergroundDungeon) {
            player.getPackets().sendGameMessage("You cannot extinguish the " + item.getName().toLowerCase() + " as you will not have a light source.");
            return false;
        }
        player.getInventory().replaceItem(LightSource.LIGHT_SOURCES[0][slot], item.getAmount(), itemSlot);
        player.getPackets().sendGameMessage("You extinguish the " + item.getName().toLowerCase() + ".");
        return true;
    }

    private static int getSlot(int itemId, boolean extinguished) {
        for (int slot = 0; slot < 8; slot++) {
            int id = LightSource.LIGHT_SOURCES[extinguished ? 0 : 1][slot];
            if (id == itemId)
                return slot;
        }
        return -1;
    }

    public static boolean hasExplosiveSource(Player player) {
        for (Item item : player.getInventory().getItems().getItems()) {
            if (item == null) {
                continue;
            }
            int slot = LightSource.getSlot(item.getId(), false);
            if (slot != -1 && (slot == 0 || slot == 1))
                return true;
        }
        return false;
    }

    public static boolean hasLightSource(Player player) {
        return LightSource.hasExplosiveSource(player) || LightSource.hasPermenantSource(player);
    }

    public static boolean hasPermenantSource(Player player) {
        for (Item item : player.getInventory().getItems().getItems()) {
            if (item == null) {
                continue;
            }
            int slot = LightSource.getSlot(item.getId(), false);
            if (slot != -1 && slot != 0 && slot != 1)
                return true;
        }
        return false;
    }

    public static boolean lightSource(Player player, int itemSlot) {
        Item item = player.getInventory().getItem(itemSlot);
        int slot = LightSource.getSlot(item.getId(), true);
        if (slot == -1)
            return false;
        else if (!player.getInventory().containsItemToolBelt(590)) {
            player.getPackets().sendGameMessage("You need a tinderbox in order to light the " + item.getName().toLowerCase() + ".");
            return false;
        }
        player.getInventory().replaceItem(LightSource.LIGHT_SOURCES[1][slot], item.getAmount(), itemSlot);
        player.getPackets().sendGameMessage("You light the " + item.getName().toLowerCase() + ".");
        return true;
    }
}
