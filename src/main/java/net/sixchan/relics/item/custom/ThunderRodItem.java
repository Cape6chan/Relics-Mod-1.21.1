package net.sixchan.relics.item.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class ThunderRodItem extends Item {

    public ThunderRodItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();

        if (!world.isClient()) {
            LightningEntity lightning = EntityType.LIGHTNING_BOLT.create(world);

            if (lightning != null) {
                lightning.refreshPositionAfterTeleport(
                    pos.getX() + 0.5,
                    pos.getY(),
                    pos.getZ() + 0.5
                );
                world.spawnEntity(lightning);
            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.relics.thunder_rod.tooltip"));

        super.appendTooltip(stack, context, tooltip, type);
    }
}
