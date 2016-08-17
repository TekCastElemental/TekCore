package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemOHSWAXE extends ItemAxe {
	public ItemOHSWAXE (ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.TekCoreItems.OHSWAXE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHSWAXE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
