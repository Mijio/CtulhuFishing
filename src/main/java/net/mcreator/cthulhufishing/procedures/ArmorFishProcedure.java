package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.cthulhufishing.network.CthulhufishingModVariables;
import net.mcreator.cthulhufishing.init.CthulhufishingModItems;

import javax.annotation.Nullable;

import java.util.UUID;

import java.lang.reflect.Modifier;

@Mod.EventBusSubscriber
public class ArmorFishProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		AttributeModifier Modifier = null;
		AttributeModifier ModifierLeg = null;
		double CurrentFood = 0;
		double CurrentRev = 0;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == CthulhufishingModItems.CHESTPLATE_FOSSIL_FISH_CHESTPLATE.get()) {
			if (CurrentFood != (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0)) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).removeModifier(UUID.fromString("9f521a51-009f-4bb5-bc08-188a495d6855"));
				Modifier = new AttributeModifier(UUID.fromString("9f521a51-009f-4bb5-bc08-188a495d6855"), ("" + (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0)),
						(0.025 * (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0)), AttributeModifier.Operation.MULTIPLY_TOTAL);
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).hasModifier(Modifier)))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).addTransientModifier(Modifier);
			}
			CurrentFood = entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0;
		} else {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).removeModifier(UUID.fromString("9f521a51-009f-4bb5-bc08-188a495d6855"));
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == CthulhufishingModItems.FROZEN_LEGGINS_LEGGINGS.get()) {
			if (CurrentRev != (entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("49c7e769-a66c-434c-9f3d-caa218f53f28"));
				ModifierLeg = new AttributeModifier(UUID.fromString("49c7e769-a66c-434c-9f3d-caa218f53f28"),
						("" + (entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score),
						(0.01 * (entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score), AttributeModifier.Operation.MULTIPLY_TOTAL);
				if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).hasModifier(ModifierLeg)))
					((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).addTransientModifier(ModifierLeg);
			}
			CurrentRev = (entity.getCapability(CthulhufishingModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CthulhufishingModVariables.PlayerVariables())).Revelation_Score;
		} else {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removeModifier(UUID.fromString("49c7e769-a66c-434c-9f3d-caa218f53f28"));
		}
	}
}
