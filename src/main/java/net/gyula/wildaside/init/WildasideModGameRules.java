
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WildasideModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> WILDASIDEDEBUGMODE = GameRules.register("wildasideDebugMode", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
}
