package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class Itemohisword extends ItemSword {
	public Itemohisword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHISWORD.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHISWORD.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
