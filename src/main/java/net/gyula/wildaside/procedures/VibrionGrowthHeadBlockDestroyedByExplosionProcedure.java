package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModParticleTypes;
import net.gyula.wildaside.init.WildasideModBlocks;

public class VibrionGrowthHeadBlockDestroyedByExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double i = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (WildasideModParticleTypes.VIBRION_PARTICLE.get()), (x + 0.5), y, (z + 0.5), 10, (-0.2), 0.4, 0.2, 0.1);
		i = 1;
		for (int index0 = 0; index0 < (int) (30); index0++) {
			if ((world.getBlockState(new BlockPos(x, y - i, z))).getBlock() == WildasideModBlocks.VIBRION_GROWTH_STEM.get()) {
				world.destroyBlock(new BlockPos(x, y - i, z), false);
			} else {
				break;
			}
			i = i + 1;
		}
	}
}
