package com.cthuluzombie.test.registry;

import com.cthuluzombie.test.Test;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Modtools implements ToolMaterial {
    @Override
    public int getDurability() {
        return 100;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10;
    }

    @Override
    public float getAttackDamage() {
        return 5.0f;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Moditems.RUBY);
    }
    public static void registerTools()  {
        Registry.register(Registry.ITEM, new Identifier(Test.MOD_ID, "ruby_pickaxe"), new ModPickaxebase(new Modtools()));
        Registry.register(Registry.ITEM, new Identifier(Test.MOD_ID, "ruby_axe"), new ModAxebase(new Modtools()));
    }
}
