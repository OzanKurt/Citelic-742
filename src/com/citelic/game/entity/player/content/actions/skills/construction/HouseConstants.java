package com.citelic.game.entity.player.content.actions.skills.construction;

import com.citelic.game.entity.player.item.Item;
import com.citelic.game.map.MapBuilder;
import com.citelic.game.map.objects.GameObject;
import com.citelic.game.map.tile.Tile;

public class HouseConstants {

	public static final int HAMMER = 2347, SAW = 8794, IRON_BAR = 2351,
			LIMESTONE_BRICKS = 3420, SOFT_CLAY = 1761, MARBLE_BLOCK = 8786,
			PLANK = 960, NAILS = 1539, OAK_PLANK = 8778, TEAK_PLANK = 8780,
			MAHOGANY_PLANK = 8782, BOLT_OF_CLOTH = 8790, STEEL_BAR = 2353,
			GOLD_LEAF = 8784, MOLTEN_GLASS = 1775;
	public static final int[] LAND = { 233, 632 };
	// empty dungeon space
	public static final int[] DUNGEON = { 235, 632 };
	public static final int[] BLACK = { 237, 632 };
	public static final int[] CHAIR_EMOTES = { 4073, 4075, 4079, 4081, 4083,
			4085, 4087 };
	public static int WINDOW_SPACE_ID = 13830;
	public static int[] WINDOW_IDS = new int[] { 13099, 13091, 13005, 13112,
			-1, 13117, -1 };
	public static int[] WALL_IDS = new int[] { 13098, 13090, 13004, 13111, -1,
			13116, -1 };

	public static enum Builds {
		// GARDEN
		CENTREPIECE(15361, false, HObject.EXIT_PORTAL, HObject.DECORATIVE_ROCK,
				HObject.POND, HObject.IMP_STATUE, HObject.DUNGEON_ENTRACE), BIG_TREE(
				15362, true, HObject.BIG_DEATH_TREE, HObject.BIG_NICE_TREE,
				HObject.BIG_OAK_TREE, HObject.BIG_WILLOW_TREE,
				HObject.BIG_MAPLE_TREE, HObject.BIG_YEW_TREE,
				HObject.BIG_MAGIC_TREE), TREE(15363, true, HObject.DEATH_TREE,
				HObject.NICE_TREE, HObject.OAK_TREE, HObject.WILLOW_TREE,
				HObject.MAPLE_TREE, HObject.YEW_TREE, HObject.MAGIC_TREE), SMALL_PLANT_1(
				15366, true, HObject.PLANT, HObject.SMALL_FERN, HObject.FERN), SMALL_PLANT_2(
				15367, true, HObject.DOCK_LEAF, HObject.THISTLE, HObject.REEDS), BIG_PLANT_1(
				15364, true, HObject.FERN_B, HObject.BUSH, HObject.TALL_PLANT), BIG_PLANT_2(
				15365, true, HObject.SHORT_PLANT, HObject.LARGE_LEAF_PLANT,
				HObject.HUGE_PLANT)
		// PARLOUR
		, CHAIRS_1(15410, false, HObject.CRUDE_WOODEN_CHAIR,
				HObject.WOODEN_CHAIR, HObject.ROCKING_CHAIR, HObject.OAK_CHAIR,
				HObject.OAK_ARMCHAIR, HObject.TEAK_ARMCHAIR,
				HObject.MAHOGANY_ARMCHAIR), CHAIRS_2(15411, false,
				HObject.CRUDE_WOODEN_CHAIR, HObject.WOODEN_CHAIR,
				HObject.ROCKING_CHAIR, HObject.OAK_CHAIR, HObject.OAK_ARMCHAIR,
				HObject.TEAK_ARMCHAIR, HObject.MAHOGANY_ARMCHAIR), CHAIRS_3(
				15412, false, HObject.CRUDE_WOODEN_CHAIR, HObject.WOODEN_CHAIR,
				HObject.ROCKING_CHAIR, HObject.OAK_CHAIR, HObject.OAK_ARMCHAIR,
				HObject.TEAK_ARMCHAIR, HObject.MAHOGANY_ARMCHAIR), FIREPLACE(
				15418, false, HObject.CLAY_FIREPLACE, HObject.STONE_FIREPLACE,
				HObject.MARBLE_FIREPLACE), CURTAINS(15419, false,
				HObject.TORN_CURTAINS, HObject.CURTAINS,
				HObject.OPULENT_CURTAINS), BOOKCASE(15416, false,
				HObject.WOODEN_BOOKCASE, HObject.OAK_BOOKCASE,
				HObject.MAHOGANY_BOOKCASE), STAIRCASE(15380, false,
				HObject.OAK_STAIRCASE, HObject.TEAK_STAIRCASE,
				HObject.SPIRAL_STAIRCASE, HObject.MARBLE_STAIRCASE,
				HObject.MARBLE_SPIRAL), STAIRCASE_DOWN(15381, false,
				HObject.OAK_STAIRCASE_DOWN, HObject.TEAK_STAIRCASE_DOWN,
				HObject.SPIRAL_STAIRCASE, HObject.MARBLE_STAIRCASE_DOWN,
				HObject.MARBLE_SPIRAL), STAIRCASE_1(15390, false,
				HObject.OAK_STAIRCASE, HObject.TEAK_STAIRCASE,
				HObject.SPIRAL_STAIRCASE, HObject.MARBLE_STAIRCASE,
				HObject.MARBLE_SPIRAL), STAIRCASE_DOWN_1(15391, false,
				HObject.OAK_STAIRCASE_DOWN, HObject.TEAK_STAIRCASE_DOWN,
				HObject.SPIRAL_STAIRCASE, HObject.MARBLE_STAIRCASE_DOWN,
				HObject.MARBLE_SPIRAL), RUG(new int[] { 15415, 15414, 15413 },
				false, HObject.BROWN_RUG, HObject.RUG, HObject.OPULENT_RUG)
		// TODO dungeon stair id
		, STAIRCASE_2(15390, false, HObject.OAK_STAIRCASE,
				HObject.TEAK_STAIRCASE, HObject.SPIRAL_STAIRCASE,
				HObject.MARBLE_STAIRCASE, HObject.MARBLE_SPIRAL)
		// TROPHY ROOM
		, HEAD_TROPHY(15382, false, HObject.CRAWLING_HAND,
				HObject.COCKATRICE_HEAD, HObject.BASALISK_HEAD, HObject.KURASK,
				HObject.ABBYSAL_DEMON, HObject.KING_BLACK_DRAGON,
				HObject.KALPHITE_QUEEN), MOUNTED_FISH(15383, false,
				HObject.MOUNTED_BASS, HObject.MOUNTED_SWORDFISH,
				HObject.MOUNTED_SHARK), RUNE_CASE(15386, false,
				HObject.RUNE_CASE_1, HObject.RUNE_CASE_2), DECORATIVE_ARMOUR(
				15384, false, HObject.BASIC_DECORATIVE,
				HObject.DETAILED_DECORATIVE, HObject.INTRICATE_DECORATIVE,
				HObject.PROFOUND_DECORATIVE), BASIC_ARMOURS(34255, false,
				HObject.MITHRIL_ARMOUR, HObject.ADAMANT_ARMOUR,
				HObject.RUNITE_ARMOUR) // BEDROOM
		, RUG_3(new int[] { 15379, 15378, 15377 }, false, HObject.RUG,
				HObject.OPULENT_RUG)
		// BED ROOM
		, BED(15260, false, HObject.WOODEN_BED, HObject.OAK_BED,
				HObject.LARGE_OAK_BED, HObject.TEAK_BED,
				HObject.LARGE_TEAK_BED, HObject.MAHOGANY_BED,
				HObject.LARGE_MAHOGANY_BED), BEDROOM_FIREPLACE(15267, false,
				HObject.CLAY_FIREPLACE, HObject.STONE_FIREPLACE,
				HObject.MARBLE_FIREPLACE), BEDROOM_CURTAINS(15263, false,
				HObject.TORN_CURTAINS, HObject.CURTAINS,
				HObject.OPULENT_CURTAINS), DRESSERS(15262, false,
				HObject.SHAVING_STAND, HObject.OAK_SHAVING_STAND,
				HObject.OAK_DRESSER, HObject.TEAK_DRESSER,
				HObject.FANCY_TEAK_DRESSER, HObject.MAHOGANY_DRESSER,
				HObject.GILDED_DRESSER), CLOCKS(15268, false,
				HObject.OAK_CLOCK, HObject.TEAK_CLOCK, HObject.GILDED_CLOCK), WARDROBE(
				15261, false, HObject.SHOE_BOX, HObject.OAK_DRAWERS,
				HObject.OAK_WARDROBE, HObject.TEAK_DRAWERS,
				HObject.TEAK_WARDROBE, HObject.MAHOGANY_WARDROBE,
				HObject.GILDED_WARDROBE)
		// KITCHEN
		, LARDER(15403, false, HObject.WOODEN_LARDER, HObject.OAK_LARDER,
				HObject.TEAK_LARDER), SINK(15404, false,
				HObject.PUMP_AND_DRAIN, HObject.PUMP_AND_TUB, HObject.SINK), KITCHEN_TABLE(
				15405, false, HObject.WOODEN_KITCHEN_TABLE,
				HObject.OAK_KITCHEN_TABLE, HObject.TEAK_KITCHEN_TABLE), CAT_BLANKET(
				15402, false, HObject.CAT_BLANKET, HObject.CAT_BASKET,
				HObject.CUSHIONED_CAT_BASKET), STOVE(15398, false,
				HObject.FIREPIT, HObject.FIREPIT_WITH_HOOK,
				HObject.FIREPIT_WITH_POT, HObject.SMALL_OVEN,
				HObject.LARGE_OVEN, HObject.STEEL_RANGE, HObject.FANCY_RANGE), SHELVES(
				15400, false, HObject.WOODEN_SHELVES_1,
				HObject.WOODEN_SHELVES_2, HObject.WOODEN_SHELVES_3,
				HObject.OAK_SHELVES_1, HObject.OAK_SHELVES_2,
				HObject.TEAK_SHELVES_1, HObject.TEAK_SHELVES_2), SHELVES_2(
				15399, false, HObject.WOODEN_SHELVES_1,
				HObject.WOODEN_SHELVES_2, HObject.WOODEN_SHELVES_3,
				HObject.OAK_SHELVES_1, HObject.OAK_SHELVES_2,
				HObject.TEAK_SHELVES_1, HObject.TEAK_SHELVES_2), BARRELS(15401,
				false, HObject.BEER_BARREL, HObject.CIDER_BARREL,
				HObject.ASGARNIAN_ALE, HObject.GREENMAN_ALE,
				HObject.DRAGON_BITTER_ALE, HObject.CHEFS_DELIGHT)
		// DINING ROOM
		, FIREPLACE_DINING(15301, false, HObject.CLAY_FIREPLACE,
				HObject.STONE_FIREPLACE, HObject.MARBLE_FIREPLACE), DINING_TABLE(
				15298, false, HObject.WOOD_DINING, HObject.OAK_DINING,
				HObject.CARVED_OAK_DINING, HObject.TEAK_DINING,
				HObject.CARVED_TEAK_DINING, HObject.MAHOGANY_DINING,
				HObject.OPULENT_TABLE), DINING_CURTAINS(15302, false,
				HObject.TORN_CURTAINS, HObject.CURTAINS,
				HObject.OPULENT_CURTAINS), DINING_BENCH_1(15300, false,
				HObject.WOOD_BENCH, HObject.OAK_BENCH,
				HObject.CARVED_OAK_BENCH, HObject.TEAK_BENCH,
				HObject.CARVED_TEAK_BENCH, HObject.MAHOGANY_BENCH,
				HObject.GILDED_BENCH), DINING_BENCH_2(15299, false,
				HObject.WOOD_BENCH, HObject.OAK_BENCH,
				HObject.CARVED_OAK_BENCH, HObject.TEAK_BENCH,
				HObject.CARVED_TEAK_BENCH, HObject.MAHOGANY_BENCH,
				HObject.GILDED_BENCH), ROPE_BELL_PULL(15304, false,
				HObject.ROPE_BELL_PULL, HObject.BELL_PULL,
				HObject.POSH_BELL_PULL), DECORATION(15303, false,
				HObject.OAK_DECORATION, HObject.TEAK_DECORATION,
				HObject.GILDED_DECORATION)
		// WORKSPACE

