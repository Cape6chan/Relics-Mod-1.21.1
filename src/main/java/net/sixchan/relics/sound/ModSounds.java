package net.sixchan.relics.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.sixchan.relics.Relics;

public class ModSounds {
    public static final SoundEvent CHISEL_USE = registerSoundEvent("chisel_use");
    public static final SoundEvent MAGIC_BLOCK_BREAK = registerSoundEvent("magic_block_break");
    public static final SoundEvent MAGIC_BLOCK_STEP = registerSoundEvent("magic_block_step");
    public static final SoundEvent MAGIC_BLOCK_PLACE = registerSoundEvent("magic_block_place");
    public static final SoundEvent MAGIC_BLOCK_hit = registerSoundEvent("magic_block_hit");
    public static final SoundEvent MAGIC_BLOCK_FALL = registerSoundEvent("magic_block_fall");

    public static final BlockSoundGroup MAGIC_BLOCK_SOUNDS = new BlockSoundGroup(1f, 1f,
            MAGIC_BLOCK_BREAK, MAGIC_BLOCK_STEP, MAGIC_BLOCK_PLACE, MAGIC_BLOCK_hit, MAGIC_BLOCK_FALL);



    public static final SoundEvent JACINTHE_THEME = registerSoundEvent("jacinthe_theme");
    public static final RegistryKey<JukeboxSong> JACINTHE_THEME_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Relics.MOD_ID, "jacinthe_theme"));

    public static final SoundEvent LIVE_TO_LIVE = registerSoundEvent("live_to_live");
    public static final RegistryKey<JukeboxSong> LIVE_TO_LIVE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Relics.MOD_ID, "live_to_live"));

    public static final SoundEvent A_CYBERS_WORLD = registerSoundEvent("a_cybers_world");
    public static final RegistryKey<JukeboxSong> A_CYBERS_WORLD_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Relics.MOD_ID, "a_cybers_world"));

    public static final SoundEvent EASY = registerSoundEvent("easy");
    public static final RegistryKey<JukeboxSong> EASY_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Relics.MOD_ID, "easy"));

    public static final SoundEvent LOVE_IN_A_BOTTLE = registerSoundEvent("love_in_a_bottle");
    public static final RegistryKey<JukeboxSong> LOVE_IN_A_BOTTLE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Relics.MOD_ID, "love_in_a_bottle"));

    public static final SoundEvent LOSER_BABY = registerSoundEvent("loser_baby");
    public static final RegistryKey<JukeboxSong> LOSER_BABY_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Relics.MOD_ID, "loser_baby"));

    public static final SoundEvent THE_SLAUGHTER_CONTINUES_WL = registerSoundEvent("the_slaughter_continues_wl");
    public static final RegistryKey<JukeboxSong> THE_SLAUGHTER_CONTINUES_WL_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Relics.MOD_ID, "the_slaughter_continues_wl"));

    public static final SoundEvent AN_ENIGMATIC_ENCOUNTER = registerSoundEvent("an_enigmatic_encounter");
    public static final RegistryKey<JukeboxSong> AN_ENIGMATIC_ENCOUNTER_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Relics.MOD_ID, "an_enigmatic_encounter"));

    public static final SoundEvent THE_GRAND_FINALE = registerSoundEvent("the_grand_finale");
    public static final RegistryKey<JukeboxSong> THE_GRAND_FINALE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Relics.MOD_ID, "the_grand_finale"));





    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Relics.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Relics.LOGGER.info("Registering Mod Sounds for " + Relics.MOD_ID);
    }
}
