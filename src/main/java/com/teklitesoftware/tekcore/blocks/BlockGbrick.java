package com.teklitesoftware.tekcore.blocks;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import scala.util.Random;

public class BlockGbrick extends Block{
	public BlockGbrick() {
		super(Material.ROCK);
		setUnlocalizedName(Reference.TekCoreBlocks.GBRICK.getUnlocalizedName());
		setRegistryName(Reference.TekCoreBlocks.GBRICK.getRegistryName());
		this.setCreativeTab(TCengine.blocks);
		this.setHardness(2);
		setResistance(15F);
		setHarvestLevel("pickaxe", 2);
		
	}
	
	public Block getItemDropped(int metadata, Random rand, int fortune) {
		return ModBlocks.gbrick;
	}
}
