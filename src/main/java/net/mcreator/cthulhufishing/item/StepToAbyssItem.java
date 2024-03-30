
package net.mcreator.cthulhufishing.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class StepToAbyssItem extends RecordItem {
	public StepToAbyssItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cthulhufishing:step_to_abyss_xythe")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1920);
	}
}