		// GAMES ROOM
		, ELEMENTAL_BALANCE(15345, false, HObject.ELEMENTAL_BALANCE_1,
				HObject.ELEMENTAL_BALANCE_2, HObject.ELEMENTAL_BALANCE_3), ATTACK_STONE(
				15344, false, HObject.CLAY_ATTACK_STONE,
				HObject.LIMESTONE_ATTACK_STONE, HObject.MARBLE_ATTACK_STONE), RANGING_GAME(
				15346, false, HObject.HOOP_AND_STICK, HObject.DART_BOARD,
				HObject.ARCHERY_TARGET), GAME(15342, false, HObject.JESTER,
				HObject.TREASURE_HUNT, HObject.HANGMAN), GAME_CHEST(15343,
				false, HObject.OAK_PRIZE_CHEST, HObject.TEAK_PRIZE_CHEST,
				HObject.GILDED_PRIZE_CHEST)
		// BOXING ROOM
		, DECORATIONS(15297, false, HObject.OAK_DECORATION,
				HObject.TEAK_DECORATION, HObject.GILDED_DECORATION), WEAPONS_RACK(
				15296, false, HObject.GLOVE_RACK, HObject.WEAPON_RACK,
				HObject.EXTRA_WEAPON_RACK), COMBAT_RING(new int[] { 15277,
				15278, 15279, 15280, 15281, 15282, 15286, 15287 // ring
				, 15289, 15290, 15294, 15295 // 2 side
				, 15288, 15291, 15293, 15292 }, false, HObject.BOXING_RING,
				HObject.FENCING_RING, HObject.COMBAT_RING) // 0side
		// QUEST ROOM
		, QUEST_BOOKCASE(15397, false, HObject.WOODEN_BOOKCASE,
				HObject.OAK_BOOKCASE, HObject.MAHOGANY_BOOKCASE), SWORD(15395,
				false, HObject.SILVERLIGHT_SWORD, HObject.EXCALIBER_SWORD,
				HObject.DARKLIGHT_SWORD), MAP(15396, false, HObject.MAP_SMALL,
				HObject.MAP_MEDIUM, HObject.MAP_LARGE), LANDSCAPE(15393, false,
				HObject.LUMBRIDGE, HObject.DESERT, HObject.MORTANYIA,
				HObject.KARAMJA, HObject.ISFADAR), PORTRAIT(15392, false,
				HObject.KING_ARTHUR, HObject.ELENA, HObject.GIANT_DWARF,
				HObject.MISCELLENIA), GUILD_TROPHY(15394, false,
				HObject.ANTIDRAGON_SHIELD, HObject.GLORY,
				HObject.CAPE_OF_LEGENDS)
		// STUDY ROOM
		, STUDY_BOOKCASE(15425, false, HObject.WOODEN_BOOKCASE,
				HObject.OAK_BOOKCASE, HObject.MAHOGANY_BOOKCASE), CHARTS(15423,
				false, HObject.ALCHEMICAL_CHART, HObject.ASTRONOMICAL_CHART,
				HObject.INFERNAL), LECTERN_STATUE(48662, false,
				HObject.LECTURN_STATUE), GLOBE(15421, false, HObject.GLOBE,
				HObject.ORNAMENTAL_GLOBE, HObject.LUNAR_GLOBE,
				HObject.CELESTIAL_GLOBE, HObject.ARMILLARY_SPHERE,
				HObject.SMALL_ORRERY, HObject.LARGE_ORRERY), LECTURN(15420,
				false, HObject.EAGLE_LECTURN, HObject.DEMON_LECTURN,
				HObject.TEAK_EAGLE_LECTURN, HObject.TEAK_DEMON_LECTURN,
				HObject.MAHOGANY_EAGLE_LECTURN, HObject.MAHOGANY_DEMON_LECTURN), CRYSTAL_BALL(
				15422, false, HObject.CRYSTAL_BALL, HObject.ELEMENTAL_SPHERE,
				HObject.CRYSTAL_OF_POWER), TELESCOPE(15424, false,
				HObject.WOODEN_TELESCOPE, HObject.TEAK_TELESCOPE,
				HObject.MAHOGANY_TELESCOPE), RUG_2(new int[] { 15389, 15388,
				15387 }, false, HObject.RUG, HObject.OPULENT_RUG)

		// CHAPEL
		// todo find -1(Zenevivia)
		, WINDOW(new int[] { 13730, 13728, 13732, 13729, 13733, 13731, 7101 },
				false, HObject.SHUTTERED_WINDOW, HObject.DECORATIVE_WINDOW,
				HObject.STAINED_GLASS), ;

		private int[] ids;
		private boolean water;
		private HObject[] pieces;

		private Builds(int id, boolean water, HObject... pieces) {
			this(new int[] { id }, water, pieces);
		}

