package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class Itemiihoe extends ItemHoe {
	public Itemiihoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.IIHOE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.IIHOE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
