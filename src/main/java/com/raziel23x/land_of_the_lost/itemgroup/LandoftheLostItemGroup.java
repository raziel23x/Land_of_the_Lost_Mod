
package com.raziel23x.land_of_the_lost.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.raziel23x.land_of_the_lost.item.EnchancedDiamondItem;
import com.raziel23x.land_of_the_lost.LandoftheLostElements;

@LandoftheLostElements.ModElement.Tag
public class LandoftheLostItemGroup extends LandoftheLostElements.ModElement {
	public LandoftheLostItemGroup(LandoftheLostElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tablandofthelostcreativetab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EnchancedDiamondItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
