package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class Itemsaxe extends ItemAxe {
	public Itemsaxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.TekCoreItems.SAXE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SAXE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
