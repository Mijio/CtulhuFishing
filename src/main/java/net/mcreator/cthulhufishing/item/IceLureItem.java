
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class IceLureItem extends Item {
	public IceLureItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
