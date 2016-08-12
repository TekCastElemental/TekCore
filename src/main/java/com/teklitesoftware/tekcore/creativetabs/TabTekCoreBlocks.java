package com.teklitesoftware.tekcore.creativetabs;

import com.teklitesoftware.tekcore.init.ModBlocks;
import com.teklitesoftware.tekcore.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabTekCoreBlocks extends CreativeTabs {
	public TabTekCoreBlocks(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		
		return Item.getItemFromBlock(ModBlocks.Crystallizer);
	}
}
