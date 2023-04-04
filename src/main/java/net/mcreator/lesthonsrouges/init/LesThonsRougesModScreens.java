
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lesthonsrouges.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.lesthonsrouges.client.gui.XeathermakerScreen;
import net.mcreator.lesthonsrouges.client.gui.RechargeScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LesThonsRougesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(LesThonsRougesModMenus.RECHARGE.get(), RechargeScreen::new);
			MenuScreens.register(LesThonsRougesModMenus.XEATHERMAKER.get(), XeathermakerScreen::new);
		});
	}
}
