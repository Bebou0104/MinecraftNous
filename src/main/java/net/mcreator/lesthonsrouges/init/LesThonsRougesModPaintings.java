
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lesthonsrouges.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.lesthonsrouges.LesThonsRougesMod;

public class LesThonsRougesModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, LesThonsRougesMod.MODID);
	public static final RegistryObject<PaintingVariant> NAZ = REGISTRY.register("naz", () -> new PaintingVariant(48, 32));
}
