package com.nullharp.createdeliverydrones.registry;

import com.nullharp.createdeliverydrones.CreateDeliveryDrones;
import com.nullharp.createdeliverydrones.entities.DeliveryDrone.DeliveryDrone;
import com.nullharp.createdeliverydrones.entities.PackageFluid.FluidPackageEntity;
import com.nullharp.createdeliverydrones.entities.PackageFluid.FluidPackageRenderer;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.data.CreateEntityBuilder;
import com.tterrag.registrate.util.entry.EntityEntry;
import com.tterrag.registrate.util.nullness.NonNullConsumer;
import com.tterrag.registrate.util.nullness.NonNullFunction;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.createmod.catnip.lang.Lang;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.storage.loot.LootTable;

import static com.nullharp.createdeliverydrones.CreateDeliveryDrones.REGISTRATE;

public class EntityRegistry {

    public static final EntityEntry<DeliveryDrone> DELIVERY_DRONE = REGISTRATE
            .entity("delivery_drone", DeliveryDrone::new, MobCategory.CREATURE)
            .properties(props -> props.sized(0.6f, 1.8f)) // Set the entity's hitbox size
            .attributes(DeliveryDrone::createMobAttributes)
            .register();


    public static void register() {}
}
