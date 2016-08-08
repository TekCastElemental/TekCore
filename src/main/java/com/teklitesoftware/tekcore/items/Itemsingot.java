package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item;

public class Itemsingot extends Item {
	public Itemsingot() {
		setUnlocalizedName(Reference.TekCoreItems.SINGOT.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SINGOT.getRegistryName());
		this.setCreativeTab(TCengine.mats);
	}
}
