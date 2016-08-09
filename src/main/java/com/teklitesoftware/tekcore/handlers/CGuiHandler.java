package com.teklitesoftware.tekcore.handlers;

import com.teklitesoftware.tekcore.entities.TileEntityCrystallizer;

import net.minecraft.client.gui.inventory.GuiFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CGuiHandler implements IGuiHandler {

	
	public static final int CRYSTALLIZER = 0;

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == CRYSTALLIZER) {
			BlockPos xyz = new BlockPos(x, y, z);
			TileEntity tileEntity = world.getTileEntity(xyz);
			if(tileEntity instanceof TileEntityCrystallizer) {
				TileEntityCrystallizer tileEntityCrystallizer = (TileEntityCrystallizer)tileEntity;
				return new ContainerFurnace(player.inventory, tileEntityCrystallizer);
			}
		}
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == CRYSTALLIZER) {
			BlockPos xyz = new BlockPos(x, y, z);
			TileEntity tileEntity = world.getTileEntity(xyz);
			if(tileEntity instanceof TileEntityCrystallizer) {
				TileEntityCrystallizer tileEntityCrystallizer = (TileEntityCrystallizer)tileEntity;
				return new GuiFurnace(player.inventory, tileEntityCrystallizer);
			}
		}
		return null;
}
}
