package com.teklitesoftware.tekcore.proxy;

import com.teklitesoftware.tekcore.entities.TileEntityCrystallizer;
import com.teklitesoftware.tekcore.init.ModBlocks;
import com.teklitesoftware.tekcore.init.ModItems;

import net.minecraft.client.gui.inventory.GuiFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ClientProxy extends CommonProxy {

	
	@Override
	public void init() {
	ModItems.registerRenders();
	ModBlocks.registerRenders();
	
	}

	
}
