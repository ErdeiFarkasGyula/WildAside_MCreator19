package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class HickoryBushAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double grass = 0;
		sx = 0;
		for (int index0 = 0; index0 < 4; index0++) {
			sy = -1;
			for (int index1 = 0; index1 < 1; index1++) {
				sz = 0;
				for (int index2 = 0; index2 < 5; index2++) {
					if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK) {
						grass = grass + 1;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (grass >= 19) {
			return true;
		}
		return false;
	}
}
