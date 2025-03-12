package com.nullharp.createdeliverydrones.registry;

import com.nullharp.createdeliverydrones.CreateDeliveryDrones;
import com.nullharp.createdeliverydrones.entities.PackageFluid.FluidPackageEntity;
import com.nullharp.createdeliverydrones.entities.PackageFluid.FluidPackageItem;
import com.simibubi.create.content.logistics.box.PackageStyles;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.nullharp.createdeliverydrones.CreateDeliveryDrones.REGISTRATE;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CreateDeliveryDrones.MODID);

    public static final RegistryEntry<Item> EXAMPLE_ITEM = REGISTRATE.item("example_item",Item::new)
            .tab(CreativeTabRegistry.MAIN_TAB.getKey())
            .register();

    public static final RegistryObject<FluidPackageItem> FLUID_PACKAGE  = ITEMS.register("fluid_package",  () -> new FluidPackageItem(new Item.Properties(),new PackageStyles.PackageStyle("fluid_package",10,12,0,false)));



    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
