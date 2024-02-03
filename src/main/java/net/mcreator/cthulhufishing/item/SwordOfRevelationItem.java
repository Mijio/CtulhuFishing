
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.cthulhufishing.init.CthulhufishingModTabs;

public class SwordOfRevelationItem extends SwordItem {
	public SwordOfRevelationItem() {
		super(new Tier() {
			public int getUses() {
				return 65;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -1.2f, new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB));
	}
}
