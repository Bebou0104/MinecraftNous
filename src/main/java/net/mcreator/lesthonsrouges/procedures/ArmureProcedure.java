package net.mcreator.lesthonsrouges.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class ArmureProcedure {
	public static void execute(ItemStack itemstack) {
		(itemstack).enchant(Enchantments.THORNS, 7);
	}
}
