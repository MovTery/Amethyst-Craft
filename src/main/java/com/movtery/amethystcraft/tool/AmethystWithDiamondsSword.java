package com.movtery.amethystcraft.tool;

import com.movtery.amethystcraft.item.AmethystRawStone;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystWithDiamondsSword implements ToolMaterial {
    public static final AmethystWithDiamondsSword AmethystWithDiamondsSword = new AmethystWithDiamondsSword();
    public static ToolItem AMETHYST_WITH_DIAMONDS_SWORD = new SwordItem(AmethystWithDiamondsSword, 5, -2.5F, new FabricItemSettings());

    @Override
    public int getDurability() {
        return 1661;
    }
    public float getMiningSpeedMultiplier() {
        return 8.5F;
    }
    public float getAttackDamage() {
        return 3.5F;
    }
    public int getMiningLevel() {
        return 3;
    }
    public int getEnchantability() {
        return 24;
    }
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AmethystRawStone.AMETHYST_RAW_STONE);
    }
}
