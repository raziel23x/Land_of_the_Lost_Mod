
package com.raziel23x.land_of_the_lost.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ShearsItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import com.raziel23x.land_of_the_lost.itemgroup.LandoftheLostItemGroup;
import com.raziel23x.land_of_the_lost.LandoftheLostElements;

@LandoftheLostElements.ModElement.Tag
public class EnhancedDiamondShearsItem extends LandoftheLostElements.ModElement {
	@ObjectHolder("land_of_the_lost:enhanceddiamondshears")
	public static final Item block = null;
	public EnhancedDiamondShearsItem(LandoftheLostElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShearsItem(new Item.Properties().group(LandoftheLostItemGroup.tab).maxDamage(3254)) {
			@Override
			public int getItemEnchantability() {
				return 2;
			}

			@Override
			public float getDestroySpeed(ItemStack stack, BlockState block) {
				return 4f;
			}
		}.setRegistryName("enhanceddiamondshears"));
	}
}