		private Builds(int[] ids, boolean water, HObject... pieces) {
			this.ids = ids;
			this.water = water;
			this.pieces = pieces;
		}

		public boolean containsId(int id) {
			return getIdSlot(id) != -1;
		}

		public boolean containsObject(GameObject object) {
			for (HObject o : getPieces()) {
				for (int id : o.getIds())
					if (object.getId() == id)
						return true;
			}
			return false;
		}

		public int getId() {
			return ids[0];
		}

		public int getIds() {
			return ids[0];
		}

		public int getIdSlot(int id) {
			for (int i = 0; i < ids.length; i++)
				if (ids[i] == id)
					return i;
			return -1;
		}

		public HObject[] getPieces() {
			return pieces;
		}

		public boolean isWater() {
			return water;
		}
	}

	public static enum HObject {
		// GARDEN

		// CENTREPIECE
		EXIT_PORTAL(8168, 13405, 1, 100, new Item(HouseConstants.IRON_BAR, 10)), DECORATIVE_ROCK(
				8169, 13406, 5, 100, new Item(HouseConstants.LIMESTONE_BRICKS,
						5)), POND(8170, 13407, 10, 100, new Item(
				HouseConstants.SOFT_CLAY, 10)), IMP_STATUE(8171, 13408, 15,
				150, new Item(HouseConstants.LIMESTONE_BRICKS, 5), new Item(
						HouseConstants.SOFT_CLAY, 5)), DUNGEON_ENTRACE(8172,
				13409, 70, 500, new Item(HouseConstants.MARBLE_BLOCK, 1))
		// BIG TREE
		, BIG_DEATH_TREE(8173, 13411, 5, 31, new Item(8417)), BIG_NICE_TREE(
				8174, 13412, 10, 44, new Item(8419)), BIG_OAK_TREE(8175, 13413,
				15, 70, new Item(8421)), BIG_WILLOW_TREE(8176, 13414, 30, 100,
				new Item(8423)), BIG_MAPLE_TREE(8177, 13415, 45, 122, new Item(
				8425)), BIG_YEW_TREE(8178, 13416, 60, 141, new Item(8427)), BIG_MAGIC_TREE(
				8179, 13417, 75, 223, new Item(8429))
		// TREE
		, DEATH_TREE(8173, 13418, 5, 31, new Item(8417)), NICE_TREE(8174,
				13419, 10, 44, new Item(8419)), OAK_TREE(8175, 13420, 15, 70,
				new Item(8421)), WILLOW_TREE(8176, 13421, 30, 100, new Item(
				8423)), MAPLE_TREE(8177, 13422, 45, 122, new Item(8425)), YEW_TREE(
				8178, 13423, 60, 141, new Item(8427)), MAGIC_TREE(8179, 13424,
				75, 223, new Item(8429))
		// SMALL PLANT 1
		, PLANT(8180, 13431, 1, 31, new Item(8431)), SMALL_FERN(8181, 13432, 6,
				70, new Item(8433)), FERN(8182, 13433, 12, 100, new Item(8435))
		// SMALL PLANT 2
		, DOCK_LEAF(8183, 13434, 1, 31, new Item(8431)), THISTLE(8184, 13435,
				6, 70, new Item(8433)), REEDS(8185, 13436, 12, 100, new Item(
				8435))
		// BIG PLANT 1
		, FERN_B(8186, 13425, 1, 31, new Item(8431)), BUSH(8187, 13426, 6, 70,
				new Item(8433)), TALL_PLANT(8188, 13427, 12, 100,
				new Item(8435))
		// BIG PLANT 2
		, SHORT_PLANT(8189, 13428, 1, 31, new Item(8431)), LARGE_LEAF_PLANT(
				8190, 13429, 6, 70, new Item(8433)), HUGE_PLANT(8191, 13430,
				12, 100, new Item(8435))

		// PARLOUR

		// CHAIRS
		, CRUDE_WOODEN_CHAIR(8309, 13581, 1, 66, new Item(HouseConstants.PLANK,
				2), new Item(HouseConstants.NAILS, 2)), WOODEN_CHAIR(8310,
				13582, 8, 96, new Item(HouseConstants.PLANK, 3), new Item(
						HouseConstants.NAILS, 3)), ROCKING_CHAIR(8311, 13583,
				14, 99, new Item(HouseConstants.PLANK, 3), new Item(
						HouseConstants.NAILS, 3)), OAK_CHAIR(8312, 13584, 19,
				120, new Item(HouseConstants.OAK_PLANK, 2)), OAK_ARMCHAIR(8313,
				13585, 26, 180, new Item(HouseConstants.OAK_PLANK, 3)), TEAK_ARMCHAIR(
				8314, 13586, 35, 180, new Item(HouseConstants.TEAK_PLANK, 2)), MAHOGANY_ARMCHAIR(
				8315, 13587, 50, 280,
				new Item(HouseConstants.MAHOGANY_PLANK, 2))
		// FIREPLACE
		, CLAY_FIREPLACE(8325, 13609, 3, 30, new Item(HouseConstants.SOFT_CLAY,
				3)), STONE_FIREPLACE(8326, 13611, 33, 40, new Item(
				HouseConstants.LIMESTONE_BRICKS, 2)), MARBLE_FIREPLACE(8327,
				13613, 63, 500, new Item(HouseConstants.MARBLE_BLOCK, 1))
		// CURTAINS
		, TORN_CURTAINS(8322, 13603, 2, 132, new Item(HouseConstants.PLANK, 3),
				new Item(HouseConstants.BOLT_OF_CLOTH, 3), new Item(
						HouseConstants.NAILS, 3)), CURTAINS(8323, 13604, 18,
				225, new Item(HouseConstants.OAK_PLANK, 3), new Item(
						HouseConstants.BOLT_OF_CLOTH, 3)), OPULENT_CURTAINS(
				8324, 13605, 40, 315, new Item(HouseConstants.TEAK_PLANK, 3),
				new Item(HouseConstants.BOLT_OF_CLOTH, 3))
		// BOOKCASES
		, WOODEN_BOOKCASE(8319, 13597, 4, 115,
				new Item(HouseConstants.PLANK, 4), new Item(
						HouseConstants.NAILS, 4)), OAK_BOOKCASE(8320, 13598,
				29, 180, new Item(HouseConstants.OAK_PLANK, 3)), MAHOGANY_BOOKCASE(
				8321, 13599, 40, 420,
				new Item(HouseConstants.MAHOGANY_PLANK, 3))
		// RUGS
		, BROWN_RUG(8316, new int[] { 13588, 13589, 13590 }, 2, 30, new Item(
				HouseConstants.BOLT_OF_CLOTH, 2)), RUG(8317, new int[] { 13591,
				13592, 13593 }, 13, 60, new Item(HouseConstants.BOLT_OF_CLOTH,
				4)), OPULENT_RUG(8318, new int[] { 13594, 13595, 13596 }, 65,
				360, new Item(HouseConstants.BOLT_OF_CLOTH, 4), new Item(
						HouseConstants.GOLD_LEAF, 1))
		// TROHPY_ROOM
		// STAIRCASE
		, OAK_STAIRCASE(8249, 13497, 27, 680, new Item(
				HouseConstants.OAK_PLANK, 10), new Item(
				HouseConstants.STEEL_BAR, 4)), OAK_STAIRCASE_DOWN(8249, 13498,
				27, 680, new Item(HouseConstants.OAK_PLANK, 10), new Item(
						HouseConstants.STEEL_BAR, 4)), TEAK_STAIRCASE(8252,
				13499, 48, 980, new Item(HouseConstants.TEAK_PLANK, 10),
				new Item(HouseConstants.STEEL_BAR, 4)), TEAK_STAIRCASE_DOWN(
				8258, 13500, 48, 980, new Item(HouseConstants.TEAK_PLANK, 10),
				new Item(HouseConstants.STEEL_BAR, 4)), SPIRAL_STAIRCASE(8258,
				13503, 67, 1040, new Item(HouseConstants.TEAK_PLANK, 10),
				new Item(HouseConstants.LIMESTONE_BRICKS, 7)), MARBLE_STAIRCASE(
				8255, 13501, 82, 3200, new Item(HouseConstants.MAHOGANY_PLANK,
						5), new Item(HouseConstants.MARBLE_BLOCK, 5)), MARBLE_STAIRCASE_DOWN(
				8255, 13502, 82, 3200, new Item(HouseConstants.MAHOGANY_PLANK,
						5), new Item(HouseConstants.MARBLE_BLOCK, 5)), MARBLE_SPIRAL(
				8259, 13505, 97, 4400, new Item(HouseConstants.TEAK_PLANK, 10),
				new Item(HouseConstants.MARBLE_BLOCK, 7))
		// HEAD_TROPHY
		, CRAWLING_HAND(8260, 13481, 38, 211, new Item(
				HouseConstants.TEAK_PLANK, 2), new Item(7975)), COCKATRICE_HEAD(
				8261, 13482, 38, 224, new Item(HouseConstants.TEAK_PLANK, 2),
				new Item(7976)), BASALISK_HEAD(8262, 13483, 38, 243, new Item(
				HouseConstants.TEAK_PLANK, 2), new Item(7977)), KURASK(8263,
				13484, 58, 357, new Item(HouseConstants.MAHOGANY_PLANK, 2),
				new Item(7978)), ABBYSAL_DEMON(8264, 13485, 58, 389, new Item(
				HouseConstants.MAHOGANY_PLANK, 2), new Item(7979)), KING_BLACK_DRAGON(
				8265, 13486, 78, 1103, new Item(HouseConstants.MAHOGANY_PLANK,
						2), new Item(7980, 1), new Item(
						HouseConstants.GOLD_LEAF, 2)), KALPHITE_QUEEN(8266,
				13487, 78, 1103, new Item(HouseConstants.MAHOGANY_PLANK, 2),
				new Item(7981, 1), new Item(HouseConstants.GOLD_LEAF, 2))
		// FISH_MANTEL
		, MOUNTED_BASS(8267, 13488, 36, 151, new Item(HouseConstants.OAK_PLANK,
				2), new Item(7989)), MOUNTED_SWORDFISH(8268, 13489, 56, 230,
				new Item(HouseConstants.TEAK_PLANK, 2), new Item(7991)), MOUNTED_SHARK(
				8269, 13490, 76, 350,
				new Item(HouseConstants.MAHOGANY_PLANK, 2), new Item(7993))
		// RUNE CASES
		, RUNE_CASE_1(8276, 13507, 41, 190, new Item(HouseConstants.TEAK_PLANK,
				2), new Item(HouseConstants.MOLTEN_GLASS, 2), new Item(554),
				new Item(555), new Item(556), new Item(557)), RUNE_CASE_2(8277,
				13508, 41, 212, new Item(HouseConstants.TEAK_PLANK, 2),
				new Item(HouseConstants.MOLTEN_GLASS, 2), new Item(559),
				new Item(560), new Item(561), new Item(562))
		// DECORATIVE ARMOR
		, BASIC_DECORATIVE(8273, 34256, 28, 135, new Item(
				HouseConstants.OAK_PLANK, 2), new Item(4069), new Item(4071),
				new Item(4072)), DETAILED_DECORATIVE(8274, 34263, 28, 150,
				new Item(HouseConstants.OAK_PLANK, 2), new Item(4504),
				new Item(4506), new Item(4507)), INTRICATE_DECORATIVE(8275,
				34280, 28, 165, new Item(HouseConstants.OAK_PLANK, 2),
				new Item(4509), new Item(4511), new Item(4512)), PROFOUND_DECORATIVE(
				18755, 34281, 28, 180, new Item(HouseConstants.OAK_PLANK, 2),
				new Item(18708), new Item(18707), new Item(18709))
		// BASIC ARMOR
		, MITHRIL_ARMOUR(8270, 13491, 28, 135, new Item(
				HouseConstants.OAK_PLANK, 2), new Item(1159), new Item(1085),
				new Item(1121)), ADAMANT_ARMOUR(8271, 13492, 28, 150, new Item(
				HouseConstants.OAK_PLANK, 2), new Item(1161), new Item(1091),
				new Item(1123)), RUNITE_ARMOUR(8272, 13493, 28, 165, new Item(
				HouseConstants.OAK_PLANK, 2), new Item(1163), new Item(1093),
				new Item(1127))

