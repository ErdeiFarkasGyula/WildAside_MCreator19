
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.gyula.wildaside.enchantment.RevealingEnchantment;
import net.gyula.wildaside.enchantment.ReliableResearchEnchantment;
import net.gyula.wildaside.WildasideMod;

public class WildasideModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, WildasideMod.MODID);
	public static final RegistryObject<Enchantment> REVEALING = REGISTRY.register("revealing", () -> new RevealingEnchantment());
	public static final RegistryObject<Enchantment> RELIABLE_RESEARCH = REGISTRY.register("reliable_research", () -> new ReliableResearchEnchantment());
}
