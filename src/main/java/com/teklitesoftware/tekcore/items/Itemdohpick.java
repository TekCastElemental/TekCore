package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class Itemdohpick extends ItemPickaxe {
	public Itemdohpick (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.DOHPICK.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.DOHPICK.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
