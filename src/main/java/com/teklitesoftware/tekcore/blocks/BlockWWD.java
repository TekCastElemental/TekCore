package com.teklitesoftware.tekcore.blocks;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;

public class BlockWWD extends BlockDoor {

	public BlockWWD(Material materialIn) {
		super(materialIn);
		setRegistryName(Reference.TekCoreBlocks.WWD.getRegistryName());
		setUnlocalizedName(Reference.TekCoreBlocks.WWD.getUnlocalizedName());
		this.setCreativeTab(TCengine.blocks);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(OPEN, Boolean.valueOf(false)).withProperty(HINGE, BlockDoor.EnumHingePosition.LEFT).withProperty(POWERED, Boolean.valueOf(false)).withProperty(HALF, BlockDoor.EnumDoorHalf.LOWER));
	}


}
