
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.cthulhufishing.procedures.MushroomFishOnPlayerStoppedUsingProcedure;
import net.mcreator.cthulhufishing.init.CthulhufishingModTabs;

public class MushroomAnglerfishItem extends Item {
	public MushroomAnglerfishItem() {
		super(new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB).stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.2f)

				.build()));
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		MushroomFishOnPlayerStoppedUsingProcedure.execute(entity);
	}
}
