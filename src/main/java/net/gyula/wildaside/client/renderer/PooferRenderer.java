
package net.gyula.wildaside.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.gyula.wildaside.entity.model.PooferModel;
import net.gyula.wildaside.entity.PooferEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PooferRenderer extends GeoEntityRenderer<PooferEntity> {
	public PooferRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PooferModel());
		this.shadowRadius = 0.3f;
	}

	@Override
	public RenderType getRenderType(PooferEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
