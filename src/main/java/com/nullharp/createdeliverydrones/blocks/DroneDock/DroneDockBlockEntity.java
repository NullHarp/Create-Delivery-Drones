package com.nullharp.createdeliverydrones.blocks.DroneDock;

import com.simibubi.create.content.logistics.packagePort.PackagePortBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class DroneDockBlockEntity extends PackagePortBlockEntity  {

    public DroneDockBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @Override
    protected void onOpenChange(boolean b) {

    }


    @Override
    public InteractionResult use(Player player) {
        if (player == null)
            return InteractionResult.PASS;

        ItemStack mainHandItem = player.getMainHandItem();

        return super.use(player);
    }
}
