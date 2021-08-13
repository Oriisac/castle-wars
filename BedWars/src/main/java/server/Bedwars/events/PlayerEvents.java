package server.Bedwars.events;


import org.bukkit.*;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerRespawnEvent;


import server.Bedwars.items.ItemManager;

import java.util.ArrayList;
import java.util.List;


public class PlayerEvents implements Listener {

    @EventHandler
    public static void onPlayerDeath(PlayerDeathEvent event)
    {



        Player player = event.getEntity().getPlayer();
        Bukkit bukkit = null;
        GameMode spectator = GameMode.SPECTATOR;
        GameMode survival = GameMode.SURVIVAL;
        player.setGameMode(spectator);
        //player.sendMessage("you death");
        int i;
        for (i = 0; i <= 20000; i++){
            player.sendTitle(ChatColor.RED +"You Death",ChatColor.YELLOW + "You will respawn in 5 seconds!",20,60,20);
        }
        for (i = 0; i <= 20000; i++){
            player.sendTitle(ChatColor.RED +"You Death",ChatColor.YELLOW + "You will respawn in 4 seconds!",20,60,20);
        }
        for (i = 0; i <= 20000; i++){
            player.sendTitle(ChatColor.RED +"You Death",ChatColor.YELLOW + "You will respawn in 3 seconds!",20,60,20);
        }
        for (i = 0; i <= 20000; i++){
            player.sendTitle(ChatColor.RED +"You Death",ChatColor.YELLOW + "You will respawn in 2 seconds!",20,60,20);
        }
        for (i = 0; i <= 20000; i++){
            player.sendTitle(ChatColor.RED +"You Death",ChatColor.YELLOW + "You will respawn in 1 seconds!",20,60,20);
        }
        player.setGameMode(survival);


    }




    @EventHandler
    public static void onDeath(PlayerInteractEvent event){

        event.isCancelled();


    }

    //@EventHandler
    // static void onRightClick(PlayerInteractEvent event){

        //if (event.getAction() == Action.RIGHT_CLICK_BLOCK){
            //if (event.getItem() != null){
                //if (event.getItem().getItemMeta().equals(ItemManager.tnt.getItemMeta())){
                    //Player player = event.getPlayer();
                    //player.getWorld().createExplosion(player.getLocation(), 2f);
                //}
            //}
        //}
    //}





    @EventHandler
    public static void onRespawn(PlayerRespawnEvent event){

        Player player = event.getPlayer();

        if (player.getInventory().containsAtLeast(ItemManager.leather_boots,1)) {
            player.getInventory().addItem(ItemManager.leather_boots);
        }
        if (player.getInventory().containsAtLeast(ItemManager.leather_leggings,1)) {
            player.getInventory().addItem(ItemManager.leather_leggings);
        }
        if (player.getInventory().containsAtLeast(ItemManager.leather_chestplate,1)) {
            player.getInventory().addItem(ItemManager.leather_chestplate);
        }
        if (player.getInventory().containsAtLeast(ItemManager.leather_helmet,1)) {
            player.getInventory().addItem(ItemManager.leather_helmet);
        }



    }


    List<FallingBlock> Tnt = new ArrayList<>();

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        if(event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
            if(event.getPlayer().getInventory().getItemInMainHand().getItemMeta() != null && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore() != null
            && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().contains("Tnt boom")){
                FallingBlock tnt = event.getPlayer().getWorld().spawnFallingBlock(event.getPlayer().getEyeLocation(), Material.TNT, (byte) 0);
                tnt.setDropItem(false);

                Tnt.add(tnt);
                tnt.setVelocity(event.getPlayer().getLocation().getDirection().multiply(3));

                event.setCancelled(true);
                event.getPlayer().getInventory().removeItem(ItemManager.tntBoom);            }

        }
    }

    @EventHandler
    public void onFall(EntityChangeBlockEvent event){
        if(event.getEntity() instanceof FallingBlock){
            if(Tnt.contains(event.getEntity())){
             event.getEntity().getWorld().createExplosion(event.getEntity().getLocation(), 3,false);
             event.setCancelled(true);
             event.getEntity().remove();
             Tnt.remove(event.getEntity());
            }
        }

    }

}







