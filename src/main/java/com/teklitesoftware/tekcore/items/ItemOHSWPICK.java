package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class ItemOHSWPICK extends ItemPickaxe {
	public ItemOHSWPICK (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHSWPICK.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHSWPICK.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
