
package net.mcreator.theplanetarymod.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.theplanetarymod.init.ThePlanetaryModModTabs;

public abstract class SlimearmourItem extends ArmorItem {
	public SlimearmourItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 50, 60, 20}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 33;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.calcite.break"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Blocks.SLIME_BLOCK), new ItemStack(Items.SLIME_BALL));
			}

			@Override
			public String getName() {
				return "slimearmour";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.3f;
			}
		}, slot, properties);
	}

	public static class Helmet extends SlimearmourItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(ThePlanetaryModModTabs.TAB_PLANETARY_MOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "the_planetary_mod:textures/models/armor/green_armour_layer_1.png";
		}
	}

	public static class Chestplate extends SlimearmourItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(ThePlanetaryModModTabs.TAB_PLANETARY_MOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "the_planetary_mod:textures/models/armor/green_armour_layer_1.png";
		}
	}

	public static class Leggings extends SlimearmourItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(ThePlanetaryModModTabs.TAB_PLANETARY_MOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "the_planetary_mod:textures/models/armor/green_armour_layer_2.png";
		}
	}

	public static class Boots extends SlimearmourItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(ThePlanetaryModModTabs.TAB_PLANETARY_MOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "the_planetary_mod:textures/models/armor/green_armour_layer_1.png";
		}
	}
}
