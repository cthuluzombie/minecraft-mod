package com.cthuluzombie.test.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class ModPickaxebase extends PickaxeItem {

    public ModPickaxebase(ToolMaterial material) {
        super(material, 0, -2, new Item.Settings().group(ItemGroup.TOOLS));
    }

}
