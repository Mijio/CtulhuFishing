
package net.mcreator.cthulhufishing.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.cthulhufishing.init.CthulhufishingModEnchantments;

import java.util.List;

public class CrimsonCatcherEnchantEnchantment extends Enchantment {
	public CrimsonCatcherEnchantEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.FISHING_ROD, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(CthulhufishingModEnchantments.SCULK_CATCHER_ENCHANTMENT.get(), CthulhufishingModEnchantments.MUSHROOM_CATCHER_ENCHANTMENT.get()).contains(ench);
	}
}
