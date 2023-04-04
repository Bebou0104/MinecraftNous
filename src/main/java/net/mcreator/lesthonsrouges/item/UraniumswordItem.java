
package net.mcreator.lesthonsrouges.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.lesthonsrouges.procedures.PoisonProcedure;
import net.mcreator.lesthonsrouges.init.LesThonsRougesModTabs;
import net.mcreator.lesthonsrouges.init.LesThonsRougesModItems;

public class UraniumswordItem extends SwordItem {
	public UraniumswordItem() {
		super(new Tier() {
			public int getUses() {
				return 3500;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 6f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(LesThonsRougesModItems.URANIUMLINGOT.get()));
			}
		}, 3, -2.5f, new Item.Properties().tab(LesThonsRougesModTabs.TAB_URATECH).fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		PoisonProcedure.execute(entity);
		return retval;
	}
}
