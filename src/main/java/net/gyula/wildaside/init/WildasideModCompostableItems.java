
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WildasideModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(WildasideModItems.VIBRION.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WildasideModItems.HICKORY_NUT.get(), 0.1f);
		ComposterBlock.COMPOSTABLES.put(WildasideModItems.RUTILLION.get(), 1f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.VIBRION_BLOCK.get().asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.SUBSTILIUM_SHROOM.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.HANGING_VIBRION_VINES_PLANT.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.HANGING_VIBRION_VINES.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.VIBRION_SPOREHOLDER.get().asItem(), 1f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.VIBRION_ROOTS.get().asItem(), 0.1f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.SUBSTILIUM_SPROUTS.get().asItem(), 0.1f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.HICKORY_LEAVES.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.RED_GLOWING_HICKORY_LEAVES.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.BROWN_GLOWING_HICKORY_LEAVES.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.YELLOW_GLOWING_HICKORY_LEAVES.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.GREEN_GLOWING_HICKORY_LEAVES.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.HICKORY_SAPLING.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.RED_GLOWING_HICKORY_SAPLING.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.BROWN_GLOWING_HICKORY_SAPLING.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.YELLOW_GLOWING_HICKORY_SAPLING.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.YELLOW_GLOWING_HICKORY_SAPLING.get().asItem(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.FALLEN_HICKORY_LEAVES.get().asItem(), 0.2f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.FALLEN_RED_GLOWING_HICKORY_LEAVES.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.FALLEN_BROWN_GLOWING_HICKORY_LEAVES.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.FALLEN_YELLOW_GLOWING_HICKORY_LEAVES.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.FALLEN_GREEN_GLOWING_HICKORY_LEAVES.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.PANXTER_FLOWER.get().asItem(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(WildasideModBlocks.SPOTTED_WINTERGREEN.get().asItem(), 0.65f);
	}
}