		// BEDROOM SEX TIME
		// BEDS
		, WOODEN_BED(8031, 13148, 20, 117, new Item(HouseConstants.PLANK, 3),
				new Item(HouseConstants.NAILS, 3), new Item(
						HouseConstants.BOLT_OF_CLOTH, 2)), OAK_BED(8032, 13149,
				30, 210, new Item(HouseConstants.OAK_PLANK, 3), new Item(
						HouseConstants.BOLT_OF_CLOTH, 2)), LARGE_OAK_BED(8033,
				13150, 34, 330, new Item(HouseConstants.OAK_PLANK, 5),
				new Item(HouseConstants.BOLT_OF_CLOTH, 2)), TEAK_BED(8034,
				13151, 40, 300, new Item(HouseConstants.TEAK_PLANK, 3),
				new Item(HouseConstants.BOLT_OF_CLOTH, 2)), LARGE_TEAK_BED(
				8035, 13152, 45, 480, new Item(HouseConstants.TEAK_PLANK, 5),
				new Item(HouseConstants.BOLT_OF_CLOTH, 2)), MAHOGANY_BED(8036,
				13153, 53, 450, new Item(HouseConstants.MAHOGANY_PLANK, 3),
				new Item(HouseConstants.BOLT_OF_CLOTH, 2)), LARGE_MAHOGANY_BED(
				8037, 13154, 60, 1330, new Item(HouseConstants.MAHOGANY_PLANK,
						5), new Item(HouseConstants.BOLT_OF_CLOTH, 2),
				new Item(HouseConstants.GOLD_LEAF, 2))
		// DRESSERS
		, SHAVING_STAND(8045, 13162, 21, 30, new Item(HouseConstants.PLANK, 1),
				new Item(HouseConstants.NAILS, 1), new Item(
						HouseConstants.MOLTEN_GLASS, 1)), OAK_SHAVING_STAND(
				8046, 13163, 29, 61, new Item(HouseConstants.OAK_PLANK, 1),
				new Item(HouseConstants.MOLTEN_GLASS, 1)), OAK_DRESSER(8047,
				13164, 37, 121, new Item(HouseConstants.OAK_PLANK, 2),
				new Item(HouseConstants.MOLTEN_GLASS, 1)), TEAK_DRESSER(8048,
				13165, 46, 181, new Item(HouseConstants.TEAK_PLANK, 2),
				new Item(HouseConstants.MOLTEN_GLASS, 1)), FANCY_TEAK_DRESSER(
				8049, 13166, 56, 182, new Item(HouseConstants.TEAK_PLANK, 2),
				new Item(HouseConstants.MOLTEN_GLASS, 2)), MAHOGANY_DRESSER(
				8050, 13167, 64, 261,
				new Item(HouseConstants.MAHOGANY_PLANK, 2), new Item(
						HouseConstants.MOLTEN_GLASS, 1)), GILDED_DRESSER(8051,
				13168, 74, 582, new Item(HouseConstants.MAHOGANY_PLANK, 2),
				new Item(HouseConstants.MOLTEN_GLASS, 2), new Item(
						HouseConstants.GOLD_LEAF, 1))
		// CLOCKS
		, OAK_CLOCK(8052, 13169, 25, 142,
				new Item(HouseConstants.OAK_PLANK, 2), new Item(8792)), TEAK_CLOCK(
				8053, 13170, 25, 142, new Item(HouseConstants.TEAK_PLANK, 2),
				new Item(8792)), GILDED_CLOCK(8054, 13171, 25, 142, new Item(
				HouseConstants.MAHOGANY_PLANK, 2), new Item(8792, 1), new Item(
				HouseConstants.GOLD_LEAF, 1))
		// WARDROBE
		, SHOE_BOX(8038, 13155, 20, 58, new Item(HouseConstants.PLANK, 2),
				new Item(HouseConstants.NAILS, 2)), OAK_DRAWERS(8039, 13156,
				27, 120, new Item(HouseConstants.OAK_PLANK, 2)), OAK_WARDROBE(
				8040, 13157, 39, 180, new Item(HouseConstants.OAK_PLANK, 3)), TEAK_DRAWERS(
				8041, 13158, 51, 180, new Item(HouseConstants.TEAK_PLANK, 2)), TEAK_WARDROBE(
				8042, 13159, 63, 270, new Item(HouseConstants.TEAK_PLANK, 3)), MAHOGANY_WARDROBE(
				8043, 13160, 75, 420,
				new Item(HouseConstants.MAHOGANY_PLANK, 3)), GILDED_WARDROBE(
				8044, 13161, 87, 720,
				new Item(HouseConstants.MAHOGANY_PLANK, 3), new Item(
						HouseConstants.GOLD_LEAF, 1))

