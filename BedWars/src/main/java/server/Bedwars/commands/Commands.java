package server.Bedwars.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import server.Bedwars.items.ItemManager;
import server.Bedwars.ui.ShopUI;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,Command command,String label, String[] args){
        if(sender.hasPermission("Bedwars.OpenShop")) {

            Player player = (Player) sender;

            player.openInventory(ShopUI.Gui(player));


        }

        if(sender.hasPermission("Bedwars.getItem")){
            if(command.getName().equals("GiveItems")){
                if (sender instanceof Player){
                    Player player = (Player) sender;
                    player.getInventory().addItem(ItemManager.aluminum,ItemManager.copper, ItemManager.diamond, ItemManager.emerald, ItemManager.knockback_stick1,ItemManager.wooden_sword,ItemManager.stone_sword,ItemManager.aluminum_sword,ItemManager.diamond_sword);
                    player.getInventory().addItem(ItemManager.tntBoom);
                    player.updateInventory();
                }
                else{
                    return true;
                }
            }
        }


        return true;
    }

}
