package com.teklitesoftware.tekcore.init;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.items.ItemRis;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item Ris;
	
	public static void init() {
		Ris = new ItemRis();
	}
	
	public static void register() {
		GameRegistry.register(Ris);
	}
	
	public static void registerRenders() {
		registerRender(Ris);
	}
	
	private static void registerRender(Item item) {
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
