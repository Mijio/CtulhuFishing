
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.cthulhufishing.block.entity.ObeliskOfGteatestObsessedEyeTileEntity;
import net.mcreator.cthulhufishing.block.entity.Obelisk4TileEntity;
import net.mcreator.cthulhufishing.block.entity.Obelisk3TileEntity;
import net.mcreator.cthulhufishing.block.entity.Obelisk2TileEntity;
import net.mcreator.cthulhufishing.block.entity.Obelisk1TileEntity;
import net.mcreator.cthulhufishing.block.entity.BlockOreEyeTileEntity;
import net.mcreator.cthulhufishing.block.entity.AltarRelicTileEntity;
import net.mcreator.cthulhufishing.block.entity.AltarRelic6TileEntity;
import net.mcreator.cthulhufishing.block.entity.AltarRelic5TileEntity;
import net.mcreator.cthulhufishing.block.entity.AltarRelic4TileEntity;
import net.mcreator.cthulhufishing.block.entity.AltarRelic3TileEntity;
import net.mcreator.cthulhufishing.block.entity.AltarRelic2TileEntity;
import net.mcreator.cthulhufishing.block.entity.AltarRelic1TileEntity;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CthulhufishingMod.MODID);
	public static final RegistryObject<BlockEntityType<BlockOreEyeTileEntity>> BLOCK_ORE_EYE = REGISTRY.register("block_ore_eye", () -> BlockEntityType.Builder.of(BlockOreEyeTileEntity::new, CthulhufishingModBlocks.BLOCK_ORE_EYE.get()).build(null));
	public static final RegistryObject<BlockEntityType<AltarRelicTileEntity>> ALTAR_RELIC = REGISTRY.register("altar_relic", () -> BlockEntityType.Builder.of(AltarRelicTileEntity::new, CthulhufishingModBlocks.ALTAR_RELIC.get()).build(null));
	public static final RegistryObject<BlockEntityType<AltarRelic1TileEntity>> ALTAR_RELIC_1 = REGISTRY.register("altar_relic_1", () -> BlockEntityType.Builder.of(AltarRelic1TileEntity::new, CthulhufishingModBlocks.ALTAR_RELIC_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<AltarRelic2TileEntity>> ALTAR_RELIC_2 = REGISTRY.register("altar_relic_2", () -> BlockEntityType.Builder.of(AltarRelic2TileEntity::new, CthulhufishingModBlocks.ALTAR_RELIC_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<AltarRelic3TileEntity>> ALTAR_RELIC_3 = REGISTRY.register("altar_relic_3", () -> BlockEntityType.Builder.of(AltarRelic3TileEntity::new, CthulhufishingModBlocks.ALTAR_RELIC_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<AltarRelic4TileEntity>> ALTAR_RELIC_4 = REGISTRY.register("altar_relic_4", () -> BlockEntityType.Builder.of(AltarRelic4TileEntity::new, CthulhufishingModBlocks.ALTAR_RELIC_4.get()).build(null));
	public static final RegistryObject<BlockEntityType<AltarRelic5TileEntity>> ALTAR_RELIC_5 = REGISTRY.register("altar_relic_5", () -> BlockEntityType.Builder.of(AltarRelic5TileEntity::new, CthulhufishingModBlocks.ALTAR_RELIC_5.get()).build(null));
	public static final RegistryObject<BlockEntityType<AltarRelic6TileEntity>> ALTAR_RELIC_6 = REGISTRY.register("altar_relic_6", () -> BlockEntityType.Builder.of(AltarRelic6TileEntity::new, CthulhufishingModBlocks.ALTAR_RELIC_6.get()).build(null));
	public static final RegistryObject<BlockEntityType<ObeliskOfGteatestObsessedEyeTileEntity>> OBELISK_OF_GTEATEST_OBSESSED_EYE = REGISTRY.register("obelisk_of_gteatest_obsessed_eye",
			() -> BlockEntityType.Builder.of(ObeliskOfGteatestObsessedEyeTileEntity::new, CthulhufishingModBlocks.OBELISK_OF_GTEATEST_OBSESSED_EYE.get()).build(null));
	public static final RegistryObject<BlockEntityType<Obelisk1TileEntity>> OBELISK_1 = REGISTRY.register("obelisk_1", () -> BlockEntityType.Builder.of(Obelisk1TileEntity::new, CthulhufishingModBlocks.OBELISK_1.get()).build(null));
	public static final RegistryObject<BlockEntityType<Obelisk2TileEntity>> OBELISK_2 = REGISTRY.register("obelisk_2", () -> BlockEntityType.Builder.of(Obelisk2TileEntity::new, CthulhufishingModBlocks.OBELISK_2.get()).build(null));
	public static final RegistryObject<BlockEntityType<Obelisk3TileEntity>> OBELISK_3 = REGISTRY.register("obelisk_3", () -> BlockEntityType.Builder.of(Obelisk3TileEntity::new, CthulhufishingModBlocks.OBELISK_3.get()).build(null));
	public static final RegistryObject<BlockEntityType<Obelisk4TileEntity>> OBELISK_4 = REGISTRY.register("obelisk_4", () -> BlockEntityType.Builder.of(Obelisk4TileEntity::new, CthulhufishingModBlocks.OBELISK_4.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
