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
