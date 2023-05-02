package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SubstiliumTreeGrowerStrAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos(x, y + 1, z)) == true && world.isEmptyBlock(new BlockPos(x, y + 2, z)) == true && world.isEmptyBlock(new BlockPos(x, y + 3, z)) == true && world.isEmptyBlock(new BlockPos(x, y + 4, z)) == true
				&& world.isEmptyBlock(new BlockPos(x, y + 5, z)) == true && world.isEmptyBlock(new BlockPos(x, y + 6, z)) == true) {
			return true;
		}
		return false;
	}
}
