
package net.mcreator.lesthonsrouges.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.lesthonsrouges.init.LesThonsRougesModTabs;

public class UraniumlingotItem extends Item {
	public UraniumlingotItem() {
		super(new Item.Properties().tab(LesThonsRougesModTabs.TAB_URATECH).stacksTo(32).fireResistant().rarity(Rarity.COMMON));
	}
}
