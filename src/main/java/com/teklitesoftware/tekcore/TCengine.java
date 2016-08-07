package com.teklitesoftware.tekcore;

import com.teklitesoftware.tekcore.init.ModBlocks;
import com.teklitesoftware.tekcore.init.ModItems;
import com.teklitesoftware.tekcore.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

//TekCore One by TekLite Software
//Initialized 8/5/16

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class TCengine {
	
	@Instance
	public static TCengine instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");
		
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
		proxy.init();
		

	}
	
	public void Init(FMLInitializationEvent event) {
		System.out.println("Init");
		
		GameRegistry.registerWorldGenerator(new SapphireGeneration(), 128);
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Init");
		
	}
}
