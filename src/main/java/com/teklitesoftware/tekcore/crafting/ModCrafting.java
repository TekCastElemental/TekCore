package com.teklitesoftware.tekcore.crafting;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import com.teklitesoftware.tekcore.init.*;
import com.teklitesoftware.tekcore.init.ModItems.ItemIndex;


public class ModCrafting {

	public static void register() {
		// Shapeless Recipes
		
			//Blocks
		/*	GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.bbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 4));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 12));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.gbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 2));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.gbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 10));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 13));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 9));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.pbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 5));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ybrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 11));
			
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.bbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 4));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 12));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.gbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 2));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.gbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 10));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 13));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.mbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 9));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.pbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 5));
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.ybst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 11)); */
			
			//Mats
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ModItems.ItemIndex.Ris.ordinal()), 2), Items.STICK, Items.IRON_INGOT);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ModItems.ItemIndex.singot.ordinal()), 9), ModBlocks.sb);
			
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
			
			//OH BS
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohbspick.ordinal())), ModItems.m_items.get(ItemIndex.bspick.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohbsaxe.ordinal())), ModItems.m_items.get(ItemIndex.bsaxe.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohbssword.ordinal())), ModItems.m_items.get(ItemIndex.bssword.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohbsspade.ordinal())), ModItems.m_items.get(ItemIndex.bsspade.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohbshoe.ordinal())), ModItems.m_items.get(ItemIndex.bshoe.ordinal()), Blocks.OBSIDIAN);	
			
			//OH SW
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohswpick.ordinal())), ModItems.m_items.get(ItemIndex.swpick.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohswaxe.ordinal())), ModItems.m_items.get(ItemIndex.swaxe.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohswsword.ordinal())), ModItems.m_items.get(ItemIndex.swsword.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohswspade.ordinal())), ModItems.m_items.get(ItemIndex.swspade.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.ohswhoe.ordinal())), ModItems.m_items.get(ItemIndex.swhoe.ordinal()), Blocks.OBSIDIAN);	
			
			//OH Diamond
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.dohpick.ordinal())), ModItems.m_items.get(ItemIndex.iidpick.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.dohaxe.ordinal())), ModItems.m_items.get(ItemIndex.iidaxe.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.dohsword.ordinal())), ModItems.m_items.get(ItemIndex.iidsword.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.dohspade.ordinal())), ModItems.m_items.get(ItemIndex.iidspade.ordinal()), Blocks.OBSIDIAN);
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.dohhoe.ordinal())), ModItems.m_items.get(ItemIndex.iidhoe.ordinal()), Blocks.OBSIDIAN);		
			
		//Shaped Recipes
			
			//Blocks
			GameRegistry.addRecipe(new ItemStack(ModBlocks.glassglowstone), new Object[]{"XGX", "XSX", "XGX", 'X', Blocks.COBBLESTONE, 'G', Blocks.GLASS, 'S', Blocks.GLOWSTONE});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.oaktable), new Object[]{"XXX", "I I", "I I", 'X', new ItemStack(Blocks.PLANKS, 1, 0), 'I', Items.STICK});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.birchtable), new Object[]{"XXX", "I I", "I I", 'X', new ItemStack(Blocks.PLANKS, 1, 2), 'I', Items.STICK});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.sprucetable), new Object[]{"XXX", "I I", "I I", 'X', new ItemStack(Blocks.PLANKS, 1, 1), 'I', Items.STICK});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.jungletable), new Object[]{"XXX", "I I", "I I", 'X', new ItemStack(Blocks.PLANKS, 1, 3), 'I', Items.STICK});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.acaciatable), new Object[]{"XXX", "I I", "I I", 'X', new ItemStack(Blocks.PLANKS, 1, 4), 'I', Items.STICK});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.darkoaktable), new Object[]{"XXX", "I I", "I I", 'X', new ItemStack(Blocks.PLANKS, 1, 5), 'I', Items.STICK});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.whitetable), new Object[]{"XXX", "I I", "I I", 'X', ModBlocks.ww, 'I', Items.STICK});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.blacktable), new Object[]{"XXX", "I I", "I I", 'X', ModBlocks.bw, 'I', Items.STICK});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.cwtable), new Object[]{"XXX", "I I", "I I", 'X', ModBlocks.cw, 'I', Items.STICK});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.phtable), new Object[]{"XXX", "I I", "I I", 'X', ModBlocks.pw, 'I', Items.STICK});
			GameRegistry.addRecipe(new ItemStack(ModBlocks.sb), new Object[]{"XXX", "XXX", "XXX", 'X', ModItems.m_items.get(ItemIndex.singot.ordinal())});
			
			GameRegistry.addRecipe(new ItemStack(ModBlocks.dt), new Object[]{"RGB", "XXX", "XXX", 'R', new ItemStack(Items.DYE, 1, 1), 'G', new ItemStack(Items.DYE, 1, 2), 'B', new ItemStack(Items.DYE, 1, 4), 'X', new ItemStack(Blocks.PLANKS, 1, 0)});
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
			
			//Burnt Scar Tools
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bsspade.ordinal())), new Object[] {"X  ", "I  ", "I  ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bsspade.ordinal())), new Object[] {" X ", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bsspade.ordinal())), new Object[] {"  X", "  I", "  I", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bssword.ordinal())), new Object[] {"X  ", "X  ", "I  ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bssword.ordinal())), new Object[] {" X ", " X ", " I ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bssword.ordinal())), new Object[] {"  X", "  X", "  I", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bspick.ordinal())), new Object[] {"XXX", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bshoe.ordinal())), new Object[] {"XX ", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bshoe.ordinal())), new Object[] {" XX", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bsaxe.ordinal())), new Object[] {"XX ", "XI ", " I ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.bsaxe.ordinal())), new Object[] {" XX", " IX", " I ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			
			
			//Spirit Wood Tools
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swspade.ordinal())), new Object[] {"X  ", "I  ", "I  ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swspade.ordinal())), new Object[] {" X ", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swspade.ordinal())), new Object[] {"  X", "  I", "  I", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swsword.ordinal())), new Object[] {"X  ", "X  ", "I  ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swsword.ordinal())), new Object[] {" X ", " X ", " I ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swsword.ordinal())), new Object[] {"  X", "  X", "  I", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swpick.ordinal())), new Object[] {"XXX", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swhoe.ordinal())), new Object[] {"XX ", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swhoe.ordinal())), new Object[] {" XX", " I ", " I ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swaxe.ordinal())), new Object[] {"XX ", "XI ", " I ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swaxe.ordinal())), new Object[] {" XX", " IX", " I ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal()), 'I', ModItems.m_items.get(ItemIndex.Ris.ordinal())});
			
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
			
			//Burnt Scar Armor
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.BurntScarHelmet.ordinal())), new Object[]{"XXX", "X X", "   ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.BurntScarHelmet.ordinal())), new Object[]{"   ", "XXX", "X X", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.BurntScarBoots.ordinal())), new Object[]{"X X", "X X", "   ", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.BurntScarBoots.ordinal())), new Object[]{"   ", "X X", "X X", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.BurntScarChestplate.ordinal())), new Object[]{"X X", "XXX", "XXX", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.BurntScarLeggings.ordinal())), new Object[]{"XXX", "X X", "X X", 'X', ModItems.m_items.get(ItemIndex.gouef.ordinal())}); 
			
			//Spirit Wood Armor
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swHelmet.ordinal())), new Object[]{"XXX", "X X", "   ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swHelmet.ordinal())), new Object[]{"   ", "XXX", "X X", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swBoots.ordinal())), new Object[]{"X X", "X X", "   ", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swBoots.ordinal())), new Object[]{"   ", "X X", "X X", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swChestplate.ordinal())), new Object[]{"X X", "XXX", "XXX", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal())});
			GameRegistry.addRecipe(new ItemStack(ModItems.m_items.get(ItemIndex.swLeggings.ordinal())), new Object[]{"XXX", "X X", "X X", 'X', ModItems.m_items.get(ItemIndex.gosw.ordinal())}); 
			
		// Smelting Recipes
		GameRegistry.addSmelting(ModBlocks.sapphireore, new ItemStack(ModItems.m_items.get(ModItems.ItemIndex.singot.ordinal())), 0.1f);
		GameRegistry.addSmelting(ModItems.m_items.get(ItemIndex.mouef.ordinal()), new ItemStack(ModItems.m_items.get(ItemIndex.gouef.ordinal())), 0.1f);
		GameRegistry.addSmelting(ModItems.m_items.get(ItemIndex.mosw.ordinal()), new ItemStack(ModItems.m_items.get(ItemIndex.gosw.ordinal())), 0.1f);
		

	}

}
