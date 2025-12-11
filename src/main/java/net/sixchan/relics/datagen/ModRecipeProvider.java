package net.sixchan.relics.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
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
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WALLY_THEME_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.DIAMOND_SWORD)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
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
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ONE_LITTLE_CAT_FEET_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.RED_STAINED_GLASS)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LIVE_AND_LEARN_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.EMERALD_BLOCK)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BY_YOUR_SIDE_ORCHESTRAL_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.LILY_OF_THE_VALLEY)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOREADOR_MARCH_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.LEATHER)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_GRANDFATHERS_CLOCK_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(ItemTags.WOOL)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SERENADE_BY_SCHUBERT_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.SCULK)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEMOLITION_INEVITABLE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.RABBIT_STEW)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FIVE_NIGHT_AT_FREDDYS_MUSIC_DISC)
                .input(ModItems.TOREADOR_MARCH_MUSIC_DISC)
                .input(Items.GOLD_BLOCK)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NEW_JEANS_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.LAPIS_BLOCK)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GOURMET_RACE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.CAKE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.META_KNIGHTS_REVENGE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.GOLDEN_SWORD)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DEDEDES_ROYAL_PAYBACK_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.SMITHING_TABLE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HYPER_ZONE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.GHAST_TEAR)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZERO_TWO_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.END_CRYSTAL)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CROWNED_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.NETHERITE_HELMET)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OTHERWORLDY_WARRIOR_MUSIC_DISC)
                .input(ModItems.META_KNIGHTS_REVENGE_MUSIC_DISC)
                .input(Items.SHIELD)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FOREVER_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.ROTTEN_FLESH)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BATTLE_BLAZE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.BLAZE_ROD)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HARDER_BETTER_FASTER_STRONGER_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.IRON_HELMET)
                .input(Items.GOLDEN_HELMET)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NIGHTMARE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.TINTED_GLASS)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.HEART_OF_NOVA_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.CLOCK)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SPICY_CALAMARI_INKANTATION_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.INK_SAC)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLY_OCTO_FLY_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.GLOW_INK_SAC)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FINAL_DESTINATION_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.BEACON)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FINAL_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.GOLD_INGOT)
                .input(Items.DIAMOND)
                .input(Items.EMERALD)
                .input(Items.REDSTONE)
                .input(Items.COPPER_INGOT)
                .input(Items.AMETHYST_SHARD)
                .input(Items.LAPIS_LAZULI)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.YOUR_BEST_NIGHTMARE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.WITHER_ROSE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.POKER_FACE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.MAP)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ASGORE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.TRIDENT)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TOURNER_DANS_LE_VIDE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.NAUTILUS_SHELL)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SANS_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.BONE_MEAL)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IDOL_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.END_ROD)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THE_ONLY_THING_THEY_FEAR_IS_YOU_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.CROSSBOW)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZINNIA_THEME_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.DRAGON_BREATH)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GANG_PLANK_GALLEON_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(ItemTags.CHEST_BOATS)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AI_SADA_AI_TURO_THEME_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.CALIBRATED_SCULK_SENSOR)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUPER_MARIO_BROS_THEME_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.RED_MUSHROOM)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.UNDERGROUND_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.DEEPSLATE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUNSHINE_SEASIDE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.TROPICAL_FISH)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIRE_DIRE_DOCKS_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.PRISMARINE_SHARD)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GUSTY_GARDEN_GALAXY_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.HONEY_BOTTLE)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WALUIGI_PINBALL_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.POWERED_RAIL)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.KOOPA_ROAD_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.MAGMA_CREAM)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FINAL_BOWSER_BATTLE_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(ModItems.KOOPA_ROAD_MUSIC_DISC)
                .input(Items.DRAGON_BREATH)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SPACE_JUNK_GALAXY_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(Items.FIREWORK_STAR)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NOWHERE_TO_RUN_MUSIC_DISC)
                .input(ModItems.FLOPPY_DISK)
                .input(ModItems.THE_GRANDFATHERS_CLOCK_MUSIC_DISC)
                .input(Items.IRON_BLOCK)
                .criterion(hasItem(ModItems.FLOPPY_DISK), conditionsFromItem(ModItems.FLOPPY_DISK))
                .offerTo(exporter);

    }
}