
package com.raziel23x.land_of_the_lost.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import com.raziel23x.land_of_the_lost.itemgroup.LandoftheLostItemGroup;
import com.raziel23x.land_of_the_lost.LandoftheLostElements;

@LandoftheLostElements.ModElement.Tag
public class Enhanced_diamondHoeItem extends LandoftheLostElements.ModElement {
	@ObjectHolder("land_of_the_lost:enhanced_diamond_hoe")
	public static final Item block = null;
	public Enhanced_diamondHoeItem(LandoftheLostElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
				return null;
			}
		}, -3f, new Item.Properties().group(LandoftheLostItemGroup.tab)) {
		}.setRegistryName("enhanced_diamond_hoe"));
	}
}
