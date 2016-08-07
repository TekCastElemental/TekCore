package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRis extends Item {
	
	public ItemRis() {
		setUnlocalizedName(Reference.TekCoreItems.RIS.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.RIS.getRegistryName());
		this.setCreativeTab(CreativeTabs.MISC);
	}
}
