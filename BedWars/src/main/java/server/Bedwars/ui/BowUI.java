package server.Bedwars.ui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import server.Bedwars.items.ItemManager;
import server.Bedwars.utils.utils;

public class BowUI {


    public static Inventory inv;
    public static String inventory_name;
    public static int inv_rows = 6 * 9;


    public static void initialise(){
        inventory_name = utils.chat("&6&lShop Bow");

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

        utils.CreateBowB(inv, 1, 1, "&bBow","&3Buy for 12 Copper");
        utils.CreatePower_Bow(inv, 1, 1, "&bPower Bow","&3Buy for 18 Copper","&2Power 1");
        utils.CreatePunch_Bow(inv, 1, 1, "&bPunch Bow","&3Buy for 5 Emerald","&2Punch 1, Power 1");
        utils.CreateArrow(inv, 1, 1, "&bArrow","&3Buy for 3 Copper");

        toReturn2.setContents(inv.getContents());
        return toReturn2;
    }



    public static void clicked(Player player, int slot, ItemStack clicked, Inventory inv){

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bMenu"))) {

            player.openInventory(ShopUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBlocks"))) {

            player.openInventory(BlocksUI.Gui(player));
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

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBrewing"))) {

            player.openInventory(BrewingUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bSpecial"))) {

            player.openInventory(SpecialUI.Gui(player));
        }


        int i = 0;

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBow"))) {
            if (player.getInventory().containsAtLeast(ItemManager.copper,12)) {
                for (i = 1; i <= 12; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.Bow);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Bow");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 12 Copper!" );
            }

        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bPower Bow"))) {
            if (player.getInventory().containsAtLeast(ItemManager.copper,18)) {
                for (i = 1; i <= 18; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.Power_Bow);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Power Bow");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 18 Copper!" );
            }

        }


        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bPunch Bow"))) {
            if (player.getInventory().containsAtLeast(ItemManager.emerald,5)) {
                for (i = 1; i <= 5; i++){
                    player.getInventory().removeItem(ItemManager.emerald);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.Punch_Bow);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Punch Bow");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Emerald! Need 5 Emerald!" );
            }

        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bArrow"))) {
            if (player.getInventory().containsAtLeast(ItemManager.copper,3)) {
                for (i = 1; i <= 3; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.Arrow);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Arrow");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 3 Copper!" );
            }

        }
    }


}
