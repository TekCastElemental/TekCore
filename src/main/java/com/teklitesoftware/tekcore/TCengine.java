package com.teklitesoftware.tekcore;

import com.teklitesoftware.tekcore.creativetabs.TabTekCoreMats;
import com.teklitesoftware.tekcore.creativetabs.TabTekCoreTools;
import com.teklitesoftware.tekcore.handlers.CGuiHandler;
import com.teklitesoftware.tekcore.init.ModBlocks;
import com.teklitesoftware.tekcore.init.ModCrafting;
import com.teklitesoftware.tekcore.init.ModItems;
import com.teklitesoftware.tekcore.proxy.ClientProxy;
import com.teklitesoftware.tekcore.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

//TekCore One by TekLite Software
//Initialized 8/5/16

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class TCengine {

	@Mod.Instance("tekcore")
	public static TCengine instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	public static CreativeTabs tools = new TabTekCoreTools("tabTCT");
	public static CreativeTabs mats = new TabTekCoreMats("tabTCM");
	public CGuiHandler guihandler = new CGuiHandler();
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");

		// Loading Blocks and Items
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
		
		// Call Renders client-side.
		proxy.init();

		// Sapphire Ore Spawns here.
		GameRegistry.registerWorldGenerator(new SapphireGeneration(), 2);

	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		System.out.println("Init");
		ModCrafting.register();
		NetworkRegistry.INSTANCE.registerGuiHandler(this, guihandler);

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Init");

	}
}
