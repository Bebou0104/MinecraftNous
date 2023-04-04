
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lesthonsrouges.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class LesThonsRougesModTabs {
	public static CreativeModeTab TAB_URATECH;

	public static void load() {
		TAB_URATECH = new CreativeModeTab("taburatech") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(LesThonsRougesModItems.URANIUMLINGOT.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
