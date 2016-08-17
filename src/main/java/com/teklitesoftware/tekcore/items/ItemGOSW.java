package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item;

public class ItemGOSW extends Item {
	public ItemGOSW() {
		setUnlocalizedName(Reference.TekCoreItems.GOSW.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.GOSW.getRegistryName());
		this.setCreativeTab(TCengine.mats);
	}
}
