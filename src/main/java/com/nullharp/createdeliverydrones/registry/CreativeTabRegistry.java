package com.nullharp.createdeliverydrones.registry;

import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static com.nullharp.createdeliverydrones.CreateDeliveryDrones.REGISTRATE;

public class CreativeTabRegistry {
    public static final RegistryEntry<CreativeModeTab> MAIN_TAB = REGISTRATE
            .object("main_tab")
            .defaultCreativeTab(tab ->
                    tab.icon(() -> new ItemStack(BlockRegistry.DRONE_DOCK.asItem())).build()
            )
            .register();

    public static void register() {}
}
