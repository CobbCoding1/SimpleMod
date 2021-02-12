package com.cobbcoding.simple.registry;

import com.cobbcoding.simple.Simple;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item COPPER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems(){
        Registry.register(Registry.ITEM, new Identifier(Simple.MOD_ID, "copper_ingot"), COPPER_INGOT);
    }
}
