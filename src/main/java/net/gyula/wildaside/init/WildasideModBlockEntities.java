
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.gyula.wildaside.block.entity.SporeAirBlockEntity;
import net.gyula.wildaside.block.entity.BioengineerWorkspaceBlockEntity;
import net.gyula.wildaside.WildasideMod;

public class WildasideModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WildasideMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BIOENGINEER_WORKSPACE = register("bioengineer_workspace", WildasideModBlocks.BIOENGINEER_WORKSPACE, BioengineerWorkspaceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPORE_AIR = register("spore_air", WildasideModBlocks.SPORE_AIR, SporeAirBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
