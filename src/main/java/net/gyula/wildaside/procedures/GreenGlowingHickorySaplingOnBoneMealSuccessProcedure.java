package net.gyula.wildaside.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GreenGlowingHickorySaplingOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(new BlockPos(x, y + 1, z))) {
			if (Math.random() >= 0.93) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("wildaside", "green_glowing_hickory_tree"));
					if (template != null) {
						template.placeInWorld(_serverworld, new BlockPos(x - 3, y, z - 3), new BlockPos(x - 3, y, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random,
								3);
					}
				}
			}
		}
	}
}
