package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemOHSWHOE extends ItemHoe {
	public ItemOHSWHOE(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHSWHOE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHSWHOE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
