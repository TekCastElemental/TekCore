package com.teklitesoftware.tekcore.init;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.blocks.BlockCrystallizer;
import com.teklitesoftware.tekcore.blocks.BlockSO;
import com.teklitesoftware.tekcore.entities.TileEntityCrystallizer;
import com.teklitesoftware.tekcore.items.ItemRis;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.DefaultStateMapper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block sapphireore;
	public static Block Crystallizer;
	public static Block Lit_Crystallizer;

	public static void init() {
		
		sapphireore = new BlockSO();
		Crystallizer = new BlockCrystallizer("crystallizer", false);
		Lit_Crystallizer = new BlockCrystallizer("lit_crystallizer", true);
	
	}

	public static void register() {
		GameRegistry.register(sapphireore);
		GameRegistry.register(Crystallizer);
		GameRegistry.register(new ItemBlock(sapphireore).setRegistryName(sapphireore.getRegistryName()));
		registerBlock(Crystallizer);
		registerBlock(Lit_Crystallizer);
		GameRegistry.registerTileEntity(TileEntityCrystallizer.class, "TileEntityCrystallizer");
	}
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		
	}

	public static void registerRenders() {
		registerRender(sapphireore);
		registerRender(Crystallizer);
		registerRender(Lit_Crystallizer);

	}

	private static void registerRender(Block block) {

		// So many crashes with this...
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

	}
}
