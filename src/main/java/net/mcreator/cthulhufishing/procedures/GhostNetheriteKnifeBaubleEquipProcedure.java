package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class GhostNetheriteKnifeBaubleEquipProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier Modifier = null;
		Modifier = new AttributeModifier(UUID.fromString("8f2868c0-75e0-4747-af05-30b306e04479"), "", 2, AttributeModifier.Operation.ADDITION);
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).hasModifier(Modifier)))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).addTransientModifier(Modifier);
		Modifier = new AttributeModifier(UUID.fromString("fe76d0b4-efcb-492c-aa45-ccca10728769"), "", 3, AttributeModifier.Operation.ADDITION);
		if (!(((LivingEntity) entity).getAttribute(CthulhufishingModAttributes.SUMMONDAMAGE.get()).hasModifier(Modifier)))
			((LivingEntity) entity).getAttribute(CthulhufishingModAttributes.SUMMONDAMAGE.get()).addTransientModifier(Modifier);
	}
}
