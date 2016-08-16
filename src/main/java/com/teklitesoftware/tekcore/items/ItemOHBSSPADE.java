package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemOHBSSPADE extends ItemSpade {
	public ItemOHBSSPADE (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHBSSPADE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHBSSPADE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
