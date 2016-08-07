package com.teklitesoftware.tekcore.proxy;

import com.teklitesoftware.tekcore.init.ModBlocks;
import com.teklitesoftware.tekcore.init.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

public class ClientProxy extends CommonProxy {

	
	@Override
	public void init() {
	ModItems.registerRenders();
	ModBlocks.registerRenders();
	}
	
}
