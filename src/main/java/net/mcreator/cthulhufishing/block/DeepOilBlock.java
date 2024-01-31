
package net.mcreator.cthulhufishing.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

public class DeepOilBlock extends Block {
	public DeepOilBlock() {
		super(BlockBehaviour.Properties.of(Material.SCULK).sound(SoundType.MUD).strength(1.8f, 20f).lightLevel(s -> 1).requiresCorrectToolForDrops().speedFactor(0.6f).jumpFactor(0.5f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof ShovelItem tieredItem)
			return tieredItem.getTier().getLevel() >= 3;
		return false;
	}
}
