package com.teklitesoftware.tekcore.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		// Shapeless Recipes
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.m_items.get(ModItems.ItemIndex.Ris.ordinal())), Items.STICK, Items.IRON_INGOT);
		
		//Shaped Recipes
			//Sapphire Tools
			/*GameRegistry.addRecipe(new ItemStack(ModItems.sspade), new Object[] {"X  ", "I  ", "I  ", 'X', m_items.get(ModItems.), 'I', });
			GameRegistry.addRecipe(new ItemStack(ModItems.sspade), new Object[] {" X ", " I ", " I ", 'X', ModItems.singot, 'I', ModItems.Ris});
			GameRegistry.addRecipe(new ItemStack(ModItems.sspade), new Object[] {"  X", "  I", "  I", 'X', ModItems.singot, 'I', ModItems.Ris});
			GameRegistry.addRecipe(new ItemStack(ModItems.ssword), new Object[] {"X  ", "X  ", "I  ", 'X', ModItems.singot, 'I', ModItems.Ris});
			GameRegistry.addRecipe(new ItemStack(ModItems.ssword), new Object[] {" X ", " X ", " I ", 'X', ModItems.singot, 'I', ModItems.Ris});
			GameRegistry.addRecipe(new ItemStack(ModItems.ssword), new Object[] {"  X", "  X", "  I", 'X', ModItems.singot, 'I', ModItems.Ris});
			GameRegistry.addRecipe(new ItemStack(ModItems.spick), new Object[] {"XXX", " I ", " I ", 'X', ModItems.singot, 'I', ModItems.Ris});
			GameRegistry.addRecipe(new ItemStack(ModItems.shoe), new Object[] {"XX ", " I ", " I ", 'X', ModItems.singot, 'I', ModItems.Ris});
			GameRegistry.addRecipe(new ItemStack(ModItems.shoe), new Object[] {" XX", " I ", " I ", 'X', ModItems.singot, 'I', ModItems.Ris});
			GameRegistry.addRecipe(new ItemStack(ModItems.saxe), new Object[] {"XX ", "XI ", " I ", 'X', ModItems.singot, 'I', ModItems.Ris});
			GameRegistry.addRecipe(new ItemStack(ModItems.saxe), new Object[] {" XX", " IX", " I ", 'X', ModItems.singot, 'I', ModItems.Ris});
			
			//Sapphire Armor
			GameRegistry.addRecipe(new ItemStack(ModItems.sapphireHelmet), new Object[]{"XXX", "X X", "   ", 'X', ModItems.singot});
			GameRegistry.addRecipe(new ItemStack(ModItems.sapphireHelmet), new Object[]{"   ", "XXX", "X X", 'X', ModItems.singot});
			GameRegistry.addRecipe(new ItemStack(ModItems.sapphireBoots), new Object[]{"X X", "X X", "   ", 'X', ModItems.singot});
			GameRegistry.addRecipe(new ItemStack(ModItems.sapphireBoots), new Object[]{"   ", "X X", "X X", 'X', ModItems.singot});
			GameRegistry.addRecipe(new ItemStack(ModItems.sapphireChestplate), new Object[]{"X X", "XXX", "XXX", 'X', ModItems.singot});
			GameRegistry.addRecipe(new ItemStack(ModItems.sapphireLeggings), new Object[]{"XXX", "X X", "X X", 'X', ModItems.singot}); */
			
		// Smelting Recipes
		GameRegistry.addSmelting(ModBlocks.sapphireore, new ItemStack(ModItems.m_items.get(ModItems.ItemIndex.singot.ordinal())), 0.1f);
		
		

	}

}
