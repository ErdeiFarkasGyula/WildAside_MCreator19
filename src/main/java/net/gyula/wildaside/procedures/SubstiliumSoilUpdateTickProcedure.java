package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.network.WildasideModVariables;
import net.gyula.wildaside.init.WildasideModEntities;

public class SubstiliumSoilUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("wildaside:vibrion_hive"))) {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 2, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 3, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 4, z))) {
				if (Mth.nextDouble(RandomSource.create(), 0, 100) < 1) {
					if (Mth.nextDouble(RandomSource.create(), 0, 100) < 30) {
						if (Mth.nextDouble(RandomSource.create(), 1, 10) > 6) {
							if (WildasideModVariables.WorldVariables.get(world).poofers_spawned <= 40) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = WildasideModEntities.POOFER.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								WildasideModVariables.WorldVariables.get(world).poofers_spawned = WildasideModVariables.WorldVariables.get(world).poofers_spawned + 1;
								WildasideModVariables.WorldVariables.get(world).syncData(world);
							}
						} else {
							if (WildasideModVariables.WorldVariables.get(world).gluttons_spawned <= 70) {
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = WildasideModEntities.GLUTTON.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1, z + 0.5), MobSpawnType.MOB_SUMMONED);
									if (entityToSpawn != null) {
										entityToSpawn.setDeltaMovement(0, 0, 0);
									}
								}
								WildasideModVariables.WorldVariables.get(world).gluttons_spawned = WildasideModVariables.WorldVariables.get(world).gluttons_spawned + 1;
								WildasideModVariables.WorldVariables.get(world).syncData(world);
							}
						}
					}
				}
			}
		}
	}
}
