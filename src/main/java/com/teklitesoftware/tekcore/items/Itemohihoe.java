package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class Itemohihoe extends ItemHoe {
	public Itemohihoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHIHOE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHIHOE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
