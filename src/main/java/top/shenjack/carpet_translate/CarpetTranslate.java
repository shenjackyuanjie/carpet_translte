package top.shenjack.carpet_translate;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CarpetTranslate implements ModInitializer {

	public static final String MOD_ID = "carpet_translate";
	public static final String MOD_NAME = "Carpet Translate";
	public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
	}
}
