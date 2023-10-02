package net.gyula.wildaside.procedures;

import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

import java.io.IOException;
import java.io.FileWriter;
import java.io.File;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ConfigOnModLoadedProcedure {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		execute();
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		File wildaside = new File("");
		com.google.gson.JsonObject jsonobject = new com.google.gson.JsonObject();
		wildaside = new File((FMLPaths.GAMEDIR.get().toString() + "/config"), File.separator + "wildaside.json");
		if (!wildaside.exists()) {
			try {
				wildaside.getParentFile().mkdirs();
				wildaside.createNewFile();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			jsonobject.addProperty("test_config", 1);
			jsonobject.addProperty("test_config_comment", "Default value is 1. Giving a value lower or higher than 1 will reduce the range that the biome spawns in proportionally");
			{
				Gson mainGSONBuilderVariable = new GsonBuilder().setPrettyPrinting().create();
				try {
					FileWriter fileWriter = new FileWriter(wildaside);
					fileWriter.write(mainGSONBuilderVariable.toJson(jsonobject));
					fileWriter.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			}
		}
	}
}
