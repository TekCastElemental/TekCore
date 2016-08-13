package com.teklitesoftware.tekcore.biomes;

import java.util.Random;

import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.init.ModBlocks;

import javafx.scene.paint.Color;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeForest;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenBirchTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraft.world.biome.BiomeColorHelper;


public class BiomeSpirit extends Biome {

	    protected static final WorldGenCanopyTree ROOF_TREE = new WorldGenCanopyTree(false);
	    public final BiomeSpirit.Type type;

	    public BiomeSpirit(BiomeSpirit.Type typeIn, Biome.BiomeProperties properties)
	    {
	        super(properties);
	        this.type = typeIn;
	        this.theBiomeDecorator.treesPerChunk = 11;
	        this.theBiomeDecorator.grassPerChunk = 2;
	        this.topBlock = Blocks.GRASS.getDefaultState();
	        this.fillerBlock = Blocks.DIRT.getDefaultState();
	        this.setRegistryName(Reference.TCbiomes.SPIRIT.getRegistryName());
	        
	        
	        
	        
	        if (this.type == BiomeSpirit.Type.FLOWER)
	        {
	            this.theBiomeDecorator.treesPerChunk = 6;
	            this.theBiomeDecorator.flowersPerChunk = 100;
	            this.theBiomeDecorator.grassPerChunk = 1;
	            this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
	        }

	        if (this.type == BiomeSpirit.Type.NORMAL)
	        {
	            this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
	        }

	        if (this.type == BiomeSpirit.Type.ROOFED)
	        {
	            this.theBiomeDecorator.treesPerChunk = 9;
	            this.theBiomeDecorator.flowersPerChunk = 10;
	            this.theBiomeDecorator.grassPerChunk = 3;
	       
	        }
	    }


	 


		public WorldGenAbstractTree genBigTreeChance(Random rand)
	    {
			 return (WorldGenAbstractTree)(rand.nextInt(3) > 0 ? this.ROOF_TREE : super.genBigTreeChance(rand));
			// return (WorldGenAbstractTree)(this.type == BiomeSpirit.Type.ROOFED && rand.nextInt(3) > 0 ? ROOF_TREE : (this.type != BiomeSpirit.Type.BIRCH && rand.nextInt(5) != 0 ? (rand.nextInt(10) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE) : BIRCH_TREE));
	    }

	    public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
	    {
	        if (this.type == BiomeSpirit.Type.FLOWER)
	        {
	            double d0 = MathHelper.clamp_double((1.0D + GRASS_COLOR_NOISE.getValue((double)pos.getX() / 48.0D, (double)pos.getZ() / 48.0D)) / 2.0D, 0.0D, 0.9999D);
	            BlockFlower.EnumFlowerType blockflower$enumflowertype = BlockFlower.EnumFlowerType.values()[(int)(d0 * (double)BlockFlower.EnumFlowerType.values().length)];
	            return blockflower$enumflowertype == BlockFlower.EnumFlowerType.BLUE_ORCHID ? BlockFlower.EnumFlowerType.POPPY : blockflower$enumflowertype;
	        }
	        else
	        {
	            return super.pickRandomFlower(rand, pos);
	        }
	    }

	    public void decorate(World worldIn, Random rand, BlockPos pos)
	    {
	        if (this.type == BiomeSpirit.Type.ROOFED)
	        {
	          
	        }

	        int i = rand.nextInt(5) - 3;

	        if (this.type == BiomeSpirit.Type.FLOWER)
	        {
	            i += 2;
	        }

	        this.addDoublePlants(worldIn, rand, pos, i);
	        super.decorate(worldIn, rand, pos);
	    }



	    public void addDoublePlants(World p_185378_1_, Random p_185378_2_, BlockPos p_185378_3_, int p_185378_4_)
	    {
	        for (int i = 0; i < p_185378_4_; ++i)
	        {
	            int j = p_185378_2_.nextInt(3);

	            if (j == 0)
	            {
	                DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.SYRINGA);
	            }
	            else if (j == 1)
	            {
	                DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.ROSE);
	            }
	            else if (j == 2)
	            {
	                DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.PAEONIA);
	            }

	            for (int k = 0; k < 5; ++k)
	            {
	                int l = p_185378_2_.nextInt(16) + 8;
	                int i1 = p_185378_2_.nextInt(16) + 8;
	                int j1 = p_185378_2_.nextInt(p_185378_1_.getHeight(p_185378_3_.add(l, 0, i1)).getY() + 32);

	                if (DOUBLE_PLANT_GENERATOR.generate(p_185378_1_, p_185378_2_, new BlockPos(p_185378_3_.getX() + l, j1, p_185378_3_.getZ() + i1)))
	                {
	                    break;
	                }
	            }
	        }
	    }

	    @Override
	    public void addDefaultFlowers()
	    {
	    	
	        if (type != BiomeSpirit.Type.FLOWER)
	        {
	            super.addDefaultFlowers();
	            return;
	        }
	        for (BlockFlower.EnumFlowerType type : BlockFlower.EnumFlowerType.values())
	        {
	            if (type.getBlockType() == BlockFlower.EnumFlowerColor.YELLOW) continue;
	            if (type == BlockFlower.EnumFlowerType.BLUE_ORCHID) type = BlockFlower.EnumFlowerType.POPPY;
	            addFlower(net.minecraft.init.Blocks.RED_FLOWER.getDefaultState().withProperty(net.minecraft.init.Blocks.RED_FLOWER.getTypeProperty(), type), 10);
	        }
	    
	    }

	    public Class <? extends Biome > getBiomeClass()
	    {
	        return BiomeSpirit.class;
	    }

	 /*   @SideOnly(Side.CLIENT)
	    @Override
	    public int getGrassColorAtPos(BlockPos pos)
	    {
	        int i = super.getGrassColorAtPos(pos);
	        return this.type == BiomeSpirit.Type.ROOFED ? (i & 16711422) + 2634762 >> 1 : i;
	    } */
	    
	    
	    @SideOnly(Side.CLIENT)
	    @Override
	    public int getGrassColorAtPos(BlockPos pos)
	    {
	    	
	    return 0x003399;
	    }
	    @SideOnly(Side.CLIENT)
	    @Override
	    public int getSkyColorByTemp(float par1) {
	    	return 19210011;
	    	
	    }

	  
	  @SideOnly(Side.CLIENT) 
	  @Override
	    public int getFoliageColorAtPos(BlockPos pos)
	    {
		  return 0x0033CC;
	     //   return 16777215;
	    }
	  
	    @Override
	    public int getWaterColorMultiplier()
	    {
	        net.minecraftforge.event.terraingen.BiomeEvent.GetWaterColor event = new net.minecraftforge.event.terraingen.BiomeEvent.GetWaterColor(this, 183071);
	        net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event);
	        return event.getNewColor();
	    }
	 

	    public static enum Type
	    {
	        NORMAL,
	        FLOWER,
	        BIRCH,
	        ROOFED;
	    }


}

