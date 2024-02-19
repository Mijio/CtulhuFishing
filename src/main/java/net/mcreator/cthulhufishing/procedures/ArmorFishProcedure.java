package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

import java.lang.reflect.Modifier;

public class ArmorFishProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double CurrentFood = 0;
		AttributeModifier Modifier = null;
		if (CurrentFood != (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0)) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).removeModifier(UUID.fromString("9f521a51-009f-4bb5-bc08-188a495d6855"));
			Modifier = new AttributeModifier(UUID.fromString("9f521a51-009f-4bb5-bc08-188a495d6855"), ("" + (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0)),
					(entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0), AttributeModifier.Operation.ADDITION);
			if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).hasModifier(Modifier)))
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).addTransientModifier(Modifier);
		}
		CurrentFood = entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0;
	}
}
