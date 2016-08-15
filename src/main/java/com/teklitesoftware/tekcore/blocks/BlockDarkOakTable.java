package com.teklitesoftware.tekcore.blocks;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import scala.util.Random;

public class BlockDarkOakTable extends Block {
	public BlockDarkOakTable() {
		super(Material.WOOD);
		setUnlocalizedName(Reference.TekCoreBlocks.DOT.getUnlocalizedName());
		setRegistryName(Reference.TekCoreBlocks.DOT.getRegistryName());
		this.setCreativeTab(TCengine.blocks);
		this.setHardness(2);
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	@Override
    public boolean canPlaceTorchOnTop(IBlockState state, IBlockAccess world, BlockPos pos)
    {
        if (state.isSideSolid(world, pos, EnumFacing.UP))
        {
            return true;
        }
        else
        {
            return this instanceof BlockDarkOakTable || this == ModBlocks.darkoaktable;
        }
    }
	public Block getItemDropped(int metadata, Random rand, int fortune) {
		return ModBlocks.darkoaktable;
	}
}
