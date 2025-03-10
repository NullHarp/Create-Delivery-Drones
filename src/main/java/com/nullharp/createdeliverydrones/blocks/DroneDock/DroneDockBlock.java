package com.nullharp.createdeliverydrones.blocks.DroneDock;

import com.nullharp.createdeliverydrones.blocks.TestKinetic.TestKineticBlockEntity;
import com.nullharp.createdeliverydrones.registry.BlockEntityRegistry;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import com.simibubi.create.foundation.block.IBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class DroneDockBlock extends Block implements IBE<DroneDockBlockEntity>, IWrenchable {

    public DroneDockBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public Class<DroneDockBlockEntity> getBlockEntityClass() {
        return DroneDockBlockEntity.class;

    }

    @Override
    public BlockEntityType<? extends DroneDockBlockEntity> getBlockEntityType() {
        return BlockEntityRegistry.DRONE_DOCK.get();
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, InteractionHand pHand,
                                 BlockHitResult pHit) {
        return onBlockEntityUse(pLevel, pPos, be -> be.use(pPlayer));
    }
}
