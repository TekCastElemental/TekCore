package com.teklitesoftware.tekcore.init;

import java.util.ArrayList;

import com.teklitesoftware.tekcore.items.ItemRis;
import com.teklitesoftware.tekcore.items.ItemSapphireArmor;
import com.teklitesoftware.tekcore.items.Itemdohaxe;
import com.teklitesoftware.tekcore.items.Itemdohhoe;
import com.teklitesoftware.tekcore.items.Itemdohpick;
import com.teklitesoftware.tekcore.items.Itemdohspade;
import com.teklitesoftware.tekcore.items.Itemdohsword;
import com.teklitesoftware.tekcore.items.Itemiiaxe;
import com.teklitesoftware.tekcore.items.Itemiidaxe;
import com.teklitesoftware.tekcore.items.Itemiidhoe;
import com.teklitesoftware.tekcore.items.Itemiidpick;
import com.teklitesoftware.tekcore.items.Itemiidspade;
import com.teklitesoftware.tekcore.items.Itemiidsword;
import com.teklitesoftware.tekcore.items.Itemiihoe;
import com.teklitesoftware.tekcore.items.Itemiipick;
import com.teklitesoftware.tekcore.items.Itemiispade;
import com.teklitesoftware.tekcore.items.Itemiisword;
import com.teklitesoftware.tekcore.items.Itemohiaxe;
import com.teklitesoftware.tekcore.items.Itemohihoe;
import com.teklitesoftware.tekcore.items.Itemohipick;
import com.teklitesoftware.tekcore.items.Itemohispade;
import com.teklitesoftware.tekcore.items.Itemohisword;
import com.teklitesoftware.tekcore.items.Itemohsaxe;
import com.teklitesoftware.tekcore.items.Itemohshoe;
import com.teklitesoftware.tekcore.items.Itemohspick;
import com.teklitesoftware.tekcore.items.Itemohsspade;
import com.teklitesoftware.tekcore.items.Itemohssword;
import com.teklitesoftware.tekcore.items.Itemsaxe;
import com.teklitesoftware.tekcore.items.Itemshoe;
import com.teklitesoftware.tekcore.items.Itemsingot;
import com.teklitesoftware.tekcore.items.Itemspick;
import com.teklitesoftware.tekcore.items.Itemsspade;
import com.teklitesoftware.tekcore.items.Itemssword;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static ArrayList<Item> m_items = new ArrayList<Item>();
	public static ToolMaterial TOOL_SAPPHIRE = EnumHelper.addToolMaterial("sapphire", 2, 1000, 7.0F, 2.5F, 12);
	public static ToolMaterial OHSAPPHIRE = EnumHelper.addToolMaterial("ohsapphire", 2, 1250, 7.0F, 2.5F, 12);
	public static ToolMaterial IDIAMOND = EnumHelper.addToolMaterial("idiamond", 3, 1761, 8.0F, 3.0F, 10);
	public static ToolMaterial OHDIAMOND = EnumHelper.addToolMaterial("ohdiamond", 3, 2000, 8.0F, 3.0F, 10);
	public static ToolMaterial RIIRON = EnumHelper.addToolMaterial("riiron", 2, 500, 6.5F, 2.0F, 14);
	public static ToolMaterial OHIRON = EnumHelper.addToolMaterial("ohiron", 2, 750, 6.5F, 2.0F, 14);
	public static ArmorMaterial ARMOR_SAPPHIRE = EnumHelper.addArmorMaterial("aSapphire", "tekcore:sapphireArmor", 24, new int[] { 2, 7, 4, 2 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	
/*	//Mats
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
	*/

	public enum ItemIndex{
		   Ris,
		   singot,
		   
		   spick,
		   saxe,
		   shoe,
		   sspade,
		   ssword,
		   
		   sapphireHelmet,
		   sapphireChestplate,
		   sapphireLeggings,
		   sapphireBoots,
		   
		   iiaxe,
		   iispade,
		   iisword,
		   iipick,
		   iihoe,
		   
		   ohiaxe,
		   ohispade,
		   ohisword,
		   ohipick,
		   ohihoe,
		   
		   ohsaxe,
		   ohsspade,
		   ohssword,
		   ohspick,
		   ohshoe,
		   
		   iidaxe,
		   iidspade,
		   iidsword,
		   iidpick,
		   iidhoe,
		   
		   dohaxe,
		   dohspade,
		   dohsword,
		   dohpick,
		   dohhoe
		   
		   		   
		}
	

	
	

	public static void init() {

		m_items.add(new ItemRis());
		m_items.add(new Itemsingot());
		
		m_items.add(new Itemspick(TOOL_SAPPHIRE));
		m_items.add(new Itemsaxe(TOOL_SAPPHIRE, 3, 7.0F));
		m_items.add(new Itemshoe(TOOL_SAPPHIRE));
		m_items.add(new Itemsspade(TOOL_SAPPHIRE));
		m_items.add(new Itemssword(TOOL_SAPPHIRE));
		
		m_items.add(new ItemSapphireArmor("sapphireHelmet", EntityEquipmentSlot.HEAD));
		m_items.add(new ItemSapphireArmor("sapphireChestplate", EntityEquipmentSlot.CHEST));
		m_items.add(new ItemSapphireArmor("sapphireLeggings", EntityEquipmentSlot.LEGS));
		m_items.add(new ItemSapphireArmor("sapphireBoots", EntityEquipmentSlot.FEET));
		
		m_items.add(new Itemiiaxe(RIIRON, 2, 7.0F));
		m_items.add(new Itemiispade(RIIRON));
		m_items.add(new Itemiisword(RIIRON));
		m_items.add(new Itemiipick(RIIRON));
		m_items.add(new Itemiihoe(RIIRON));
		
		m_items.add(new Itemohiaxe(OHIRON, 2, 7.0F));
		m_items.add(new Itemohispade(OHIRON));
		m_items.add(new Itemohisword(OHIRON));
		m_items.add(new Itemohipick(OHIRON));
		m_items.add(new Itemohihoe(OHIRON));
		
		m_items.add(new Itemohsaxe(OHSAPPHIRE, 2, 7.0F));
		m_items.add(new Itemohsspade(OHSAPPHIRE));
		m_items.add(new Itemohssword(OHSAPPHIRE));
		m_items.add(new Itemohspick(OHSAPPHIRE));
		m_items.add(new Itemohshoe(OHSAPPHIRE));
		
		m_items.add(new Itemiidaxe(IDIAMOND, 3, 8.0F));
		m_items.add(new Itemiidspade(IDIAMOND));
		m_items.add(new Itemiidsword(IDIAMOND));
		m_items.add(new Itemiidpick(IDIAMOND));
		m_items.add(new Itemiidhoe(IDIAMOND));
		
		m_items.add(new Itemdohaxe(OHDIAMOND, 3, 8.0F));
		m_items.add(new Itemdohspade(OHDIAMOND));
		m_items.add(new Itemdohsword(OHDIAMOND));
		m_items.add(new Itemdohpick(OHDIAMOND));
		m_items.add(new Itemdohhoe(OHDIAMOND));
		


	}

	public static void register() {
	    for(Item i : m_items)
	        GameRegistry.register(i);
	    
	}

	public static void registerRenders() {
		
		  for(Item i : m_items)
		        registerRender(i);

	}

	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
