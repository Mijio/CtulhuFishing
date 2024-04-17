
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cthulhufishing.block.PseudoEyeBlock;
import net.mcreator.cthulhufishing.block.ObeliskOfGteatestObsessedEyeBlock;
import net.mcreator.cthulhufishing.block.Obelisk4Block;
import net.mcreator.cthulhufishing.block.Obelisk3Block;
import net.mcreator.cthulhufishing.block.Obelisk2Block;
import net.mcreator.cthulhufishing.block.Obelisk1Block;
import net.mcreator.cthulhufishing.block.DeepOilBlock;
import net.mcreator.cthulhufishing.block.CtulhuAltarFishBlock;
import net.mcreator.cthulhufishing.block.BlockOreEyeBlock;
import net.mcreator.cthulhufishing.block.AltarRelicBlock;
import net.mcreator.cthulhufishing.block.AltarRelic6Block;
import net.mcreator.cthulhufishing.block.AltarRelic5Block;
import net.mcreator.cthulhufishing.block.AltarRelic4Block;
import net.mcreator.cthulhufishing.block.AltarRelic3Block;
import net.mcreator.cthulhufishing.block.AltarRelic2Block;
import net.mcreator.cthulhufishing.block.AltarRelic1Block;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CthulhufishingMod.MODID);
	public static final RegistryObject<Block> DEEP_OIL = REGISTRY.register("deep_oil", () -> new DeepOilBlock());
	public static final RegistryObject<Block> CTULHU_ALTAR_FISH = REGISTRY.register("ctulhu_altar_fish", () -> new CtulhuAltarFishBlock());
	public static final RegistryObject<Block> BLOCK_ORE_EYE = REGISTRY.register("block_ore_eye", () -> new BlockOreEyeBlock());
	public static final RegistryObject<Block> ALTAR_RELIC = REGISTRY.register("altar_relic", () -> new AltarRelicBlock());
	public static final RegistryObject<Block> ALTAR_RELIC_1 = REGISTRY.register("altar_relic_1", () -> new AltarRelic1Block());
	public static final RegistryObject<Block> ALTAR_RELIC_2 = REGISTRY.register("altar_relic_2", () -> new AltarRelic2Block());
	public static final RegistryObject<Block> ALTAR_RELIC_3 = REGISTRY.register("altar_relic_3", () -> new AltarRelic3Block());
	public static final RegistryObject<Block> ALTAR_RELIC_4 = REGISTRY.register("altar_relic_4", () -> new AltarRelic4Block());
	public static final RegistryObject<Block> ALTAR_RELIC_5 = REGISTRY.register("altar_relic_5", () -> new AltarRelic5Block());
	public static final RegistryObject<Block> ALTAR_RELIC_6 = REGISTRY.register("altar_relic_6", () -> new AltarRelic6Block());
	public static final RegistryObject<Block> PSEUDO_EYE = REGISTRY.register("pseudo_eye", () -> new PseudoEyeBlock());
	public static final RegistryObject<Block> OBELISK_OF_GTEATEST_OBSESSED_EYE = REGISTRY.register("obelisk_of_gteatest_obsessed_eye", () -> new ObeliskOfGteatestObsessedEyeBlock());
	public static final RegistryObject<Block> OBELISK_1 = REGISTRY.register("obelisk_1", () -> new Obelisk1Block());
	public static final RegistryObject<Block> OBELISK_2 = REGISTRY.register("obelisk_2", () -> new Obelisk2Block());
	public static final RegistryObject<Block> OBELISK_3 = REGISTRY.register("obelisk_3", () -> new Obelisk3Block());
	public static final RegistryObject<Block> OBELISK_4 = REGISTRY.register("obelisk_4", () -> new Obelisk4Block());
}
