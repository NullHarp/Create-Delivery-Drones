package com.nullharp.createdeliverydrones.registry;

import com.nullharp.createdeliverydrones.CreateDeliveryDrones;
import com.nullharp.createdeliverydrones.entities.DeliveryDrone.DeliveryDrone;
import com.nullharp.createdeliverydrones.entities.PackageFluid.FluidPackageEntity;
import com.nullharp.createdeliverydrones.entities.PackageFluid.FluidPackageRenderer;
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


    public static final EntityEntry<FluidPackageEntity> FLUID_PACKAGE = register("package", FluidPackageEntity::new, () -> FluidPackageRenderer::new,
            MobCategory.MISC, 10, 3, true, false, FluidPackageEntity::build)
            .register();



    private static <T extends Entity> CreateEntityBuilder<T, ?> register(String name, EntityType.EntityFactory<T> factory,
        NonNullSupplier<NonNullFunction<EntityRendererProvider.Context, EntityRenderer<? super T>>> renderer,
        MobCategory group, int range, int updateFrequency, boolean sendVelocity, boolean immuneToFire,
        NonNullConsumer<EntityType.Builder<T>> propertyBuilder) {
            String id = Lang.asId(name);
            return (CreateEntityBuilder<T, ?>) CreateDeliveryDrones.REGISTRATE
            .entity(id, factory, group)
            .properties(b -> b.setTrackingRange(range)
            .setUpdateInterval(updateFrequency)
            .setShouldReceiveVelocityUpdates(sendVelocity))
            .properties(propertyBuilder)
            .properties(b -> {
                if (immuneToFire)
                    b.fireImmune();
                })
            .renderer(renderer);
    }

    public static void register() {}
}
