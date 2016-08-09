package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class Itemiipick extends ItemPickaxe {
	public Itemiipick(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.IIPICK.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.IIPICK.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
