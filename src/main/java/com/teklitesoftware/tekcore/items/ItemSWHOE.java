package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemSWHOE extends ItemHoe {
	public ItemSWHOE(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.SWHOE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SWHOE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
