package com.movtery.amethystcraft.tool;

import com.movtery.amethystcraft.item.AmethystRawStone;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystWithDiamondsHoe implements ToolMaterial {
    public static final AmethystWithDiamondsHoe AmethystWithDiamondsHoe = new AmethystWithDiamondsHoe();
    public static ToolItem AMETHYST_WITH_DIAMONDS_HOE = new HoeItem(AmethystWithDiamondsHoe, -1, -2.2F, new FabricItemSettings());

    @Override
    public int getDurability() {
        return 1661;
    }
    public float getMiningSpeedMultiplier() {
        return 8.5F;
    }
    public float getAttackDamage() {
        return 1;
    }
    public int getMiningLevel() {
        return 3;
    }
    public int getEnchantability() {
        return 20;
    }
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AmethystRawStone.AMETHYST_RAW_STONE);
    }
}
