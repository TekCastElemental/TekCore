package com.teklitesoftware.tekcore.handlers;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler {
	@Override 
	public int getBurnTime(ItemStack fuel) { 
	Block blockFuel = Block.getBlockFromItem(fuel.getItem()); 
	Item itemFuel = fuel.getItem(); 
	if (blockFuel == Blocks.ICE) { 
		return 1600;
		//replace 0 with the number of ticks you want your Block or Item to burn. There are 20 ticks in a second. It takes 10 seconds to make one item. 
		} else{ 
				return 0;
			//Do not change this 0. Doing so would make every item in the game smeltable for the number of ticks this is set to. } } 
	}
	}
}
