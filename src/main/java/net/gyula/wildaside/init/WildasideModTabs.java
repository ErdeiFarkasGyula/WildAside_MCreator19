
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WildasideModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("wildaside", "wildaside_tab"),
				builder -> builder.title(Component.translatable("item_group.wildaside.wildaside_tab")).icon(() -> new ItemStack(WildasideModBlocks.VIBRION_BLOCK.get())).displayItems((parameters, tabData) -> {
					tabData.accept(WildasideModItems.VIBRION.get());
					tabData.accept(WildasideModBlocks.VIBRION_BLOCK.get().asItem());
					tabData.accept(WildasideModBlocks.VIBRION_GEL.get().asItem());
					tabData.accept(WildasideModBlocks.VIBRION_GLASS.get().asItem());
					tabData.accept(WildasideModBlocks.LIT_VIBRION_GLASS.get().asItem());
					tabData.accept(WildasideModBlocks.VIBRION_GLASS_PANE.get().asItem());
					tabData.accept(WildasideModBlocks.LIT_VIBRION_GLASS_PANE.get().asItem());
					tabData.accept(WildasideModBlocks.VIBRION_ROOTS.get().asItem());
					tabData.accept(WildasideModBlocks.HANGING_VIBRION_VINES.get().asItem());
					tabData.accept(WildasideModBlocks.VIBRION_SPOREHOLDER.get().asItem());
					tabData.accept(WildasideModItems.ENTORIUM.get());
					tabData.accept(WildasideModItems.ENTORIUM_PILL.get());
					tabData.accept(WildasideModItems.ENTORIUM_SPOREBOMB.get());
					tabData.accept(WildasideModItems.ENTORIUM_GAUNTLET.get());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_SHROOM.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_STEM.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_WOOD.get().asItem());
					tabData.accept(WildasideModBlocks.STRIPPED_SUBSTILIUM_STEM.get().asItem());
					tabData.accept(WildasideModBlocks.STRIPPED_SUBSTILIUM_BLOCK.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_PLANKS.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_STAIRS.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_SLAB.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_FENCE.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_FENCE_GATE.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_PRESSURE_PLATE.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_BUTTON.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_DOOR.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_TRAPDOOR.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_SPROUTS.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_SOIL.get().asItem());
					tabData.accept(WildasideModBlocks.OVERGROWN_ENTORIUM_ORE.get().asItem());
					tabData.accept(WildasideModBlocks.ENTORIUM_ORE.get().asItem());
					tabData.accept(WildasideModBlocks.NATURAL_SPORE_BLASTER.get().asItem());
					tabData.accept(WildasideModBlocks.SPORE_BLASTER.get().asItem());
					tabData.accept(WildasideModBlocks.BIOENGINEER_WORKSPACE.get().asItem());
					tabData.accept(WildasideModBlocks.COMPRESSED_SUBSTILIUM_SOIL.get().asItem());
					tabData.accept(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL.get().asItem());
					tabData.accept(WildasideModBlocks.CHISELED_SUBSTILIUM_SOIL.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_SOIL_TILES.get().asItem());
					tabData.accept(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILES.get().asItem());
					tabData.accept(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL_STAIRS.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_SOIL_TILE_STAIRS.get().asItem());
					tabData.accept(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILE_STAIRS.get().asItem());
					tabData.accept(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL_SLAB.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_SOIL_TILE_SLAB.get().asItem());
					tabData.accept(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILE_SLAB.get().asItem());
					tabData.accept(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL_WALL.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_SOIL_TILE_WALL.get().asItem());
					tabData.accept(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILE_WALL.get().asItem());
					tabData.accept(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL_PRESSURE_PLATE.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_SOIL_TILE_PRESSURE_PLATE.get().asItem());
					tabData.accept(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILE_PRESSURE_PLATE.get().asItem());
					tabData.accept(WildasideModBlocks.SMOOTH_SUBSTILIUM_SOIL_BUTTON.get().asItem());
					tabData.accept(WildasideModBlocks.SUBSTILIUM_SOIL_TILE_BUTTON.get().asItem());
					tabData.accept(WildasideModBlocks.CRACKED_SUBSTILIUM_SOIL_TILE_BUTTON.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_LOG.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_WOOD.get().asItem());
					tabData.accept(WildasideModBlocks.STRIPPED_HICKORY_LOG.get().asItem());
					tabData.accept(WildasideModBlocks.STRIPPED_HICKORY_BLOCK.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_PLANKS.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_STAIRS.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_SLAB.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_FENCE.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_FENCE_GATE.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_PRESSURE_PLATE.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_BUTTON.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_DOOR.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_TRAPDOOR.get().asItem());
					tabData.accept(WildasideModBlocks.HICKORY_LEAVES.get().asItem());
					tabData.accept(WildasideModBlocks.RED_GLOWING_HICKORY_LEAVES.get().asItem());
					tabData.accept(WildasideModBlocks.BROWN_GLOWING_HICKORY_LEAVES.get().asItem());
					tabData.accept(WildasideModBlocks.YELLOW_GLOWING_HICKORY_LEAVES.get().asItem());
					tabData.accept(WildasideModBlocks.GREEN_GLOWING_HICKORY_LEAVES.get().asItem());
					tabData.accept(WildasideModBlocks.FALLEN_HICKORY_LEAVES.get().asItem());
					tabData.accept(WildasideModBlocks.FALLEN_RED_GLOWING_HICKORY_LEAVES.get().asItem());
					tabData.accept(WildasideModBlocks.FALLEN_BROWN_GLOWING_HICKORY_LEAVES.get().asItem());
					tabData.accept(WildasideModBlocks.FALLEN_YELLOW_GLOWING_HICKORY_LEAVES.get().asItem());
					tabData.accept(WildasideModBlocks.FALLEN_GREEN_GLOWING_HICKORY_LEAVES.get().asItem());
					tabData.accept(WildasideModItems.HICKORY_NUT.get());
					tabData.accept(WildasideModBlocks.HICKORY_SAPLING.get().asItem());
					tabData.accept(WildasideModBlocks.RED_GLOWING_HICKORY_SAPLING.get().asItem());
					tabData.accept(WildasideModBlocks.BROWN_GLOWING_HICKORY_SAPLING.get().asItem());
					tabData.accept(WildasideModBlocks.YELLOW_GLOWING_HICKORY_SAPLING.get().asItem());
					tabData.accept(WildasideModBlocks.GREEN_GLOWING_HICKORY_SAPLING.get().asItem());
					tabData.accept(WildasideModBlocks.PANXTER_FLOWER.get().asItem());
					tabData.accept(WildasideModBlocks.SPOTTED_WINTERGREEN.get().asItem());
					tabData.accept(WildasideModItems.RED_GLOWING_ESSENCE.get());
					tabData.accept(WildasideModItems.BROWN_GLOWING_ESSENCE.get());
					tabData.accept(WildasideModItems.YELLOW_GLOWING_ESSENCE.get());
					tabData.accept(WildasideModItems.GREEN_GLOWING_ESSENCE.get());
					tabData.accept(WildasideModItems.RUTILLION.get());
					tabData.accept(WildasideModBlocks.BALD_CYPRESS_LOG.get().asItem());
					tabData.accept(WildasideModBlocks.BALD_CYPRESS_WOOD.get().asItem());
					tabData.accept(WildasideModBlocks.BALD_CYPRESS_PLANKS.get().asItem());
					tabData.accept(WildasideModBlocks.BALD_CYPRESS_LEAVES.get().asItem());
					tabData.accept(WildasideModBlocks.STRIPPED_BALD_CYPRESS_LOG.get().asItem());
					tabData.accept(WildasideModBlocks.STRIPPED_BALD_CYPRESS_WOOD.get().asItem());
					tabData.accept(WildasideModBlocks.BALD_CYPRESS_STAIRS.get().asItem());
					tabData.accept(WildasideModBlocks.BALD_CYPRESS_SLAB.get().asItem());
					tabData.accept(WildasideModBlocks.BALD_CYPRESS_FENCE.get().asItem());
					tabData.accept(WildasideModBlocks.BALD_CYPRESS_FENCE_GATE.get().asItem());
					tabData.accept(WildasideModBlocks.BALD_CYPRESS_PRESSURE_PLATE.get().asItem());
					tabData.accept(WildasideModBlocks.BALD_CYPRESS_BUTTON.get().asItem());
				})

		);
	}
}
