package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item;

public class ItemMouef extends Item {
	
	public ItemMouef() {
		setUnlocalizedName(Reference.TekCoreItems.MOUEF.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.MOUEF.getRegistryName());
		this.setCreativeTab(TCengine.mats);
	}
}
