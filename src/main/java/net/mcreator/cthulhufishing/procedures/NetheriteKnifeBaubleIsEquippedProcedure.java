package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class NetheriteKnifeBaubleIsEquippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		AttributeModifier Modifier = null;
		Modifier = new AttributeModifier(UUID.fromString("21b62c7f-9b55-4acd-be1b-0048483e167e"), "", 3, AttributeModifier.Operation.ADDITION);
		if (!(((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).hasModifier(Modifier)))
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).addTransientModifier(Modifier);
	}
}
