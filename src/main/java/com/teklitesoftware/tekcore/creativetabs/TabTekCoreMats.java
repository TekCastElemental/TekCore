package com.teklitesoftware.tekcore.creativetabs;

import com.teklitesoftware.tekcore.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabTekCoreMats extends CreativeTabs {
	
	public TabTekCoreMats(String label) {
		super(label);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		
		return ModItems.Ris;
	}
}