		// KITCHEN
		// LARDER
		, WOODEN_LARDER(8233, 13565, 9, 228, new Item(HouseConstants.PLANK, 8),
				new Item(HouseConstants.NAILS, 8)), OAK_LARDER(8234, 13566, 33,
				480, new Item(HouseConstants.OAK_PLANK, 8)), TEAK_LARDER(8235,
				13567, 43, 750, new Item(HouseConstants.TEAK_PLANK, 8),
				new Item(HouseConstants.BOLT_OF_CLOTH, 2))
		// SINK
		, PUMP_AND_DRAIN(8230, 13559, 7, 100, new Item(
				HouseConstants.STEEL_BAR, 5)), PUMP_AND_TUB(8231, 13561, 27,
				200, new Item(HouseConstants.STEEL_BAR, 10)), SINK(8232, 13563,
				47, 300, new Item(HouseConstants.STEEL_BAR, 15))
		// KITCHEN TABLE
		, WOODEN_KITCHEN_TABLE(8246, 13577, 12, 87, new Item(
				HouseConstants.PLANK, 3), new Item(HouseConstants.NAILS, 3)), OAK_KITCHEN_TABLE(
				8247, 13578, 32, 180, new Item(HouseConstants.OAK_PLANK, 3)), TEAK_KITCHEN_TABLE(
				8248, 13579, 52, 270, new Item(HouseConstants.TEAK_PLANK, 3))
		// CAT BASKET
		, CAT_BLANKET(8236, 13574, 5, 15, new Item(
				HouseConstants.BOLT_OF_CLOTH, 1)), CAT_BASKET(8237, 13575, 19,
				58, new Item(HouseConstants.PLANK, 2), new Item(
						HouseConstants.NAILS, 2)), CUSHIONED_CAT_BASKET(8238,
				13576, 33, 58, new Item(HouseConstants.PLANK, 2), new Item(
						HouseConstants.NAILS, 2), new Item(1737, 2))
		// STOVE
		, FIREPIT(8216, 13528, 5, 40, new Item(HouseConstants.STEEL_BAR, 1),
				new Item(HouseConstants.SOFT_CLAY, 2)), FIREPIT_WITH_HOOK(8217,
				13529, 11, 60, new Item(HouseConstants.STEEL_BAR, 2), new Item(
						HouseConstants.SOFT_CLAY, 2)), FIREPIT_WITH_POT(8218,
				13531, 17, 80, new Item(HouseConstants.STEEL_BAR, 3), new Item(
						HouseConstants.SOFT_CLAY, 2)), SMALL_OVEN(8219, 13533,
				24, 80, new Item(HouseConstants.STEEL_BAR, 4)), LARGE_OVEN(
				8220, 13536, 29, 100, new Item(HouseConstants.STEEL_BAR, 5)), STEEL_RANGE(
				8221, 13539, 34, 120, new Item(HouseConstants.STEEL_BAR, 6)), FANCY_RANGE(
				8222, 13542, 42, 160, new Item(HouseConstants.STEEL_BAR, 8))
		// SHELVES
		, WOODEN_SHELVES_1(8223, 13545, 6, 87,
				new Item(HouseConstants.PLANK, 3), new Item(
						HouseConstants.NAILS, 3)), WOODEN_SHELVES_2(8224,
				13546, 12, 147, new Item(HouseConstants.PLANK, 3), new Item(
						HouseConstants.NAILS, 3), new Item(
						HouseConstants.SOFT_CLAY, 3)), WOODEN_SHELVES_3(8225,
				13547, 23, 147, new Item(HouseConstants.PLANK, 3), new Item(
						HouseConstants.NAILS, 3), new Item(
						HouseConstants.SOFT_CLAY, 6)), OAK_SHELVES_1(8226,
				13548, 34, 240, new Item(HouseConstants.OAK_PLANK, 3),
				new Item(HouseConstants.SOFT_CLAY, 6)), OAK_SHELVES_2(8227,
				13549, 45, 240, new Item(HouseConstants.OAK_PLANK, 3),
				new Item(HouseConstants.SOFT_CLAY, 6)), TEAK_SHELVES_1(8228,
				13550, 56, 330, new Item(HouseConstants.TEAK_PLANK, 3),
				new Item(HouseConstants.SOFT_CLAY, 6)), TEAK_SHELVES_2(8229,
				13551, 67, 930, new Item(HouseConstants.TEAK_PLANK, 3),
				new Item(HouseConstants.SOFT_CLAY, 6), new Item(
						HouseConstants.GOLD_LEAF, 2))
		// BARRELS
		, BEER_BARREL(8239, 13568, 7, 87, new Item(HouseConstants.PLANK, 3),
				new Item(HouseConstants.NAILS, 3)), CIDER_BARREL(8240, 13569,
				12, 91, new Item(HouseConstants.PLANK, 3), new Item(
						HouseConstants.NAILS, 3), new Item(5763, 8)), ASGARNIAN_ALE(
				8241, 13570, 18, 184, new Item(HouseConstants.OAK_PLANK, 3),
				new Item(5763, 8)), GREENMAN_ALE(8242, 13571, 26, 184,
				new Item(HouseConstants.OAK_PLANK, 3), new Item(1909, 8)), DRAGON_BITTER_ALE(
				8243, 13572, 36, 224, new Item(HouseConstants.OAK_PLANK, 3),
				new Item(1911, 8), new Item(HouseConstants.STEEL_BAR, 2)), CHEFS_DELIGHT(
				8243, 13572, 36, 224, new Item(HouseConstants.OAK_PLANK, 3),
				new Item(5755, 8), new Item(HouseConstants.STEEL_BAR, 2))

		// DINING ROOM
		// DINING TABLES
		, WOOD_DINING(8115, 13293, 10, 115, new Item(HouseConstants.PLANK, 4),
				new Item(HouseConstants.NAILS, 4)), OAK_DINING(8116, 13294, 22,
				240, new Item(HouseConstants.OAK_PLANK, 4)), CARVED_OAK_DINING(
				8117, 13295, 31, 360, new Item(HouseConstants.OAK_PLANK, 6)), TEAK_DINING(
				8118, 13296, 38, 360, new Item(HouseConstants.TEAK_PLANK, 4)), CARVED_TEAK_DINING(
				8119, 13297, 45, 600, new Item(HouseConstants.TEAK_PLANK, 6),
				new Item(HouseConstants.BOLT_OF_CLOTH, 4)), MAHOGANY_DINING(
				8120, 13298, 52, 840,
				new Item(HouseConstants.MAHOGANY_PLANK, 6)), OPULENT_TABLE(
				8121, 13299, 72, 3100, new Item(HouseConstants.MAHOGANY_PLANK,
						6), new Item(HouseConstants.BOLT_OF_CLOTH, 4),
				new Item(HouseConstants.GOLD_LEAF, 2), new Item(
						HouseConstants.MARBLE_BLOCK, 2))
		// DINING BENCHES
		, WOOD_BENCH(8108, 13300, 10, 115, new Item(HouseConstants.PLANK, 4),
				new Item(HouseConstants.NAILS, 4)), OAK_BENCH(8109, 13301, 22,
				240, new Item(HouseConstants.OAK_PLANK, 4)), CARVED_OAK_BENCH(
				8110, 13302, 31, 240, new Item(HouseConstants.OAK_PLANK, 4)), TEAK_BENCH(
				8111, 13303, 38, 360, new Item(HouseConstants.TEAK_PLANK, 4)), CARVED_TEAK_BENCH(
				8112, 13304, 44, 360, new Item(HouseConstants.TEAK_PLANK, 4)), MAHOGANY_BENCH(
				8113, 13305, 52, 560,
				new Item(HouseConstants.MAHOGANY_PLANK, 4)), GILDED_BENCH(8114,
				13306, 61, 1760, new Item(HouseConstants.MAHOGANY_PLANK, 4),
				new Item(HouseConstants.GOLD_LEAF, 4))
		// ROPE PULL
		, ROPE_BELL_PULL(8099, 13307, 26, 64, new Item(
				HouseConstants.OAK_PLANK, 1), new Item(954, 1)), BELL_PULL(
				8100, 13308, 37, 120, new Item(HouseConstants.TEAK_PLANK, 1),
				new Item(HouseConstants.BOLT_OF_CLOTH, 2)), POSH_BELL_PULL(
				8101, 13309, 60, 420, new Item(HouseConstants.TEAK_PLANK, 1),
				new Item(HouseConstants.BOLT_OF_CLOTH, 2), new Item(
						HouseConstants.GOLD_LEAF, 1))
		// DECORATION
		, OAK_DECORATION(8102, 13606, 16, 120, new Item(
				HouseConstants.OAK_PLANK, 2)), TEAK_DECORATION(8103, 13607, 36,
				180, new Item(HouseConstants.TEAK_PLANK, 2)), GILDED_DECORATION(
				8104, 13608, 56, 1020, new Item(HouseConstants.MAHOGANY_PLANK,
						3), new Item(HouseConstants.GOLD_LEAF, 2))

