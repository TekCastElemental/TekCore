package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ItemOHSWSPADE extends ItemSpade {
	public ItemOHSWSPADE (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHSWSPADE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHSWSPADE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
