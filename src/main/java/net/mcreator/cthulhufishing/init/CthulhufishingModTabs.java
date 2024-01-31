
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CthulhufishingModTabs {
	public static CreativeModeTab TAB_CTULHU_FISHING_TAB;

	public static void load() {
		TAB_CTULHU_FISHING_TAB = new CreativeModeTab("tabctulhu_fishing_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CthulhufishingModItems.THIRD_EYE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
