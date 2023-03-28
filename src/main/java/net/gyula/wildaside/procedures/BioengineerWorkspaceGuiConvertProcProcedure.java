package net.gyula.wildaside.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;

import net.gyula.wildaside.init.WildasideModMobEffects;
import net.gyula.wildaside.init.WildasideModItems;

import java.util.function.Supplier;
import java.util.Map;

public class BioengineerWorkspaceGuiConvertProcProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(4)).getItem() : ItemStack.EMPTY).getItem() == WildasideModItems.VIBRION.get()) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == WildasideModItems.RED_GLOWING_ESSENCE.get()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(1)).getItem() : ItemStack.EMPTY)
							.getItem() == WildasideModItems.BROWN_GLOWING_ESSENCE.get()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(2)).getItem() : ItemStack.EMPTY)
							.getItem() == WildasideModItems.YELLOW_GLOWING_ESSENCE.get()
					&& (entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(3)).getItem() : ItemStack.EMPTY)
							.getItem() == WildasideModItems.GREEN_GLOWING_ESSENCE.get()) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(WildasideModItems.RUTILLION.get());
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(5) + 1));
					((Slot) _slots.get(5)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				i = 0;
				for (int index0 = 0; index0 < (int) (5); index0++) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
						((Slot) _slots.get((int) i)).remove(1);
						_player.containerMenu.broadcastChanges();
					}
					i = i + 1;
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE);
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(6) + 4));
					((Slot) _slots.get(6)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
				if (Math.random() >= 0.07) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(WildasideModMobEffects.CONTAMINATION.get(), 600, 1, (false), (true)));
				}
			}
		}
	}
}
