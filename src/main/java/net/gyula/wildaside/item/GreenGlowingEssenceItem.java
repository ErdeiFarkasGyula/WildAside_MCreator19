
package net.gyula.wildaside.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.gyula.wildaside.init.WildasideModTabs;

public class GreenGlowingEssenceItem extends Item {
	public GreenGlowingEssenceItem() {
		super(new Item.Properties().tab(WildasideModTabs.TAB_WILDASIDE_TAB).stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
