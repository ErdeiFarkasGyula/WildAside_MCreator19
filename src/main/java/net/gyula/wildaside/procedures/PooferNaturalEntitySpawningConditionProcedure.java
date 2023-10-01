package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModBlocks;

public class PooferNaturalEntitySpawningConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WildasideModBlocks.SUBSTILIUM_SOIL.get()) {
			return true;
		}
		return false;
	}
}
