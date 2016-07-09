package Drugs;

import cn.nukkit.Player;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerItemHeldEvent;
import cn.nukkit.item.Item;
import cn.nukkit.level.particle.SmokeParticle;
import cn.nukkit.math.Vector3;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.potion.Effect;
import cn.nukkit.utils.TextFormat;


/**
 * Created by FuryTacticz & iMagicalGamer on 08.07.2016.
 */
public class Drugs extends PluginBase implements Listener{
	@Override 
	  public void onEnable() { 
	  this.getLogger().info(TextFormat.GREEN  + "Nicks by FuryTacticz & iMagicalGamer Enabled!"); 
	} 

	public void onHeld(PlayerItemHeldEvent event){
		Player player = event.getPlayer();
		Item item = player.getInventory().getItemInHand();
		
		 switch(item.getId()){
		 	case 296:
		 		player.getInventory().setItemInHand(item.setCustomName(TextFormat.RESET  + TextFormat.GREEN + "Weed"));
		 		player.addEffect(Effect.getEffect(9).setDuration(20 * 10).setAmplifier(2));
		 		player.addEffect(Effect.getEffect(10).setDuration(20 * 5).setAmplifier(2));
		 		player.addEffect(Effect.getEffect(2).setDuration(20 * 10));
		 		
		 		Item InvItem = new Item(296,0,1);
		 		
		 		player.getInventory().remove(InvItem);
		 		
		 		player.getLevel().addParticle(new SmokeParticle(new Vector3(player.getX(), player.getY(), player.getZ())));
		 		
		 		player.sendMessage(TextFormat.GREEN + "[DrugsPlus]" + TextFormat.WHITE + " You Smoked Weed!");
		 		
		 		break;
		 }
	}
}

