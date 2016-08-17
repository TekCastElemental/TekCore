package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemSWSWORD extends ItemSword {
	public ItemSWSWORD(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.SWSWORD.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SWSWORD.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}

