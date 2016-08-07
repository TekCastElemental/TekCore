package com.teklitesoftware.tekcore.blocks;

import com.teklitesoftware.tekcore.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockSO extends Block {
	
public BlockSO() {
	super(Material.IRON);
	setUnlocalizedName(Reference.TekCoreBlocks.SAPPHIREORE.getUnlocalizedName());
	setRegistryName(Reference.TekCoreBlocks.SAPPHIREORE.getRegistryName());
	this.setCreativeTab(CreativeTabs.MISC);

}
}
