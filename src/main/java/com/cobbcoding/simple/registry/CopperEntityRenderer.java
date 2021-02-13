package com.cobbcoding.simple.registry;

import com.cobbcoding.simple.Simple;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class CopperEntityRenderer extends MobEntityRenderer<CopperEntity, CopperEntityModel> {

    public CopperEntityRenderer(EntityRenderDispatcher entityRenderDispatcher){
        super(entityRenderDispatcher, new CopperEntityModel(), 0.5f);
    }

    @Override
    public Identifier getTexture(CopperEntity entity){
        return new Identifier(Simple.MOD_ID, "textures/entity/copper/copper.png");
    }
}
