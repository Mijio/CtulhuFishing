
package net.mcreator.cthulhufishing.enchantment;

public class PowerOfTheExtinctEnchantment extends Enchantment {

	public PowerOfTheExtinctEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 5;
	}

}
