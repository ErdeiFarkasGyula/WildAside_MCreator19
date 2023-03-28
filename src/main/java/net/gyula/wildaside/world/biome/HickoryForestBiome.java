
package net.gyula.wildaside.world.biome;

import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraft.world.level.levelgen.placement.NoiseThresholdCountPlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

import java.util.List;

public class HickoryForestBiome {
	public static final List<Climate.ParameterPoint> PARAMETER_POINTS = List.of(
			new Climate.ParameterPoint(Climate.Parameter.span(-0.4f, 0.5f), Climate.Parameter.span(-0.4f, 0.5f), Climate.Parameter.span(0.1f, 1f), Climate.Parameter.span(-1f, 0.35f), Climate.Parameter.point(0.0f),
					Climate.Parameter.span(-0.7f, 0.35f), 0),
			new Climate.ParameterPoint(Climate.Parameter.span(-0.4f, 0.5f), Climate.Parameter.span(-0.4f, 0.5f), Climate.Parameter.span(0.1f, 1f), Climate.Parameter.span(-1f, 0.35f), Climate.Parameter.point(1.0f),
					Climate.Parameter.span(-0.7f, 0.35f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(12638463).waterColor(4159204).waterFogColor(329011).skyColor(7972607).foliageColorOverride(-13196533).grassColorOverride(-11687384).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("wildaside:grass_hickory_forest", VegetationFeatures.PATCH_GRASS,
				List.of(NoiseThresholdCountPlacement.of(-0.8D, 5, 30), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, PlacementUtils.register("wildaside:flower_hickory_forest", VegetationFeatures.FLOWER_DEFAULT,
				List.of(CountPlacement.of(15), RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		biomeGenerationSettings.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,
				PlacementUtils.register("wildaside:mushrooms_huge_hickory_forest", VegetationFeatures.MUSHROOM_ISLAND_VEGETATION, List.of(CountPlacement.of(1), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
		BiomeDefaultFeatures.addFerns(biomeGenerationSettings);
		BiomeDefaultFeatures.addSavannaGrass(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addMossyStoneBlock(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultSeagrass(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.COW, 5, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.CREEPER, 6, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.HORSE, 6, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 2, 1, 4));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.ZOMBIE, 10, 1, 2));
		mobSpawnInfo.addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(EntityType.SKELETON, 5, 2, 5));
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.RAIN).temperature(0.4f).downfall(0.4f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
