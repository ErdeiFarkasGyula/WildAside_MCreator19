package net.gyula.wildaside.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.gyula.wildaside.init.WildasideModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ContaminationUseProc2Procedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(WildasideModMobEffects.CONTAMINATION.get()) : false) {
			{
				ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
				if (_ist.hurt(entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WildasideModMobEffects.CONTAMINATION.get()) ? _livEnt.getEffect(WildasideModMobEffects.CONTAMINATION.get()).getAmplifier() : 0, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
		}
	}
}
