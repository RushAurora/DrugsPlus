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
 
 public class Main extends PluginBase implements Listener{
  
  @Override 
  public void onEnable(){
   this.getLogger().info(TextFormat.GREEN + "Enabled!");
  }
  
  //naming the items so it shows their drug names PlayerInteractEvent is for using the drugs
  @Override
  public void onHeld(PlayerItemHeldEvent event){
   player = event.getPlayer();
   item = player.getInventory().getItemInHand();
   switch(item.getId()){
    case 296:
     player.getInventory.setItemInHand(item.setCustomName(TextFormat.RESET  + TextFormat.GREEN + "Weed");
    break;
   }
  }
 }
