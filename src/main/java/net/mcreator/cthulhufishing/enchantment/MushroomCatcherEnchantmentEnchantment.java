
package net.mcreator.cthulhufishing.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.cthulhufishing.init.CthulhufishingModEnchantments;

import java.util.List;

public class MushroomCatcherEnchantmentEnchantment extends Enchantment {
	public MushroomCatcherEnchantmentEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.FISHING_ROD, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(CthulhufishingModEnchantments.CRIMSON_CATCHER_ENCHANT.get(), CthulhufishingModEnchantments.SCULK_CATCHER_ENCHANTMENT.get()).contains(ench);
	}
}
