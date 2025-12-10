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
            Identifier.of(Relics.MOD_ID, "ma_all"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FLOPPY_DISK))
                    .displayName(Text.translatable("itemgroup.relics.ma_all"))
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
                        entries.add(ModItems.DEMOLITION_INEVITABLE_MUSIC_DISC);
                        entries.add(ModItems.FIVE_NIGHT_AT_FREDDYS_MUSIC_DISC);
                        entries.add(ModItems.NEW_JEANS_MUSIC_DISC);
                        entries.add(ModItems.GOURMET_RACE_MUSIC_DISC);
                        entries.add(ModItems.META_KNIGHTS_REVENGE_MUSIC_DISC);
                        entries.add(ModItems.DEDEDES_ROYAL_PAYBACK_MUSIC_DISC);
                        entries.add(ModItems.HYPER_ZONE_MUSIC_DISC);
                        entries.add(ModItems.ZERO_TWO_MUSIC_DISC);
                        entries.add(ModItems.CROWNED_MUSIC_DISC);
                        entries.add(ModItems.OTHERWORLDY_WARRIOR_MUSIC_DISC);
                        entries.add(ModItems.FOREVER_MUSIC_DISC);
                        entries.add(ModItems.BATTLE_BLAZE_MUSIC_DISC);
                        entries.add(ModItems.HARDER_BETTER_FASTER_STRONGER_MUSIC_DISC);
                        entries.add(ModItems.NIGHTMARE_MUSIC_DISC);
                        entries.add(ModItems.HEART_OF_NOVA_MUSIC_DISC);
                        entries.add(ModItems.SPICY_CALAMARI_INKANTATION_MUSIC_DISC);
                        entries.add(ModItems.FLY_OCTO_FLY_MUSIC_DISC);
                        entries.add(ModItems.FINAL_DESTINATION_MUSIC_DISC);
                        entries.add(ModItems.FINAL_MUSIC_DISC);
                        entries.add(ModItems.YOUR_BEST_NIGHTMARE_MUSIC_DISC);
                        entries.add(ModItems.POKER_FACE_MUSIC_DISC);
                        entries.add(ModItems.ASGORE_MUSIC_DISC);
                        entries.add(ModItems.TOURNER_DANS_LE_VIDE_MUSIC_DISC);
                        entries.add(ModItems.SANS_MUSIC_DISC);
                        entries.add(ModItems.IDOL_MUSIC_DISC);
                        entries.add(ModItems.THE_ONLY_THING_THEY_FEAR_IS_YOU_MUSIC_DISC);



                    }).build());

    public static final ItemGroup DIVERS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "mb_divers"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.HARDER_BETTER_FASTER_STRONGER_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.mb_divers"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.THE_GRAND_FINALE_MUSIC_DISC);
                        entries.add(ModItems.ONE_LITTLE_CAT_FEET_MUSIC_DISC);
                        entries.add(ModItems.LIVE_AND_LEARN_MUSIC_DISC);
                        entries.add(ModItems.BY_YOUR_SIDE_ORCHESTRAL_MUSIC_DISC);
                        entries.add(ModItems.NEW_JEANS_MUSIC_DISC);
                        entries.add(ModItems.HARDER_BETTER_FASTER_STRONGER_MUSIC_DISC);
                        entries.add(ModItems.FINAL_DESTINATION_MUSIC_DISC);
                        entries.add(ModItems.POKER_FACE_MUSIC_DISC);
                        entries.add(ModItems.TOURNER_DANS_LE_VIDE_MUSIC_DISC);
                        entries.add(ModItems.IDOL_MUSIC_DISC);
                        entries.add(ModItems.THE_ONLY_THING_THEY_FEAR_IS_YOU_MUSIC_DISC);

                    }).build());

    public static final ItemGroup FNAF_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "mz_fnaf"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TOREADOR_MARCH_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.mz_fnaf"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TOREADOR_MARCH_MUSIC_DISC);
                        entries.add(ModItems.THE_GRANDFATHERS_CLOCK_MUSIC_DISC);
                        entries.add(ModItems.SERENADE_BY_SCHUBERT_MUSIC_DISC);

                        entries.add(ModItems.DEMOLITION_INEVITABLE_MUSIC_DISC);
                        entries.add(ModItems.FIVE_NIGHT_AT_FREDDYS_MUSIC_DISC);

                    }).build());

    public static final ItemGroup HAZBIN_HOTEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "mz_hazbin_hotel"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.KING_OF_HELL_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.mz_hazbin_hotel"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.LIVE_TO_LIVE_MUSIC_DISC);
                        entries.add(ModItems.EASY_MUSIC_DISC);
                        entries.add(ModItems.LOVE_IN_A_BOTTLE_MUSIC_DISC);
                        entries.add(ModItems.LOSER_BABY_MUSIC_DISC);
                        entries.add(ModItems.POISON_MUSIC_DISC);
                        entries.add(ModItems.KING_OF_HELL_MUSIC_DISC);

                    }).build());

    public static final ItemGroup UNDERTALE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "mz_undertale"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FINAL_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.mz_undertale"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.THE_SLAUGHTER_CONTINUES_WL_MUSIC_DISC);
                        entries.add(ModItems.AN_ENIGMATIC_ENCOUNTER_MUSIC_DISC);
                        entries.add(ModItems.BATTLE_AGAINST_A_TRUE_HERO_MUSIC_DISC);
                        entries.add(ModItems.CORE_MUSIC_DISC);
                        entries.add(ModItems.FINAL_MUSIC_DISC);
                        entries.add(ModItems.YOUR_BEST_NIGHTMARE_MUSIC_DISC);
                        entries.add(ModItems.ASGORE_MUSIC_DISC);
                        entries.add(ModItems.SANS_MUSIC_DISC);

                    }).build());

    public static final ItemGroup DELTARUNE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "mz_deltarune"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.THE_THIRD_SANCTUARY_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.mz_deltarune"))
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

    public static final ItemGroup POKEMON_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "mz_pokemon"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RED_THEME_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.mz_pokemon"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_THEME_MUSIC_DISC);
                        entries.add(ModItems.ACCUMULA_TOWN_MUSIC_DISC);
                        entries.add(ModItems.WALLY_THEME_MUSIC_DISC);
                        entries.add(ModItems.ASH_GRENINJA_MUSIC_DISC);
                        entries.add(ModItems.JACINTHE_THEME_MUSIC_DISC);

                    }).build());

    public static final ItemGroup KIRBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "mz_kirby"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.GOURMET_RACE_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.mz_kirby"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GOURMET_RACE_MUSIC_DISC);
                        entries.add(ModItems.META_KNIGHTS_REVENGE_MUSIC_DISC);
                        entries.add(ModItems.DEDEDES_ROYAL_PAYBACK_MUSIC_DISC);
                        entries.add(ModItems.HYPER_ZONE_MUSIC_DISC);
                        entries.add(ModItems.ZERO_TWO_MUSIC_DISC);
                        entries.add(ModItems.CROWNED_MUSIC_DISC);
                        entries.add(ModItems.OTHERWORLDY_WARRIOR_MUSIC_DISC);
                        entries.add(ModItems.NIGHTMARE_MUSIC_DISC);
                        entries.add(ModItems.HEART_OF_NOVA_MUSIC_DISC);

                    }).build());

    public static final ItemGroup GLITCH_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "mz_glitch"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.FOREVER_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.mz_glitch"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.FOREVER_MUSIC_DISC);
                        entries.add(ModItems.BATTLE_BLAZE_MUSIC_DISC);

                    }).build());

    public static final ItemGroup SPLATOON_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "mz_splatoon"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SPICY_CALAMARI_INKANTATION_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.mz_splatoon"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SPICY_CALAMARI_INKANTATION_MUSIC_DISC);
                        entries.add(ModItems.FLY_OCTO_FLY_MUSIC_DISC);

                    }).build());

    public static void registerItemGroups() {
        Relics.LOGGER.info("Registering Mod Item Groups for " + Relics.MOD_ID);
    }
}
