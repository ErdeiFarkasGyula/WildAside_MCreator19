
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WildasideModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> GIVE_WILDASIDE_LEXION_TO_PLAYER = GameRules.register("giveWildasideLexionToPlayer", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
