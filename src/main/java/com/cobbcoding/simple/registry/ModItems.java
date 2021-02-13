package com.cobbcoding.simple.registry;

import com.cobbcoding.simple.Simple;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Items

    // Copper Ingot
    public static final Item COPPER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    // Block Items

    // Copper Block
    public static final BlockItem COPPER_BLOCK = new BlockItem(ModBlocks.COPPER_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    // Copper Ore
    public static final BlockItem COPPER_ORE = new BlockItem(ModBlocks.COPPER_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    // Tools

    // Copper Pickaxe
    public static ToolItem COPPER_PICKAXE = new CustomPickaxeItem(CopperToolMaterial.INSTANCE, 1, 1.2f, new Item.Settings().group(ItemGroup.TOOLS));

    public static void registerItems(){
        // Register Copper Ingot
        Registry.register(Registry.ITEM, new Identifier(Simple.MOD_ID, "copper_ingot"), COPPER_INGOT);

        // Register Copper Block
        Registry.register(Registry.ITEM, new Identifier(Simple.MOD_ID, "copper_block"), COPPER_BLOCK);

        // Register Copper Ore
        Registry.register(Registry.ITEM, new Identifier(Simple.MOD_ID, "copper_ore"), COPPER_ORE);

        // Register Copper Pickaxe
        Registry.register(Registry.ITEM, new Identifier(Simple.MOD_ID, "copper_pickaxe"), COPPER_PICKAXE);
    }
}

