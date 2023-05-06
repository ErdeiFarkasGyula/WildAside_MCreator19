
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.gyula.wildaside.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.gyula.wildaside.client.particle.VibrionParticleParticle;
import net.gyula.wildaside.client.particle.SubstiliumParticleParticle;
import net.gyula.wildaside.client.particle.StillVibrionParticleParticle;
import net.gyula.wildaside.client.particle.StillSubstiliumParticleParticle;
import net.gyula.wildaside.client.particle.EntoriumParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WildasideModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(WildasideModParticleTypes.VIBRION_PARTICLE.get(), VibrionParticleParticle::provider);
		event.registerSpriteSet(WildasideModParticleTypes.ENTORIUM_PARTICLE.get(), EntoriumParticleParticle::provider);
		event.registerSpriteSet(WildasideModParticleTypes.SUBSTILIUM_PARTICLE.get(), SubstiliumParticleParticle::provider);
		event.registerSpriteSet(WildasideModParticleTypes.STILL_SUBSTILIUM_PARTICLE.get(), StillSubstiliumParticleParticle::provider);
		event.registerSpriteSet(WildasideModParticleTypes.STILL_VIBRION_PARTICLE.get(), StillVibrionParticleParticle::provider);
	}
}
