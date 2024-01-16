package com.pojavpro.featherclient;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.ContainerScreen;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModNameMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register a RenderLayer to render the logo
        MinecraftClient.getInstance().getItemRenderer().getHeldItemModel(ItemStack.EMPTY);

        ContainerScreen<?>.class_5247 drawingGui = (ContainerScreen.class_5247) MinecraftClient.getInstance().getContainerScreen();
        drawingGui.render(new MatrixStack(), 0, 0, 0);
    }

    // Method to render the logo on GUIs
    private void renderLogo(MatrixStack matrices, int x, int y) {
        MinecraftClient client = MinecraftClient.getInstance();
        ItemRenderer itemRenderer = client.getItemRenderer();

        // Assuming your logo is a texture in your mod's resources
        Identifier logoTexture = new Identifier("featherclient", "textures/gui/container_logo.png");

        client.getTextureManager().bindTexture(logoTexture);

        int width = 16; // Set your logo's width
        int height = 16; // Set your logo's height

        itemRenderer.blit(matrices, x, y, 0, 0, width, height);
    }
                                                    }
          