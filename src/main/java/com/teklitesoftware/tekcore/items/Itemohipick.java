package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class Itemohipick extends ItemPickaxe {
	public Itemohipick(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHIPICK.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHIPICK.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
