package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class Itemshoe extends ItemHoe {
	public Itemshoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.SHOE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SHOE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
