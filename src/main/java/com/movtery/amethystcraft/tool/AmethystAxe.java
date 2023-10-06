package com.movtery.amethystcraft.tool;

import com.movtery.amethystcraft.item.AmethystRawStone;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystAxe implements ToolMaterial {
    public static final AmethystAxe AmethystAxe = new AmethystAxe();
    public static ToolItem AMETHYST_AXE = new AxeItem(AmethystAxe, 5.3F, -2.8F, new FabricItemSettings());

    @Override
    public int getDurability() {
        return 650;
    }
    public float getMiningSpeedMultiplier() {
        return 6.2F;
    }
    public float getAttackDamage() {
        return 4.2F;
    }
    public int getMiningLevel() {
        return 3;
    }
    public int getEnchantability() {
        return 15;
    }
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AmethystRawStone.AMETHYST_RAW_STONE);
    }
}
