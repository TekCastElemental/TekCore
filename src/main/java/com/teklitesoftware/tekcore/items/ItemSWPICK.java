package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemSWPICK extends ItemPickaxe {
	public ItemSWPICK (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.SWPICK.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SWPICK.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
