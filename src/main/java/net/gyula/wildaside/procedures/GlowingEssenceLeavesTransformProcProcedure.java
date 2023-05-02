package net.gyula.wildaside.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.init.WildasideModItems;
import net.gyula.wildaside.init.WildasideModBlocks;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber
public class GlowingEssenceLeavesTransformProcProcedure {
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
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		BlockState block = Blocks.AIR.defaultBlockState();
		BlockState block2 = Blocks.AIR.defaultBlockState();
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.HICKORY_LEAVES.get() || (world.getBlockState(new BlockPos(x, y, z))).getBlock() == WildasideModBlocks.FALLEN_HICKORY_LEAVES.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("wildaside:glowing_essences")))) {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
				((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).setCount((int) (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).getCount() - 1));
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bottle.empty")), SoundSource.PLAYERS, 1, (float) 0.7);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bottle.empty")), SoundSource.PLAYERS, 1, (float) 0.7, false);
					}
				}
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WildasideModItems.RED_GLOWING_ESSENCE.get()) {
					block = WildasideModBlocks.RED_GLOWING_HICKORY_LEAVES.get().defaultBlockState();
					block2 = WildasideModBlocks.FALLEN_RED_GLOWING_HICKORY_LEAVES.get().defaultBlockState();
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WildasideModItems.BROWN_GLOWING_ESSENCE.get()) {
					block = WildasideModBlocks.BROWN_GLOWING_HICKORY_LEAVES.get().defaultBlockState();
					block2 = WildasideModBlocks.FALLEN_BROWN_GLOWING_HICKORY_LEAVES.get().defaultBlockState();
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WildasideModItems.YELLOW_GLOWING_ESSENCE.get()) {
					block = WildasideModBlocks.YELLOW_GLOWING_HICKORY_LEAVES.get().defaultBlockState();
					block2 = WildasideModBlocks.FALLEN_YELLOW_GLOWING_HICKORY_LEAVES.get().defaultBlockState();
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WildasideModItems.GREEN_GLOWING_ESSENCE.get()) {
					block = WildasideModBlocks.GREEN_GLOWING_HICKORY_LEAVES.get().defaultBlockState();
					block2 = WildasideModBlocks.FALLEN_GREEN_GLOWING_HICKORY_LEAVES.get().defaultBlockState();
				}
				sx = -1;
				found = false;
				for (int index0 = 0; index0 < 3; index0++) {
					sy = -1;
					for (int index1 = 0; index1 < 3; index1++) {
						sz = -1;
						for (int index2 = 0; index2 < 3; index2++) {
							if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == WildasideModBlocks.HICKORY_LEAVES.get()) {
								{
									BlockPos _bp = new BlockPos(x + sx, y + sy, z + sz);
									BlockState _bs = block;
									BlockState _bso = world.getBlockState(_bp);
									for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
										Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
										if (_property != null && _bs.getValue(_property) != null)
											try {
												_bs = _bs.setValue(_property, (Comparable) entry.getValue());
											} catch (Exception e) {
											}
									}
									world.setBlock(_bp, _bs, 3);
								}
							} else {
								if ((world.getBlockState(new BlockPos(x + sx, y + sy, z + sz))).getBlock() == WildasideModBlocks.FALLEN_HICKORY_LEAVES.get()) {
									{
										BlockPos _bp = new BlockPos(x + sx, y + sy, z + sz);
										BlockState _bs = block2;
										BlockState _bso = world.getBlockState(_bp);
										for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
											Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
											if (_property != null && _bs.getValue(_property) != null)
												try {
													_bs = _bs.setValue(_property, (Comparable) entry.getValue());
												} catch (Exception e) {
												}
										}
										world.setBlock(_bp, _bs, 3);
									}
								}
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
			}
		}
	}
}
