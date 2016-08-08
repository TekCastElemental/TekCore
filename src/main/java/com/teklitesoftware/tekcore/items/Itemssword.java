package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class Itemssword extends ItemSword {
	public Itemssword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.SSWORD.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SSWORD.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
