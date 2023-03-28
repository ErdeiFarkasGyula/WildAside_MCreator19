
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
	}
}
