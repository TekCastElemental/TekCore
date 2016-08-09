package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class Itemiidspade extends ItemSpade {
	public Itemiidspade(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.IIDSPADE.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.IIDSPADE.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}
}
