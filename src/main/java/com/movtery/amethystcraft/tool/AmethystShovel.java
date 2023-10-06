package com.movtery.amethystcraft.tool;

import com.movtery.amethystcraft.item.AmethystRawStone;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystShovel implements ToolMaterial {
    public static final AmethystShovel AmethystShovel = new AmethystShovel();
    public static ToolItem AMETHYST_SHOVEL = new ShovelItem(AmethystShovel, 3, -2.8F, new FabricItemSettings());

    @Override
    public int getDurability() {
        return 530;
    }
    public float getMiningSpeedMultiplier() {
        return 6.2F;
    }
    public float getAttackDamage() {
        return 1;
    }
    public int getMiningLevel() {
        return 3;
    }
    public int getEnchantability() {
        return 22;
    }
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AmethystRawStone.AMETHYST_RAW_STONE);
    }
}
