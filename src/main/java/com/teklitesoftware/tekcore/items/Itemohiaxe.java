package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class Itemohiaxe extends ItemAxe {
	public Itemohiaxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.TekCoreItems.OHIAXE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHIAXE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
