package com.nullharp.createdeliverydrones.registry;

import com.nullharp.createdeliverydrones.CreateDeliveryDrones;
import com.nullharp.createdeliverydrones.blocks.TestKinetic.TestKineticBlockEntity;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class BlockEntityRegistry {

    public static final BlockEntityEntry<TestKineticBlockEntity> TEST_KINETIC = CreateDeliveryDrones.REGISTRATE
            .blockEntity("test_kinetic", TestKineticBlockEntity::new)
            .validBlocks(BlockRegistry.TEST_KINETIC)
            .register();

    public static void register() {}
}
