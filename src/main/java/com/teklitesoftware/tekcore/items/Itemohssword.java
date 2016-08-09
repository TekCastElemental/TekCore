package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class Itemohssword extends ItemSword {
	public Itemohssword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHSSWORD.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHSSWORD.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
