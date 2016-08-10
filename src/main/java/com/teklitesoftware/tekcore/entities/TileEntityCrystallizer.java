package com.teklitesoftware.tekcore.entities;

import javax.annotation.Nullable;
import com.teklitesoftware.tekcore.blocks.BlockCrystallizer;
import com.teklitesoftware.tekcore.init.CrystallizerRecipes;
import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ITickable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerFurnace;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.SlotFurnaceFuel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.tileentity.TileEntityLockable;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.datafix.DataFixer;
import net.minecraft.util.datafix.FixTypes;
import net.minecraft.util.datafix.walkers.ItemStackDataLists;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityCrystallizer extends TileEntityFurnace implements IInventory, ISidedInventory, ITickable {
	  private static final int[] slotsTop = new int[] {0};
	    private static final int[] slotsBottom = new int[] {2, 1};
	    private static final int[] slotsSides = new int[] {1};
	    /** The ItemStacks that hold the items currently being used in the furnace */
	    private ItemStack[] furnaceItemStacks = new ItemStack[3];
	    /** The number of ticks that the furnace will keep burning */
	    private int furnaceBurnTime;
	    /** The number of ticks that a fresh copy of the currently-burning item would keep the furnace burning for */
	    private int currentItemBurnTime;
	    private int cookTime;
	    private int totalCookTime;
	    private String furnaceCustomName;

	    /**
	     * Returns the number of slots in the inventory.
	     */
	    public int getSizeInventory()
	    {
	        return this.furnaceItemStacks.length;
	    }

	    /**
	     * Returns the stack in the given slot.
	     */
	    public ItemStack getStackInSlot(int index)
	    {
	        return this.furnaceItemStacks[index];
	    }

	    /**
	     * Removes up to a specified number of items from an inventory slot and returns them in a new stack.
	     */
	    public ItemStack decrStackSize(int index, int count)
	    {
	        if (this.furnaceItemStacks[index] != null)
	        {
	            if (this.furnaceItemStacks[index].stackSize <= count)
	            {
	                ItemStack itemstack1 = this.furnaceItemStacks[index];
	                this.furnaceItemStacks[index] = null;
	                return itemstack1;
	            }
	            else
	            {
	                ItemStack itemstack = this.furnaceItemStacks[index].splitStack(count);

	                if (this.furnaceItemStacks[index].stackSize == 0)
	                {
	                    this.furnaceItemStacks[index] = null;
	                }

	                return itemstack;
	            }
	        }
	        else
	        {
	            return null;
	        }
	    }

	    /**
	     * Removes a stack from the given slot and returns it.
	     */
	    public ItemStack removeStackFromSlot(int index)
	    {
	        if (this.furnaceItemStacks[index] != null)
	        {
	            ItemStack itemstack = this.furnaceItemStacks[index];
	            this.furnaceItemStacks[index] = null;
	            return itemstack;
	        }
	        else
	        {
	            return null;
	        }
	    }

	    /**
	     * Sets the given item stack to the specified slot in the inventory (can be crafting or armor sections).
	     */
	    public void setInventorySlotContents(int index, ItemStack stack)
	    {
	        boolean flag = stack != null && stack.isItemEqual(this.furnaceItemStacks[index]) && ItemStack.areItemStackTagsEqual(stack, this.furnaceItemStacks[index]);
	        this.furnaceItemStacks[index] = stack;

	        if (stack != null && stack.stackSize > this.getInventoryStackLimit())
	        {
	            stack.stackSize = this.getInventoryStackLimit();
	        }

	        if (index == 0 && !flag)
	        {
	            this.totalCookTime = this.getCookTime(stack);
	            this.cookTime = 0;
	            this.markDirty();
	        }
	    }
	    
	    @Override
	    public boolean shouldRefresh(World world, BlockPos pos, IBlockState oldState, IBlockState newState) {

	        return newState != ModBlocks.Crystallizer && newState != ModBlocks.Lit_Crystallizer;

	    }

	    /**
	     * Get the name of this object. For players this returns their username
	     */
	    public String getName()
	    {
	        return this.hasCustomName() ? this.furnaceCustomName : "Crystallizer";
	    }

	    /**
	     * Returns true if this thing is named
	     */
	    public boolean hasCustomName()
	    {
	        return this.furnaceCustomName != null && this.furnaceCustomName.length() > 0;
	    }

	    public void setCustomInventoryName(String customName)
	    {
	        this.furnaceCustomName = customName;
	    }

	    public void readFromNBT(NBTTagCompound compound)
	    {
	        super.readFromNBT(compound);
	        NBTTagList nbttaglist = compound.getTagList("Items", 10);
	        this.furnaceItemStacks = new ItemStack[this.getSizeInventory()];

	        for (int i = 0; i < nbttaglist.tagCount(); ++i)
	        {
	            NBTTagCompound nbttagcompound = nbttaglist.getCompoundTagAt(i);
	            int j = nbttagcompound.getByte("Slot");

	            if (j >= 0 && j < this.furnaceItemStacks.length)
	            {
	                this.furnaceItemStacks[j] = ItemStack.loadItemStackFromNBT(nbttagcompound);
	            }
	        }

	        this.furnaceBurnTime = compound.getShort("BurnTime");
	        this.cookTime = compound.getShort("CookTime");
	        this.totalCookTime = compound.getShort("CookTimeTotal");
	        this.currentItemBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);

	        if (compound.hasKey("CustomName", 8))
	        {
	            this.furnaceCustomName = compound.getString("CustomName");
	        }
	    }
	    
	    public NBTTagCompound writeToNBT(NBTTagCompound compound)
	    {
	        super.writeToNBT(compound);
	        compound.setInteger("BurnTime", this.furnaceBurnTime);
	        compound.setInteger("CookTime", this.cookTime);
	        compound.setInteger("CookTimeTotal", this.totalCookTime);
	        NBTTagList nbttaglist = new NBTTagList();

	        for (int i = 0; i < this.furnaceItemStacks.length; ++i)
	        {
	            if (this.furnaceItemStacks[i] != null)
	            {
	                NBTTagCompound nbttagcompound = new NBTTagCompound();
	                nbttagcompound.setByte("Slot", (byte)i);
	                this.furnaceItemStacks[i].writeToNBT(nbttagcompound);
	                nbttaglist.appendTag(nbttagcompound);
	            }
	        }

	        compound.setTag("Items", nbttaglist);

	        if (this.hasCustomName())
	        {
	            compound.setString("CustomName", this.furnaceCustomName);
	        }

	        return compound;
	    }
	    

	    /**
	     * Returns the maximum stack size for a inventory slot. Seems to always be 64, possibly will be extended.
	     */
	    public int getInventoryStackLimit()
	    {
	        return 64;
	    }

	    /**
	     * Furnace isBurning
	     */
	    public boolean isBurning()
	    {
	        return this.furnaceBurnTime > 0;
	    }

	    @SideOnly(Side.CLIENT)
	    public static boolean isBurning(IInventory inventory)
	    {
	        return inventory.getField(0) > 0;
	    }

	    /**
	     * Like the old updateEntity(), except more generic.
	     */
	    public void update()
	    {
	        boolean flag = this.isBurning();
	        boolean flag1 = false;

	        if (this.isBurning())
	        {
	            --this.furnaceBurnTime;
	        }

	        if (!this.worldObj.isRemote)
	        {
	            if (this.isBurning() || this.furnaceItemStacks[1] != null && this.furnaceItemStacks[0] != null)
	            {
	                if (!this.isBurning() && this.canSmelt())
	                {
	                    this.currentItemBurnTime = this.furnaceBurnTime = getItemBurnTime(this.furnaceItemStacks[1]);

	                    if (this.isBurning())
	                    {
	                        flag1 = true;

	                        if (this.furnaceItemStacks[1] != null)
	                        {
	                            --this.furnaceItemStacks[1].stackSize;

	                            if (this.furnaceItemStacks[1].stackSize == 0)
	                            {
	                                this.furnaceItemStacks[1] = furnaceItemStacks[1].getItem().getContainerItem(furnaceItemStacks[1]);
	                            }
	                        }
	                    }
	                }

	                if (this.isBurning() && this.canSmelt())
	                {
	                    ++this.cookTime;

	                    if (this.cookTime == this.totalCookTime)
	                    {
	                        this.cookTime = 0;
	                        this.totalCookTime = this.getCookTime(this.furnaceItemStacks[0]);
	                        this.smeltItem();
	                        flag1 = true;
	                    }
	                }
	                else
	                {
	                    this.cookTime = 0;
	                }
	            }
	            else if (!this.isBurning() && this.cookTime > 0)
	            {
	                this.cookTime = MathHelper.clamp_int(this.cookTime - 2, 0, this.totalCookTime);
	            }

	            if (flag != this.isBurning())
	            {
	                flag1 = true;
	                BlockCrystallizer.setState(this.isBurning(), this.worldObj, this.pos);
	            }
	        }

	        if (flag1)
	        {
	            this.markDirty();
	        }
	    }

	    public int getCookTime(ItemStack stack)
	    {
	        return 100; //Change this took make it faster or slower
	    }

	    /**
	     * Returns true if the furnace can smelt an item, i.e. has a source item, destination stack isn't full, etc.
	     */
	    private boolean canSmelt()
	    {
	        if (this.furnaceItemStacks[0] == null)
	        {
	            return false;
	        }
	        else
	        {
	            ItemStack itemstack = CrystallizerRecipes.instance().getSmeltingResult(this.furnaceItemStacks[0]);
	            if (itemstack == null) return false;
	            if (this.furnaceItemStacks[2] == null) return true;
	            if (!this.furnaceItemStacks[2].isItemEqual(itemstack)) return false;
	            int result = furnaceItemStacks[2].stackSize + itemstack.stackSize;
	            return result <= getInventoryStackLimit() && result <= this.furnaceItemStacks[2].getMaxStackSize(); //Forge BugFix: Make it respect stack sizes properly.
	        }
	    }

	    /**
	     * Turn one item from the furnace source stack into the appropriate smelted item in the furnace result stack
	     */
	    public void smeltItem()
	    {
	        if (this.canSmelt())
	        {
	            ItemStack itemstack = CrystallizerRecipes.instance().getSmeltingResult(this.furnaceItemStacks[0]);

	            if (this.furnaceItemStacks[2] == null)
	            {
	                this.furnaceItemStacks[2] = itemstack.copy();
	            }
	            else if (this.furnaceItemStacks[2].getItem() == itemstack.getItem())
	            {
	                this.furnaceItemStacks[2].stackSize += itemstack.stackSize; // Forge BugFix: Results may have multiple items
	            }

	            if (this.furnaceItemStacks[0].getItem() == Item.getItemFromBlock(Blocks.SPONGE) && this.furnaceItemStacks[0].getMetadata() == 1 && this.furnaceItemStacks[1] != null && this.furnaceItemStacks[1].getItem() == Items.BUCKET)
	            {
	                this.furnaceItemStacks[1] = new ItemStack(Items.WATER_BUCKET);
	            }

	            --this.furnaceItemStacks[0].stackSize;

	            if (this.furnaceItemStacks[0].stackSize <= 0)
	            {
	                this.furnaceItemStacks[0] = null;
	            }
	        }
	    }

	    /**
	     * Returns the number of ticks that the supplied fuel item will keep the furnace burning, or 0 if the item isn't
	     * fuel
	     */
	    public static int getItemBurnTime(ItemStack stack)
	    {
	        if (stack == null)
	        {
	            return 0;
	        }
	        else
	        {
	            Item item = stack.getItem();

	            if (item instanceof ItemBlock && Block.getBlockFromItem(item) != Blocks.AIR)
	            {
	                Block block = Block.getBlockFromItem(item);

	                if (block == Blocks.ICE)
	                {
	                    return 1500;
	                }

	             /* if (block.getDefaultState().getMaterial() == Material.WOOD)
	                {
	                    return 300;
	                } 

	                if (block == Blocks.COAL_BLOCK)
	                {
	                    return 16000;
	                }*/
	            }

	        /*    if (item instanceof ItemTool && "WOOD".equals(((ItemTool)item).getToolMaterialName())) return 200;
	            if (item instanceof ItemSword && "WOOD".equals(((ItemSword)item).getToolMaterialName())) return 200;
	            if (item instanceof ItemHoe && "WOOD".equals(((ItemHoe)item).getMaterialName())) return 200;
	            if (item == Items.STICK) return 100;
	            if (item == Items.COAL) return 1600;
	            if (item == Items.LAVA_BUCKET) return 20000;
	            if (item == Item.getItemFromBlock(Blocks.SAPLING)) return 100;
	            if (item == Items.BLAZE_ROD) return 2400; */
	            return net.minecraftforge.fml.common.registry.GameRegistry.getFuelValue(stack);
	        }
	    }

	    public static boolean isItemFuel(ItemStack stack)
	    {
	        /**
	         * Returns the number of ticks that the supplied fuel item will keep the furnace burning, or 0 if the item isn't
	         * fuel
	         */
	        return getItemBurnTime(stack) > 0;
	    }

	    /**
	     * Do not make give this method the name canInteractWith because it clashes with Container
	     */
	    public boolean isUseableByPlayer(EntityPlayer player)
	    {
	        return this.worldObj.getTileEntity(this.pos) != this ? false : player.getDistanceSq((double)this.pos.getX() + 0.5D, (double)this.pos.getY() + 0.5D, (double)this.pos.getZ() + 0.5D) <= 64.0D;
	    }

	    public void openInventory(EntityPlayer player)
	    {
	    }

	    public void closeInventory(EntityPlayer player)
	    {
	    }


	    /**
	     * Returns true if automation is allowed to insert the given stack (ignoring stack size) into the given slot.
	     */
	    public boolean isItemValidForSlot(int index, ItemStack stack)
	    {
	        return index == 2 ? false : (index != 1 ? true : isItemFuel(stack) || SlotFurnaceFuel.isBucket(stack));
	    }

	    public int[] getSlotsForFace(EnumFacing side)
	    {
	        return side == EnumFacing.DOWN ? slotsBottom : (side == EnumFacing.UP ? slotsTop : slotsSides);
	    }

	    /**
	     * Returns true if automation can insert the given item in the given slot from the given side. Args: slot, item,
	     * side
	     */
	    public boolean canInsertItem(int index, ItemStack itemStackIn, EnumFacing direction)
	    {
	        return this.isItemValidForSlot(index, itemStackIn);
	    }

	    /**
	     * Returns true if automation can extract the given item in the given slot from the given side. Args: slot, item,
	     * side
	     */
	    public boolean canExtractItem(int index, ItemStack stack, EnumFacing direction)
	    {
	        if (direction == EnumFacing.DOWN && index == 1)
	        {
	            Item item = stack.getItem();

	            if (item != Items.WATER_BUCKET && item != Items.BUCKET)
	            {
	                return false;
	            }
	        }

	        return true;
	    }

	    public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn)
	    {
	        return new ContainerFurnace(playerInventory, this);
	    }

	    public int getField(int id)
	    {
	        switch (id)
	        {
	            case 0:
	                return this.furnaceBurnTime;
	            case 1:
	                return this.currentItemBurnTime;
	            case 2:
	                return this.cookTime;
	            case 3:
	                return this.totalCookTime;
	            default:
	                return 0;
	        }
	    }

	    public void setField(int id, int value)
	    {
	        switch (id)
	        {
	            case 0:
	                this.furnaceBurnTime = value;
	                break;
	            case 1:
	                this.currentItemBurnTime = value;
	                break;
	            case 2:
	                this.cookTime = value;
	                break;
	            case 3:
	                this.totalCookTime = value;
	        }
	    }

	    public int getFieldCount()
	    {
	        return 4;
	    }

	    public void clear()
	    {
	        for (int i = 0; i < this.furnaceItemStacks.length; ++i)
	        {
	            this.furnaceItemStacks[i] = null;
	        }
	}

	@Override
	public ITextComponent getDisplayName() {
		return this.hasCustomName() ? new TextComponentString(this.getName())
				: new TextComponentTranslation(this.getName());
	}

}