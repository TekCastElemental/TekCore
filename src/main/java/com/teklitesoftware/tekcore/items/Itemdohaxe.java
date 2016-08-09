package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class Itemdohaxe extends ItemAxe {
	public Itemdohaxe (ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.TekCoreItems.DOHAXE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.DOHAXE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
