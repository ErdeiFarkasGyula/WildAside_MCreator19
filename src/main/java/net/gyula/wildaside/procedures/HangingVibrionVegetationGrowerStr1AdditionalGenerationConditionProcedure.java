package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class HangingVibrionVegetationGrowerStr1AdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:mineable/pickaxe")))) {
			if (world.isEmptyBlock(BlockPos.containing(x, y, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 2, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 3, z))) {
				return true;
			}
		}
		return false;
	}
}
