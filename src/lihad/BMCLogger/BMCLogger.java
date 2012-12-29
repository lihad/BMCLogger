package lihad.BMCLogger;

import java.util.HashMap;
import java.util.Map;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="Lihads Logger Mod", name="Lihads Logger Mod", version="1.0.0")
@NetworkMod(clientSideRequired=false, serverSideRequired=false)
public class BMCLogger {
	public static Map<String,String> right_click = new HashMap<String, String>();
	public static Map<String,String> breaked = new HashMap<String, String>();

	  @Mod.Instance("Lihads Logger Mod")
	  public static BMCLogger instance;

	  @SidedProxy(clientSide="lihad.logger.ClientProxy", serverSide="lihad.logger.ServerProxy")
	  public static CommonProxy proxy;

	  @Mod.PreInit
	  public void preInit(FMLPreInitializationEvent event)
	  {
	  }

	  @Mod.Init
	  public void load(FMLInitializationEvent event)
	  {
	    FMLCommonHandler.instance().getFMLLogger().info("lihad.logger Mod was loaded.");
	  }

	  @Mod.ServerStarting
	  public void serverStart(FMLServerStartingEvent event)
	  {
	    proxy.init();
	  }
}
