package DrugsPlus;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat; 
import cn.nukkit.utils.Utils; 

import java.io.File; 
import java.io.IOException; 
import java.util.LinkedHashMap;

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
  
  @Override
  public boolean onHeld(PlayerItemHeldEvent event){
   player = event.getPlayer();
   item = player.getInventory().getItemInHand();
   switch(item.getId()){
    case 296:
     player.getInventory.setItemInHand(item.setCustomName(TextFormat.RESET  + TextFormat.GREEN + "Weed");
    break;
   }
  }
 }
