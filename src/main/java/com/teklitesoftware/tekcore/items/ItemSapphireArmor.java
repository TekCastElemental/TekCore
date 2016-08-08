package com.teklitesoftware.tekcore.items;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemSapphireArmor extends ItemArmor {
	public ItemSapphireArmor(String name, EntityEquipmentSlot equipmentSlotIn)
	{
		super(ModItems.ARMOR_SAPPHIRE, 0, equipmentSlotIn);
		setRegistryName(name);
		setUnlocalizedName(getRegistryName().toString());
		setCreativeTab(TCengine.mats);

}


}
