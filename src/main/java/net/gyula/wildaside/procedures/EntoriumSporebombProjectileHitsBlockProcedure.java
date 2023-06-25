package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.gyula.wildaside.init.WildasideModParticleTypes;
import net.gyula.wildaside.init.WildasideModBlocks;

public class EntoriumSporebombProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (immediatesourceentity instanceof ServerPlayer _player) {
			Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("wildaside:dangerous_warfare"));
			AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
			if (!_ap.isDone()) {
				for (String criteria : _ap.getRemainingCriteria())
					_player.getAdvancements().award(_adv, criteria);
			}
		}
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 3, 8); index0++) {
			world.addParticle((SimpleParticleType) (WildasideModParticleTypes.VIBRION_PARTICLE.get()), (x + Math.random()), (y + Math.random()), (z + Math.random()), 0, 0, 0);
		}
		sx = -2;
		found = false;
		for (int index1 = 0; index1 < 5; index1++) {
			sy = -1;
			for (int index2 = 0; index2 < 4; index2++) {
				sz = -2;
				for (int index3 = 0; index3 < 5; index3++) {
					if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz))) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), WildasideModBlocks.SPORE_AIR.get().defaultBlockState(), 3);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		sx = -1;
		found = false;
		for (int index4 = 0; index4 < 3; index4++) {
			sy = -2;
			for (int index5 = 0; index5 < 6; index5++) {
				sz = -1;
				for (int index6 = 0; index6 < 3; index6++) {
					if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz))) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), WildasideModBlocks.SPORE_AIR.get().defaultBlockState(), 3);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
