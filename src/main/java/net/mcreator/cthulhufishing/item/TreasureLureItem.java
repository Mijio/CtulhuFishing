
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.cthulhufishing.init.CthulhufishingModTabs;

public class TreasureLureItem extends Item {
	public TreasureLureItem() {
		super(new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
