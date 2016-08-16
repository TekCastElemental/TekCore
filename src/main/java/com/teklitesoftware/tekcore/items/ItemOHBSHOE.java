package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemOHBSHOE extends ItemHoe {
	public ItemOHBSHOE (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHBSHOE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHBSHOE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
