package net.sixchan.relics;

import net.fabricmc.api.ModInitializer;

import net.sixchan.relics.item.ModItemGroups;
import net.sixchan.relics.item.ModItems;
import net.sixchan.relics.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FloppyDisk implements ModInitializer {
	public static final String MOD_ID = "floppy_disk";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        //ModBlocks.registerModBlocks();
        ModSounds.registerSounds();
	}
}