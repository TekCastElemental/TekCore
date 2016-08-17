package com.teklitesoftware.tekcore;

public class Reference {
	public static final String MOD_ID = "tekcore";
	public static final String NAME = "TekCore One";
	public static final String VERSION = "0.1alpha";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.teklitesoftware.tekcore.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.teklitesoftware.tekcore.proxy.ServerProxy";
	
	public static enum TekCoreItems {
		
		
		

		//Mats
		RIS("Ris", "ItemRis"),
		SINGOT("singot", "Itemsingot"),
		MOUEF("mouef", "ItemMouef"),
		
		//Tools
		//base sapphire
		SPICK("spick", "Itemspick"),
		SAXE("saxe", "Itemsaxe"),
		SHOE("shoe", "Itemshoe"),
		SSPADE("sspade", "Itemsspade"),
		SSWORD("ssword", "Itemssword"),
		
		//OH Sapphire
		OHSPICK("ohspick", "Itemohspick"),
		OHSAXE("ohsaxe", "Itemohsaxe"),
		OHSHOE("ohshoe", "Itemohshoe"),
		OHSSPADE("ohsspade", "Itemohsspade"),
		OHSSWORD("ohssword", "Itemohssword"),
		
		//iiron
		IIAXE("iiaxe", "Itemiiaxe"),
		IISPADE("iispade", "Itemiispade"),
		IISWORD("iisword", "Itemiisword"),
		IIHOE("iihoe", "Itemiihoe"),
		IIPICK("iipick", "Itemiipick"),
		
		//ohi iron
		OHIAXE("ohiaxe", "Itemohiaxe"),
		OHISPADE("ohispade", "Itemohispade"),
		OHISWORD("ohisword", "Itemohisword"),
		OHIHOE("ohihoe", "Itemohihoe"),
		OHIPICK("ohipick", "Itemohipick"),
		
		//II diamond
		IIDAXE("iidaxe", "Itemiidaxe"),
		IIDSPADE("iidspade", "Itemiidspade"),
		IIDSWORD("iidsword", "Itemiidsword"),
		IIDHOE("iidhoe", "Itemiidhoe"),
		IIDPICK("iidpick", "Itemiidpick"),
		
		DOHAXE("dohaxe", "Itemdohaxe"),
		DOHSPADE("dohspade", "Itemdohspade"),
		DOHSWORD("dohsword", "Itemdohsword"),
		DOHHOE("dohhoe", "Itemdohhoe"),
		DOHPICK("dohpick", "Itemdohpick"),
		
		GOUEF("gouef", "ItemGOUEF"),
		
		BSAXE("bsaxe", "ItemBSAXE"),
		BSSWORD("bssword", "ItemBSSWORD"),
		BSSPADE("bsspade", "ItemBSSPADE"),
		BSHOE("bshoe", "ItemBSHOE"),
		BSPICK("bspick", "ItemBSPICK"),
		
		OHBSAXE("ohbsaxe", "ItemOHBSAXE"),
		OHBSSWORD("ohbssword", "ItemOHBSSWORD"),
		OHBSSPADE("ohbsspade", "ItemOHBSSPADE"),
		OHBSHOE("ohbshoe", "ItemOHBSHOE"),
		OHBSPICK("ohbspick", "ItemOHBSPICK"),
		
		MOSW("mosw", "ItemMOSW"),
		
		SWAXE("swaxe", "ItemSWAXE"),
		SWSWORD("swsword", "ItemSWSWORD"),
		SWSPADE("swspade", "ItemSWSPADE"),
		SWHOE("swhoe", "ItemSWHOE"),
		SWPICK("swpick", "ItemSWPICK"),
		
		OHSWAXE("ohswaxe", "ItemOHSWAXE"),
		OHSWSWORD("ohswsword", "ItemOHSWSWORD"),
		OHSWSPADE("ohswspade", "ItemOHSWSPADE"),
		OHSWHOE("ohswhoe", "ItemOHSWHOE"),
		OHSWPICK("ohswpick", "ItemOHSWPICK"),
		
		GOSW("gosw", "ItemGOSW");
		
		private String unlocalizedName;
		private String registryName;
		
		TekCoreItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	public static enum TekCoreBlocks {
		SAPPHIREORE("sapphireore", "BlockSO"),
		GLG("glassglowstone", "BlockGlassGlowstone"),
		OT("oaktable", "BlockOakTable"),
		ST("sprucetable", "BlockSpruceTable"),
		BT("birchtable", "BlockBirchTable"),
		JT("jungletable", "BlockJungleTable"),
		AT("acaciatable", "BlockAcaciaTable"),
		DOT("darkoaktable", "BlockDarkOakTable"),
		CRYSTALLIZER("crystallizer", "BlockCrystallizer"),
		LIT_CRYSTALLIZER("lit_crystallizer", "BlockCrystallizer"),
		BBRICK("bbrick", "BlockBbrick"),
		BLBRICK("blbrick", "BlockBlbrick"),
		GBRICK("gbrick", "BlockGbrick"),
		MBRICK("mbrick", "BlockMbrick"),
		PBRICK("pbrick", "BlockPbrick"),
		YBRICK("ybrick", "BlockYbrick"),
		BBST("bbst", "BlockBBST"),
		BLBST("blbst", "BlockBLBST"),
		GBST("gbst", "BlockGBST"),
		MBST("mbst", "BlockMBST"),
		PBST("pbst", "BlockPBST"),
		YBST("ybst", "BlockYBST"),
		SAPPHIREBLOCK("sb", "BlockSapBlock"),
		DT("dt", "BlockDyeTable"),
		WW("ww", "BlockWhiteWood"),
		BW("bw", "BlockBlackWood"),
		WHITETABLE("whitetable", "BlockWhiteTable"),
		BLACKTABLE("blacktable", "BlockBlackTable"),
		UEFO("uefo", "BlockUEFO"),
		OSG("osg", "BlockOSG");
		private String unlocalizedName;
		private String registryName;
		
		TekCoreBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
	public static enum TCbiomes {
		SPIRIT("spirit", "BiomeSpirit"),
		FROZEN("frozen", "BiomeFrozenPlains"),
		BURNT("burnt", "BiomeBurntScar");
		private String unlocalizedName;
		private String registryName;
		
		TCbiomes(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
	}
}
