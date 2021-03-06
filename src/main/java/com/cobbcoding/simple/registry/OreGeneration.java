package com.cobbcoding.simple.registry;

import com.cobbcoding.simple.Simple;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGeneration {
    public static ConfiguredFeature<?, ?> COPPER_ORE_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    ModBlocks.COPPER_ORE.getDefaultState(),
                    9)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    64)))
            .spreadHorizontally()
            .repeat(20);

    public static void registerGeneration(){
        RegistryKey<ConfiguredFeature<?, ?>> copperOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier(Simple.MOD_ID, "copper_ore_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, copperOreOverworld.getValue(), COPPER_ORE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, copperOreOverworld);
    }
}
