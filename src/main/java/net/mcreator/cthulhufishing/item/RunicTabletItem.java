
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.cthulhufishing.init.CthulhufishingModTabs;

public class RunicTabletItem extends Item {
	public RunicTabletItem() {
		super(new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
