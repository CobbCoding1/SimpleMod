package com.cobbcoding.simple.registry;

import com.cobbcoding.simple.Simple;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // Copper Block
    public static final Block COPPER_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool().strength(5f, 30f).sounds(BlockSoundGroup.METAL));

    public static void registerBlocks(){
        Registry.register(Registry.BLOCK, new Identifier(Simple.MOD_ID, "copper_block"), COPPER_BLOCK);
    }
}
