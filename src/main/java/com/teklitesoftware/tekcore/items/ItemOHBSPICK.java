package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemOHBSPICK extends ItemPickaxe {
	public ItemOHBSPICK (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHBSPICK.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHBSPICK.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
