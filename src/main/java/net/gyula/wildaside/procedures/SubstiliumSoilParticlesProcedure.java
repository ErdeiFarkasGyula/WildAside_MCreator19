package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.particles.SimpleParticleType;

import net.gyula.wildaside.init.WildasideModParticleTypes;

public class SubstiliumSoilParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) (Mth.nextInt(RandomSource.create(), 3, 7)); index0++) {
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.SUBSTILIUM_PARTICLE.get()), (x + Math.random()), (y + Mth.nextInt(RandomSource.create(), 10, 30) / 100), (z + Math.random()), 0,
					(Mth.nextInt(RandomSource.create(), 10, 15) / 1000), 0);
		}
	}
}
