package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import java.util.UUID;

public class AncientBlessingEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR).removePermanentModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"));
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH).removePermanentModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"));
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).removePermanentModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"));
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE).removePermanentModifier(UUID.fromString("f4991cc1-a369-43e3-8fae-b0b5495e9d1d"));
	}
}
