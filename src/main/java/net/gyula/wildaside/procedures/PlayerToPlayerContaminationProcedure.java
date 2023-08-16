package net.gyula.wildaside.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.gyula.wildaside.init.WildasideModMobEffects;

public class PlayerToPlayerContaminationProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (0.6 >= Math.random()) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(WildasideModMobEffects.CONTAMINATION.get(), Mth.nextInt(RandomSource.create(), 200, 700),
						(int) ((sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(WildasideModMobEffects.CONTAMINATION.get()) ? _livEnt.getEffect(WildasideModMobEffects.CONTAMINATION.get()).getAmplifier() : 0) + 1), false, true));
		}
	}
}
