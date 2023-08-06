
package net.gyula.wildaside.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.gyula.wildaside.init.WildasideModTabs;

public class RutillionItem extends Item {
	public RutillionItem() {
		super(new Item.Properties().tab(WildasideModTabs.TAB_WILDASIDE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
