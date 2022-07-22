package com.cthuluzombie.test.registry;

import com.cthuluzombie.test.Test;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.security.PublicKey;


public class Moditems {
    //moditems
    public static final Item RUBY = new Item(new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    //modblocks
    public static final BlockItem RUBY_BLOCK = new BlockItem(Modblocks.RUBY_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Test.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(Test.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}

