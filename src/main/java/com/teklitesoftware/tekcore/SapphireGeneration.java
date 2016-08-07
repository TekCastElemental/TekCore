package com.teklitesoftware.tekcore;

import java.util.Random;

import com.teklitesoftware.tekcore.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import com.teklitesoftware.tekcore.blocks.BlockSO;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class SapphireGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {

		switch (world.provider.getDimension()) {
		case -1:
			generateEnd(world, random, chunkX, chunkZ);
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
		case 1:
			generateNether(world, random, chunkX, chunkZ);

		}
	}

	public void generateEnd(World world, Random rand, int x, int z) {

	}

	public void generateOverworld(World world, Random rand, int x, int z) {
		generateOre(ModBlocks.sapphireore, world, rand, x, z, 3, 10, 100, 1, 100, Blocks.STONE);
	}

	public void generateNether(World world, Random rand, int x, int z) {

	}
	
	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generateIn) {
		for(int i = 0; i < chance; i++){
			int defaultChunkSize = 16;

			int Xpos = chunkX +random.nextInt(defaultChunkSize);
			int Ypos = minY + random.nextInt(maxY - minY);
			int Zpos = chunkZ +random.nextInt(defaultChunkSize);

			IBlockState state = block.getDefaultState();
			BlockPos blockPos = new BlockPos(Xpos, Ypos, Zpos);

			new WorldGenMinable(state, maxVienSize).generate(world, random, blockPos); 
		}
	}

}
