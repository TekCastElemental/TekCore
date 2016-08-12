package com.teklitesoftware.tekcore;

import com.ibm.icu.text.DisplayContext.Type;
import com.teklitesoftware.tekcore.biomes.BiomeSpirit;
import com.teklitesoftware.tekcore.crafting.ModCrafting;
import com.teklitesoftware.tekcore.creativetabs.TabTekCoreBlocks;
import com.teklitesoftware.tekcore.creativetabs.TabTekCoreMats;
import com.teklitesoftware.tekcore.creativetabs.TabTekCoreTools;
import com.teklitesoftware.tekcore.entities.TileEntityCrystallizer;
import com.teklitesoftware.tekcore.generators.SapphireGeneration;
import com.teklitesoftware.tekcore.handlers.CGuiHandler;
import com.teklitesoftware.tekcore.handlers.FuelHandler;
import com.teklitesoftware.tekcore.init.ModBiomes;
import com.teklitesoftware.tekcore.init.ModBlocks;
import com.teklitesoftware.tekcore.init.ModItems;
import com.teklitesoftware.tekcore.proxy.ClientProxy;
import com.teklitesoftware.tekcore.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.world.biome.Biome;

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
	public static CreativeTabs blocks = new TabTekCoreBlocks("tabTCB");

	public CGuiHandler guihandler = new CGuiHandler();
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");
		
		// Loading Blocks and Items
		ModItems.init();
		ModItems.register();
		ModBlocks.init();
		ModBlocks.register();
		GameRegistry.registerFuelHandler(new FuelHandler());
		
		// Call Renders client-side.
		proxy.init();

		// Sapphire Ore Spawns here.
		GameRegistry.registerWorldGenerator(new SapphireGeneration(), 2);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, guihandler);
		
		ModBiomes.registerBiomes();
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		System.out.println("Init");
		ModCrafting.register();
		GameRegistry.registerTileEntity(TileEntityCrystallizer.class, "TileEntityCrystallizer");
		
	

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Init");

	}
}
