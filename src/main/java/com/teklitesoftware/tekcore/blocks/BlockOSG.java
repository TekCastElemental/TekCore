package com.teklitesoftware.tekcore.blocks;

import java.util.Random;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModItems;
import com.teklitesoftware.tekcore.init.ModItems.ItemIndex;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOSG extends Block {
	
	public BlockOSG() {
	super(Material.ROCK);

	setUnlocalizedName(Reference.TekCoreBlocks.OSG.getUnlocalizedName());
	setRegistryName(Reference.TekCoreBlocks.OSG.getRegistryName());
	this.setCreativeTab(TCengine.blocks);
	this.setHardness(4);
	setResistance(15F);
	setHarvestLevel("pickaxe", 3);
	this.setLightLevel(1.0F);
	
}
@Override
public Item getItemDropped(IBlockState state, Random rand, int fortune) {
    return ModItems.m_items.get(ItemIndex.mosw.ordinal());
}
@Override
public int quantityDropped(Random rand)
{
   return 1;
}

}
