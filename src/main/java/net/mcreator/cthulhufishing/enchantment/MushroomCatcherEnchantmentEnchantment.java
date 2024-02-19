
package net.mcreator.cthulhufishing.enchantment;

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
