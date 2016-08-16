package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemBSPICK extends ItemPickaxe {
	public ItemBSPICK(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.BSPICK.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.BSPICK.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
