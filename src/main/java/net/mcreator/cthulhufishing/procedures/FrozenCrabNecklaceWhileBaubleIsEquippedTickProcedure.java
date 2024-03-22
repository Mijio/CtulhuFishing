package net.mcreator.cthulhufishing.procedures;

import net.minecraft.world.entity.Entity;

public class FrozenCrabNecklaceWhileBaubleIsEquippedTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getTicksFrozen() == 0)) {
			entity.setTicksFrozen((int) (entity.getTicksFrozen() * 0.3));
		}
	}
}
