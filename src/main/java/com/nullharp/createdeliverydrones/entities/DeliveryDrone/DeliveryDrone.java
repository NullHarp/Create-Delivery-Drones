package com.nullharp.createdeliverydrones.entities.DeliveryDrone;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class DeliveryDrone extends Mob {
    private static final EntityDataAccessor<Integer> STORED_AIR = SynchedEntityData.defineId(DeliveryDrone.class, EntityDataSerializers.INT);
    private static final int MAX_AIR = 1000;

    public DeliveryDrone(EntityType<? extends Mob> type, Level world) {
        super(type, world);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(STORED_AIR, 0); // Set default value
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(3, new HoverGoal(this, 5.0D));
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 8.0F));
    }

    public void setStoredAir(int value) {
        if (value >= MAX_AIR) {
            entityData.set(STORED_AIR,MAX_AIR);
        } else entityData.set(STORED_AIR, Math.max(value, 0));
    }

    public int getStoredAir() {
        return entityData.get(STORED_AIR);
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {}

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {}
}