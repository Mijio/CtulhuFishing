
package net.mcreator.cthulhufishing.enchantment;

public class DarkBladeEnchantment extends Enchantment {

	public DarkBladeEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(CthulhufishingModItems.KNIFE_FOR_RITUAL_BLEEDING.get()).contains(item);
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
