package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item;

public class ItemMOSW extends Item {
	
	public ItemMOSW() {
		setUnlocalizedName(Reference.TekCoreItems.MOSW.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.MOSW.getRegistryName());
		this.setCreativeTab(TCengine.mats);
	}

}
