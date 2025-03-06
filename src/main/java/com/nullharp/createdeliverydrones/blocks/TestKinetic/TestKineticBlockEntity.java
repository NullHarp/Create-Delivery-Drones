package com.nullharp.createdeliverydrones.blocks.TestKinetic;

import com.simibubi.create.content.kinetics.base.KineticBlockEntity;
import net.minecraft.client.gui.components.ChatComponent;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.WorldData;
import net.minecraftforge.common.util.LazyOptional;

public class TestKineticBlockEntity extends KineticBlockEntity {


    public TestKineticBlockEntity(BlockEntityType<?> typeIn, BlockPos pos, BlockState state) {
        super(typeIn, pos, state);
    }

    @Override
    public float calculateStressApplied() {
        float impact = 512f;
        this.lastStressApplied = impact;
        return impact;
    }

    @Override
    public void onSpeedChanged(float previousSpeed) {
        getLevel().getServer().getPlayerList().getPlayers().forEach(player -> {
            player.sendSystemMessage(Component.literal(String.valueOf(getSpeed())));
        });
    }
}

