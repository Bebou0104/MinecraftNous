
package net.mcreator.lesthonsrouges.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.lesthonsrouges.init.LesThonsRougesModTabs;

public class IronstickItem extends Item {
	public IronstickItem() {
		super(new Item.Properties().tab(LesThonsRougesModTabs.TAB_URATECH).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 10;
	}
}
