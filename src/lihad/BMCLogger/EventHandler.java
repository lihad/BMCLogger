package lihad.BMCLogger;

import fihgu.core.event.PlayerBreakBlockEvent;
import fihgu.core.event.PlayerRightClickEvent;
import fihgu.core.tool.Location;
import net.minecraftforge.event.ForgeSubscribe;

public class EventHandler {
	@ForgeSubscribe
	public void onPlayerBreakBlock(PlayerBreakBlockEvent event){
		Location location = new Location(event.x, event.y, event.height, event.dimension);
		BMCLogger.breaked.put(event.player.toString(), location+" "+event.item.toString());
	}
	@ForgeSubscribe
	public void onPlayerRightClick(PlayerRightClickEvent event) {
		Location location = new Location(event.x, event.y, event.height, event.dimension);
		BMCLogger.right_click.put(event.player.toString(), location+" "+event.item.toString());
	}
}
