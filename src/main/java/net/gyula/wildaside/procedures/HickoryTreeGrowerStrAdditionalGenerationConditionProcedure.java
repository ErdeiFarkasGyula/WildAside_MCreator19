package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModBlocks;

public class HickoryTreeGrowerStrAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = 1;
		found = false;
		for (int index0 = 0; index0 < (int) (3); index0++) {
			sy = 1;
			for (int index1 = 0; index1 < (int) (3); index1++) {
				sz = 1;
				for (int index2 = 0; index2 < (int) (3); index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == WildasideModBlocks.HICKORY_LOG.get()) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			return false;
		}
		return true;
	}
}
