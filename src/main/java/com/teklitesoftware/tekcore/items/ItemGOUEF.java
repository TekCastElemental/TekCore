package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item;

public class ItemGOUEF extends Item {
	
	public ItemGOUEF() {
		setUnlocalizedName(Reference.TekCoreItems.GOUEF.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.GOUEF.getRegistryName());
		this.setCreativeTab(TCengine.mats);
	}
}
