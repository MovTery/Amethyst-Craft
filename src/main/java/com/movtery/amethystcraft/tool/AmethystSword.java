package com.movtery.amethystcraft.tool;

import com.movtery.amethystcraft.item.AmethystRawStone;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystSword implements ToolMaterial {
    public static final AmethystSword AmethystSword = new AmethystSword();
    public static ToolItem AMETHYST_SWORD = new SwordItem(AmethystSword, 5, -2.6F, new FabricItemSettings());

    @Override
    public int getDurability() {
        return 760;
    }
    public float getMiningSpeedMultiplier() {
        return 6.2F;
    }
    public float getAttackDamage() {
        return 2.5F;
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
