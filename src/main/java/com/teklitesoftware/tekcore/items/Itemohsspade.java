package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class Itemohsspade extends ItemSpade {
	public Itemohsspade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHSSPADE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHSSPADE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
