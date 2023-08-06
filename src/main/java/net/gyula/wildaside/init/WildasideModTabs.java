
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class WildasideModTabs {
	public static CreativeModeTab TAB_WILDASIDE_TAB;

	public static void load() {
		TAB_WILDASIDE_TAB = new CreativeModeTab("tabwildaside_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(WildasideModBlocks.VIBRION_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
