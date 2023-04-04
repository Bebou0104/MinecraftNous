
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lesthonsrouges.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.lesthonsrouges.world.inventory.XeathermakerMenu;
import net.mcreator.lesthonsrouges.world.inventory.ChargeMenu;
import net.mcreator.lesthonsrouges.LesThonsRougesMod;

public class LesThonsRougesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LesThonsRougesMod.MODID);
	public static final RegistryObject<MenuType<XeathermakerMenu>> XEATHERMAKER = REGISTRY.register("xeathermaker", () -> IForgeMenuType.create(XeathermakerMenu::new));
	public static final RegistryObject<MenuType<ChargeMenu>> CHARGE = REGISTRY.register("charge", () -> IForgeMenuType.create(ChargeMenu::new));
}
