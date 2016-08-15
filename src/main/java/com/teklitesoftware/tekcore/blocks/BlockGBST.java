package com.teklitesoftware.tekcore.blocks;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import scala.util.Random;

public class BlockGBST extends BlockStairs {
	public BlockGBST() {
		super(ModBlocks.gbrick.getStateFromMeta(0));
		 this.useNeighborBrightness = true;
		 this.setCreativeTab(TCengine.blocks);
			setUnlocalizedName(Reference.TekCoreBlocks.GBST.getUnlocalizedName());
			setRegistryName(Reference.TekCoreBlocks.GBST.getRegistryName());
			this.setHardness(2);
	}
	public Block getItemDropped(int metadata, Random rand, int fortune) {
		return ModBlocks.gbst;
	}
}
