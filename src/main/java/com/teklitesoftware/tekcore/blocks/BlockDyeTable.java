package com.teklitesoftware.tekcore.blocks;

import javax.annotation.Nullable;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.TCengine;
import com.teklitesoftware.tekcore.containers.ContainerDyeTable;
import com.teklitesoftware.tekcore.handlers.CGuiHandler;
import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;

public class BlockDyeTable extends Block {
	 public BlockDyeTable()
	    {
	        super(Material.WOOD);
	        this.setCreativeTab(TCengine.blocks);
	        this.setRegistryName(Reference.TekCoreBlocks.DT.getRegistryName());
	        this.setUnlocalizedName(Reference.TekCoreBlocks.DT.getUnlocalizedName());
	        this.setHardness(2);
	    }

	    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ)
	    {

	  
	    	playerIn.openGui(TCengine.instance, CGuiHandler.DYE, worldIn, pos.getX(), pos.getY(), pos.getZ());

	            return true;
	        
	    }

	    public static class InterfaceCraftingTable implements IInteractionObject
	        {
	            private final World world;
	            private final BlockPos position;

	            public InterfaceCraftingTable(World worldIn, BlockPos pos)
	            {
	                this.world = worldIn;
	                this.position = pos;
	            }

	            /**
	             * Get the name of this object. For players this returns their username
	             */
	            public String getName()
	            {
	                return "Dye";
	            }

	            /**
	             * Returns true if this thing is named
	             */
	            public boolean hasCustomName()
	            {
	                return true;
	            }

	            /**
	             * Get the formatted ChatComponent that will be used for the sender's username in chat
	             */
	            public ITextComponent getDisplayName()
	            {
	                return new TextComponentTranslation(ModBlocks.dt.getUnlocalizedName() + ".name", new Object[0]);
	            }

	            public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
	            {
	                return new ContainerDyeTable(playerInventory, this.world, this.position);
	            }

	            public String getGuiID()
	            {
	                return "tekcore:dye_table";
	            }
	        }
}
