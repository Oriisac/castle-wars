package server.Bedwars.Shop;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import server.Bedwars.ui.ShopUI;

import javax.swing.*;

public class ClickedOnNPC implements Listener {

    @EventHandler (priority= EventPriority.NORMAL, ignoreCancelled=true)
    public void onRightClick(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked().getType()== EntityType.VILLAGER) {
            event.setCancelled(true);

            player.openInventory(ShopUI.Gui(player));


        }



}




}





