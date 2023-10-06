package com.movtery.amethystcraft.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class WrappedSuspiciousAmethystBlock implements ModInitializer {
    public static final Block WRAPPED_SUSPICIOUS_AMETHYST_BLOCK = new Block(FabricBlockSettings.create().sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(3.5F, 9.0F).requiresTool());
    @Override
    public void onInitialize() {
    }
}