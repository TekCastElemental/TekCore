package com.teklitesoftware.tekcore.crafting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockStone;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockStoneSlabNew;
import net.minecraft.block.BlockWall;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeBookCloning;
import net.minecraft.item.crafting.RecipeFireworks;
import net.minecraft.item.crafting.RecipeRepairItem;
import net.minecraft.item.crafting.RecipeTippedArrow;
import net.minecraft.item.crafting.RecipesArmor;
import net.minecraft.item.crafting.RecipesArmorDyes;
import net.minecraft.item.crafting.RecipesBanners;
import net.minecraft.item.crafting.RecipesCrafting;
import net.minecraft.item.crafting.RecipesDyes;
import net.minecraft.item.crafting.RecipesFood;
import net.minecraft.item.crafting.RecipesIngots;
import net.minecraft.item.crafting.RecipesMapCloning;
import net.minecraft.item.crafting.RecipesMapExtending;
import net.minecraft.item.crafting.RecipesTools;
import net.minecraft.item.crafting.RecipesWeapons;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.item.crafting.ShieldRecipes;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class DyeRecipes {
	 /** The static instance of this class */
    private static final DyeRecipes INSTANCE = new DyeRecipes();
    private final List<IRecipe> recipes = Lists.<IRecipe>newArrayList();

    /**
     * Returns the static instance of this class
     */
    public static DyeRecipes getInstance()
    {
        /** The static instance of this class */
        return INSTANCE;
    }

    private DyeRecipes()
    {
        
   
    	this.addShapelessRecipe(new ItemStack(ModBlocks.bbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 0));
		this.addShapelessRecipe(new ItemStack(ModBlocks.blbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 4));
		this.addShapelessRecipe(new ItemStack(ModBlocks.blbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 12));
		this.addShapelessRecipe(new ItemStack(ModBlocks.gbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 2));
		this.addShapelessRecipe(new ItemStack(ModBlocks.gbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 10));
		this.addShapelessRecipe(new ItemStack(ModBlocks.mbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 13));
		this.addShapelessRecipe(new ItemStack(ModBlocks.mbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 9));
		this.addShapelessRecipe(new ItemStack(ModBlocks.pbrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 5));
		this.addShapelessRecipe(new ItemStack(ModBlocks.ybrick), Blocks.BRICK_BLOCK, new ItemStack(Items.DYE, 1, 11));
        
		this.addShapelessRecipe(new ItemStack(ModBlocks.bbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 0));
		this.addShapelessRecipe(new ItemStack(ModBlocks.blbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 4));
		this.addShapelessRecipe(new ItemStack(ModBlocks.blbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 12));
		this.addShapelessRecipe(new ItemStack(ModBlocks.gbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 2));
		this.addShapelessRecipe(new ItemStack(ModBlocks.gbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 10));
		this.addShapelessRecipe(new ItemStack(ModBlocks.mbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 13));
		this.addShapelessRecipe(new ItemStack(ModBlocks.mbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 9));
		this.addShapelessRecipe(new ItemStack(ModBlocks.pbst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 5));
		this.addShapelessRecipe(new ItemStack(ModBlocks.ybst), Blocks.BRICK_STAIRS, new ItemStack(Items.DYE, 1, 11));
		
		this.addShapelessRecipe(new ItemStack(ModBlocks.ww), new ItemStack(Blocks.PLANKS, 1, 0), new ItemStack(Items.DYE, 1, 15));
		this.addShapelessRecipe(new ItemStack(ModBlocks.bw), new ItemStack(Blocks.PLANKS, 1, 0), new ItemStack(Items.DYE, 1, 0));
    }

    /**
     * Adds a shaped recipe to the games recipe list.
     */
    public ShapedRecipes addRecipe(ItemStack stack, Object... recipeComponents)
    {
        String s = "";
        int i = 0;
        int j = 0;
        int k = 0;

        if (recipeComponents[i] instanceof String[])
        {
            String[] astring = (String[])((String[])recipeComponents[i++]);

            for (String s2 : astring)
            {
                ++k;
                j = s2.length();
                s = s + s2;
            }
        }
        else
        {
            while (recipeComponents[i] instanceof String)
            {
                String s1 = (String)recipeComponents[i++];
                ++k;
                j = s1.length();
                s = s + s1;
            }
        }

        Map<Character, ItemStack> map;

        for (map = Maps.<Character, ItemStack>newHashMap(); i < recipeComponents.length; i += 2)
        {
            Character character = (Character)recipeComponents[i];
            ItemStack itemstack = null;

            if (recipeComponents[i + 1] instanceof Item)
            {
                itemstack = new ItemStack((Item)recipeComponents[i + 1]);
            }
            else if (recipeComponents[i + 1] instanceof Block)
            {
                itemstack = new ItemStack((Block)recipeComponents[i + 1], 1, 32767);
            }
            else if (recipeComponents[i + 1] instanceof ItemStack)
            {
                itemstack = (ItemStack)recipeComponents[i + 1];
            }

            map.put(character, itemstack);
        }

        ItemStack[] aitemstack = new ItemStack[j * k];

        for (int l = 0; l < j * k; ++l)
        {
            char c0 = s.charAt(l);

            if (map.containsKey(Character.valueOf(c0)))
            {
                aitemstack[l] = ((ItemStack)map.get(Character.valueOf(c0))).copy();
            }
            else
            {
                aitemstack[l] = null;
            }
        }

        ShapedRecipes shapedrecipes = new ShapedRecipes(j, k, aitemstack, stack);
        this.recipes.add(shapedrecipes);
        return shapedrecipes;
    }

    /**
     * Adds a shapeless crafting recipe to the the game.
     */
    public void addShapelessRecipe(ItemStack stack, Object... recipeComponents)
    {
        List<ItemStack> list = Lists.<ItemStack>newArrayList();

        for (Object object : recipeComponents)
        {
            if (object instanceof ItemStack)
            {
                list.add(((ItemStack)object).copy());
            }
            else if (object instanceof Item)
            {
                list.add(new ItemStack((Item)object));
            }
            else
            {
                if (!(object instanceof Block))
                {
                    throw new IllegalArgumentException("Invalid shapeless recipe: unknown type " + object.getClass().getName() + "!");
                }

                list.add(new ItemStack((Block)object));
            }
        }

        this.recipes.add(new ShapelessRecipes(stack, list));
    }

    /**
     * Adds an IRecipe to the list of crafting recipes.
     */
    public void addRecipe(IRecipe recipe)
    {
        this.recipes.add(recipe);
    }

    /**
     * Retrieves an ItemStack that has multiple recipes for it.
     */
    @Nullable
    public ItemStack findMatchingRecipe(InventoryCrafting craftMatrix, World worldIn)
    {
        for (IRecipe irecipe : this.recipes)
        {
            if (irecipe.matches(craftMatrix, worldIn))
            {
                return irecipe.getCraftingResult(craftMatrix);
            }
        }

        return null;
    }

    public ItemStack[] getRemainingItems(InventoryCrafting craftMatrix, World worldIn)
    {
        for (IRecipe irecipe : this.recipes)
        {
            if (irecipe.matches(craftMatrix, worldIn))
            {
                return irecipe.getRemainingItems(craftMatrix);
            }
        }

        ItemStack[] aitemstack = new ItemStack[craftMatrix.getSizeInventory()];

        for (int i = 0; i < aitemstack.length; ++i)
        {
            aitemstack[i] = craftMatrix.getStackInSlot(i);
        }

        return aitemstack;
    }

    public List<IRecipe> getRecipeList()
    {
        return this.recipes;
    }
}
