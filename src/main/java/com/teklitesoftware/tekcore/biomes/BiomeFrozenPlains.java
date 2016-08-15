package com.teklitesoftware.tekcore.biomes;

import java.util.Random;

import com.teklitesoftware.tekcore.Reference;

import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockFlower;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenTaiga1;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BiomeFrozenPlains extends Biome {

    protected static final WorldGenCanopyTree ROOF_TREE = new WorldGenCanopyTree(false);
    private static final WorldGenTaiga1 PINE_GENERATOR = new WorldGenTaiga1();
    public final BiomeFrozenPlains.Type type;

    public BiomeFrozenPlains(BiomeFrozenPlains.Type typeIn, Biome.BiomeProperties properties)
    {
        super(properties);
        this.type = typeIn;
        this.theBiomeDecorator.treesPerChunk = 2;
        this.theBiomeDecorator.grassPerChunk = 5;
        this.topBlock = Blocks.SNOW_LAYER.getDefaultState();
        this.fillerBlock = Blocks.DIRT.getDefaultState();
        this.setRegistryName(Reference.TCbiomes.FROZEN.getRegistryName());
        
        
        
        
        if (this.type == BiomeFrozenPlains.Type.FLOWER)
        {
            this.theBiomeDecorator.treesPerChunk = 6;
            this.theBiomeDecorator.flowersPerChunk = 100;
            this.theBiomeDecorator.grassPerChunk = 1;
            this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityRabbit.class, 4, 2, 3));
        }

        if (this.type == BiomeFrozenPlains.Type.NORMAL)
        {
            this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityWolf.class, 5, 4, 4));
            this.theBiomeDecorator.flowersPerChunk = 0;
            
        }

        if (this.type == BiomeFrozenPlains.Type.ROOFED)
        {
            this.theBiomeDecorator.treesPerChunk = 9;
            this.theBiomeDecorator.flowersPerChunk = 10;
            this.theBiomeDecorator.grassPerChunk = 3;
       
        }
    }


 


	public WorldGenAbstractTree genBigTreeChance(Random rand)
    {
		 return (WorldGenAbstractTree)(rand.nextInt(3) > 0 ? this.PINE_GENERATOR : super.genBigTreeChance(rand));
		// return (WorldGenAbstractTree)(this.type == BiomeSpirit.Type.ROOFED && rand.nextInt(3) > 0 ? ROOF_TREE : (this.type != BiomeSpirit.Type.BIRCH && rand.nextInt(5) != 0 ? (rand.nextInt(10) == 0 ? BIG_TREE_FEATURE : TREE_FEATURE) : BIRCH_TREE));
    }

    public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
    {
        if (this.type == BiomeFrozenPlains.Type.FLOWER)
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
        if (this.type == BiomeFrozenPlains.Type.ROOFED)
        {
          
        }

        int i = rand.nextInt(5) - 3;

        if (this.type == BiomeFrozenPlains.Type.FLOWER)
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
    	
        if (type != BiomeFrozenPlains.Type.FLOWER)
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
        return BiomeFrozenPlains.class;
    }
	    public static enum Type
	    {
	        NORMAL,
	        FLOWER,
	        BIRCH,
	        ROOFED;
	    }
	    @SideOnly(Side.CLIENT)
	    @Override
	    public int getGrassColorAtPos(BlockPos pos)
	    {
	    	
	    	return 0xFFFFFF;
	    }
	    @SideOnly(Side.CLIENT)
	    @Override
	    public int getSkyColorByTemp(float par1) {
	    	return 0x9900FF;
	    	
	    }

	  
	  @SideOnly(Side.CLIENT) 
	  @Override
	    public int getFoliageColorAtPos(BlockPos pos)
	    {
		  return 0xFFFFFF;
	     //   return 16777215;
	    }
}
