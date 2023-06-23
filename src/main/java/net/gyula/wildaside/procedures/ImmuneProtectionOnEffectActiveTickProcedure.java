package net.gyula.wildaside.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.gyula.wildaside.init.WildasideModMobEffects;

public class ImmuneProtectionOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(WildasideModMobEffects.CONTAMINATION.get())) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WildasideModMobEffects.CONTAMINATION.get());
		}
		if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.POISON)) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
		}
	}
}
