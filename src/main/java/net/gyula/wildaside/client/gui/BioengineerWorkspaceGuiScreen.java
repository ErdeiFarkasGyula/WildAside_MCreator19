package net.gyula.wildaside.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.gyula.wildaside.world.inventory.BioengineerWorkspaceGuiMenu;
import net.gyula.wildaside.network.BioengineerWorkspaceGuiButtonMessage;
import net.gyula.wildaside.WildasideMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BioengineerWorkspaceGuiScreen extends AbstractContainerScreen<BioengineerWorkspaceGuiMenu> {
	private final static HashMap<String, Object> guistate = BioengineerWorkspaceGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_convert;
	ImageButton imagebutton_vibrion_gui;
	ImageButton imagebutton_red_glowing_essence_gui;
	ImageButton imagebutton_brown_glowing_essence_gui;
	ImageButton imagebutton_yellow_glowing_essence_gui;
	ImageButton imagebutton_green_glowing_essence_gui;

	public BioengineerWorkspaceGuiScreen(BioengineerWorkspaceGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("wildaside:textures/screens/bioengineer_workspace_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("wildaside:textures/screens/arrow.png"));
		this.blit(ms, this.leftPos + 79, this.topPos + 33, 0, 0, 22, 15, 22, 15);

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
		button_convert = new Button(this.leftPos + 101, this.topPos + 58, 61, 20, Component.translatable("gui.wildaside.bioengineer_workspace_gui.button_convert"), e -> {
			if (true) {
				WildasideMod.PACKET_HANDLER.sendToServer(new BioengineerWorkspaceGuiButtonMessage(0, x, y, z));
				BioengineerWorkspaceGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_convert", button_convert);
		this.addRenderableWidget(button_convert);
		imagebutton_vibrion_gui = new ImageButton(this.leftPos + 42, this.topPos + 31, 18, 18, 0, 0, 18, new ResourceLocation("wildaside:textures/screens/atlas/imagebutton_vibrion_gui.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_vibrion_gui", imagebutton_vibrion_gui);
		this.addRenderableWidget(imagebutton_vibrion_gui);
		imagebutton_red_glowing_essence_gui = new ImageButton(this.leftPos + 24, this.topPos + 13, 18, 18, 0, 0, 18, new ResourceLocation("wildaside:textures/screens/atlas/imagebutton_red_glowing_essence_gui.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_red_glowing_essence_gui", imagebutton_red_glowing_essence_gui);
		this.addRenderableWidget(imagebutton_red_glowing_essence_gui);
		imagebutton_brown_glowing_essence_gui = new ImageButton(this.leftPos + 60, this.topPos + 49, 18, 18, 0, 0, 18, new ResourceLocation("wildaside:textures/screens/atlas/imagebutton_brown_glowing_essence_gui.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_brown_glowing_essence_gui", imagebutton_brown_glowing_essence_gui);
		this.addRenderableWidget(imagebutton_brown_glowing_essence_gui);
		imagebutton_yellow_glowing_essence_gui = new ImageButton(this.leftPos + 60, this.topPos + 13, 18, 18, 0, 0, 18, new ResourceLocation("wildaside:textures/screens/atlas/imagebutton_yellow_glowing_essence_gui.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_yellow_glowing_essence_gui", imagebutton_yellow_glowing_essence_gui);
		this.addRenderableWidget(imagebutton_yellow_glowing_essence_gui);
		imagebutton_green_glowing_essence_gui = new ImageButton(this.leftPos + 24, this.topPos + 49, 18, 18, 0, 0, 18, new ResourceLocation("wildaside:textures/screens/atlas/imagebutton_green_glowing_essence_gui.png"), 18, 36, e -> {
		});
		guistate.put("button:imagebutton_green_glowing_essence_gui", imagebutton_green_glowing_essence_gui);
		this.addRenderableWidget(imagebutton_green_glowing_essence_gui);
	}
}
