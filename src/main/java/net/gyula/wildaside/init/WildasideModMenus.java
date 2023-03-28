
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.gyula.wildaside.world.inventory.BioengineerWorkspaceGuiMenu;
import net.gyula.wildaside.WildasideMod;

public class WildasideModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WildasideMod.MODID);
	public static final RegistryObject<MenuType<BioengineerWorkspaceGuiMenu>> BIOENGINEER_WORKSPACE_GUI = REGISTRY.register("bioengineer_workspace_gui", () -> IForgeMenuType.create(BioengineerWorkspaceGuiMenu::new));
}
