package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemSWAXE extends ItemAxe {
	public ItemSWAXE (ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.TekCoreItems.SWAXE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SWAXE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
