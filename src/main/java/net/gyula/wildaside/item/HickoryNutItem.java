
package net.gyula.wildaside.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.gyula.wildaside.init.WildasideModTabs;

public class HickoryNutItem extends Item {
	public HickoryNutItem() {
		super(new Item.Properties().tab(WildasideModTabs.TAB_WILDASIDE_TAB).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.19999999999999998f)

				.build()));
	}
}
