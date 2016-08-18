package com.teklitesoftware.tekcore.init;

import com.teklitesoftware.tekcore.blocks.BlockAcaciaTable;
import com.teklitesoftware.tekcore.blocks.BlockBBST;
import com.teklitesoftware.tekcore.blocks.BlockBLBST;
import com.teklitesoftware.tekcore.blocks.BlockBWS;
import com.teklitesoftware.tekcore.blocks.BlockBbrick;
import com.teklitesoftware.tekcore.blocks.BlockBirchTable;
import com.teklitesoftware.tekcore.blocks.BlockBlackTable;
import com.teklitesoftware.tekcore.blocks.BlockBlackWood;
import com.teklitesoftware.tekcore.blocks.BlockBlbrick;
import com.teklitesoftware.tekcore.blocks.BlockCW;
import com.teklitesoftware.tekcore.blocks.BlockCWS;
import com.teklitesoftware.tekcore.blocks.BlockCWTable;
import com.teklitesoftware.tekcore.blocks.BlockCrystallizer;
import com.teklitesoftware.tekcore.blocks.BlockDarkOakTable;
import com.teklitesoftware.tekcore.blocks.BlockDyeTable;
import com.teklitesoftware.tekcore.blocks.BlockGBST;
import com.teklitesoftware.tekcore.blocks.BlockGbrick;
import com.teklitesoftware.tekcore.blocks.BlockGlassGlowstone;
import com.teklitesoftware.tekcore.blocks.BlockJungleTable;
import com.teklitesoftware.tekcore.blocks.BlockMBST;
import com.teklitesoftware.tekcore.blocks.BlockMbrick;
import com.teklitesoftware.tekcore.blocks.BlockOBST;
import com.teklitesoftware.tekcore.blocks.BlockOSG;
import com.teklitesoftware.tekcore.blocks.BlockOakTable;
import com.teklitesoftware.tekcore.blocks.BlockObrick;
import com.teklitesoftware.tekcore.blocks.BlockPBST;
import com.teklitesoftware.tekcore.blocks.BlockPHTable;
import com.teklitesoftware.tekcore.blocks.BlockPW;
import com.teklitesoftware.tekcore.blocks.BlockPWS;
import com.teklitesoftware.tekcore.blocks.BlockPbrick;
import com.teklitesoftware.tekcore.blocks.BlockSO;
import com.teklitesoftware.tekcore.blocks.BlockSapBlock;
import com.teklitesoftware.tekcore.blocks.BlockSpruceTable;
import com.teklitesoftware.tekcore.blocks.BlockUEFO;
import com.teklitesoftware.tekcore.blocks.BlockWWS;
import com.teklitesoftware.tekcore.blocks.BlockWhiteTable;
import com.teklitesoftware.tekcore.blocks.BlockWhiteWood;
import com.teklitesoftware.tekcore.blocks.BlockYBST;
import com.teklitesoftware.tekcore.blocks.BlockYbrick;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	public static Block sapphireore;
	public static Block glassglowstone;
	public static Block Crystallizer;
	public static Block Lit_Crystallizer;
	public static Block oaktable;
	public static Block birchtable;
	public static Block sprucetable;
	public static Block jungletable;
	public static Block acaciatable;
	public static Block darkoaktable;
	public static Block bbrick;
	public static Block blbrick;
	public static Block gbrick;
	public static Block mbrick;
	public static Block pbrick;
	public static Block ybrick;
	public static Block obrick;
	
	public static Block bbst;
	public static Block blbst;
	public static Block gbst;
	public static Block mbst;
	public static Block pbst;
	public static Block ybst;
	public static Block obst;
	
	public static Block sb;
	
	public static Block dt;
	
	public static Block ww;
	public static Block bw;
	public static Block pw;
	public static Block cw;
	
	public static Block whitetable;
	public static Block blacktable;
	public static Block phtable;
	public static Block cwtable;
	
	public static Block wws;
	public static Block bws;
	public static Block pws;
	public static Block cws;
	
	public static Block mouefore;
	
	public static Block osg;
	
//	public static Block wwd;
	
