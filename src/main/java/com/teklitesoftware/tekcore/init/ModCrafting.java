package com.teklitesoftware.tekcore.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.teklitesoftware.tekcore.init.*;
import com.teklitesoftware.tekcore.init.ModItems.ItemIndex;


public class ModCrafting {

	public static void register() {
		// Shapeless Recipes
			//Mats
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ModItems.ItemIndex.Ris.ordinal())), Items.STICK, Items.IRON_INGOT);
			
			//OH Iron
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohipick.ordinal())), ModItems.m_items.get(ItemIndex.iipick.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohiaxe.ordinal())), ModItems.m_items.get(ItemIndex.iiaxe.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohisword.ordinal())), ModItems.m_items.get(ItemIndex.iisword.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohispade.ordinal())), ModItems.m_items.get(ItemIndex.iispade.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohihoe.ordinal())), ModItems.m_items.get(ItemIndex.iihoe.ordinal()), Blocks.OBSIDIAN);
			
			//OH Sapphire
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohspick.ordinal())), ModItems.m_items.get(ItemIndex.spick.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohsaxe.ordinal())), ModItems.m_items.get(ItemIndex.saxe.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohssword.ordinal())), ModItems.m_items.get(ItemIndex.ssword.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohsspade.ordinal())), ModItems.m_items.get(ItemIndex.sspade.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohshoe.ordinal())), ModItems.m_items.get(ItemIndex.shoe.ordinal()), Blocks.OBSIDIAN);		
			
			//OH Diamond
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.dohpick.ordinal())), ModItems.m_items.get(ItemIndex.iidpick.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.dohaxe.ordinal())), ModItems.m_items.get(ItemIndex.iidaxe.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.dohsword.ordinal())), ModItems.m_items.get(ItemIndex.iidsword.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.dohspade.ordinal())), ModItems.m_items.get(ItemIndex.iidspade.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.dohhoe.ordinal())), ModItems.m_items.get(ItemIndex.iidhoe.ordinal()), Blocks.OBSIDIAN);		
			
		//Shaped Recipes
			//Sapphire Tools
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.sspade.ordinal())), new Object[] {"X  ", "I  ", "I  ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.sspade.ordinal())), new Object[] {" X ", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.sspade.ordinal())), new Object[] {"  X", "  I", "  I", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ssword.ordinal())), new Object[] {"X  ", "X  ", "I  ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ssword.ordinal())), new Object[] {" X ", " X ", " I ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ssword.ordinal())), new Object[] {"  X", "  X", "  I", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.spick.ordinal())), new Object[] {"XXX", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.shoe.ordinal())), new Object[] {"XX ", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.shoe.ordinal())), new Object[] {" XX", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.saxe.ordinal())), new Object[] {"XX ", "XI ", " I ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.saxe.ordinal())), new Object[] {" XX", " IX", " I ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			
			//Iron Tools
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iispade.ordinal())), new Object[] {"X  ", "I  ", "I  ", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iispade.ordinal())), new Object[] {" X ", " I ", " I ", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iispade.ordinal())), new Object[] {"  X", "  I", "  I", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iisword.ordinal())), new Object[] {"X  ", "X  ", "I  ", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iisword.ordinal())), new Object[] {" X ", " X ", " I ", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iisword.ordinal())), new Object[] {"  X", "  X", "  I", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iipick.ordinal())), new Object[] {"XXX", " I ", " I ", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iihoe.ordinal())), new Object[] {"XX ", " I ", " I ", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iihoe.ordinal())), new Object[] {" XX", " I ", " I ", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iiaxe.ordinal())), new Object[] {"XX ", "XI ", " I ", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iiaxe.ordinal())), new Object[] {" XX", " IX", " I ", 'X', Items.IRON_INGOT, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			
			//Diamond Tools
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidspade.ordinal())), new Object[] {"X  ", "I  ", "I  ", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidspade.ordinal())), new Object[] {" X ", " I ", " I ", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidspade.ordinal())), new Object[] {"  X", "  I", "  I", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidsword.ordinal())), new Object[] {"X  ", "X  ", "I  ", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidsword.ordinal())), new Object[] {" X ", " X ", " I ", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidsword.ordinal())), new Object[] {"  X", "  X", "  I", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidpick.ordinal())), new Object[] {"XXX", " I ", " I ", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidhoe.ordinal())), new Object[] {"XX ", " I ", " I ", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidhoe.ordinal())), new Object[] {" XX", " I ", " I ", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidaxe.ordinal())), new Object[] {"XX ", "XI ", " I ", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.iidaxe.ordinal())), new Object[] {" XX", " IX", " I ", 'X', Items.DIAMOND, 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			
			
			//Sapphire Armor
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.sapphireHelmet.ordinal())), new Object[]{"XXX", "X X", "   ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.sapphireHelmet.ordinal())), new Object[]{"   ", "XXX", "X X", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.sapphireBoots.ordinal())), new Object[]{"X X", "X X", "   ", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.sapphireBoots.ordinal())), new Object[]{"   ", "X X", "X X", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.sapphireChestplate.ordinal())), new Object[]{"X X", "XXX", "XXX", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.sapphireLeggings.ordinal())), new Object[]{"XXX", "X X", "X X", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal())}); 
			
		// Smelting Recipes
		GameRegistry.addSmelting(ModBlocks.sapphireore, new ItemStack(ModItems.m_items.get(ModItems.ItemIndex.singot.ordinal())), 0.1f);
		
		

	}

}
