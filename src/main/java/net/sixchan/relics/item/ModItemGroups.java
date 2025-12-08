package net.sixchan.relics.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sixchan.relics.Relics;
import net.sixchan.relics.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "pink_garnet"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.relics.pink_garnet"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);

                        /*entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_SLAB);
                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_WALL);
                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);*/

                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);

                        entries.add(ModBlocks.MAGIC_BLOCK);

                        entries.add(ModItems.CHISEL);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.STARLIGHT_ASHES);

                    }).build());

    public static final ItemGroup REFERENCE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "reference"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NEEDLE))
                    .displayName(Text.translatable("itemgroup.relics.reference"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.NEEDLE);
                        entries.add(ModItems.THUNDER_ROD);

                    }).build());

    public static final ItemGroup DISC_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Relics.MOD_ID, "disc"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.JACINTHE_THEME_MUSIC_DISC))
                    .displayName(Text.translatable("itemgroup.relics.disc"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.JACINTHE_THEME_MUSIC_DISC);
                        entries.add(ModItems.A_CYBERS_WORLD_MUSIC_DISC);
                        entries.add(ModItems.LIVE_TO_LIVE_MUSIC_DISC);

                    }).build());

    public static void registerItemGroups() {
        Relics.LOGGER.info("Registering Mod Item Groups for " + Relics.MOD_ID);
    }
}
