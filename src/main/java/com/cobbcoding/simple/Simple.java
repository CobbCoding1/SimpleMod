package com.cobbcoding.simple;

import com.cobbcoding.simple.registry.ModBlocks;
import com.cobbcoding.simple.registry.ModEntities;
import com.cobbcoding.simple.registry.ModItems;
import com.cobbcoding.simple.registry.OreGeneration;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.RegistryKey;

public class Simple implements ModInitializer {

    public static final String MOD_ID = "simple";

    @Override
    public void onInitialize(){
        // Register Items
        ModItems.registerItems();

        // Register Blocks
        ModBlocks.registerBlocks();

        // Register Generation
        OreGeneration.registerGeneration();

        // Register Entities
        ModEntities.registerEntities();
    }
}
