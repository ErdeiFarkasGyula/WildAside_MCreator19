package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.gyula.wildaside.init.WildasideModParticleTypes;

public class SporeAirClientDisplayRandomTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 10, 15); index0++) {
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.STILL_VIBRION_PARTICLE.get()), (x + Math.random()), (y + Math.random()), (z + Math.random()), 0, 0, 0);
		}
	}
}
