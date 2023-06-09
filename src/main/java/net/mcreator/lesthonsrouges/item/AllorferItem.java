
package net.mcreator.lesthonsrouges.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import net.mcreator.lesthonsrouges.init.LesThonsRougesModTabs;

import java.util.List;

public class AllorferItem extends Item {
	public AllorferItem() {
		super(new Item.Properties().tab(LesThonsRougesModTabs.TAB_URATECH).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00E0 utiliser pour rafiner l'uranium"));
	}
}
