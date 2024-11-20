package net.wolfywitchybluees7.ggmod;

import net.fabricmc.api.ModInitializer;

import net.wolfywitchybluees7.ggmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenerallyGeneral implements ModInitializer {
	public static final String MOD_ID = "ggmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// new change

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}