package com.nullharp.createdeliverydrones.registry;

import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import static com.nullharp.createdeliverydrones.CreateDeliveryDrones.REGISTRATE;

public class ItemRegistry {

    public static final RegistryEntry<Item> EXAMPLE_ITEM = REGISTRATE.get().item("example_item",Item::new)
            .lang("Example Item")
            .register();




}
