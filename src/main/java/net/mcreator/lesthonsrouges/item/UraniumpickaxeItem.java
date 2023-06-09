
package net.mcreator.lesthonsrouges.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.lesthonsrouges.procedures.UraniumProcedure;
import net.mcreator.lesthonsrouges.init.LesThonsRougesModTabs;
import net.mcreator.lesthonsrouges.init.LesThonsRougesModItems;

public class UraniumpickaxeItem extends PickaxeItem {
	public UraniumpickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3500;
			}

			public float getSpeed() {
				return 20f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 6;
			}

			public int getEnchantmentValue() {
				return 20;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(LesThonsRougesModItems.URANIUMLINGOT.get()));
			}
		}, 1, -2.5f, new Item.Properties().tab(LesThonsRougesModTabs.TAB_URATECH).fireResistant());
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		UraniumProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}
}
