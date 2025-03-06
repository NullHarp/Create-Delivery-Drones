package com.nullharp.createdeliverydrones.registry;

import com.nullharp.createdeliverydrones.CreateDeliveryDrones;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.CreativeModeTab;

import static com.nullharp.createdeliverydrones.CreateDeliveryDrones.REGISTRATE;

public class CreativeTabRegistry {
    public static final RegistryEntry<CreativeModeTab> MAIN_TAB = REGISTRATE.defaultCreativeTab("main_tab")
            .register();

    public static void register() {}
}
