
package net.mcreator.lesthonsrouges.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class UraniumlingotItem extends Item {
	public UraniumlingotItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(32).fireResistant().rarity(Rarity.COMMON));
	}
}
