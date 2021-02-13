package com.cobbcoding.simple.registry;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class CopperEntity extends PathAwareEntity {

    public CopperEntity(EntityType<? extends PathAwareEntity> entityType, World world){
        super(entityType, world);
    }
}
