package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemOHSWSWORD extends ItemSword {
	public ItemOHSWSWORD(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.OHSWSWORD.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.OHSWSWORD.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}

