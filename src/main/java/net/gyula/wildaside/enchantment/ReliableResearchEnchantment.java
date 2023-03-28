
package net.gyula.wildaside.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import net.gyula.wildaside.init.WildasideModItems;

import java.util.List;

public class ReliableResearchEnchantment extends Enchantment {
	public ReliableResearchEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(WildasideModItems.ENTORIUM_GAUNTLET.get()).contains(item);
	}
}