		// WORKSPACE
		// CRAFTING TABLE
		, CRAFTING_TABLE(8380, 13709, 16, 240, new Item(
				HouseConstants.OAK_PLANK, 4)), CRAFTING_TABLE_2(8381, 13710,
				25, 1, new Item(HouseConstants.MOLTEN_GLASS, 1)), CRAFTING_TABLE_3(
				8382, 13711, 34, 2, new Item(HouseConstants.MOLTEN_GLASS, 2)), CRAFTING_TABLE_4(
				8383, 13712, 42, 120, new Item(HouseConstants.OAK_PLANK, 2))
		// WORKBENCH
		, WOODEN_WORKBENCH(8375, 13704, 17, 143, new Item(HouseConstants.PLANK,
				5), new Item(HouseConstants.NAILS, 5)), OAK_WORKBENCH(8376,
				13705, 32, 300, new Item(HouseConstants.OAK_PLANK, 5)), STEEL_FRAMED_WORKBENCH(
				8377, 13706, 46, 440, new Item(HouseConstants.OAK_PLANK, 6),
				new Item(HouseConstants.STEEL_BAR, 4)), BENCH_WITH_VICE(8378,
				13707, 62, 140, new Item(HouseConstants.OAK_PLANK, 2),
				new Item(HouseConstants.STEEL_BAR, 1)), BENCH_WITH__A_LATHE(
				8379, 13708, 77, 140, new Item(HouseConstants.OAK_PLANK, 2),
				new Item(HouseConstants.STEEL_BAR, 1))

		// GAMES ROOM
		// COMBAT STONE
		, CLAY_ATTACK_STONE(8153, 13392, 39, 100, new Item(
				HouseConstants.SOFT_CLAY, 10)), LIMESTONE_ATTACK_STONE(8154,
				13393, 59, 200, new Item(HouseConstants.LIMESTONE_BRICKS, 10)), MARBLE_ATTACK_STONE(
				8154, 13393, 59, 2000, new Item(HouseConstants.MARBLE_BLOCK, 4))
		// RANGING GAME
		, HOOP_AND_STICK(8162, 13399, 30, 120, new Item(
				HouseConstants.OAK_PLANK, 2)), DART_BOARD(8163, 13400, 54, 290,
				new Item(HouseConstants.TEAK_PLANK, 3), new Item(
						HouseConstants.STEEL_BAR, 1)), ARCHERY_TARGET(8164,
				13402, 81, 600, new Item(HouseConstants.TEAK_PLANK, 6),
				new Item(HouseConstants.STEEL_BAR, 3))
		// PRIZE CHEST
		, OAK_PRIZE_CHEST(8165, 13385, 34, 240, new Item(
				HouseConstants.OAK_PLANK, 4)), TEAK_PRIZE_CHEST(8166, 13387,
				44, 660, new Item(HouseConstants.TEAK_PLANK, 4)), GILDED_PRIZE_CHEST(
				8167, 13389, 44, 860,
				new Item(HouseConstants.MAHOGANY_PLANK, 4), new Item(
						HouseConstants.GOLD_LEAF, 1))
		// ELEMENTAL BALANCE
		, ELEMENTAL_BALANCE_1(8156, 13395, 37, 176, new Item(554, 500),
				new Item(555, 500), new Item(556, 500), new Item(557, 500)), ELEMENTAL_BALANCE_2(
				8157, 13396, 57, 252, new Item(554, 1000), new Item(555, 1000),
				new Item(556, 1000), new Item(557, 1000)), ELEMENTAL_BALANCE_3(
				8158, 13397, 77, 356, new Item(554, 2000), new Item(555, 2000),
				new Item(556, 2000), new Item(557, 2000))
		// GAME SPACE
		, JESTER(8159, 13390, 39, 360, new Item(HouseConstants.TEAK_PLANK, 4)), TREASURE_HUNT(
				8160, 13379, 49, 800, new Item(HouseConstants.TEAK_PLANK, 8),
				new Item(HouseConstants.STEEL_BAR, 4)), HANGMAN(8161, 13404,
				59, 1200, new Item(HouseConstants.TEAK_PLANK, 12), new Item(
						HouseConstants.STEEL_BAR, 6))
		// BOXING ROOM
		// COMBAT RING
		, GLOVE_RACK(8028, 13381, 34, 120,
				new Item(HouseConstants.OAK_PLANK, 2)), WEAPON_RACK(8029,
				13382, 44, 180, new Item(HouseConstants.TEAK_PLANK, 2)), EXTRA_WEAPON_RACK(
				8030, 13383, 54, 440, new Item(HouseConstants.TEAK_PLANK, 4),
				new Item(HouseConstants.STEEL_BAR, 4))

		/*
		 * , COMBAT_RING(new int[] {15277, 15278, 15279, 15280, 15281, 15282,
		 * 15286, 15287 //ring , 15289, 15290, 15294, 15295 //2 side , 15288,
		 * 15291, 15293 , 15292 }, false, HObject.BOXING_RING) //0side
		 */, BOXING_RING(8023, new int[] { 13129, 13129, 13129, 13129, 13129,
				13129, 13129, 13129, 13126, 13126, 13126, 13126, 13128, 13128,
				13128, 13127 }, 32, 570, new Item(HouseConstants.OAK_PLANK, 6),
				new Item(HouseConstants.BOLT_OF_CLOTH, 4)), FENCING_RING(8024,
				new int[] { 13133, 13133, 13133, 13133, 13133, 13133, 13133,
						13133, 13135, 13135, 13135, 13135, 13134, 13134, 13134,
						13136 }, 31, 570,
				new Item(HouseConstants.OAK_PLANK, 6), new Item(
						HouseConstants.BOLT_OF_CLOTH, 6)), COMBAT_RING(8025,
				new int[] { 13137, 13137, 13137, 13137, 13137, 13137, 13137,
						13137, 13138, 13138, 13138, 13138, 13139, 13139, 13139,
						13140 }, 51, 630,
				new Item(HouseConstants.TEAK_PLANK, 6), new Item(
						HouseConstants.BOLT_OF_CLOTH, 6))
		// MAP SPACE
		, MAP_SMALL(8294, 13525, 38, 211,
				new Item(HouseConstants.TEAK_PLANK, 3), new Item(8004, 1)), MAP_MEDIUM(
				8295, 13526, 58, 451,
				new Item(HouseConstants.MAHOGANY_PLANK, 3), new Item(8005, 1)), MAP_LARGE(
				8296, 13527, 78, 591,
				new Item(HouseConstants.MAHOGANY_PLANK, 4), new Item(8006, 1))
		// SWORD
		, SILVERLIGHT_SWORD(8279, 13519, 42, 187, new Item(
				HouseConstants.TEAK_PLANK, 2), new Item(2402, 1)), EXCALIBER_SWORD(
				8280, 13521, 42, 194, new Item(HouseConstants.TEAK_PLANK, 2),
				new Item(35, 1)), DARKLIGHT_SWORD(8281, 13520, 42, 202,
				new Item(HouseConstants.TEAK_PLANK, 2), new Item(6746, 1))
		// GUILD_TROPHY
		, ANTIDRAGON_SHIELD(8282, 13522, 47, 280, new Item(
				HouseConstants.TEAK_PLANK, 3), new Item(1540, 1)), GLORY(8283,
				13523, 47, 290, new Item(HouseConstants.TEAK_PLANK, 3),
				new Item(1704, 1)), CAPE_OF_LEGENDS(8284, 13524, 47, 300,
				new Item(HouseConstants.TEAK_PLANK, 3), new Item(1052, 1))
		// PORTRAIT
		, KING_ARTHUR(8285, 13510, 35, 211, new Item(HouseConstants.TEAK_PLANK,
				2), new Item(7995)), ELENA(8286, 13511, 35, 211, new Item(
				HouseConstants.TEAK_PLANK, 2), new Item(7996)), GIANT_DWARF(
				8287, 13512, 35, 211, new Item(HouseConstants.TEAK_PLANK, 2),
				new Item(7997)), MISCELLENIA(8288, 13513, 55, 311, new Item(
				HouseConstants.MAHOGANY_PLANK, 2), new Item(7998))
		// LANDSCAPE
		, LUMBRIDGE(8289, 13517, 44, 314,
				new Item(HouseConstants.TEAK_PLANK, 3), new Item(8002, 1)), DESERT(
				8290, 13514, 44, 314, new Item(HouseConstants.TEAK_PLANK, 3),
				new Item(7999, 1)), MORTANYIA(8291, 13518, 44, 314, new Item(
				HouseConstants.TEAK_PLANK, 3), new Item(8003, 1)), KARAMJA(
				8292, 13516, 65, 464,
				new Item(HouseConstants.MAHOGANY_PLANK, 3), new Item(8001, 1)), ISFADAR(
				8293, 13515, 65, 464,
				new Item(HouseConstants.MAHOGANY_PLANK, 3), new Item(8000, 1))

