package net.gyula.wildaside.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModMobEffects;
import net.gyula.wildaside.init.WildasideModBlocks;

public class VibrionGrowthStemBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		if (!entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("wildaside:is_immune_to_contamination")))) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(WildasideModMobEffects.CONTAMINATION.get(), Mth.nextInt(RandomSource.create(), 300, 700), Mth.nextInt(RandomSource.create(), 1, 2), false, true));
		}
		if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("wildaside:is_contamination_beneficial")))) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, Mth.nextInt(RandomSource.create(), 300, 700), Mth.nextInt(RandomSource.create(), 0, 1), false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, Mth.nextInt(RandomSource.create(), 300, 700), Mth.nextInt(RandomSource.create(), 0, 1), false, false));
		}
		i = 1;
		for (int index0 = 0; index0 < 30; index0++) {
			if ((world.getBlockState(new BlockPos(x, y - i, z))).getBlock() == WildasideModBlocks.VIBRION_GROWTH_STEM.get()) {
				world.destroyBlock(new BlockPos(x, y - i, z), false);
			} else {
				break;
			}
			i = i + 1;
		}
	}
}
