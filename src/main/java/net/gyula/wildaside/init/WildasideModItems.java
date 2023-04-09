
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.gyula.wildaside.item.YellowGlowingEssenceItem;
import net.gyula.wildaside.item.VibrionItem;
import net.gyula.wildaside.item.RutillionItem;
import net.gyula.wildaside.item.RedGlowingEssenceItem;
import net.gyula.wildaside.item.HickoryNutItem;
import net.gyula.wildaside.item.GreenGlowingEssenceItem;
import net.gyula.wildaside.item.EntoriumSporebombItem;
import net.gyula.wildaside.item.EntoriumPillItem;
import net.gyula.wildaside.item.EntoriumItem;
import net.gyula.wildaside.item.EntoriumGauntletItem;
import net.gyula.wildaside.item.BrownGlowingEssenceItem;
import net.gyula.wildaside.WildasideMod;

public class WildasideModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WildasideMod.MODID);
	public static final RegistryObject<Item> VIBRION = REGISTRY.register("vibrion", () -> new VibrionItem());
	public static final RegistryObject<Item> VIBRION_BLOCK = block(WildasideModBlocks.VIBRION_BLOCK, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GEL = block(WildasideModBlocks.VIBRION_GEL, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GLASS = block(WildasideModBlocks.VIBRION_GLASS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> LIT_VIBRION_GLASS = block(WildasideModBlocks.LIT_VIBRION_GLASS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GLASS_PANE = block(WildasideModBlocks.VIBRION_GLASS_PANE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> LIT_VIBRION_GLASS_PANE = block(WildasideModBlocks.LIT_VIBRION_GLASS_PANE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_ROOTS = block(WildasideModBlocks.VIBRION_ROOTS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HANGING_VIBRION_VINES = block(WildasideModBlocks.HANGING_VIBRION_VINES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_SPOREHOLDER = block(WildasideModBlocks.VIBRION_SPOREHOLDER, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> ENTORIUM = REGISTRY.register("entorium", () -> new EntoriumItem());
	public static final RegistryObject<Item> ENTORIUM_PILL = REGISTRY.register("entorium_pill", () -> new EntoriumPillItem());
	public static final RegistryObject<Item> ENTORIUM_SPOREBOMB = REGISTRY.register("entorium_sporebomb", () -> new EntoriumSporebombItem());
	public static final RegistryObject<Item> ENTORIUM_GAUNTLET = REGISTRY.register("entorium_gauntlet", () -> new EntoriumGauntletItem());
	public static final RegistryObject<Item> SUBSTILIUM_SHROOM = block(WildasideModBlocks.SUBSTILIUM_SHROOM, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_STEM = block(WildasideModBlocks.SUBSTILIUM_STEM, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_WOOD = block(WildasideModBlocks.SUBSTILIUM_WOOD, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> STRIPPED_SUBSTILIUM_STEM = block(WildasideModBlocks.STRIPPED_SUBSTILIUM_STEM, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> STRIPPED_SUBSTILIUM_BLOCK = block(WildasideModBlocks.STRIPPED_SUBSTILIUM_BLOCK, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_PLANKS = block(WildasideModBlocks.SUBSTILIUM_PLANKS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_STAIRS = block(WildasideModBlocks.SUBSTILIUM_STAIRS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SLAB = block(WildasideModBlocks.SUBSTILIUM_SLAB, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_FENCE = block(WildasideModBlocks.SUBSTILIUM_FENCE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_FENCE_GATE = block(WildasideModBlocks.SUBSTILIUM_FENCE_GATE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_PRESSURE_PLATE = block(WildasideModBlocks.SUBSTILIUM_PRESSURE_PLATE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_BUTTON = block(WildasideModBlocks.SUBSTILIUM_BUTTON, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_DOOR = doubleBlock(WildasideModBlocks.SUBSTILIUM_DOOR, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_TRAPDOOR = block(WildasideModBlocks.SUBSTILIUM_TRAPDOOR, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SPROUTS = block(WildasideModBlocks.SUBSTILIUM_SPROUTS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SOIL = block(WildasideModBlocks.SUBSTILIUM_SOIL, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> OVERGROWN_ENTORIUM_ORE = block(WildasideModBlocks.OVERGROWN_ENTORIUM_ORE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> ENTORIUM_ORE = block(WildasideModBlocks.ENTORIUM_ORE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> NATURAL_SPORE_BLASTER = block(WildasideModBlocks.NATURAL_SPORE_BLASTER, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SPORE_BLASTER = block(WildasideModBlocks.SPORE_BLASTER, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GROWTH_STEM = block(WildasideModBlocks.VIBRION_GROWTH_STEM, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> VIBRION_GROWTH_HEAD = block(WildasideModBlocks.VIBRION_GROWTH_HEAD, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> BIOENGINEER_WORKSPACE = block(WildasideModBlocks.BIOENGINEER_WORKSPACE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> COMPRESSED_SUBSTILIUM_SOIL = block(WildasideModBlocks.COMPRESSED_SUBSTILIUM_SOIL, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SMOOTH_SUBSTILIUM_SOIL = block(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> CHISELED_SUBSTILIUM_SOIL = block(WildasideModBlocks.CHISELED_SUBSTILIUM_SOIL, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SOIL_TILES = block(WildasideModBlocks.SUBSTILIUM_SOIL_TILES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> CRACKED_SUBSTILIUM_SOIL_TILES = block(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SMOOTH_SUBSTILIUM_SOIL_STAIRS = block(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL_STAIRS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SOIL_TILE_STAIRS = block(WildasideModBlocks.SUBSTILIUM_SOIL_TILE_STAIRS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> CRACKED_SUBSTILIUM_SOIL_TILE_STAIRS = block(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILE_STAIRS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SMOOTH_SUBSTILIUM_SOIL_SLAB = block(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL_SLAB, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SOIL_TILE_SLAB = block(WildasideModBlocks.SUBSTILIUM_SOIL_TILE_SLAB, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> CRACKED_SUBSTILIUM_SOIL_TILE_SLAB = block(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILE_SLAB, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SMOOTH_SUBSTILIUM_SOIL_WALL = block(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL_WALL, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SOIL_TILE_WALL = block(WildasideModBlocks.SUBSTILIUM_SOIL_TILE_WALL, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> CRACKED_SUBSTILIUM_SOIL_TILE_WALL = block(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILE_WALL, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SMOOTH_SUBSTILIUM_SOIL_PRESSURE_PLATE = block(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL_PRESSURE_PLATE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SOIL_TILE_PRESSURE_PLATE = block(WildasideModBlocks.SUBSTILIUM_SOIL_TILE_PRESSURE_PLATE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> CRACKED_SUBSTILIUM_SOIL_TILE_PRESSURE_PLATE = block(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILE_PRESSURE_PLATE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SMOOTH_SUBSTILIUM_SOIL_BUTTON = block(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL_BUTTON, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SUBSTILIUM_SOIL_TILE_BUTTON = block(WildasideModBlocks.SUBSTILIUM_SOIL_TILE_BUTTON, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> CRACKED_SUBSTILIUM_SOIL_TILE_BUTTON = block(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILE_BUTTON, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_LOG = block(WildasideModBlocks.HICKORY_LOG, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_WOOD = block(WildasideModBlocks.HICKORY_WOOD, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> STRIPPED_HICKORY_LOG = block(WildasideModBlocks.STRIPPED_HICKORY_LOG, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> STRIPPED_HICKORY_BLOCK = block(WildasideModBlocks.STRIPPED_HICKORY_BLOCK, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_PLANKS = block(WildasideModBlocks.HICKORY_PLANKS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_STAIRS = block(WildasideModBlocks.HICKORY_STAIRS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_SLAB = block(WildasideModBlocks.HICKORY_SLAB, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_FENCE = block(WildasideModBlocks.HICKORY_FENCE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_FENCE_GATE = block(WildasideModBlocks.HICKORY_FENCE_GATE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_PRESSURE_PLATE = block(WildasideModBlocks.HICKORY_PRESSURE_PLATE, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_BUTTON = block(WildasideModBlocks.HICKORY_BUTTON, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_DOOR = doubleBlock(WildasideModBlocks.HICKORY_DOOR, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_TRAPDOOR = block(WildasideModBlocks.HICKORY_TRAPDOOR, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_LEAVES = block(WildasideModBlocks.HICKORY_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> RED_GLOWING_HICKORY_LEAVES = block(WildasideModBlocks.RED_GLOWING_HICKORY_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> BROWN_GLOWING_HICKORY_LEAVES = block(WildasideModBlocks.BROWN_GLOWING_HICKORY_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> YELLOW_GLOWING_HICKORY_LEAVES = block(WildasideModBlocks.YELLOW_GLOWING_HICKORY_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> GREEN_GLOWING_HICKORY_LEAVES = block(WildasideModBlocks.GREEN_GLOWING_HICKORY_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> FALLEN_HICKORY_LEAVES = block(WildasideModBlocks.FALLEN_HICKORY_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> FALLEN_RED_GLOWING_HICKORY_LEAVES = block(WildasideModBlocks.FALLEN_RED_GLOWING_HICKORY_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> FALLEN_BROWN_GLOWING_HICKORY_LEAVES = block(WildasideModBlocks.FALLEN_BROWN_GLOWING_HICKORY_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> FALLEN_YELLOW_GLOWING_HICKORY_LEAVES = block(WildasideModBlocks.FALLEN_YELLOW_GLOWING_HICKORY_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> FALLEN_GREEN_GLOWING_HICKORY_LEAVES = block(WildasideModBlocks.FALLEN_GREEN_GLOWING_HICKORY_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> HICKORY_NUT = REGISTRY.register("hickory_nut", () -> new HickoryNutItem());
	public static final RegistryObject<Item> HICKORY_SAPLING = block(WildasideModBlocks.HICKORY_SAPLING, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> RED_GLOWING_HICKORY_SAPLING = block(WildasideModBlocks.RED_GLOWING_HICKORY_SAPLING, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> BROWN_GLOWING_HICKORY_SAPLING = block(WildasideModBlocks.BROWN_GLOWING_HICKORY_SAPLING, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> YELLOW_GLOWING_HICKORY_SAPLING = block(WildasideModBlocks.YELLOW_GLOWING_HICKORY_SAPLING, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> GREEN_GLOWING_HICKORY_SAPLING = block(WildasideModBlocks.GREEN_GLOWING_HICKORY_SAPLING, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> PANXTER_FLOWER = block(WildasideModBlocks.PANXTER_FLOWER, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> SPOTTED_WINTERGREEN = block(WildasideModBlocks.SPOTTED_WINTERGREEN, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> RED_GLOWING_ESSENCE = REGISTRY.register("red_glowing_essence", () -> new RedGlowingEssenceItem());
	public static final RegistryObject<Item> BROWN_GLOWING_ESSENCE = REGISTRY.register("brown_glowing_essence", () -> new BrownGlowingEssenceItem());
	public static final RegistryObject<Item> YELLOW_GLOWING_ESSENCE = REGISTRY.register("yellow_glowing_essence", () -> new YellowGlowingEssenceItem());
	public static final RegistryObject<Item> GREEN_GLOWING_ESSENCE = REGISTRY.register("green_glowing_essence", () -> new GreenGlowingEssenceItem());
	public static final RegistryObject<Item> RUTILLION = REGISTRY.register("rutillion", () -> new RutillionItem());
	public static final RegistryObject<Item> HANGING_VIBRION_VINES_PLANT = block(WildasideModBlocks.HANGING_VIBRION_VINES_PLANT, null);
	public static final RegistryObject<Item> SPORE_AIR = block(WildasideModBlocks.SPORE_AIR, null);
	public static final RegistryObject<Item> HICKORY_TREE_GROWER = block(WildasideModBlocks.HICKORY_TREE_GROWER, null);
	public static final RegistryObject<Item> GLOWING_HICKORY_TREE_GROWER = block(WildasideModBlocks.GLOWING_HICKORY_TREE_GROWER, null);
	public static final RegistryObject<Item> HANGING_VIBRION_VEGETATION_GROWER = block(WildasideModBlocks.HANGING_VIBRION_VEGETATION_GROWER, null);
	public static final RegistryObject<Item> SUBSTILIUM_TREE_GROWER = block(WildasideModBlocks.SUBSTILIUM_TREE_GROWER, null);
	public static final RegistryObject<Item> BALD_CYPRESS_LOG = block(WildasideModBlocks.BALD_CYPRESS_LOG, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> BALD_CYPRESS_PLANKS = block(WildasideModBlocks.BALD_CYPRESS_PLANKS, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> BALD_CYPRESS_WOOD = block(WildasideModBlocks.BALD_CYPRESS_WOOD, WildasideModTabs.TAB_WILDASIDE_TAB);
	public static final RegistryObject<Item> BALD_CYPRESS_LEAVES = block(WildasideModBlocks.BALD_CYPRESS_LEAVES, WildasideModTabs.TAB_WILDASIDE_TAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
