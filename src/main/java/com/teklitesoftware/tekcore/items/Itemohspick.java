package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class Itemohspick extends ItemPickaxe {
	public Itemohspick(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHSPICK.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHSPICK.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
