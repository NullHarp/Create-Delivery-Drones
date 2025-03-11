package com.nullharp.createdeliverydrones.entities.DeliveryDrone;

import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DeliveryDroneRenderer extends MobRenderer<DeliveryDrone, DeliveryDroneModel<DeliveryDrone>> {
    public DeliveryDroneRenderer(EntityRendererProvider.Context context) {
        super(context, new DeliveryDroneModel<>(context.bakeLayer(DeliveryDroneModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(DeliveryDrone entity) {
        return new ResourceLocation("createdeliverydrones", "textures/entity/delivery_drone.png");
    }
}
