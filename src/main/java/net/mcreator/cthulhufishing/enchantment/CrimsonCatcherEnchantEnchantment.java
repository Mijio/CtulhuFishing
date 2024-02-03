
package net.mcreator.cthulhufishing.enchantment;

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
		return this != ench && !List.of(CthulhufishingModEnchantments.SCULK_CATCHER_ENCHANTMENT.get()).contains(ench);
	}

}
