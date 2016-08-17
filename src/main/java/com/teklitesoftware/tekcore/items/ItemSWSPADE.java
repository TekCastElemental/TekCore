package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class ItemSWSPADE extends ItemSpade {
	public ItemSWSPADE (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.SWSPADE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SWSPADE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
