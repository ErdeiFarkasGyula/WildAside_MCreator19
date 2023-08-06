
package net.gyula.wildaside.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.gyula.wildaside.procedures.EntoriumPillEffectsProcedure;
import net.gyula.wildaside.init.WildasideModTabs;

import java.util.List;

public class EntoriumPillItem extends Item {
	public EntoriumPillItem() {
		super(new Item.Properties().tab(WildasideModTabs.TAB_WILDASIDE_TAB).stacksTo(4).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(-1).saturationMod(-0.2f).alwaysEat().meat().build()));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Gives Immune-protection which removes Contamination"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EntoriumPillEffectsProcedure.execute(entity);
		return retval;
	}
}
