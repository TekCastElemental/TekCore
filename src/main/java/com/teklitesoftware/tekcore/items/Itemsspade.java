package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class Itemsspade extends ItemSpade {
	public Itemsspade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.SSPADE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SSPADE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
