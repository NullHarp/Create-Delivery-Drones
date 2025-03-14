package com.nullharp.createdeliverydrones.registry;


import com.nullharp.createdeliverydrones.CreateDeliveryDrones;
import com.nullharp.createdeliverydrones.blocks.DroneDock.DroneDockBlock;
import com.nullharp.createdeliverydrones.blocks.TestKinetic.TestKineticBlock;
import com.simibubi.create.AllTags;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;


import static com.simibubi.create.foundation.data.ModelGen.customItemModel;

public class BlockRegistry {

    public static final BlockEntry<TestKineticBlock> TEST_KINETIC = CreateDeliveryDrones.REGISTRATE.block("test_kinetic", TestKineticBlock::new)
            .initialProperties(SharedProperties::softMetal)
            //.transform(CStress.setImpact(Config.MAX_STRESS.get()/256f))
            .tag(AllTags.AllBlockTags.SAFE_NBT.tag) //Dono what this tag means (contraption safe?).
            .item()
            .transform(customItemModel())
            .register();

    public static final BlockEntry<DroneDockBlock> DRONE_DOCK = CreateDeliveryDrones.REGISTRATE.block("drone_dock", DroneDockBlock::new)
            .initialProperties(SharedProperties::softMetal)
            //.transform(CStress.setImpact(Config.MAX_STRESS.get()/256f))
            .tag(AllTags.AllBlockTags.SAFE_NBT.tag) //Dono what this tag means (contraption safe?).
            .item()
            .transform(customItemModel())
            .register();

    public static void register() {}
}
