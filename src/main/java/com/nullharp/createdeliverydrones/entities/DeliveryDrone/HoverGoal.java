package com.nullharp.createdeliverydrones.entities.DeliveryDrone;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.phys.Vec3;

public class HoverGoal extends Goal {
    private final Mob entity;
    private final double hoverHeight;

    public HoverGoal(Mob entity, double hoverHeight) {
        this.entity = entity;
        this.hoverHeight = hoverHeight; // Set how high you want the entity to hover above the ground
    }

    @Override
    public boolean canUse() {
        // Can use when the entity is on the ground or in the air
        return true;
    }

    @Override
    public void tick() {
        Level world = entity.getCommandSenderWorld(); // Get the world the entity is in
        BlockPos entityPos = entity.blockPosition(); // Get the entity's block position

        // Get the ground Y-coordinate using the heightmap
        int groundY = world.getHeight(Heightmap.Types.MOTION_BLOCKING, entityPos.getX(), entityPos.getZ());

        double targetY = groundY + hoverHeight; // Set the hover height above the ground
        entity.setPos(new Vec3(entity.getX(), targetY, entity.getZ())); // Update the entity's position
    }
}