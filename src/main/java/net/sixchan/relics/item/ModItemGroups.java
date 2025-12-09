package net.sixchan.relics.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sixchan.relics.Relics;

public class ModItemGroups {
    public static final ItemGroup ALL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "all"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FLOPPY_DISK))
                    .displayName(Text.translatable("itemgroup.relics.all"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FLOPPY_DISK);
                        entries.add(ModItems.JACINTHE_THEME_MUSIC_DISC);
                        entries.add(ModItems.A_CYBERS_WORLD_MUSIC_DISC);
                        entries.add(ModItems.LIVE_TO_LIVE_MUSIC_DISC);
                        entries.add(ModItems.EASY_MUSIC_DISC);
                        entries.add(ModItems.LOVE_IN_A_BOTTLE_MUSIC_DISC);
                        entries.add(ModItems.LOSER_BABY_MUSIC_DISC);
                        entries.add(ModItems.THE_SLAUGHTER_CONTINUES_WL_MUSIC_DISC);
                        entries.add(ModItems.AN_ENIGMATIC_ENCOUNTER_MUSIC_DISC);
                        entries.add(ModItems.THE_GRAND_FINALE_MUSIC_DISC);
                        entries.add(ModItems.ACCUMULA_TOWN_MUSIC_DISC);
                        entries.add(ModItems.RED_THEME_MUSIC_DISC);
                        entries.add(ModItems.WALLY_THEME_MUSIC_DISC);
                        entries.add(ModItems.ASH_GRENINJA_MUSIC_DISC);
                        entries.add(ModItems.THE_WORLD_REVOLVING_MUSIC_DISC);
                        entries.add(ModItems.HAMMER_OF_JUSTICE_MUSIC_DISC);
                        entries.add(ModItems.BIG_SHOT_MUSIC_DISC);
                        entries.add(ModItems.FIELD_OF_HOPES_AND_DREAMS_MUSIC_DISC);
                        entries.add(ModItems.BATTLE_AGAINST_A_TRUE_HERO_MUSIC_DISC);
                        entries.add(ModItems.CORE_MUSIC_DISC);
                        entries.add(ModItems.RAISE_UP_YOUR_BAT_MUSIC_DISC);
                        entries.add(ModItems.ITS_TV_TIME_MUSIC_DISC);
                        entries.add(ModItems.DRIVING_IN_MY_CAR_MUSIC_DISC);
                        entries.add(ModItems.THE_THIRD_SANCTUARY_MUSIC_DISC);
                        entries.add(ModItems.NEVERENDING_NIGHT_MUSIC_DISC);
                        entries.add(ModItems.BLACK_KNIFE_MUSIC_DISC);
                        entries.add(ModItems.KING_OF_HELL_MUSIC_DISC);
                        entries.add(ModItems.POISON_MUSIC_DISC);
                        entries.add(ModItems.ONE_LITTLE_CAT_FEET_MUSIC_DISC);
                        entries.add(ModItems.LIVE_AND_LEARN_MUSIC_DISC);
                        entries.add(ModItems.BY_YOUR_SIDE_ORCHESTRAL_MUSIC_DISC);
                        entries.add(ModItems.TOREADOR_MARCH_MUSIC_DISC);
                        entries.add(ModItems.THE_GRANDFATHERS_CLOCK_MUSIC_DISC);
                        entries.add(ModItems.SERENADE_BY_SCHUBERT_MUSIC_DISC);

                    }).build());

    public static final ItemGroup FNAF_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "fnaf"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TOREADOR_MARCH_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.fnaf"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TOREADOR_MARCH_MUSIC_DISC);
                        entries.add(ModItems.THE_GRANDFATHERS_CLOCK_MUSIC_DISC);
                        entries.add(ModItems.SERENADE_BY_SCHUBERT_MUSIC_DISC);

                    }).build());

    public static final ItemGroup HAZBIN_HOTEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "hazbin_hotel"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.KING_OF_HELL_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.hazbin_hotel"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LIVE_TO_LIVE_MUSIC_DISC);
                        entries.add(ModItems.EASY_MUSIC_DISC);
                        entries.add(ModItems.LOVE_IN_A_BOTTLE_MUSIC_DISC);
                        entries.add(ModItems.LOSER_BABY_MUSIC_DISC);
                        entries.add(ModItems.POISON_MUSIC_DISC);
                        entries.add(ModItems.KING_OF_HELL_MUSIC_DISC);

                    }).build());

    public static final ItemGroup UNDERTALE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "undertale"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.BATTLE_AGAINST_A_TRUE_HERO_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.undertale"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.THE_SLAUGHTER_CONTINUES_WL_MUSIC_DISC);
                        entries.add(ModItems.AN_ENIGMATIC_ENCOUNTER_MUSIC_DISC);
                        entries.add(ModItems.BATTLE_AGAINST_A_TRUE_HERO_MUSIC_DISC);
                        entries.add(ModItems.CORE_MUSIC_DISC);

                    }).build());

    public static final ItemGroup DELTARUNE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "deltarune"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.THE_THIRD_SANCTUARY_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.deltarune"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FIELD_OF_HOPES_AND_DREAMS_MUSIC_DISC);
                        entries.add(ModItems.THE_WORLD_REVOLVING_MUSIC_DISC);
                        entries.add(ModItems.A_CYBERS_WORLD_MUSIC_DISC);
                        entries.add(ModItems.BIG_SHOT_MUSIC_DISC);
                        entries.add(ModItems.RAISE_UP_YOUR_BAT_MUSIC_DISC);
                        entries.add(ModItems.ITS_TV_TIME_MUSIC_DISC);
                        entries.add(ModItems.BLACK_KNIFE_MUSIC_DISC);
                        entries.add(ModItems.HAMMER_OF_JUSTICE_MUSIC_DISC);
                        entries.add(ModItems.THE_THIRD_SANCTUARY_MUSIC_DISC);
                        entries.add(ModItems.NEVERENDING_NIGHT_MUSIC_DISC);

                    }).build());

    public static void registerItemGroups() {
        Relics.LOGGER.info("Registering Mod Item Groups for " + Relics.MOD_ID);
    }
}
