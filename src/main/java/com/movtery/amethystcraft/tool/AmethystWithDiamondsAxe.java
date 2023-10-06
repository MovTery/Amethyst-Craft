package com.movtery.amethystcraft.tool;

import com.movtery.amethystcraft.item.AmethystRawStone;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystWithDiamondsAxe implements ToolMaterial {
    public static final AmethystWithDiamondsAxe AmethystWithDiamondsAxe = new AmethystWithDiamondsAxe();
    public static ToolItem AMETHYST_WITH_DIAMONDS_AXE = new AxeItem(AmethystWithDiamondsAxe, 5.5F, -2.8F, new FabricItemSettings());

    @Override
    public int getDurability() {
        return 1661;
    }
    public float getMiningSpeedMultiplier() {
        return 8.5F;
    }
    public float getAttackDamage() {
        return 5F;
    }
    public int getMiningLevel() {
        return 3;
    }
    public int getEnchantability() {
        return 17;
    }
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AmethystRawStone.AMETHYST_RAW_STONE);
    }
}
