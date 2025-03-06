package com.nullharp.createdeliverydrones.registry;

import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.RegistryObject;

import static com.nullharp.createdeliverydrones.CreateDeliveryDrones.REGISTRATE;

public class BlockRegistry {

    public static final RegistryEntry<Block> EXAMPLE_BLOCK = REGISTRATE.get().block("example_block", Block::new)
            .simpleItem()
            .lang("Example Block")
            .register();
}
