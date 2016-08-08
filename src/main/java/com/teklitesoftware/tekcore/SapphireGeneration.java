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
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case 1:
			generateNether(world, random, chunkX, chunkZ);

		}
	}

	public void generateEnd(World world, Random rand, int x, int z) {

	}

	public void generateNether(World world, Random rand, int x, int z) {

	}

	public void generateSurface(World world, Random rand, int chunkX, int chunkZ) {
		for (int k = 0; k < 6; k++) {
			int firstBlockXCoord = chunkX + rand.nextInt(16);
			int firstBlockZCoord = chunkZ + rand.nextInt(16);
			// Will be found between y = 0 and y = 20
			int sY = rand.nextInt(30);
			BlockPos sPos = new BlockPos(firstBlockXCoord, sY, firstBlockZCoord);

			
			(new WorldGenMinable(ModBlocks.sapphireore.getDefaultState(), 4)).generate(world, rand, sPos);
		}
	}

}
