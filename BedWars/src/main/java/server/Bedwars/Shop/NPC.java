package server.Bedwars.Shop;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;



public class NPC implements Listener {


    @EventHandler
    public void onBreakBlock(BlockBreakEvent event){

        if(event.getBlock().getType() == Material.SPONGE)
        {
         event.setCancelled(true);
         event.getBlock().setType(Material.AIR);

            Villager villager = event.getBlock().getWorld().spawn(event.getBlock().getLocation().add(0.5,0,0.5),Villager.class);
            villager.setCustomName(ChatColor.GREEN + "Shop");
            villager.setMaxHealth(1000000000);
            villager.setMaximumNoDamageTicks(1000000000);
            villager.setAI(false);

        }


    }
}