/*	public static Block bbs;
	public static Block blbs;
	public static Block gbs;
	public static Block mbs;
	public static Block pbs;
	public static Block ybs; */

	public static void init() {

		sapphireore = new BlockSO();
		oaktable = new BlockOakTable();
		birchtable = new BlockBirchTable();
		sprucetable = new BlockSpruceTable();
		jungletable = new BlockJungleTable();
		acaciatable = new BlockAcaciaTable();
		darkoaktable = new BlockDarkOakTable();
		glassglowstone = new BlockGlassGlowstone();
		
		bbrick = new BlockBbrick();
		blbrick = new BlockBlbrick();
		gbrick = new BlockGbrick();
		mbrick = new BlockMbrick();
		pbrick = new BlockPbrick();
		ybrick = new BlockYbrick();
		obrick = new BlockObrick();
		
		bbst = new BlockBBST();
		blbst = new BlockBLBST();
		gbst = new BlockGBST();
		mbst = new BlockMBST();
		pbst = new BlockPBST();
		ybst = new BlockYBST();
		obst = new BlockOBST();
		
		sb = new BlockSapBlock();
		
		/*bbs = new BlockBBS();
		blbs = new BlockBLBS();
		gbs = new BlockGBS();
		mbs = new BlockMBS();
		pbs = new BlockPBS();
		ybs = new BlockYBS(); */
		
		Crystallizer = new BlockCrystallizer("crystallizer", false);
		Lit_Crystallizer = new BlockCrystallizer("lit_crystallizer", true);
		
		dt = new BlockDyeTable();
		
		ww = new BlockWhiteWood();
		bw = new BlockBlackWood();
		pw = new BlockPW();
		cw = new BlockCW();

		whitetable = new BlockWhiteTable();
		blacktable = new BlockBlackTable();
		phtable = new BlockPHTable();
		cwtable = new BlockCWTable();
		
		wws = new BlockWWS();
		bws = new BlockBWS();
		pws = new BlockPWS();
		cws = new BlockCWS();
		
		mouefore = new BlockUEFO();
		
		osg = new BlockOSG();
		
	//	wwd = new BlockWWD(Material.WOOD);
	}

	public static void register() {
		GameRegistry.register(sapphireore);
		GameRegistry.register(glassglowstone);
		GameRegistry.register(oaktable);
		GameRegistry.register(birchtable);
		GameRegistry.register(sprucetable);
		GameRegistry.register(jungletable);
		GameRegistry.register(acaciatable);
		GameRegistry.register(darkoaktable);
		GameRegistry.register(phtable);
		GameRegistry.register(cwtable);
		
		GameRegistry.register(bbrick);
		GameRegistry.register(blbrick);
		GameRegistry.register(gbrick);
		GameRegistry.register(mbrick);
		GameRegistry.register(pbrick);
		GameRegistry.register(ybrick);
		GameRegistry.register(obrick);
		
		GameRegistry.register(bbst);
		GameRegistry.register(blbst);
		GameRegistry.register(gbst);
		GameRegistry.register(mbst);
		GameRegistry.register(pbst);
		GameRegistry.register(ybst);
		GameRegistry.register(obst);
		
		GameRegistry.register(sb);
		
		GameRegistry.register(dt);
		
		GameRegistry.register(ww);
		GameRegistry.register(bw);
		GameRegistry.register(pw);
		GameRegistry.register(cw);
		
		GameRegistry.register(wws);
		GameRegistry.register(bws);
		GameRegistry.register(cws);
		GameRegistry.register(pws);
		
		GameRegistry.register(whitetable);
		GameRegistry.register(blacktable);
		
		GameRegistry.register(mouefore);
		
		GameRegistry.register(osg);
		
		//GameRegistry.register(wwd);
		
	/*	GameRegistry.register(bbs);
		GameRegistry.register(blbs);
		GameRegistry.register(gbs);
		GameRegistry.register(mbs);
		GameRegistry.register(pbs);
		GameRegistry.register(ybs); */
		
		GameRegistry.register(new ItemBlock(bbrick).setRegistryName(bbrick.getRegistryName()));
		GameRegistry.register(new ItemBlock(blbrick).setRegistryName(blbrick.getRegistryName()));
		GameRegistry.register(new ItemBlock(gbrick).setRegistryName(gbrick.getRegistryName()));
		GameRegistry.register(new ItemBlock(mbrick).setRegistryName(mbrick.getRegistryName()));
		GameRegistry.register(new ItemBlock(pbrick).setRegistryName(pbrick.getRegistryName()));
		GameRegistry.register(new ItemBlock(ybrick).setRegistryName(ybrick.getRegistryName()));
		GameRegistry.register(new ItemBlock(obrick).setRegistryName(obrick.getRegistryName()));
		
		GameRegistry.register(new ItemBlock(bbst).setRegistryName(bbst.getRegistryName()));
		GameRegistry.register(new ItemBlock(blbst).setRegistryName(blbst.getRegistryName()));
		GameRegistry.register(new ItemBlock(gbst).setRegistryName(gbst.getRegistryName()));
		GameRegistry.register(new ItemBlock(mbst).setRegistryName(mbst.getRegistryName()));
		GameRegistry.register(new ItemBlock(pbst).setRegistryName(pbst.getRegistryName()));
		GameRegistry.register(new ItemBlock(ybst).setRegistryName(ybst.getRegistryName())); 
		GameRegistry.register(new ItemBlock(obst).setRegistryName(obst.getRegistryName())); 
		
	/*	GameRegistry.register(new ItemBlock(bbs).setRegistryName(bbs.getRegistryName()));
		GameRegistry.register(new ItemBlock(blbs).setRegistryName(blbs.getRegistryName()));
		GameRegistry.register(new ItemBlock(gbs).setRegistryName(gbrick.getRegistryName()));
		GameRegistry.register(new ItemBlock(mbs).setRegistryName(mbs.getRegistryName()));
		GameRegistry.register(new ItemBlock(pbs).setRegistryName(pbs.getRegistryName()));
		GameRegistry.register(new ItemBlock(ybs).setRegistryName(ybs.getRegistryName())); */
		
		GameRegistry.register(new ItemBlock(oaktable).setRegistryName(oaktable.getRegistryName()));
		GameRegistry.register(new ItemBlock(birchtable).setRegistryName(birchtable.getRegistryName()));
		GameRegistry.register(new ItemBlock(sprucetable).setRegistryName(sprucetable.getRegistryName()));
		GameRegistry.register(new ItemBlock(jungletable).setRegistryName(jungletable.getRegistryName()));
		GameRegistry.register(new ItemBlock(acaciatable).setRegistryName(acaciatable.getRegistryName()));
		GameRegistry.register(new ItemBlock(darkoaktable).setRegistryName(darkoaktable.getRegistryName()));
		GameRegistry.register(new ItemBlock(glassglowstone).setRegistryName(glassglowstone.getRegistryName()));
		GameRegistry.register(new ItemBlock(sapphireore).setRegistryName(sapphireore.getRegistryName()));
		
		GameRegistry.register(new ItemBlock(mouefore).setRegistryName(mouefore.getRegistryName()));
		
		GameRegistry.register(new ItemBlock(osg).setRegistryName(osg.getRegistryName()));
		
		GameRegistry.register(new ItemBlock(ww).setRegistryName(ww.getRegistryName()));
		GameRegistry.register(new ItemBlock(bw).setRegistryName(bw.getRegistryName()));
		GameRegistry.register(new ItemBlock(pw).setRegistryName(pw.getRegistryName()));
		GameRegistry.register(new ItemBlock(cw).setRegistryName(cw.getRegistryName()));
		
		GameRegistry.register(new ItemBlock(wws).setRegistryName(wws.getRegistryName()));
		GameRegistry.register(new ItemBlock(bws).setRegistryName(bws.getRegistryName()));
		GameRegistry.register(new ItemBlock(pws).setRegistryName(pws.getRegistryName()));
		GameRegistry.register(new ItemBlock(cws).setRegistryName(cws.getRegistryName()));
		
		GameRegistry.register(new ItemBlock(sb).setRegistryName(sb.getRegistryName()));
		
		GameRegistry.register(new ItemBlock(dt).setRegistryName(dt.getRegistryName()));
		
		GameRegistry.register(new ItemBlock(whitetable).setRegistryName(whitetable.getRegistryName()));
		GameRegistry.register(new ItemBlock(blacktable).setRegistryName(blacktable.getRegistryName()));
		GameRegistry.register(new ItemBlock(phtable).setRegistryName(phtable.getRegistryName()));
		GameRegistry.register(new ItemBlock(cwtable).setRegistryName(cwtable.getRegistryName()));
		
		//GameRegistry.register(new ItemBlock(wwd).setRegistryName(wwd.getRegistryName()));
		
		
		
		registerBlock(Crystallizer);
		registerBlock(Lit_Crystallizer);

	}

	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);

	}

	public static void registerRenders() {
		registerRender(sapphireore);
		
		registerRender(Crystallizer);
		registerRender(Lit_Crystallizer);
		
		registerRender(glassglowstone);
		
		registerRender(oaktable);
		registerRender(birchtable);
		registerRender(sprucetable);
		registerRender(jungletable);
		registerRender(acaciatable);
		registerRender(darkoaktable);
		
		registerRender(bbrick);
		registerRender(blbrick);
		registerRender(gbrick);
		registerRender(mbrick);
		registerRender(pbrick);
		registerRender(ybrick);
		registerRender(obrick);
		
		registerRender(bbst);
		registerRender(blbst);
		registerRender(gbst);
		registerRender(mbst);
		registerRender(pbst);
		registerRender(ybst);
		registerRender(obst);
		
		registerRender(sb);
		
		registerRender(dt);
		
		registerRender(ww);
		registerRender(bw);
		registerRender(pw);
		registerRender(cw);
		registerRender(wws);
		registerRender(bws);
		registerRender(pws);
		registerRender(cws);
		
		registerRender(whitetable);
		registerRender(blacktable);
		registerRender(cwtable);
		registerRender(phtable);
		
		registerRender(mouefore);
		
		registerRender(osg);
		
		//registerRender(wwd);
		
	/*	registerRender(bbs);
		registerRender(blbs);
		registerRender(gbs);
		registerRender(mbs);
		registerRender(pbs);
		registerRender(ybs);*/
		
		

	}

	private static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
}
