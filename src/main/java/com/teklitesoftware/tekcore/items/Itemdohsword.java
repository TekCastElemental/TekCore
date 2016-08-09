package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class Itemdohsword extends ItemSword {
	public Itemdohsword(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.DOHSWORD.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.DOHSWORD.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
