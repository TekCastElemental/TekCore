package com.teklitesoftware.tekcore.init;

import com.google.common.collect.Lists;
import com.teklitesoftware.tekcore.Reference;
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
	
	public static void registerBiomes() {
		biomeSpirit = new BiomeSpirit(com.teklitesoftware.tekcore.biomes.BiomeSpirit.Type.ROOFED, new BiomeProperties("Spirit Woods").setRainfall(1.0F).setTemperature(0.5F));
		GameRegistry.register(biomeSpirit);
		BiomeDictionary.registerBiomeType(biomeSpirit, BiomeDictionary.Type.LUSH);
		BiomeManager.addBiome(BiomeType.COOL, new BiomeManager.BiomeEntry(biomeSpirit, 999));
		BiomeManager.addSpawnBiome(biomeSpirit);
		
	}

}