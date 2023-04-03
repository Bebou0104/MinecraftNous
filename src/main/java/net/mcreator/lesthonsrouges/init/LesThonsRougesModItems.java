
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lesthonsrouges.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lesthonsrouges.item.UraniumswordItem;
import net.mcreator.lesthonsrouges.item.UraniumpickaxeItem;
import net.mcreator.lesthonsrouges.item.UraniumlingotItem;
import net.mcreator.lesthonsrouges.item.UraniumarmureItem;
import net.mcreator.lesthonsrouges.item.IronstickItem;
import net.mcreator.lesthonsrouges.LesThonsRougesMod;

public class LesThonsRougesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LesThonsRougesMod.MODID);
	public static final RegistryObject<Item> URANIUMLINGOT = REGISTRY.register("uraniumlingot", () -> new UraniumlingotItem());
	public static final RegistryObject<Item> URANIUMBLOCK = block(LesThonsRougesModBlocks.URANIUMBLOCK, CreativeModeTab.TAB_MATERIALS);
	public static final RegistryObject<Item> URANIUMSWORD = REGISTRY.register("uraniumsword", () -> new UraniumswordItem());
	public static final RegistryObject<Item> URANIUMPICKAXE = REGISTRY.register("uraniumpickaxe", () -> new UraniumpickaxeItem());
	public static final RegistryObject<Item> IRONSTICK = REGISTRY.register("ironstick", () -> new IronstickItem());
	public static final RegistryObject<Item> URANIUMARMURE_HELMET = REGISTRY.register("uraniumarmure_helmet", () -> new UraniumarmureItem.Helmet());
	public static final RegistryObject<Item> URANIUMARMURE_CHESTPLATE = REGISTRY.register("uraniumarmure_chestplate", () -> new UraniumarmureItem.Chestplate());
	public static final RegistryObject<Item> URANIUMARMURE_LEGGINGS = REGISTRY.register("uraniumarmure_leggings", () -> new UraniumarmureItem.Leggings());
	public static final RegistryObject<Item> URANIUMARMURE_BOOTS = REGISTRY.register("uraniumarmure_boots", () -> new UraniumarmureItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
