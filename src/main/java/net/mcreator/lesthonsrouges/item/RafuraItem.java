
package net.mcreator.lesthonsrouges.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.lesthonsrouges.init.LesThonsRougesModTabs;

public class RafuraItem extends Item {
	public RafuraItem() {
		super(new Item.Properties().tab(LesThonsRougesModTabs.TAB_URATECH).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}
}
