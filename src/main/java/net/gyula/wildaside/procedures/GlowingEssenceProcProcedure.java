package net.gyula.wildaside.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.gyula.wildaside.network.WildasideModVariables;
import net.gyula.wildaside.init.WildasideModItems;
import net.gyula.wildaside.init.WildasideModBlocks;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class GlowingEssenceProcProcedure {
	@SubscribeEvent
	public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.HONEY_BOTTLE) {
			if ((world.getBlockState(new BlockPos(x, y, z))).is(BlockTags.create(new ResourceLocation("wildaside:glowing_hickory_leaves")))) {
				if (world.getBlockState(new BlockPos(x, y, z)).getLightEmission(world, new BlockPos(x, y, z)) >= 7) {
					((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.RED_GLOWING_HICKORY_LEAVES.get()) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(WildasideModItems.RED_GLOWING_ESSENCE.get());
							_setstack.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
						{
							boolean _setval = true;
							entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.redGlowingHickoryEssence = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.YELLOW_GLOWING_HICKORY_LEAVES.get()) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(WildasideModItems.YELLOW_GLOWING_ESSENCE.get());
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
							{
								boolean _setval = true;
								entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.yellowGlowingHickoryEssence = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else {
							if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.BROWN_GLOWING_HICKORY_LEAVES.get()) {
								if (entity instanceof Player _player) {
									ItemStack _setstack = new ItemStack(WildasideModItems.BROWN_GLOWING_ESSENCE.get());
									_setstack.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
								}
								{
									boolean _setval = true;
									entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.brownGlowingHickoryEssence = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.GREEN_GLOWING_HICKORY_LEAVES.get()) {
									if (entity instanceof Player _player) {
										ItemStack _setstack = new ItemStack(WildasideModItems.GREEN_GLOWING_ESSENCE.get());
										_setstack.setCount(1);
										ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
									}
									{
										boolean _setval = true;
										entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.greenGlowingHickoryEssence = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
							}
						}
					}
					if ((entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WildasideModVariables.PlayerVariables())).redGlowingHickoryEssence == true
							&& (entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WildasideModVariables.PlayerVariables())).brownGlowingHickoryEssence == true
							&& (entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WildasideModVariables.PlayerVariables())).yellowGlowingHickoryEssence == true
							&& (entity.getCapability(WildasideModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new WildasideModVariables.PlayerVariables())).greenGlowingHickoryEssence == true) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("wildaside:quattuor_essentiae"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
				}
			}
		}
	}
}
