package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModItems;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemswArmor extends ItemArmor {
	public ItemswArmor(String name, EntityEquipmentSlot equipmentSlotIn)
	{
		super(ModItems.A_SW, 0, equipmentSlotIn);
		setRegistryName(name);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(TCengine.mats);

}

}