		// STUDY ROOM
		// CHARTS
		, ALCHEMICAL_CHART(8354, 13662, 43, 30, new Item(
				HouseConstants.BOLT_OF_CLOTH, 2)), ASTRONOMICAL_CHART(8355,
				13663, 63, 45, new Item(HouseConstants.BOLT_OF_CLOTH, 3)), INFERNAL(
				8356, 13664, 83, 60, new Item(HouseConstants.BOLT_OF_CLOTH, 4))
		// TELESCOPE
		, WOODEN_TELESCOPE(8348, 13656, 44, 121, new Item(
				HouseConstants.OAK_PLANK, 2), new Item(
				HouseConstants.MOLTEN_GLASS, 1)), TEAK_TELESCOPE(8348, 13656,
				64, 181, new Item(HouseConstants.TEAK_PLANK, 2), new Item(
						HouseConstants.MOLTEN_GLASS, 1)), MAHOGANY_TELESCOPE(
				8349, 13657, 84, 580,
				new Item(HouseConstants.MAHOGANY_PLANK, 2), new Item(
						HouseConstants.MOLTEN_GLASS, 1))
		// CRYSTAL BALL
		, CRYSTAL_BALL(8351, 13659, 42, 280, new Item(
				HouseConstants.TEAK_PLANK, 3), new Item(567, 1)), ELEMENTAL_SPHERE(
				8352, 13660, 54, 580, new Item(HouseConstants.TEAK_PLANK, 3),
				new Item(567, 1), new Item(HouseConstants.GOLD_LEAF, 1)), CRYSTAL_OF_POWER(
				8353, 13661, 66, 890,
				new Item(HouseConstants.MAHOGANY_PLANK, 2), new Item(567, 1),
				new Item(HouseConstants.GOLD_LEAF, 2))
		// GLOBE
		, GLOBE(8341, 13649, 41, 180, new Item(HouseConstants.OAK_PLANK, 3)), ORNAMENTAL_GLOBE(
				8342, 13650, 50, 270, new Item(HouseConstants.TEAK_PLANK, 3)), LUNAR_GLOBE(
				8343, 13651, 59, 570, new Item(HouseConstants.TEAK_PLANK, 3),
				new Item(HouseConstants.GOLD_LEAF, 1)), CELESTIAL_GLOBE(8344,
				13652, 68, 570, new Item(HouseConstants.TEAK_PLANK, 3),
				new Item(HouseConstants.GOLD_LEAF, 1)), ARMILLARY_SPHERE(8345,
				13653, 77, 960, new Item(HouseConstants.MAHOGANY_PLANK, 2),
				new Item(HouseConstants.GOLD_LEAF, 2), new Item(
						HouseConstants.STEEL_BAR, 4)), SMALL_ORRERY(8346,
				13654, 86, 1320, new Item(HouseConstants.MAHOGANY_PLANK, 3),
				new Item(HouseConstants.GOLD_LEAF, 3)), LARGE_ORRERY(8347,
				13655, 95, 1420, new Item(HouseConstants.MAHOGANY_PLANK, 3),
				new Item(HouseConstants.GOLD_LEAF, 5))
		// LECTURNS
		, OAK_LECTURN(8334, 13642, 40, 60,
				new Item(HouseConstants.OAK_PLANK, 1)), EAGLE_LECTURN(8335,
				13643, 47, 120, new Item(HouseConstants.OAK_PLANK, 2)), DEMON_LECTURN(
				8336, 13644, 47, 120, new Item(HouseConstants.OAK_PLANK, 2)), TEAK_EAGLE_LECTURN(
				8337, 13645, 57, 180, new Item(HouseConstants.TEAK_PLANK, 2)), TEAK_DEMON_LECTURN(
				8338, 13646, 57, 180, new Item(HouseConstants.TEAK_PLANK, 2)), MAHOGANY_EAGLE_LECTURN(
				8339, 13647, 67, 580,
				new Item(HouseConstants.MAHOGANY_PLANK, 2), new Item(
						HouseConstants.GOLD_LEAF, 1)), MAHOGANY_DEMON_LECTURN(
				8340, 13648, 67, 580,
				new Item(HouseConstants.MAHOGANY_PLANK, 2), new Item(
						HouseConstants.GOLD_LEAF, 1))
		// STATUE I'ma just make it auto-completed
		, LECTURN_STATUE(15521, 48642, 1, 1.5, new Item(
				HouseConstants.MAHOGANY_PLANK, 2), new Item(
				HouseConstants.STEEL_BAR, 10))

		// COSTUME ROOM
		// TREASURE CHEST
		, OAK_TREASURE_CHEST(9839, 18804, 48, 120, new Item(
				HouseConstants.OAK_PLANK, 2)), TEAK_TREASURE_CHEST(9840, 18806,
				66, 180, new Item(HouseConstants.TEAK_PLANK, 2)), MAHOGANY_TREASURE_CHEST(
				9841, 18808, 84, 280,
				new Item(HouseConstants.MAHOGANY_PLANK, 2))
		// ARMOUR CASE
		, OAK_ARMOUR_CASE(9826, 18778, 46, 180, new Item(
				HouseConstants.OAK_PLANK, 3)), TEAK_ARMOUR_CASE(9827, 18780,
				64, 270, new Item(HouseConstants.TEAK_PLANK, 3)), MAHOGANY_ARMOUR_CASE(
				9828, 18782, 82, 420,
				new Item(HouseConstants.MAHOGANY_PLANK, 3))
		// MAGIC WARDROBE

		// CHAPEL
		// ALTAR
		, OAK_ALTAR(8062, 13179, 45, 240, new Item(HouseConstants.OAK_PLANK, 4)), TEAK_ALTAR(
				8063, 13181, 50, 360, new Item(HouseConstants.TEAK_PLANK, 4)), CLOTH_ALTAR(
				8064, 13183, 56, 390, new Item(HouseConstants.TEAK_PLANK, 4),
				new Item(HouseConstants.BOLT_OF_CLOTH, 2)), MAHOGANY_ALTAR(
				8065, 13185, 60, 590,
				new Item(HouseConstants.MAHOGANY_PLANK, 4), new Item(
						HouseConstants.BOLT_OF_CLOTH, 2)), LIMESTONE_ALTAR(
				8066, 13187, 64, 910,
				new Item(HouseConstants.MAHOGANY_PLANK, 6), new Item(
						HouseConstants.BOLT_OF_CLOTH, 2), new Item(
						HouseConstants.LIMESTONE_BRICKS, 2)), MARBLE_ALTAR(
				8067, 13189, 70, 1030,
				new Item(HouseConstants.MARBLE_BLOCK, 2), new Item(
						HouseConstants.BOLT_OF_CLOTH, 2)), GUILDED_ALTAR(8068,
				13191, 75, 2230, new Item(HouseConstants.MARBLE_BLOCK, 2),
				new Item(HouseConstants.BOLT_OF_CLOTH, 2), new Item(
						HouseConstants.GOLD_LEAF, 4))
		// LAMPS
		, WOODEN_TORCHES(8069, 13200, 49, 58, new Item(
				HouseConstants.OAK_PLANK, 2), new Item(HouseConstants.NAILS, 5)), STEEL_TORCHES(
				8070, 13201, 45, 80, new Item(HouseConstants.STEEL_BAR, 2)), STEEL_CANDLESTICK(
				8071, 13202, 53, 124, new Item(HouseConstants.STEEL_BAR, 6),
				new Item(36, 6)), GOLD_CANDLESTICK(8072, 13203, 57, 46,
				new Item(2357, 6), new Item(36, 6)), INSCENCE_BURNER(8073,
				13204, 61, 280, new Item(HouseConstants.OAK_PLANK, 4),
				new Item(HouseConstants.STEEL_BAR, 2)), MAHOGANY_BURNER(8074,
				13205, 65, 600, new Item(HouseConstants.MAHOGANY_PLANK, 4),
				new Item(HouseConstants.STEEL_BAR, 2)), MARBLE_BURNER(8075,
				13206, 69, 1600, new Item(HouseConstants.MARBLE_BLOCK, 2),
				new Item(HouseConstants.STEEL_BAR, 2))
		// SYMBOL
		, GUTHIX_SYMBOL(8057, 13174, 48, 120, new Item(
				HouseConstants.OAK_PLANK, 2)), SARADOMIN_SYMBOL(8055, 13172,
				48, 120, new Item(HouseConstants.OAK_PLANK, 2)), ZAMORAK_SYMBOL(
				8056, 13173, 48, 120, new Item(HouseConstants.OAK_PLANK, 2)), GUTHIX_ICON(
				8060, 13177, 59, 960, new Item(HouseConstants.TEAK_PLANK, 4),
				new Item(HouseConstants.GOLD_LEAF, 2)), SARADOMIN_ICON(8058,
				13175, 59, 960, new Item(HouseConstants.TEAK_PLANK, 4),
				new Item(HouseConstants.GOLD_LEAF, 2)), ZAMORAK_ICON(8059,
				13173, 59, 960, new Item(HouseConstants.TEAK_PLANK, 4),
				new Item(HouseConstants.GOLD_LEAF, 2)), ICON_OF_BOB(8061,
				13178, 71, 1160, new Item(HouseConstants.TEAK_PLANK, 4),
				new Item(HouseConstants.GOLD_LEAF, 2))
		// MUSIC
		, WINCHIMES(8079, 13214, 49, 323,
				new Item(HouseConstants.OAK_PLANK, 4), new Item(
						HouseConstants.NAILS, 4), new Item(
						HouseConstants.STEEL_BAR, 4)), BELLS(8080, 13215, 58,
				480, new Item(HouseConstants.TEAK_PLANK, 4), new Item(
						HouseConstants.STEEL_BAR, 6)), ORGAN(8081, 13216, 69,
				680, new Item(HouseConstants.MAHOGANY_PLANK, 4), new Item(
						HouseConstants.STEEL_BAR, 6))
		// STATUE
		, SMALL_STATUE(8082, 13271, 49, 40, new Item(
				HouseConstants.LIMESTONE_BRICKS, 2)), MEDIUM_STATUE(8083,
				13275, 69, 500, new Item(HouseConstants.MARBLE_BLOCK, 1)), LARGE_STATUE(
				8084, 13279, 89, 1500, new Item(HouseConstants.MARBLE_BLOCK, 3))
		// WINDOWS
		, SHUTTERED_WINDOW(8076, new int[] { 13253, 13226, 13235, 13244, 13217,
				13262, 39232 }, 49, 228, new Item(HouseConstants.PLANK, 8),
				new Item(HouseConstants.NAILS, 8)), DECORATIVE_WINDOW(8077,
				new int[] { 13254, 13227, 13236, 13245, 13218, 13263, 39253 },
				69, 4, new Item(HouseConstants.MOLTEN_GLASS, 8)), STAINED_GLASS(
				8078, new int[] { 13255, 13228, 13237, 13246, 13219, 13264,
						39254 }, 89, 5, new Item(HouseConstants.MOLTEN_GLASS,
						16));

