package net.gyula.wildaside.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.gyula.wildaside.entity.GluttonEntity;

public class GluttonModel extends GeoModel<GluttonEntity> {
	@Override
	public ResourceLocation getAnimationResource(GluttonEntity entity) {
		return new ResourceLocation("wildaside", "animations/glutton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GluttonEntity entity) {
		return new ResourceLocation("wildaside", "geo/glutton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GluttonEntity entity) {
		return new ResourceLocation("wildaside", "textures/entities/" + entity.getTexture() + ".png");
	}

}
