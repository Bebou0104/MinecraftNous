
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lesthonsrouges.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.lesthonsrouges.block.UraniumblockBlock;
import net.mcreator.lesthonsrouges.LesThonsRougesMod;

public class LesThonsRougesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, LesThonsRougesMod.MODID);
	public static final RegistryObject<Block> URANIUMBLOCK = REGISTRY.register("uraniumblock", () -> new UraniumblockBlock());
}