		private int itemId, level;
		private int[] ids;
		private double xp;
		private Item[] reqs;

		private HObject(int itemId, int id, int level, double xp, Item... reqs) {
			this(itemId, new int[] { id }, level, xp, reqs);
		}

		private HObject(int itemId, int[] ids, int level, double xp,
				Item... reqs) {
			this.itemId = itemId;
			this.ids = ids;
			this.level = level;
			this.xp = xp;
			this.reqs = reqs;
		}

		public int getId() {
			return ids[0];
		}

		public int[] getIds() {
			return ids;
		}

		public int getItemId() {
			return itemId;
		}

		public int getLevel() {
			return level;
		}

		public Item[] getRequirements() {
			return reqs;
		}

		public double getXP() {
			return xp;
		}
	}

	public static enum POHLocation {

		RIMMINGTON(new Tile(2953, 3225, 0), 1, 5000),

		TAVERLY(new Tile(2882, 3452, 0), 10, 5000),

		POLLNIVNEACH(new Tile(3340, 3003, 0), 20, 7500),

		RELLEKKE(new Tile(2670, 3631, 0), 30, 10000),

		BRIMHAVEN(new Tile(2757, 3178, 0), 40, 15000),

		YANILLE(new Tile(2544, 3096, 0), 50, 25000);

		private Tile tile;
		private int levelRequired, cost;

		private POHLocation(Tile tile, int levelRequired, int cost) {
			this.tile = tile;
			this.levelRequired = levelRequired;
			this.cost = cost;
		}

		public int getCost() {
			return cost;
		}

		public int getLevelRequired() {
			return levelRequired;
		}

		public Tile getTile() {
			return tile;
		}
	}

	public static enum Roof {

		ROOF1(233, 634, MapBuilder.NORTH, MapBuilder.SOUTH), ROOF2(235, 634,
				MapBuilder.NORTH, MapBuilder.EAST, MapBuilder.SOUTH), ROOF3(
				235, 634, MapBuilder.NORTH, MapBuilder.EAST, MapBuilder.SOUTH,
				MapBuilder.NORTH), DUNGEON_ROOF1(235, 632, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.NORTH);

		private int chunkX;
		private int chunkY;
		@SuppressWarnings("unused")
		private int[] dirs;

		private Roof(int chunkX, int chunkY, int... dirs) {
			this.chunkX = chunkX;
			this.chunkY = chunkY;
			this.dirs = dirs;
		}

		public int getChunkX() {
			return chunkX;
		}

		public int getChunkY() {
			return chunkY;
		}
	}

	public static enum Room {
		// done
		PARLOUR(1000, 1, 232, 639, true, MapBuilder.EAST, MapBuilder.SOUTH,
				MapBuilder.WEST)
		// done
		, GARDEN(1000, 1, 232, 633, false, MapBuilder.NORTH, MapBuilder.EAST,
				MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, KITCHEN(5000, 5, 234, 639, true, MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, DINING_ROOM(5000, 10, 236, 639, true, MapBuilder.EAST,
				MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, WORKSHOP(10000, 15, 232, 637, true, MapBuilder.NORTH,
				MapBuilder.SOUTH)
		// done
		, BEDROOM(10000, 20, 238, 639, true, MapBuilder.NORTH, MapBuilder.WEST)
		// done
		, HALL_SKILL(15000, 25, 233, 638, true, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, GAMES_ROOM(25000, 30, 237, 636, true, MapBuilder.EAST,
				MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, COMBAT_ROOM(25000, 32, 235, 636, true, MapBuilder.EAST,
				MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, HALL_QUEST(25000, 35, 237, 638, true, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, MENAGERIE(30000, 37, 247, 634, false, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, STUDY(50000, 40, 236, 637, true, MapBuilder.EAST, MapBuilder.SOUTH,
				MapBuilder.WEST),
		// done
		COSTUME_ROOM(50000, 42, 246, 633, true, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, CHAPEL(50000, 45, 234, 637, true, MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, PORTAL_CHAMBER(100000, 50, 233, 636, true, MapBuilder.SOUTH)
		// done
		, FORMAL_GARDEN(75000, 55, 234, 633, false, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, THRONE_ROOM(150000, 60, 238, 637, true, MapBuilder.SOUTH), OUTBLIETTE(
				150000, 65, 232, 633, false, MapBuilder.NORTH, MapBuilder.EAST,
				MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, DUNGEON_CORRIDOR(7500, 70, 236, 635, false, MapBuilder.NORTH,
				MapBuilder.SOUTH)
		// done
		, DUNGEON_JUNCTION(7500, 70, 232, 635, false, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, DUNGEON_STAIRS(7500, 70, 234, 635, false, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, DUNGEON_PIT(10000, 70, 237, 634, false, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.WEST)
		// done
		, TREASURE_ROOM(250000, 75, 238, 633, true, MapBuilder.SOUTH)

		// hall skill down
		, HALL_SKILL_DOWN(15000, 25, 235, 638, true, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.WEST)

		// hall quest down
		, HALL_QUEST_DOWN(25000, 35, 239, 638, true, MapBuilder.NORTH,
				MapBuilder.EAST, MapBuilder.SOUTH, MapBuilder.WEST);
		private int price, level;
		private int chunkX;
		private int chunkY;
		private boolean showRoof;
		@SuppressWarnings("unused")
		// might be useful on future
		private int[] doorDirs;

		private Room(int price, int level, int chunkX, int chunkY,
				boolean showRoof, int... doorDirs) {
			this.price = price;
			this.chunkX = chunkX;
			this.chunkY = chunkY;
			this.showRoof = showRoof;
			this.doorDirs = doorDirs;
		}

		public int getChunkX() {
			return chunkX;
		}

		public int getChunkY() {
			return chunkY;
		}

		public int getLevel() {
			return level;
		}

		public int getPrice() {
			return price;
		}

		public boolean isShowRoof() {
			return showRoof;
		}

	}
}
