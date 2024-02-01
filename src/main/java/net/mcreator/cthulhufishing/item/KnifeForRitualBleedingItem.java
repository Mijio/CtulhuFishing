
package net.mcreator.cthulhufishing.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.cthulhufishing.procedures.KnifeForRitualBleedingRightclickedProcedure;
import net.mcreator.cthulhufishing.init.CthulhufishingModTabs;

public class KnifeForRitualBleedingItem extends SwordItem {
	public KnifeForRitualBleedingItem() {
		super(new Tier() {
			public int getUses() {
				return 65;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 0.5f;
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
		}, 3, -2.2f, new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		KnifeForRitualBleedingRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return ar;
	}
}
