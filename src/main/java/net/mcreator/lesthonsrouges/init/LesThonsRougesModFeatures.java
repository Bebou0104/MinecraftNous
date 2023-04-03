
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lesthonsrouges.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.lesthonsrouges.world.features.ores.UraniumblockFeature;
import net.mcreator.lesthonsrouges.LesThonsRougesMod;

@Mod.EventBusSubscriber
public class LesThonsRougesModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, LesThonsRougesMod.MODID);
	public static final RegistryObject<Feature<?>> URANIUMBLOCK = REGISTRY.register("uraniumblock", UraniumblockFeature::feature);
}
