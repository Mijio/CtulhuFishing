
package net.mcreator.cthulhufishing.item;

import net.minecraft.sounds.SoundEvent;
import java.util.function.Consumer;
import net.minecraft.client.model.Model;

public abstract class ChestplateFossilFishItem extends ArmorItem {

	public ChestplateFossilFishItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 1000;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{0, 0, 5, 0}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "chestplate_fossil_fish";
			}

			@Override
			public float getToughness() {
				return 2f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Chestplate extends ChestplateFossilFishItem {

		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(CthulhufishingModTabs.TAB_CTULHU_FISHING_TAB));
		}

		@Override
		public void initializeClient(Consumer<IClientItemExtensions> consumer) {
			consumer.accept(new IClientItemExtensions() {
				@Override
				@OnlyIn(Dist.CLIENT)
				public HumanoidModel getHumanoidArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
					HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body", new ModelFossilFishArmor(Minecraft.getInstance().getEntityModels().bakeLayer(ModelFossilFishArmor.LAYER_LOCATION)).bipedBody,
							"left_arm", new ModelFossilFishArmor(Minecraft.getInstance().getEntityModels().bakeLayer(ModelFossilFishArmor.LAYER_LOCATION)).bipedRightArm, "right_arm",
							new ModelFossilFishArmor(Minecraft.getInstance().getEntityModels().bakeLayer(ModelFossilFishArmor.LAYER_LOCATION)).bipedLeftArm, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat",
							new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
					armorModel.crouching = living.isShiftKeyDown();
					armorModel.riding = defaultModel.riding;
					armorModel.young = living.isBaby();
					return armorModel;
				}
			});
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "cthulhufishing:textures/models/armor/texture_armor2_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ChestplateFossilFishChestplateTickEventProcedure.execute(

			);
		}
	}

}
