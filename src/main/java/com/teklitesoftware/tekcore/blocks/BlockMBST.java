package com.teklitesoftware.tekcore.blocks;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import scala.util.Random;

public class BlockMBST extends BlockStairs {
	public BlockMBST() {
		super(ModBlocks.mbrick.getStateFromMeta(0));
		 this.useNeighborBrightness = true;
		 this.setCreativeTab(TCengine.blocks);
			setUnlocalizedName(Reference.TekCoreBlocks.MBST.getUnlocalizedName());
			setRegistryName(Reference.TekCoreBlocks.MBST.getRegistryName());
			this.setHardness(2);
	}
	public Block getItemDropped(int metadata, Random rand, int fortune) {
		return ModBlocks.mbst;
	}
}
