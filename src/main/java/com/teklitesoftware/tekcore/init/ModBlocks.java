package com.teklitesoftware.tekcore.init;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.blocks.BlockSO;
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
	
	public static void init() {
	sapphireore = new BlockSO();
	}
	
	public static void register() {
		GameRegistry.register(sapphireore);
		GameRegistry.register(new ItemBlock(sapphireore).setRegistryName(sapphireore.getRegistryName()));
		
	
	}

	public static void registerRenders() {
		registerRender(sapphireore);
	}
	
	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		

	}
}
