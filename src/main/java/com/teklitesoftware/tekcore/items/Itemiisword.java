package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class Itemiisword extends ItemSword {
	public Itemiisword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.IISWORD.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.IISWORD.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
