package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class Itemohispade extends ItemSpade {
	public Itemohispade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHISPADE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHISPADE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
