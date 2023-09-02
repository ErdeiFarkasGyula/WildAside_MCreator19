package net.gyula.wildaside.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.gyula.wildaside.entity.PooferEntity;

public class PooferModel extends GeoModel<PooferEntity> {
	@Override
	public ResourceLocation getAnimationResource(PooferEntity entity) {
		return new ResourceLocation("wildaside", "animations/poofer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PooferEntity entity) {
		return new ResourceLocation("wildaside", "geo/poofer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PooferEntity entity) {
		return new ResourceLocation("wildaside", "textures/entities/" + entity.getTexture() + ".png");
	}

}
