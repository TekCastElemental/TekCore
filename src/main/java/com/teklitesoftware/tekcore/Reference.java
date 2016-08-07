package com.teklitesoftware.tekcore;

public class Reference {
	public static final String MOD_ID = "tekcore";
	public static final String NAME = "TekCore One";
	public static final String VERSION = "pre1.0 alpha";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.teklitesoftware.tekcore.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.teklitesoftware.tekcore.proxy.ServerProxy";
	
	public static enum TekCoreItems {
		RIS("Ris", "ItemRis");
		
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
		SAPPHIREORE("sapphireore", "BlockSO");
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
