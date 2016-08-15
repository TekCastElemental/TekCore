package com.teklitesoftware.tekcore.blocks;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import scala.util.Random;

public class BlockBLBST extends BlockStairs {
	public BlockBLBST() {
		super(ModBlocks.blbrick.getStateFromMeta(0));
		 this.useNeighborBrightness = true;
		 this.setCreativeTab(TCengine.blocks);
			setUnlocalizedName(Reference.TekCoreBlocks.BLBST.getUnlocalizedName());
			setRegistryName(Reference.TekCoreBlocks.BLBST.getRegistryName());
			this.setHardness(2);
	}
	public Block getItemDropped(int metadata, Random rand, int fortune) {
		return ModBlocks.blbst;
	}
}
