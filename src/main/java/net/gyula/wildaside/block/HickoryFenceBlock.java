
package net.gyula.wildaside.block;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.gyula.wildaside.procedures.HickoryPlanksBlockAddedProcedure;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.gyula.wildaside.init.WildasideModBlocks;

import java.util.List;
import java.util.Collections;

public class HickoryFenceBlock extends FenceBlock {

	public static final BooleanProperty IS_YELLOW = BooleanProperty.create("is_yellow");

	public HickoryFenceBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_ORANGE).sound(SoundType.WOOD).strength(2.5f, 4f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).dynamicShape());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		HickoryPlanksBlockAddedProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		ItemBlockRenderTypes.setRenderLayer(WildasideModBlocks.HICKORY_FENCE.get(), renderType -> renderType == RenderType.cutout());
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
		   pBuilder.add(NORTH, EAST, WEST, SOUTH, WATERLOGGED, IS_YELLOW);
	}

}
