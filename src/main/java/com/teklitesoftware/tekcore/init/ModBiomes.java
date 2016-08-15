package com.teklitesoftware.tekcore.init;

import com.google.common.collect.Lists;
import com.teklitesoftware.tekcore.Reference;
import com.teklitesoftware.tekcore.biomes.BiomeBurntScar;
import com.teklitesoftware.tekcore.biomes.BiomeFrozenPlains;
import com.teklitesoftware.tekcore.biomes.BiomeSpirit;
import com.teklitesoftware.tekcore.biomes.BiomeSpirit.Type;

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
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.Optional;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBiomes {

	public static Biome biomeSpirit;
	public static Biome biomefrozenPlains;
	public static Biome biomeBurntScar;
	
	public static void registerBiomes() {
		biomeSpirit = new BiomeSpirit(com.teklitesoftware.tekcore.biomes.BiomeSpirit.Type.ROOFED, new BiomeProperties("Spirit Woods").setRainfall(1.0F).setTemperature(0.5F).setBaseHeight(0.5F).setHeightVariation(0.1F));
		biomefrozenPlains = new BiomeFrozenPlains(BiomeFrozenPlains.Type.NORMAL, new BiomeProperties("Frozen Plains").setRainfall(2.0F).setTemperature(0F).setBaseHeight(0.5F).setHeightVariation(0F));
		biomeBurntScar = new BiomeBurntScar(BiomeBurntScar.Type.NORMAL, new BiomeProperties("Burnt Scar").setRainfall(0F).setTemperature(1.5F).setBaseHeight(0.5F).setHeightVariation(0F));
		
		GameRegistry.register(biomefrozenPlains);
		BiomeDictionary.registerBiomeType(biomefrozenPlains, BiomeDictionary.Type.COLD);
		BiomeManager.addBiome(BiomeType.COOL, new BiomeManager.BiomeEntry(biomefrozenPlains, 6));
		BiomeManager.addSpawnBiome(biomefrozenPlains);
		
		GameRegistry.register(biomeSpirit);
		BiomeDictionary.registerBiomeType(biomeSpirit, BiomeDictionary.Type.LUSH);
		BiomeManager.addBiome(BiomeType.COOL, new BiomeManager.BiomeEntry(biomeSpirit, 6));
		BiomeManager.addSpawnBiome(biomeSpirit); 
		
		GameRegistry.register(biomeBurntScar);
		BiomeDictionary.registerBiomeType(biomeBurntScar, BiomeDictionary.Type.DEAD);
		BiomeManager.addBiome(BiomeType.WARM, new BiomeManager.BiomeEntry(biomeBurntScar, 4));
		BiomeManager.addSpawnBiome(biomeBurntScar);
		
	}

}