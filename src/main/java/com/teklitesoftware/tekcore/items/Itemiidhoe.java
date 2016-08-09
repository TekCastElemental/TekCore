package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class Itemiidhoe extends ItemHoe {
	public Itemiidhoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.IIDHOE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.IIDHOE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
