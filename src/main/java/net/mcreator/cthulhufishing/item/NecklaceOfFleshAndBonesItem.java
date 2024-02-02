
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class NecklaceOfFleshAndBonesItem extends Item implements ICurioItem {

	public NecklaceOfFleshAndBonesItem() {
		super(new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB).stacksTo(1).rarity(Rarity.COMMON));
	}

}
