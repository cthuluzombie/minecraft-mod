package com.cthuluzombie.test;

import com.cthuluzombie.test.registry.Modarmor;
import com.cthuluzombie.test.registry.Modblocks;
import com.cthuluzombie.test.registry.Moditems;
import com.cthuluzombie.test.registry.Modtools;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ArmorMaterial;

public class Test implements ModInitializer{

    public static final String MOD_ID = "test";

    public static final ArmorMaterial RUBY_ARMOR = new Modarmor();

    @Override
    public void onInitialize() {
        Moditems.registerItems();
        Modblocks.registerBlocks();
        Modtools.registerTools();
        Modarmor.registerArmor();
    }
}
