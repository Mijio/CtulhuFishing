
package net.mcreator.cthulhufishing.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.cthulhufishing.init.CthulhufishingModItems;

import java.util.List;

public class DarkWaterEnchantment extends Enchantment {
	public DarkWaterEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.VANISHABLE, slots);
	}

	@Override
	public int getMinLevel() {
		return 0;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(CthulhufishingModItems.DECANTER_OF_DEPTHS_FILLED.get()).contains(item);
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
