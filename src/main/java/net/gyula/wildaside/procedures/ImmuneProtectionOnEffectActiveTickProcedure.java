package net.gyula.wildaside.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.gyula.wildaside.init.WildasideModMobEffects;

public class ImmuneProtectionOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(WildasideModMobEffects.CONTAMINATION.get()) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(WildasideModMobEffects.CONTAMINATION.get());
		}
		if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(MobEffects.POISON) : false) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
		}
	}
}
