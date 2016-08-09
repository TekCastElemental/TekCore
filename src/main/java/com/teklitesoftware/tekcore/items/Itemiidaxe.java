package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class Itemiidaxe extends ItemAxe {
	public Itemiidaxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.TekCoreItems.IIDAXE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.IIDAXE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
