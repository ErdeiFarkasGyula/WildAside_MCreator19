
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.gyula.wildaside.potion.ImmuneProtectionMobEffect;
import net.gyula.wildaside.potion.ContaminationMobEffect;
import net.gyula.wildaside.WildasideMod;

public class WildasideModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, WildasideMod.MODID);
	public static final RegistryObject<MobEffect> CONTAMINATION = REGISTRY.register("contamination", () -> new ContaminationMobEffect());
	public static final RegistryObject<MobEffect> IMMUNE_PROTECTION = REGISTRY.register("immune_protection", () -> new ImmuneProtectionMobEffect());
}
