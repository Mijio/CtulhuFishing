
package net.mcreator.cthulhufishing.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SculkRingItem extends Item implements ICurioItem {
	public SculkRingItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.RARE));
	}
}
