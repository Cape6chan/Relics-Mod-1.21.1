package net.sixchan.relics.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.sixchan.relics.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.FLOPPY_DISK, Models.GENERATED);
        itemModelGenerator.register(ModItems.JACINTHE_THEME_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.A_CYBERS_WORLD_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIVE_TO_LIVE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.EASY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LOVE_IN_A_BOTTLE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LOSER_BABY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_SLAUGHTER_CONTINUES_WL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.AN_ENIGMATIC_ENCOUNTER_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_GRAND_FINALE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ACCUMULA_TOWN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_THEME_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WALLY_THEME_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASH_GRENINJA_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_WORLD_REVOLVING_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.HAMMER_OF_JUSTICE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BIG_SHOT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FIELD_OF_HOPES_AND_DREAMS_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BATTLE_AGAINST_A_TRUE_HERO_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAISE_UP_YOUR_BAT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ITS_TV_TIME_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.DRIVING_IN_MY_CAR_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_THIRD_SANCTUARY_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEVERENDING_NIGHT_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLACK_KNIFE_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.KING_OF_HELL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.POISON_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.ONE_LITTLE_CAT_FEET_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.LIVE_AND_LEARN_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.BY_YOUR_SIDE_ORCHESTRAL_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.TOREADOR_MARCH_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.THE_GRANDFATHERS_CLOCK_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SERENADE_BY_SCHUBERT_MUSIC_DISC, Models.GENERATED);
    }
}
