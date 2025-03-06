package com.nullharp.createdeliverydrones.registry;

import com.nullharp.createdeliverydrones.CreateDeliveryDrones;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;


import static com.nullharp.createdeliverydrones.CreateDeliveryDrones.REGISTRATE;

public class BlockRegistry {

    public static final RegistryEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new)
            .lang("Example Block")
            .register();

    public static final RegistryEntry<BlockItem> EXAMPLE_BLOCK_ITEM = REGISTRATE.block("example_block", Block::new)
            .item()
            .tab(CreativeTabRegistry.MAIN_TAB.getKey())
            .lang("Example Block")
            .register();

    public static void register() {}

}
