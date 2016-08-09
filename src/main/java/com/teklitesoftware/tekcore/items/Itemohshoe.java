package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemHoe;

public class Itemohshoe extends ItemHoe {
	public Itemohshoe(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHSHOE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHSHOE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
