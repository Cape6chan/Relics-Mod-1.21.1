package net.sixchan.relics.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.sixchan.relics.block.ModBlocks;
import net.sixchan.relics.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK, 0.25f, 200, "misc");
        offerBlasting(exporter, List.of(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK, 0.25f, 100, "misc");

        offerSmelting(exporter, List.of(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK, 0.25f, 200, "misc");
        offerBlasting(exporter, List.of(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK, 0.25f, 100, "misc");

        offerSmelting(exporter, List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK, 0.25f, 200, "misc");
        offerBlasting(exporter, List.of(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK, 0.25f, 100, "misc");


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLOPPY_DISK)
                .pattern("*i*")
                .pattern("***")
                .pattern("*#*")
                .input('i', Items.REDSTONE)
                .input('*', Items.IRON_NUGGET)
                .input('#', Items.PAPER)
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.JACINTHE_THEME_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.BREAD)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIVE_TO_LIVE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.FEATHER)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.EASY_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.SPECTRAL_ARROW)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LOVE_IN_A_BOTTLE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.GLASS_BOTTLE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LOSER_BABY_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.GLOWSTONE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_SLAUGHTER_CONTINUES_WL_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.BONE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AN_ENIGMATIC_ENCOUNTER_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.SKELETON_SKULL)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_GRAND_FINALE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.NETHER_STAR)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ACCUMULA_TOWN_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.RABBIT_FOOT)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THEME_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.RED_BANNER)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);

        // WALLY THEME pour lulu

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ASH_GRENINJA_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.TADPOLE_BUCKET)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_WORLD_REVOLVING_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.NETHERITE_HOE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HAMMER_OF_JUSTICE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.TURTLE_HELMET)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BIG_SHOT_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.REPEATER)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FIELD_OF_HOPES_AND_DREAMS_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.CRIMSON_FUNGUS)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.A_CYBERS_WORLD_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.REDSTONE_BLOCK)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BATTLE_AGAINST_A_TRUE_HERO_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.TOTEM_OF_UNDYING)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.LAVA_BUCKET)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAISE_UP_YOUR_BAT_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.NOTE_BLOCK)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ITS_TV_TIME_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.LIGHTNING_ROD)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DRIVING_IN_MY_CAR_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.MINECART)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_THIRD_SANCTUARY_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.BLUE_ICE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEVERENDING_NIGHT_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.ECHO_SHARD)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLACK_KNIFE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.NETHERITE_SWORD)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.KING_OF_HELL_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.ENCHANTED_GOLDEN_APPLE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POISON_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.SPIDER_EYE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
    }
}