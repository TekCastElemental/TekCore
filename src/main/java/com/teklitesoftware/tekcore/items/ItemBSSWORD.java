package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class ItemBSSWORD extends ItemSword {
	public ItemBSSWORD(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.BSSWORD.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.BSSWORD.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
