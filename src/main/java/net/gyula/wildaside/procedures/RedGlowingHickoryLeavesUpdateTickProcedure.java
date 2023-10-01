package net.gyula.wildaside.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModBlocks;

public class RedGlowingHickoryLeavesUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double i = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(new ResourceLocation("wildaside:glowing_hickory_leaves")))) {
			if (world.dayTime() < 12000) {
				if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _getip4 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip4) : -1) > 0) {
					{
						int _value = (int) (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _getip6
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip6)
								: -1) - 1);
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
			} else {
				if (world.dayTime() >= 12000) {
					if (world.dayTime() >= 23000) {
						if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _getip11
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip11)
								: -1) > 0) {
							{
								int _value = (int) (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _getip13
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip13)
										: -1) - 1);
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					} else {
						if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _getip16
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip16)
								: -1) < 7) {
							{
								int _value = (int) (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _getip18
										? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip18)
										: -1) + 1);
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("light") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
				}
			}
		}
		if (Math.random() >= 0.9) {
			if (Math.random() >= 0.9) {
				i = 1;
				for (int index0 = 0; index0 < 12; index0++) {
					if (world.isEmptyBlock(BlockPos.containing(x, y - i, z)) && (world.getBlockState(BlockPos.containing(x, y - (i + 1), z))).getBlock() == Blocks.GRASS_BLOCK) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WildasideModBlocks.HICKORY_LEAVES.get()) {
							world.setBlock(BlockPos.containing(x, y - i, z), WildasideModBlocks.FALLEN_HICKORY_LEAVES.get().defaultBlockState(), 3);
						} else {
							if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WildasideModBlocks.RED_GLOWING_HICKORY_LEAVES.get()) {
								world.setBlock(BlockPos.containing(x, y - i, z), WildasideModBlocks.FALLEN_RED_GLOWING_HICKORY_LEAVES.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WildasideModBlocks.YELLOW_GLOWING_HICKORY_LEAVES.get()) {
									world.setBlock(BlockPos.containing(x, y - i, z), WildasideModBlocks.FALLEN_YELLOW_GLOWING_HICKORY_LEAVES.get().defaultBlockState(), 3);
								} else {
									if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WildasideModBlocks.BROWN_GLOWING_HICKORY_LEAVES.get()) {
										world.setBlock(BlockPos.containing(x, y - i, z), WildasideModBlocks.FALLEN_BROWN_GLOWING_HICKORY_LEAVES.get().defaultBlockState(), 3);
									} else {
										if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WildasideModBlocks.GREEN_GLOWING_HICKORY_LEAVES.get()) {
											world.setBlock(BlockPos.containing(x, y - i, z), WildasideModBlocks.FALLEN_GREEN_GLOWING_HICKORY_LEAVES.get().defaultBlockState(), 3);
										}
									}
								}
							}
						}
						break;
					}
					i = i + 1;
				}
			}
		}
	}
}
