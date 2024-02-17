
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.FishingRodItem;

import net.mcreator.cthulhufishing.init.CthulhufishingModTabs;

public class HeavyFishingRoadItem extends FishingRodItem {
	public HeavyFishingRoadItem() {
		super(new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB).durability(80));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}
}
