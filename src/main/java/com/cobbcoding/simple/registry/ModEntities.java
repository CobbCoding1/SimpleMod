package com.cobbcoding.simple.registry;

import com.cobbcoding.simple.Simple;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

@Environment(EnvType.CLIENT)
public class ModEntities {

    public static final EntityType<CopperEntity> COPPER = Registry.register(Registry.ENTITY_TYPE, new Identifier(Simple.MOD_ID, "copper"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CopperEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

    public static void registerEntities(){
        FabricDefaultAttributeRegistry.register(COPPER, CopperEntity.createMobAttributes());

        EntityRendererRegistry.INSTANCE.register(COPPER, (dispatcher, context) -> {
           return new CopperEntityRenderer(dispatcher);
        });
    }
}
