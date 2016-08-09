package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class Itemiispade extends ItemSpade {
	public Itemiispade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.IISPADE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.IISPADE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
