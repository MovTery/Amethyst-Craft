package com.movtery.amethystcraft.item;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AmethystRawStone implements ModInitializer {
    public static final Item AMETHYST_RAW_STONE = new Item(new FabricItemSettings());

    @Override
    public void onInitialize() {
    }
}
