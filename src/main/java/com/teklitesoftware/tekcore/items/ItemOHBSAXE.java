package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;

public class ItemOHBSAXE extends ItemAxe {
	
	public ItemOHBSAXE(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.TekCoreItems.OHBSAXE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHBSAXE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
