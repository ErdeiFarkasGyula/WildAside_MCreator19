
package net.gyula.wildaside.world.biome;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.AmbientParticleSettings;
import net.minecraft.world.level.biome.AmbientMoodSettings;
import net.minecraft.world.level.biome.AmbientAdditionsSettings;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.core.particles.SimpleParticleType;

import net.gyula.wildaside.init.WildasideModParticleTypes;

import java.util.List;

public class VibrionHiveBiome {
	public static final List<Climate.ParameterPoint> UNDERGROUND_PARAMETER_POINTS = List.of(new Climate.ParameterPoint(Climate.Parameter.span(-1f, 0f), Climate.Parameter.span(-1f, 0f), Climate.Parameter.span(-0.3f, 0.5f),
			Climate.Parameter.span(-0.3f, 0.3f), Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-1f, 1f), 0));

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-6184663).waterColor(-6184663).waterFogColor(-6184663).skyColor(-6184663).foliageColorOverride(-6184663).grassColorOverride(-6184663)
				.ambientLoopSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.crimson_forest.loop")))
				.ambientMoodSound(new AmbientMoodSettings(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.soul_sand_valley.mood")), 4000, 8, 2))
				.ambientAdditionsSound(new AmbientAdditionsSettings(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.nether_wastes.additions")), 0.0111D))
				.ambientParticle(new AmbientParticleSettings((SimpleParticleType) (WildasideModParticleTypes.STILL_SUBSTILIUM_PARTICLE.get()), 0.006f)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addFossilDecoration(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultMonsterRoom(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).temperature(0.19999999999999998f).downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build()).build();
	}
}
