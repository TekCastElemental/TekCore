package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class Itemohsaxe extends ItemAxe {
	public Itemohsaxe(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.TekCoreItems.OHSAXE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHSAXE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
