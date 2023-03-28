
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.gyula.wildaside.WildasideMod;

public class WildasideModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, WildasideMod.MODID);
	public static final RegistryObject<SimpleParticleType> VIBRION_PARTICLE = REGISTRY.register("vibrion_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> ENTORIUM_PARTICLE = REGISTRY.register("entorium_particle", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SUBSTILIUM_PARTICLE = REGISTRY.register("substilium_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> STILL_SUBSTILIUM_PARTICLE = REGISTRY.register("still_substilium_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> STILL_VIBRION_PARTICLE = REGISTRY.register("still_vibrion_particle", () -> new SimpleParticleType(true));
}
