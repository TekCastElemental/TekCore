package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class Itemdohspade extends ItemSpade {
	public Itemdohspade (ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.DOHSPADE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.DOHSPADE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
