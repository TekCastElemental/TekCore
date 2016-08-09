package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class Itemdohhoe extends ItemHoe {
	public Itemdohhoe (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.DOHHOE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.DOHHOE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
