package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.gyula.wildaside.init.WildasideModParticleTypes;

public class SpawnEntoriumParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double i = 0;
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 3, 7); index0++) {
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.ENTORIUM_PARTICLE.get()), (x + Math.random()), (y + Math.random()), (z + Math.random()), (Mth.nextInt(RandomSource.create(), -2, 2) / 100),
					(Mth.nextInt(RandomSource.create(), -2, 2) / 100), (Mth.nextInt(RandomSource.create(), -2, 2) / 100));
		}
	}
}
