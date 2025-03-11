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
    private static final double HOVER_SPEED = 0.1; // Speed at which to reach the hover height
    private static final double MAX_VELOCITY = 0.5; // Maximum allowed velocity to avoid rapid movement

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
        double currentY = entity.getY(); // Get the current Y position of the entity

        // Calculate the difference between current position and target position
        double difference = targetY - currentY;

        // Apply a velocity to move the entity toward the target height
        if (Math.abs(difference) > 0.05) { // If the difference is significant, move toward the target height
            double velocityChange = difference * HOVER_SPEED;
            double newYVelocity = Math.min(Math.max(velocityChange, -MAX_VELOCITY), MAX_VELOCITY); // Ensure the velocity doesn't exceed maximum bounds

            // Apply the velocity change in the Y direction
            entity.setDeltaMovement(entity.getDeltaMovement().add(0, newYVelocity, 0));
        }
    }
}