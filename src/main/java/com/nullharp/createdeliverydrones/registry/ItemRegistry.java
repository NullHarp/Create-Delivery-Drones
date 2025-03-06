package com.nullharp.createdeliverydrones.registry;

import com.nullharp.createdeliverydrones.CreateDeliveryDrones;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.Item;

import static com.nullharp.createdeliverydrones.CreateDeliveryDrones.REGISTRATE;

public class ItemRegistry {

    public static final RegistryEntry<Item> EXAMPLE_ITEM = REGISTRATE.item("example_item",Item::new)
            .lang("Example Item")
            .tab(CreativeTabRegistry.MAIN_TAB.getKey())
            .register();


    public static void register() {}
}
