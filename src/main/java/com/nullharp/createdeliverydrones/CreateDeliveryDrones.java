package com.nullharp.createdeliverydrones;

import com.mojang.logging.LogUtils;
import com.nullharp.createdeliverydrones.entities.DeliveryDrone.DeliveryDroneModel;
import com.nullharp.createdeliverydrones.entities.DeliveryDrone.DeliveryDroneRenderer;
import com.nullharp.createdeliverydrones.entities.PackageFluid.FluidPackageModel;
import com.nullharp.createdeliverydrones.entities.PackageFluid.FluidPackageRenderer;
import com.nullharp.createdeliverydrones.registry.*;
import com.tterrag.registrate.Registrate;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(CreateDeliveryDrones.MODID)
public class CreateDeliveryDrones
{


    public static void registerAll(IEventBus bus) {
        // Reference all registry classes here
        ItemRegistry.register(bus);
        BlockRegistry.register();
        BlockEntityRegistry.register();
        EntityRegistry.register();
        CreativeTabRegistry.register();
    }

    public static final String MODID = "createdeliverydrones";

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final Registrate REGISTRATE = Registrate.create(CreateDeliveryDrones.MODID);

    private final Registrate registrate = Registrate.create("createdeliverydrones");

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ModEntityRenderers {
        @SubscribeEvent
        public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
            event.registerEntityRenderer(EntityRegistry.DELIVERY_DRONE.get(), DeliveryDroneRenderer::new);
        }
        @SubscribeEvent
        public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(DeliveryDroneModel.LAYER_LOCATION, DeliveryDroneModel::createBodyLayer);
        }
    }

    public CreateDeliveryDrones(FMLJavaModLoadingContext context)
    {


        IEventBus bus = context.getModEventBus(); //if needed

        registerAll(bus);

        MinecraftForge.EVENT_BUS.register(this);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
