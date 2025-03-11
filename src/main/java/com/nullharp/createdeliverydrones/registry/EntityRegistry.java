package com.nullharp.createdeliverydrones.registry;

import com.nullharp.createdeliverydrones.entities.DeliveryDrone.DeliveryDrone;
import com.nullharp.createdeliverydrones.entities.PackageFluid.FluidPackageEntity;
import com.tterrag.registrate.util.entry.EntityEntry;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobCategory;

import static com.nullharp.createdeliverydrones.CreateDeliveryDrones.REGISTRATE;

public class EntityRegistry {

    public static final EntityEntry<DeliveryDrone> DELIVERY_DRONE = REGISTRATE
            .entity("delivery_drone", DeliveryDrone::new, MobCategory.CREATURE)
            .properties(props -> props.sized(0.6f, 1.8f)) // Set the entity's hitbox size
            .attributes(DeliveryDrone::createMobAttributes)
            .register();

    public static final EntityEntry<Entity> FLUID_PACKAGE = REGISTRATE
            .object("fluid_package")
            .entity(FluidPackageEntity::new, MobCategory.CREATURE)
            .register();



    public static void register() {}
}
