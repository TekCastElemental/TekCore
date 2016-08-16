package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModItems;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemBurntScarArmor extends ItemArmor {
	public ItemBurntScarArmor(String name, EntityEquipmentSlot equipmentSlotIn)
	{
		super(ModItems.ARMOR_BURNTSCAR, 0, equipmentSlotIn);
		setRegistryName(name);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(TCengine.mats);

}

}
