
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MushroomLureItem extends Item {
	public MushroomLureItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
