package com.movtery.amethystcraft.tool;

import com.movtery.amethystcraft.item.AmethystRawStone;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AmethystHoe implements ToolMaterial {
    public static final AmethystHoe AmethystHoe = new AmethystHoe();
    public static ToolItem AMETHYST_HOE = new HoeItem(AmethystHoe, -1, -2.1F, new FabricItemSettings());

    @Override
    public int getDurability() {
        return 620;
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
        return 18;
    }
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AmethystRawStone.AMETHYST_RAW_STONE);
    }
}
