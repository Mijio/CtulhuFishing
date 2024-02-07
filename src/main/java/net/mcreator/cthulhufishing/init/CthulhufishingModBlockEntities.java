
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cthulhufishing.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.cthulhufishing.block.entity.BlockOreEyeTileEntity;
import net.mcreator.cthulhufishing.CthulhufishingMod;

public class CthulhufishingModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, CthulhufishingMod.MODID);
	public static final RegistryObject<BlockEntityType<BlockOreEyeTileEntity>> BLOCK_ORE_EYE = REGISTRY.register("block_ore_eye", () -> BlockEntityType.Builder.of(BlockOreEyeTileEntity::new, CthulhufishingModBlocks.BLOCK_ORE_EYE.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
