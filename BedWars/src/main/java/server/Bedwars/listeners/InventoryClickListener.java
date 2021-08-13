package server.Bedwars.listeners;

import com.sun.source.tree.DoWhileLoopTree;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.plugin.Plugin;
import server.Bedwars.me;
import server.Bedwars.ui.*;

public class InventoryClickListener  implements Listener {

    private me plugin;

    public InventoryClickListener(me plugin){
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, (Plugin) plugin);
    }

    @EventHandler
    public void onClick(InventoryClickEvent event){
            String title = event.getInventory().getTitle();
            Player player = null;


       if(title.equals(ShopUI.inventory_name)){
                event.setCancelled(true);
                if (event.getCurrentItem() == null){
                    return ;
                }
                if (title.equals(ShopUI.inventory_name)){
                    ShopUI.clicked((Player) event.getWhoClicked(), event.getSlot(),event.getCurrentItem(),event.getInventory());

               }
            }

        if(title.equals(BlocksUI.inventory_name)){
            event.setCancelled(true);
            if (event.getCurrentItem() == null){
                return ;
            }
            if (title.equals(BlocksUI.inventory_name)){
                BlocksUI.clicked((Player) event.getWhoClicked(), event.getSlot(),event.getCurrentItem(),event.getInventory());

            }
        }

        if(title.equals(SwordUI.inventory_name)){
            event.setCancelled(true);
            if (event.getCurrentItem() == null){
                return ;
            }
            if (title.equals(SwordUI.inventory_name)){
                SwordUI.clicked((Player) event.getWhoClicked(), event.getSlot(),event.getCurrentItem(),event.getInventory());

            }
        }


        if(title.equals(ArmorsUI.inventory_name)){
            event.setCancelled(true);
            if (event.getCurrentItem() == null){
                return ;
            }
            if (title.equals(ArmorsUI.inventory_name)){
                ArmorsUI.clicked((Player) event.getWhoClicked(), event.getSlot(),event.getCurrentItem(),event.getInventory());

            }
        }


        if(title.equals(ToolsUI.inventory_name)){
            event.setCancelled(true);
            if (event.getCurrentItem() == null){
                return ;
            }
            if (title.equals(ToolsUI.inventory_name)){
                ToolsUI.clicked((Player) event.getWhoClicked(), event.getSlot(),event.getCurrentItem(),event.getInventory());

            }
        }

        if(title.equals(BowUI.inventory_name)){
            event.setCancelled(true);
            if (event.getCurrentItem() == null){
                return ;
            }
            if (title.equals(BowUI.inventory_name)){
                BowUI.clicked((Player) event.getWhoClicked(), event.getSlot(),event.getCurrentItem(),event.getInventory());

            }
        }

        if(title.equals(BrewingUI.inventory_name)){
            event.setCancelled(true);
            if (event.getCurrentItem() == null){
                return ;
            }
            if (title.equals(BrewingUI.inventory_name)){
                BrewingUI.clicked((Player) event.getWhoClicked(), event.getSlot(),event.getCurrentItem(),event.getInventory());

            }
        }

        if(title.equals(SpecialUI.inventory_name)){
            event.setCancelled(true);
            if (event.getCurrentItem() == null){
                return ;
            }
            if (title.equals(SpecialUI.inventory_name)){
                SpecialUI.clicked((Player) event.getWhoClicked(), event.getSlot(),event.getCurrentItem(),event.getInventory());

            }
        }
    }

}
