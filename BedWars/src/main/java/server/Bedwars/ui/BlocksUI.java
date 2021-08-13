package server.Bedwars.ui;

import org.bukkit.inventory.Inventory;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Wool;
import org.json.simple.ItemList;
import server.Bedwars.items.ItemManager;
import server.Bedwars.utils.utils;
import server.Bedwars.ui.ShopUI;


public class BlocksUI {

    public static Inventory inv;
    public static String inventory_name;
    public static int inv_rows = 6 * 9;


    public static void initialise(){
        inventory_name = utils.chat("&6&lShop Blocks");

        inv = Bukkit.createInventory(null , inv_rows);
    }

    public static Inventory Gui (Player player){
        Inventory toReturn2 = Bukkit.createInventory(null, inv_rows, inventory_name);

        utils.CreateMenu(inv, 4, 1, 1, "&bMenu");
        utils.CreateItemBlock(inv,1, 159/1, 1, 1, "&bBlocks");
        utils.CreateItemSword(inv, 1, 1, "&bSwords");
        utils.CreateArmor(inv, 1, 1, "&bArmor");
        utils.CreateTools(inv, 1, 1,"&bTools");
        utils.CreateBow(inv, 1, 1,"&bBow");
        utils.CreateBrewing(inv, 1, 1,"&bBrewing");
        utils.CreateSpecial(inv, 1, 1,"&bSpecial");


        utils.CreateItemBlack1(inv,9, 1, 1, "&b");
        utils.CreateItemBlack1(inv,10, 1, 1, "&b");
        utils.CreateItemBlack1(inv,11, 1, 1, "&b");
        utils.CreateItemBlack1(inv,12, 1, 1, "&b");
        utils.CreateItemBlack1(inv,13, 1, 1, "&b");
        utils.CreateItemBlack1(inv,14, 1, 1, "&b");
        utils.CreateItemBlack1(inv,15, 1, 1, "&b");
        utils.CreateItemBlack1(inv,16, 1, 1, "&b");
        utils.CreateItemBlack1(inv,17, 1, 1, "&b");

        utils.CreateItemBlackWool(inv, 16, 1, "&bWool","&3Buy for 4 Aluminum");
        utils.CreateItemBlackWood(inv, 16, 1, "&bWood", "&3Buy for 4 Coppers");
        utils.CreateItemBlackEnd_Stone(inv, 12, 1, "&bEnd Stone","&3Buy for 24 Aluminum");
        utils.CreateItemBlackObsidian(inv, 4, 1, "&bObsidian","&3Buy for 4 Emeralds");
        utils.CreateItemGlass(inv, 4, 1, "&bGlass","&3Buy for 12 Aluminum");
        utils.CreateItemTerracotta(inv, 12, 1, "&bTerracotta","&3Buy for 12 Aluminum");
        utils.CreateItemLadder(inv, 2, 1, "&bLadder","&3Buy for 10 Aluminum");

        toReturn2.setContents(inv.getContents());
        return toReturn2;
    }


    public static void clicked(Player player, int slot, ItemStack clicked, Inventory inv){

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bMenu"))) {

            player.openInventory(ShopUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bSwords"))) {

            player.openInventory(SwordUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bArmor"))) {

            player.openInventory(ArmorsUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bTools"))) {

            player.openInventory(ToolsUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBow"))) {

            player.openInventory(BowUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBrewing"))) {

            player.openInventory(BrewingUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bSpecial"))) {

            player.openInventory(SpecialUI.Gui(player));
        }


        int i = 0;
    if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bWool"))) {

        if (player.getInventory().containsAtLeast(ItemManager.aluminum,4)) {
            player.getInventory().removeItem(ItemManager.aluminum);
            player.getInventory().removeItem(ItemManager.aluminum);
            player.getInventory().removeItem(ItemManager.aluminum);
            player.getInventory().removeItem(ItemManager.aluminum);

            player.getInventory().addItem(ItemManager.Wool);
            player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Wool");
        }
        else{
            player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 4 Aluminum!" );
        }
    }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bWood"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper,4)) {
                player.getInventory().removeItem(ItemManager.copper);
                player.getInventory().removeItem(ItemManager.copper);
                player.getInventory().removeItem(ItemManager.copper);
                player.getInventory().removeItem(ItemManager.copper);

                player.getInventory().addItem(ItemManager.Wood);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Wood");

            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 4 Copper!" );
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bEnd Stone"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,24)) {
                for (i = 1; i <= 24; i++){
                    player.getInventory().removeItem(ItemManager.aluminum);
                }
                i = 0;
                player.getInventory().addItem(ItemManager.EndStone);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "End Stone");
            }
            else{
                player.sendMessage(ChatColor.RED +"You don't have enough Aluminum! Need 24 Aluminum!" );
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bObsidian"))) {

            if (player.getInventory().containsAtLeast(ItemManager.emerald,4)) {
                for (i = 1; i <= 4; i++){
                    player.getInventory().removeItem(ItemManager.emerald);
                }
                i = 0;
                player.getInventory().addItem(ItemManager.Obsidian);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Obsidian");
            }
            else{
                player.sendMessage(ChatColor.RED +"You don't have enough Emerald! Need 4 Emerald!" );
            }
        }




        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bGlass"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,12)) {
                for (i = 1; i <= 12; i++){
                    player.getInventory().removeItem(ItemManager.aluminum);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.Glass);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Glass");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 12 Aluminum!" );
            }
        }




        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bTerracotta"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,12)) {
                for (i = 1; i <= 12; i++){
                    player.getInventory().removeItem(ItemManager.aluminum);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.Terracotta);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Terracotta");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 12 Aluminum!" );
            }
        }




        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bLadder"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,10)) {
                for (i = 1; i <= 10; i++){
                    player.getInventory().removeItem(ItemManager.aluminum);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.Ladder);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Ladder");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 10 Aluminum!" );
            }
        }
    }
}


//player.openInventory(ShopUI.Gui(player));