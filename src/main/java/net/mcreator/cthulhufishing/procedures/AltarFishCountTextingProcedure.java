package net.mcreator.cthulhufishing.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AltarFishCountTextingProcedure {
	public static String execute() {
		return new java.text.DecimalFormat("##.##").format() + "";
	}
}
