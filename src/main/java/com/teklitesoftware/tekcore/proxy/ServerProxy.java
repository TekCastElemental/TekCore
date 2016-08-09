package com.teklitesoftware.tekcore.proxy;

import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.handlers.CGuiHandler;

import net.minecraftforge.fml.common.network.NetworkRegistry;

public class ServerProxy extends CommonProxy{
	@Override
	public void init(){
	//NetworkRegistry.INSTANCE.registerGuiHandler(TCengine.instance, new GuiHandler());
	}
}
