package com.cthuluzombie.test.registry;

import com.cthuluzombie.test.Test;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Modblocks {

    public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4f).sounds(BlockSoundGroup.METAL));

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Test.MOD_ID, "ruby_block"), RUBY_BLOCK);
    }
}
