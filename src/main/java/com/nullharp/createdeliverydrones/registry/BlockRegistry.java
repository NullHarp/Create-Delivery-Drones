package com.nullharp.createdeliverydrones.registry;

import com.nullharp.createdeliverydrones.CreateDeliveryDrones;
import com.nullharp.createdeliverydrones.blocks.DroneDock.DroneDockBlock;
import com.nullharp.createdeliverydrones.blocks.TestKinetic.TestKineticBlock;
import com.nullharp.createdeliverydrones.blocks.TestKinetic.TestKineticBlockEntity;
import com.simibubi.create.AllPartialModels;
import com.simibubi.create.AllTags;
import com.simibubi.create.content.kinetics.base.OrientedRotatingVisual;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;


import static com.nullharp.createdeliverydrones.CreateDeliveryDrones.REGISTRATE;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;

public class BlockRegistry {

    public static final RegistryEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new)
            .lang("Example Block")
            .register();

    public static final RegistryEntry<BlockItem> EXAMPLE_BLOCK_ITEM = REGISTRATE.block("example_block", Block::new)
            .item()
            .tab(CreativeTabRegistry.MAIN_TAB.getKey())
            .lang("Example Block")
            .register();

    public static final BlockEntry<TestKineticBlock> TEST_KINETIC = CreateDeliveryDrones.REGISTRATE.block("test_kinetic", TestKineticBlock::new)
            .initialProperties(SharedProperties::softMetal)
            //.transform(CStress.setImpact(Config.MAX_STRESS.get()/256f))
            .tag(AllTags.AllBlockTags.SAFE_NBT.tag) //Dono what this tag means (contraption safe?).
            .item()
            .transform(customItemModel())
            .lang("Test Kinetic")
            .register();

    public static final BlockEntry<DroneDockBlock> DRONE_DOCK = CreateDeliveryDrones.REGISTRATE.block("drone_dock", DroneDockBlock::new)
            .initialProperties(SharedProperties::softMetal)
            //.transform(CStress.setImpact(Config.MAX_STRESS.get()/256f))
            .tag(AllTags.AllBlockTags.SAFE_NBT.tag) //Dono what this tag means (contraption safe?).
            .item()
            .transform(customItemModel())
            .lang("drone_dock")
            .register();

    public static void register() {}
}
