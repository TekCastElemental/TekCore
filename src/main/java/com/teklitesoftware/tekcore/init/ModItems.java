package com.teklitesoftware.tekcore.init;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.items.ItemRis;
import com.teklitesoftware.tekcore.items.ItemSapphireArmor;
import com.teklitesoftware.tekcore.items.Itemsaxe;
import com.teklitesoftware.tekcore.items.Itemshoe;
import com.teklitesoftware.tekcore.items.Itemsingot;
import com.teklitesoftware.tekcore.items.Itemspick;
import com.teklitesoftware.tekcore.items.Itemsspade;
import com.teklitesoftware.tekcore.items.Itemssword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ToolMaterial TOOL_SAPPHIRE = EnumHelper.addToolMaterial("sapphire", 2, 1000, 7.0F, 2.5F, 12);
	public static ArmorMaterial ARMOR_SAPPHIRE = EnumHelper.addArmorMaterial("aSapphire", "tekcore:sapphireArmor", 24, new int[] { 2, 7, 4, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
	//Mats
	public static Item Ris;
	public static Item singot;
	
	//Basic Sapphire (Dyes included)
	public static Item spick;
	public static Item saxe;
	public static Item shoe;
	public static Item sspade;
	public static Item ssword;
	//Red Basic Sapphire
	public static Item rspick;
	public static Item rsaxe;
	public static Item rshoe;
	public static Item rsspade;
	public static Item rssword;
	//Green Basic Sapphire
	public static Item gspick;
	public static Item gsaxe;
	public static Item gshoe;
	public static Item gsspade;
	public static Item gssword;
	//Blue Basic Sapphire
	public static Item bspick;
	public static Item bsaxe;
	public static Item bshoe;
	public static Item bsspade;
	public static Item bssword;
	
	//Obsidian Headed Sapphire Tools 
	public static Item ohspick;
	public static Item ohsaxe;
	public static Item ohshoe;
	public static Item ohsspade;
	public static Item ohssword;
	//Red Obsidian Headed Sapphire Tools
	public static Item rohspick;
	public static Item rohsaxe;
	public static Item rohshoe;
	public static Item rohsspade;
	public static Item rohssword;	
	//Green Obsidian Headed Sapphire Tools
	public static Item gohspick;
	public static Item gohsaxe;
	public static Item gohshoe;
	public static Item gohsspade;
	public static Item gohssword;
	//Blue Obsidian Headed Sapphire Tools
	public static Item bohspick;
	public static Item bohsaxe;
	public static Item bohshoe;
	public static Item bohsspade;
	public static Item bohssword;
	
	
	//Reinforced Iron Tools (Obsidian head included)
	public static Item iiaxe;
	public static Item iispade;
	public static Item iisword;
	public static Item iipick;
	public static Item iihoe;
	//Obsidian
	public static Item ohiiaxe;
	public static Item ohiispade;
	public static Item ohiisword;
	public static Item ohiipick;
	public static Item ohiihoe;
	
	//Reinforced Diamond Tools
	//Reinforced Diamond
	public static Item iidaxe;
	public static Item iidspade;
	public static Item iidsword;
	public static Item iidpick;
	public static Item iidhoe;
	//Red Reinforced Diamond
	public static Item rdaxe;
	public static Item rdspade;
	public static Item rdsword;
	public static Item rdpick;
	public static Item rdhoe;
	//Green Reinforced Diamond
	public static Item gdaxe;
	public static Item gdspade;
	public static Item gdsword;
	public static Item gdpick;
	public static Item gdhoe;
	//Blue Reinforced Diamond
	public static Item bdaxe;
	public static Item bdspade;
	public static Item bdsword;
	public static Item bdpick;
	public static Item bdhoe;
	//Obsidian Headed Diamond
	public static Item dohaxe;
	public static Item dohspade;
	public static Item dohsword;
	public static Item dohpick;
	public static Item dohhoe;
	//Red Obsidian Headed Diamond
	public static Item rdohaxe;
	public static Item rdohspade;
	public static Item rdohsword;
	public static Item rdohpick;
	public static Item rdohhoe;
	//Green Obsidian Headed Diamond
	public static Item gdohaxe;
	public static Item gdohspade;
	public static Item gdohsword;
	public static Item gdohpick;
	public static Item gdohhoe;
	//Blue Obsidian Headed Diamond
	public static Item bdohaxe;
	public static Item bdohspade;
	public static Item bdohsword;
	public static Item bdohpick;
	public static Item bdohhoe;

	
	
	//Armor
	public static Item sapphireHelmet;
	public static Item sapphireChestplate;
	public static Item sapphireLeggings;
	public static Item sapphireBoots;
	

	public static void init() {
		
		//Armor
		sapphireHelmet = new ItemSapphireArmor("sapphireHelmet", EntityEquipmentSlot.HEAD);
		sapphireChestplate = new ItemSapphireArmor("sapphireChestplate", EntityEquipmentSlot.CHEST);
		sapphireLeggings = new ItemSapphireArmor("sapphireLeggings", EntityEquipmentSlot.LEGS);
		sapphireBoots = new ItemSapphireArmor("sapphireBoots", EntityEquipmentSlot.FEET);

		// Mats
		Ris = new ItemRis();
		singot = new Itemsingot();

		// Tools
		spick = new Itemspick(TOOL_SAPPHIRE);
		saxe = new Itemsaxe(TOOL_SAPPHIRE, 3, 7.0F);
		shoe = new Itemshoe(TOOL_SAPPHIRE);
		sspade = new Itemsspade(TOOL_SAPPHIRE);
		ssword = new Itemssword(TOOL_SAPPHIRE);

	}

	public static void register() {
		GameRegistry.register(Ris);
		GameRegistry.register(singot);
		GameRegistry.register(spick);
		GameRegistry.register(saxe);
		GameRegistry.register(shoe);
		GameRegistry.register(sspade);
		GameRegistry.register(ssword);
		GameRegistry.register(sapphireHelmet);
		GameRegistry.register(sapphireChestplate);
		GameRegistry.register(sapphireLeggings);
		GameRegistry.register(sapphireBoots);
	}

	public static void registerRenders() {
		registerRender(Ris);
		registerRender(singot);
		registerRender(spick);
		registerRender(saxe);
		registerRender(shoe);
		registerRender(sspade);
		registerRender(ssword);
		registerRender(sapphireHelmet);
		registerRender(sapphireChestplate);
		registerRender(sapphireLeggings);
		registerRender(sapphireBoots);

	}

	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
