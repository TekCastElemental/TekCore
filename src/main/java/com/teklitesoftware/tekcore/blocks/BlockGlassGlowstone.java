package com.teklitesoftware.tekcore.blocks;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;

public class BlockGlassGlowstone extends Block{
public BlockGlassGlowstone() {
	super(Material.GLASS);
	setUnlocalizedName(Reference.TekCoreBlocks.GLG.getUnlocalizedName());
	setRegistryName(Reference.TekCoreBlocks.GLG.getRegistryName());
	this.setCreativeTab(TCengine.blocks);
	this.setLightLevel(1F);
	this.setHardness(2);
	this.setLightOpacity(15);
}

@Override
public boolean isFullCube(IBlockState state) {
	return true;
}

@Override
public boolean isOpaqueCube(IBlockState state) {
	return true;
}
@Override
public BlockRenderLayer getBlockLayer() {
	return BlockRenderLayer.TRANSLUCENT;
}

}
