package com.cobbcoding.simple;

import com.cobbcoding.simple.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Simple implements ModInitializer {

    public static final String MOD_ID = "simple";

    @Override
    public void onInitialize(){
        ModItems.registerItems();
    }
}
