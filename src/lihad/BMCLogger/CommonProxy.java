package lihad.BMCLogger;

import java.io.File;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;


public class CommonProxy {

	public void init()
	{
		MinecraftForge.EVENT_BUS.register(new EventHandler());
		registerCommands();
		loadFile();
		config();
	}

	public static void config()
	{
		Configuration config = new Configuration(new File("./lihad/BMCLogger/config.cfg"));
		config.load();
		
		
		config.save();
	}

	private void registerCommands()
	{
		//Commands go here with the following format
		
		//new Warp().register();
		//new Summon().register();
	}

	private void loadFile()
	{
		
	}
}
