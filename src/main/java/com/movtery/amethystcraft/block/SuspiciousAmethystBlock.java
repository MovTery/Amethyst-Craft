package com.movtery.amethystcraft.block;

import com.movtery.amethystcraft.item.Gauze;
import com.movtery.amethystcraft.sound.ModSoundEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SuspiciousAmethystBlock extends Block {
    public static final Block SUSPICIOUS_AMETHYST_BLOCK = new SuspiciousAmethystBlock(FabricBlockSettings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(6.5F, 10.0F).requiresTool());

    public SuspiciousAmethystBlock(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack stack = player.getStackInHand(hand);
        if (stack.getItem() != Gauze.GAUZE) {
            return ActionResult.PASS;
        }

        world.setBlockState(pos, WrappedSuspiciousAmethystBlock.WRAPPED_SUSPICIOUS_AMETHYST_BLOCK.getDefaultState());
        world.playSound(null, pos, ModSoundEvents.AC_USE_GAUZE, SoundCategory.BLOCKS, 1.0F, 1.0F);

        if (!player.isCreative()) {
            stack.decrement(1);
        }

        return ActionResult.SUCCESS;
    }
}