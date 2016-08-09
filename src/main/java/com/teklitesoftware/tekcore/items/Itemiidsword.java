package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class Itemiidsword extends ItemSword {
	public Itemiidsword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.IIDSWORD.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.IIDSWORD.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
