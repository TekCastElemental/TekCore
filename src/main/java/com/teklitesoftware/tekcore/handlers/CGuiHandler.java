package com.teklitesoftware.tekcore.handlers;

import com.teklitesoftware.tekcore.containers.ContainerDyeTable;
import com.teklitesoftware.tekcore.gui.GuiDying;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CGuiHandler implements IGuiHandler {

	
	public static final int DYE = 0;
	

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == DYE) {
			BlockPos xyz = new BlockPos(x, y, z);

			
				return new ContainerDyeTable(player.inventory, world, xyz);
			
		}
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == DYE) {
			BlockPos xyz = new BlockPos(x, y, z);
				return new GuiDying(player.inventory, world, xyz);
			
		}
		return null;
}
}
