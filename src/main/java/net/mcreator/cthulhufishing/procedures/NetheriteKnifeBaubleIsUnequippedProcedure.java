package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class NetheriteKnifeBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).removeModifier(UUID.fromString("21b62c7f-9b55-4acd-be1b-0048483e167e"));
	}
}
