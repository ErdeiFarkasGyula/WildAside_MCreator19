package net.gyula.wildaside.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

import net.gyula.wildaside.init.WildasideModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ContaminationUseProc1Procedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		{
			ItemStack _ist = (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
			if (_ist.hurt(sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WildasideModMobEffects.CONTAMINATION.get()) ? _livEnt.getEffect(WildasideModMobEffects.CONTAMINATION.get()).getAmplifier() : 0, RandomSource.create(),
					null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		PlayerToPlayerContaminationProcedure.execute(entity, sourceentity);
	}
}
