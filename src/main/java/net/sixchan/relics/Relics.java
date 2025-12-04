package net.sixchan.relics;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.sixchan.relics.block.ModBlocks;
import net.sixchan.relics.item.ModItemGroups;
import net.sixchan.relics.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Relics implements ModInitializer {
	public static final String MOD_ID = "relics";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

        FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 4800);
	}
}