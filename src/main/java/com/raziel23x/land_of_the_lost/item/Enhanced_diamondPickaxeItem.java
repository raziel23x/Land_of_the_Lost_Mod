
package com.raziel23x.land_of_the_lost.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.raziel23x.land_of_the_lost.itemgroup.LandoftheLostItemGroup;
import com.raziel23x.land_of_the_lost.LandoftheLostElements;

@LandoftheLostElements.ModElement.Tag
public class Enhanced_diamondPickaxeItem extends LandoftheLostElements.ModElement {
	@ObjectHolder("land_of_the_lost:enhanced_diamond_pickaxe")
	public static final Item block = null;
	public Enhanced_diamondPickaxeItem(LandoftheLostElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1741;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 56;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnchancedDiamondItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(LandoftheLostItemGroup.tab)) {
		}.setRegistryName("enhanced_diamond_pickaxe"));
	}
}
