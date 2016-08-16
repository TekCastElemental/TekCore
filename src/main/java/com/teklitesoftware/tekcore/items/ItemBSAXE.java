package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemBSAXE extends ItemAxe {
	public ItemBSAXE(ToolMaterial material, float damage, float speed) {
		super(material, damage, speed);
		setUnlocalizedName(Reference.TekCoreItems.BSAXE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.BSAXE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
