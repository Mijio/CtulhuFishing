
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class MushroomLureItem extends Item {

	public MushroomLureItem() {
		super(new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

}
