package DrugsPlus;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.potion.Effect;
import cn.nukkit.utils.TextFormat;
import cn.nukkit.Player;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerItemHeldEvent;
import cn.nukkit.item.Item;
import cn.nukkit.level.particle.SmokeParticle;
import cn.nukkit.math.Vector3;
import cn.nukkit.utils.Utils;
import cn.nukkit.event.player.PlayerItemHeldEvent;
import cn.nukkit.event.player.PlayerInteractEvent;

/* Copyright (C) ImagicalGamer - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Jake C <imagicalgamer@outlook.com>, July 2016
 */
 
 public class Main extends PluginBase implements Listener{
  
  @Override 
  public void onEnable(){
   this.getLogger().info(TextFormat.GREEN + "Enabled!");
  }
  
  public void onHeld(PlayerItemHeldEvent event){
	   Player player = event.getPlayer();
	   Item item = player.getInventory().getItemInHand();
	   switch(item.getId()){
	    case 296:
	     player.getInventory().setItemInHand(item.setCustomName(TextFormat.RESET  + TextFormat.GREEN + "Weed"));
	    break;
	    case 353:
	     player.getInventory().setItemInHand(item.setCustomName(TextFormat.RESET  + TextFormat.WHITE + "Cocaine"));
	    break;
	    case 331:
	     player.getInventory().setItemInHand(item.setCustomName(TextFormat.RESET  + TextFormat.RED + "Herion"));
	    break;
	    case 475:
	     player.getInventory().setItemInHand(item.setCustomName(TextFormat.RESET  + TextFormat.YELLOW + "Spice"));
	    break;
	    case 295:
	     player.getInventory().setItemInHand(item.setCustomName(TextFormat.RESET  + TextFormat.DARK_GREEN + "Weed Seeds"));
	    break;
	    case 338:
	     player.getInventory().setItemInHand(item.setCustomName(TextFormat.RESET  + TextFormat.GRAY + "Cocaine Plant"));
	    break;
	    case 414:
	     player.getInventory().setItemInHand(item.setCustomName(TextFormat.RESET  + TextFormat.WHITE + "Steroids"));
	    break;
	   }
	  }
	  
	  public void onInteract(PlayerInteractEvent event){
	   Player player = event.getPlayer();
	   Item item = player.getInventory().getItemInHand();
	   switch(item.getId()){
	    case 296:
	     player.addEffect(Effect.getEffect(9).setDuration(20 * 10).setAmplifier(2));
			 		player.addEffect(Effect.getEffect(10).setDuration(20 * 5).setAmplifier(2));
			 		player.addEffect(Effect.getEffect(2).setDuration(20 * 10));
			 		Item InvItem = new Item(296,0,1);
		 		 player.getInventory().remove(InvItem);
			 		player.getLevel().addParticle(new SmokeParticle(new Vector3(player.getX(), player.getY(), player.getZ())));
			 		player.sendMessage(TextFormat.GREEN + "[DrugsPlus]" + TextFormat.WHITE + " You Smoked Weed!");
			 	break;
			 	case 353:
			 	 player.addEffect(Effect.getEffect(1).setDuration(20 * 10).setAmplifier(2));
			 		player.addEffect(Effect.getEffect(3).setDuration(20 * 5).setAmplifier(2));
			 		player.addEffect(Effect.getEffect(8).setDuration(20 * 10));
			 		Item InvItem1 = new Item(353,0,1);
		 		 player.getInventory().remove(InvItem1);
			 		player.sendMessage(TextFormat.GREEN + "[DrugsPlus]" + TextFormat.WHITE + " You Snorted some Cocaine!");
			 	break;
			 	case 331:
			 	 player.addEffect(Effect.getEffect(1).setDuration(20 * 10).setAmplifier(2));
			 		player.addEffect(Effect.getEffect(8).setDuration(20 * 5).setAmplifier(2));
			 		player.addEffect(Effect.getEffect(9).setDuration(20 * 10));
			 		Item InvItem2 = new Item(331,0,1);
		 		 player.getInventory().remove(InvItem2);
			 		player.sendMessage(TextFormat.GREEN + "[DrugsPlus]" + TextFormat.WHITE + " You Injected Herion!");
			 	break;
			 	case 475:
			 	 player.addEffect(Effect.getEffect(1).setDuration(20 * 10).setAmplifier(2));
			 		player.addEffect(Effect.getEffect(9).setDuration(20 * 10));
			 		Item InvItem3 = new Item(475,0,1);
		 		 player.getInventory().remove(InvItem3);
		 		 player.getLevel().addParticle(new SmokeParticle(new Vector3(player.getX(), player.getY(), player.getZ())));
			 		player.sendMessage(TextFormat.GREEN + "[DrugsPlus]" + TextFormat.WHITE + " You Smoked Spice!");
	   }
	  }
 }
