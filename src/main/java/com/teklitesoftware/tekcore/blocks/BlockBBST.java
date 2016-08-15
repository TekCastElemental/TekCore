package com.teklitesoftware.tekcore.blocks;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import scala.util.Random;

public class BlockBBST extends BlockStairs {
	public BlockBBST() {
		super(ModBlocks.bbrick.getStateFromMeta(0));
		 this.useNeighborBrightness = true;
		 this.setCreativeTab(TCengine.blocks);
			setUnlocalizedName(Reference.TekCoreBlocks.BBST.getUnlocalizedName());
			setRegistryName(Reference.TekCoreBlocks.BBST.getRegistryName());
			this.setHardness(2);
	}
	public Block getItemDropped(int metadata, Random rand, int fortune) {
		return ModBlocks.bbst;
	}

}
