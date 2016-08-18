package com.teklitesoftware.tekcore.blocks;

import net.minecraft.block.BlockStairs;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import scala.util.Random;

public class BlockCWS extends BlockStairs {
	public BlockCWS() {
		super(ModBlocks.cw.getStateFromMeta(0));
		 this.useNeighborBrightness = true;
		 this.setCreativeTab(TCengine.blocks);
			setUnlocalizedName(Reference.TekCoreBlocks.CWS.getUnlocalizedName());
			setRegistryName(Reference.TekCoreBlocks.CWS.getRegistryName());
			this.setHardness(2);
	}
	public Block getItemDropped(int metadata, Random rand, int fortune) {
		return ModBlocks.cws;
	}
}
