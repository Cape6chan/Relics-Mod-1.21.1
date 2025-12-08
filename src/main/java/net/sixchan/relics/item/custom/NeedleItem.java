package net.sixchan.relics.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NeedleItem extends Item {
    public NeedleItem(Settings settings) {
        super(settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (world.isClient()) {
            return;
        }

        if (!(entity instanceof PlayerEntity player)) {
            return;
        }

        // Effet constant
        StatusEffectInstance effect = new StatusEffectInstance(
                StatusEffects.HEALTH_BOOST,
                20,        // durée très courte, réappliquée chaque tick
                0,         // niveau 1 donc +2 coeurs
                true,
                false,
                false
        );

        player.addStatusEffect(effect);
    }
}
