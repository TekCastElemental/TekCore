package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;

import net.minecraft.item.ItemPickaxe;

public class Itemspick extends ItemPickaxe {

	public Itemspick(ToolMaterial material) {
		super(material);
		setUnlocalizedName(Reference.TekCoreItems.SPICK.getUnlocalizedName());
		setRegistryName(Reference.TekCoreItems.SPICK.getRegistryName());
		this.setCreativeTab(TCengine.tools);
	}

}
