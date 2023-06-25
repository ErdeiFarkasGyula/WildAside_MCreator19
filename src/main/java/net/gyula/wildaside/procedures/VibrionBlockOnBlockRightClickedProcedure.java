package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModBlocks;

public class VibrionBlockOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		Spawn7ParticlesProcedure.execute(world, x, y, z);
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			world.setBlock(BlockPos.containing(x, y + 1, z), WildasideModBlocks.SPORE_AIR.get().defaultBlockState(), 3);
		}
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			world.setBlock(BlockPos.containing(x, y - 1, z), WildasideModBlocks.SPORE_AIR.get().defaultBlockState(), 3);
		}
		if (world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
			world.setBlock(BlockPos.containing(x + 1, y, z), WildasideModBlocks.SPORE_AIR.get().defaultBlockState(), 3);
		}
		if (world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
			world.setBlock(BlockPos.containing(x - 1, y, z), WildasideModBlocks.SPORE_AIR.get().defaultBlockState(), 3);
		}
		if (world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
			world.setBlock(BlockPos.containing(x, y, z + 1), WildasideModBlocks.SPORE_AIR.get().defaultBlockState(), 3);
		}
		if (world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
			world.setBlock(BlockPos.containing(x, y, z - 1), WildasideModBlocks.SPORE_AIR.get().defaultBlockState(), 3);
		}
	}
}
