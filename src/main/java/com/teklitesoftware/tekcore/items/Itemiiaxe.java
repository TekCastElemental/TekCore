package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class Itemiiaxe extends ItemAxe {
	public Itemiiaxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.TekCoreItems.IIAXE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.IIAXE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
