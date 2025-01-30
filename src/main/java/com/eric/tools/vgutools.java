package com.eric.tools;

import com.eric.BECUYeric;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class vgutools implements ToolMaterial {
    @Override
    public int getDurability() {
        return 10000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 10000000;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(BECUYeric.vgu
        );
    }
}