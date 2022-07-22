package com.cthuluzombie.test.registry;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class ModAxebase extends AxeItem {
    protected ModAxebase(ToolMaterial material) {
        super(material, 20, 2.0f, new Item.Settings().group(ItemGroup.TOOLS));
    }
}
