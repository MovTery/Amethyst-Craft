package com.movtery.amethystcraft.tool;

import com.movtery.amethystcraft.item.AmethystRawStone;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;

public class AmethystPickaxe implements ToolMaterial {
    public static final AmethystPickaxe AmethystPickaxe = new AmethystPickaxe();
    public static ToolItem AMETHYST_PICKAXE = new PickaxeItem(AmethystPickaxe, 1, -2.8F, new FabricItemSettings());

    @Override
    public int getDurability() {
        return 730;
    }
    public float getMiningSpeedMultiplier() {
        return 6.2F;
    }
    public float getAttackDamage() {
        return 3.0F;
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
