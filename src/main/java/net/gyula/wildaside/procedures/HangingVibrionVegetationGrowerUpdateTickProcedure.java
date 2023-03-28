package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModGameRules;
import net.gyula.wildaside.init.WildasideModBlocks;

public class HangingVibrionVegetationGrowerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double emptySpace = 0;
		double loopNumber = 0;
		if (world.getLevelData().getGameRules().getBoolean(WildasideModGameRules.WILDASIDEDEBUGMODE) == false) {
			world.setBlock(new BlockPos(x, y, z), Blocks.CAVE_AIR.defaultBlockState(), 3);
			if (Math.random() <= 0.4) {
				emptySpace = 1;
				loopNumber = 0;
				for (int index0 = 0; index0 < (int) (50); index0++) {
					if (world.isEmptyBlock(new BlockPos(x, y - emptySpace, z))) {
						emptySpace = emptySpace + 1;
					} else {
						break;
					}
				}
				for (int index1 = 0; index1 < (int) (Math.round(emptySpace / (Mth.nextInt(RandomSource.create(), 15, 22) / 10))); index1++) {
					world.setBlock(new BlockPos(x, y - loopNumber, z), WildasideModBlocks.HANGING_VIBRION_VINES.get().defaultBlockState(), 3);
					loopNumber = loopNumber + 1;
				}
				sx = -4;
				for (int index2 = 0; index2 < (int) (9); index2++) {
					sy = -1;
					for (int index3 = 0; index3 < (int) (6); index3++) {
						sz = -4;
						for (int index4 = 0; index4 < (int) (9); index4++) {
							if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).is(BlockTags.create(new ResourceLocation("minecraft:base_stone_overworld")))) {
								if (Math.random() <= 0.25) {
									world.setBlock(new BlockPos(x + sx, y + sy, z + sz), WildasideModBlocks.SUBSTILIUM_SOIL.get().defaultBlockState(), 3);
								}
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
			} else {
				emptySpace = 1;
				loopNumber = 0;
				for (int index5 = 0; index5 < (int) (50); index5++) {
					if (world.isEmptyBlock(new BlockPos(x, y - emptySpace, z))) {
						emptySpace = emptySpace + 1;
					} else {
						break;
					}
				}
				for (int index6 = 0; index6 < (int) (Math.round(emptySpace / (Mth.nextInt(RandomSource.create(), 15, 22) / 10))); index6++) {
					world.setBlock(new BlockPos(x, y - loopNumber, z), WildasideModBlocks.VIBRION_GEL.get().defaultBlockState(), 3);
					loopNumber = loopNumber + 1;
				}
			}
		}
	}
}
