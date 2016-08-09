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
		DOHPICK("dohpick", "Itemdohpick");
		
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
		CRYSTALLIZER("crystallizer", "BlockCrystallizer"),
		LIT_CRYSTALLIZER("lit_crystallizer", "BlockCrystallizer");
		
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
}
