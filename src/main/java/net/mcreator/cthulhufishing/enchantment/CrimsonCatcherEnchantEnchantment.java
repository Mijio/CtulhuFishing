
package net.mcreator.cthulhufishing.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class CrimsonCatcherEnchantEnchantment extends Enchantment {
	public CrimsonCatcherEnchantEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.FISHING_ROD, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}
}
