package net.mcreator.lesthonsrouges.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.lesthonsrouges.world.inventory.XeathermakerMenu;
import net.mcreator.lesthonsrouges.network.XeathermakerButtonMessage;
import net.mcreator.lesthonsrouges.LesThonsRougesMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class XeathermakerScreen extends AbstractContainerScreen<XeathermakerMenu> {
	private final static HashMap<String, Object> guistate = XeathermakerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_jour;
	Button button_nuit;
	Button button_soleil;
	Button button_pluie;
	Button button_orage;

	public XeathermakerScreen(XeathermakerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("les_thons_rouges:textures/screens/xeathermaker.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.les_thons_rouges.xeathermaker.label_weather_maker_2000"), 36, 15, -13408513);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_jour = new Button(this.leftPos + 8, this.topPos + 59, 46, 20, Component.translatable("gui.les_thons_rouges.xeathermaker.button_jour"), e -> {
			if (true) {
				LesThonsRougesMod.PACKET_HANDLER.sendToServer(new XeathermakerButtonMessage(0, x, y, z));
				XeathermakerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_jour", button_jour);
		this.addRenderableWidget(button_jour);
		button_nuit = new Button(this.leftPos + 116, this.topPos + 59, 46, 20, Component.translatable("gui.les_thons_rouges.xeathermaker.button_nuit"), e -> {
			if (true) {
				LesThonsRougesMod.PACKET_HANDLER.sendToServer(new XeathermakerButtonMessage(1, x, y, z));
				XeathermakerButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:button_nuit", button_nuit);
		this.addRenderableWidget(button_nuit);
		button_soleil = new Button(this.leftPos + 5, this.topPos + 103, 56, 20, Component.translatable("gui.les_thons_rouges.xeathermaker.button_soleil"), e -> {
			if (true) {
				LesThonsRougesMod.PACKET_HANDLER.sendToServer(new XeathermakerButtonMessage(2, x, y, z));
				XeathermakerButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:button_soleil", button_soleil);
		this.addRenderableWidget(button_soleil);
		button_pluie = new Button(this.leftPos + 112, this.topPos + 104, 51, 20, Component.translatable("gui.les_thons_rouges.xeathermaker.button_pluie"), e -> {
			if (true) {
				LesThonsRougesMod.PACKET_HANDLER.sendToServer(new XeathermakerButtonMessage(3, x, y, z));
				XeathermakerButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:button_pluie", button_pluie);
		this.addRenderableWidget(button_pluie);
		button_orage = new Button(this.leftPos + 59, this.topPos + 134, 51, 20, Component.translatable("gui.les_thons_rouges.xeathermaker.button_orage"), e -> {
			if (true) {
				LesThonsRougesMod.PACKET_HANDLER.sendToServer(new XeathermakerButtonMessage(4, x, y, z));
				XeathermakerButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:button_orage", button_orage);
		this.addRenderableWidget(button_orage);
	}
}
