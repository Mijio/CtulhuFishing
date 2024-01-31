
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cthulhufishing.block.DeepOilBlock;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CthulhufishingMod.MODID);
	public static final RegistryObject<Block> DEEP_OIL = REGISTRY.register("deep_oil", () -> new DeepOilBlock());
}
