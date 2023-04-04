
package net.mcreator.lesthonsrouges.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.lesthonsrouges.procedures.ArmureProcedure;
import net.mcreator.lesthonsrouges.init.LesThonsRougesModTabs;
import net.mcreator.lesthonsrouges.init.LesThonsRougesModItems;

public abstract class UraniumarmureItem extends ArmorItem {
	public UraniumarmureItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 18;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(LesThonsRougesModItems.URANIUMLINGOT.get()));
			}

			@Override
			public String getName() {
				return "uraniumarmure";
			}

			@Override
			public float getToughness() {
				return 2.5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.2f;
			}
		}, slot, properties);
	}

	public static class Helmet extends UraniumarmureItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(LesThonsRougesModTabs.TAB_URATECH).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "les_thons_rouges:textures/models/armor/ura_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ArmureProcedure.execute(itemstack);
		}
	}

	public static class Chestplate extends UraniumarmureItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(LesThonsRougesModTabs.TAB_URATECH).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "les_thons_rouges:textures/models/armor/ura_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ArmureProcedure.execute(itemstack);
		}
	}

	public static class Leggings extends UraniumarmureItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(LesThonsRougesModTabs.TAB_URATECH).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "les_thons_rouges:textures/models/armor/ura_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ArmureProcedure.execute(itemstack);
		}
	}

	public static class Boots extends UraniumarmureItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(LesThonsRougesModTabs.TAB_URATECH).fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "les_thons_rouges:textures/models/armor/ura_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ArmureProcedure.execute(itemstack);
		}
	}
}
