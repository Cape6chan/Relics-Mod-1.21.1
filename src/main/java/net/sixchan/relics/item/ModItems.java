package net.sixchan.relics.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sixchan.relics.Relics;
import net.sixchan.relics.item.custom.ChiselItem;
import net.sixchan.relics.item.custom.NeedleItem;
import net.sixchan.relics.item.custom.ThunderRodItem;
import net.sixchan.relics.sound.ModSounds;

import java.util.List;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFLOWER)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.relics.cauliflower.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item STARLIGHT_ASHES = registerItem("starlight_ashes", new Item(new Item.Settings()));

    public static final Item THUNDER_ROD = registerItem("thunder_rod", new ThunderRodItem(new Item.Settings()));
    public static final Item NEEDLE = registerItem("needle", new NeedleItem(new Item.Settings().maxDamage(250)));

    public static final Item FLOPPY_DISK = registerItem("floppy_disk", new Item(new Item.Settings()));
    public static final Item JACINTHE_THEME_MUSIC_DISC = registerItem("jacinthe_theme_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.JACINTHE_THEME_KEY).maxCount(1)));
    public static final Item A_CYBERS_WORLD_MUSIC_DISC = registerItem("a_cybers_world_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.A_CYBERS_WORLD_KEY).maxCount(1)));
    public static final Item LIVE_TO_LIVE_MUSIC_DISC = registerItem("live_to_live_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.LIVE_TO_LIVE_KEY).maxCount(1)));
    public static final Item EASY_MUSIC_DISC = registerItem("easy_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.EASY_KEY).maxCount(1)));
    public static final Item LOVE_IN_A_BOTTLE_MUSIC_DISC = registerItem("love_in_a_bottle_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.LOVE_IN_A_BOTTLE_KEY).maxCount(1)));
    public static final Item LOSER_BABY_MUSIC_DISC = registerItem("loser_baby_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.LOSER_BABY_KEY).maxCount(1)));
    public static final Item THE_SLAUGHTER_CONTINUES_WL_MUSIC_DISC = registerItem("the_slaughter_continues_wl_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.THE_SLAUGHTER_CONTINUES_WL_KEY).maxCount(1)));
    public static final Item AN_ENIGMATIC_ENCOUNTER_MUSIC_DISC = registerItem("an_enigmatic_encounter_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.AN_ENIGMATIC_ENCOUNTER_KEY).maxCount(1)));
    public static final Item THE_GRAND_FINALE_MUSIC_DISC = registerItem("the_grand_finale_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.THE_GRAND_FINALE_KEY).maxCount(1)));
    public static final Item ACCUMULA_TOWN_MUSIC_DISC = registerItem("accumula_town_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ACCUMULA_TOWN_KEY).maxCount(1)));
    public static final Item RED_THEME_MUSIC_DISC = registerItem("red_theme_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.RED_THEME_KEY).maxCount(1)));
    public static final Item WALLY_THEME_MUSIC_DISC = registerItem("wally_theme_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.WALLY_THEME_KEY).maxCount(1)));
    public static final Item ASH_GRENINJA_MUSIC_DISC = registerItem("ash_greninja_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ASH_GRENINJA_KEY).maxCount(1)));
    public static final Item THE_WORLD_REVOLVING_MUSIC_DISC = registerItem("the_world_revolving_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.THE_WORLD_REVOLVING_KEY).maxCount(1)));
    public static final Item HAMMER_OF_JUSTICE_MUSIC_DISC = registerItem("hammer_of_justice_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.HAMMER_OF_JUSTICE_KEY).maxCount(1)));
    public static final Item BIG_SHOT_MUSIC_DISC = registerItem("big_shot_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BIG_SHOT_KEY).maxCount(1)));
    public static final Item FIELD_OF_HOPES_AND_DREAMS_MUSIC_DISC = registerItem("field_of_hopes_and_dreams_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.FIELD_OF_HOPES_AND_DREAMS_KEY).maxCount(1)));
    public static final Item BATTLE_AGAINST_A_TRUE_HERO_MUSIC_DISC = registerItem("battle_against_a_true_hero_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BATTLE_AGAINST_A_TRUE_HERO_KEY).maxCount(1)));
    public static final Item CORE_MUSIC_DISC = registerItem("core_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.CORE_KEY).maxCount(1)));
    public static final Item RAISE_UP_YOUR_BAT_MUSIC_DISC = registerItem("raise_up_your_bat_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.RAISE_UP_YOUR_BAT_KEY).maxCount(1)));
    public static final Item ITS_TV_TIME_MUSIC_DISC = registerItem("its_tv_time_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.ITS_TV_TIME_KEY).maxCount(1)));
    public static final Item DRIVING_IN_MY_CAR_MUSIC_DISC = registerItem("driving_in_my_car_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.DRIVING_IN_MY_CAR_KEY).maxCount(1)));
    public static final Item THE_THIRD_SANCTUARY_MUSIC_DISC = registerItem("the_third_sanctuary_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.THE_THIRD_SANCTUARY_KEY).maxCount(1)));
    public static final Item NEVERENDING_NIGHT_MUSIC_DISC = registerItem("neverending_night_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.NEVERENDING_NIGHT_KEY).maxCount(1)));
    public static final Item BLACK_KNIFE_MUSIC_DISC = registerItem("black_knife_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.BLACK_KNIFE_KEY).maxCount(1)));
    public static final Item KING_OF_HELL_MUSIC_DISC = registerItem("king_of_hell_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.KING_OF_HELL_KEY).maxCount(1)));
    public static final Item POISON_MUSIC_DISC = registerItem("poison_music_disc",
            new Item(new Item.Settings().jukeboxPlayable(ModSounds.POISON_KEY).maxCount(1)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Relics.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Relics.LOGGER.info("Registering Mod Items for " + Relics.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_GARNET);
            fabricItemGroupEntries.add(RAW_PINK_GARNET);
            fabricItemGroupEntries.add(STARLIGHT_ASHES);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(CAULIFLOWER);
        });
    }
}
