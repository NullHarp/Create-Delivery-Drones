package com.nullharp.createdeliverydrones;

import com.mojang.logging.LogUtils;
import com.nullharp.createdeliverydrones.registry.BlockRegistry;
import com.nullharp.createdeliverydrones.registry.CreativeTabRegistry;
import com.nullharp.createdeliverydrones.registry.ItemRegistry;
import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(CreateDeliveryDrones.MODID)
public class CreateDeliveryDrones
{


    public static void registerAll() {
        // Reference all registry classes here
        ItemRegistry.register();
        BlockRegistry.register();
        CreativeTabRegistry.register();
    }

    public static final String MODID = "createdeliverydrones";

    private static final Logger LOGGER = LogUtils.getLogger();

    public static final Registrate REGISTRATE = Registrate.create(CreateDeliveryDrones.MODID);

    private final Registrate registrate = Registrate.create("createdeliverydrones");




    public CreateDeliveryDrones(FMLJavaModLoadingContext context)
    {
        registerAll();

        IEventBus modEventBus = context.getModEventBus(); //if needed

        MinecraftForge.EVENT_BUS.register(this);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
