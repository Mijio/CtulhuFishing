
package net.mcreator.cthulhufishing.enchantment;

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
		return List.of(CthulhufishingModItems.DELETED_MOD_ELEMENT.get()).contains(item);
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
