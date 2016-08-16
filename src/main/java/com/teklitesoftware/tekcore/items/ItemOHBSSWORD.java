package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ItemOHBSSWORD extends ItemSword {
	public ItemOHBSSWORD (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHBSSWORD.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHBSSWORD.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
