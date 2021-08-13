package server.Bedwars.ui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import server.Bedwars.items.ItemManager;
import server.Bedwars.utils.utils;

public class ToolsUI {

    public static Inventory inv;
    public static String inventory_name;
    public static int inv_rows = 6 * 9;


    public static void initialise(){
        inventory_name = utils.chat("&6&lShop Tools");

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

        if (!player.getInventory().containsAtLeast(ItemManager.wooden_pickaxe,1)) {
            utils.CreateWooden_Pickaxe(inv, 1, 1, "&bWooden Pickaxe","&3Buy for 5 Aluminum");
        }

        if (player.getInventory().containsAtLeast(ItemManager.wooden_pickaxe,1)) {
            utils.CreateStone_Pickaxe(inv,1,1,"&bStone Pickaxe","&3Buy for 10 Aluminum");
        }

        if (player.getInventory().containsAtLeast(ItemManager.stone_pickaxe,1)) {
            utils.CreateAluminum_Pickaxe(inv,1,1,"&bAluminum Pickaxe","&3Buy for 4 Copper");
        }

        if (player.getInventory().containsAtLeast(ItemManager.aluminum_pickaxe,1)) {
            utils.CreateDiamond_Pickaxe(inv,1,1,"&bDiamond Pickaxe","&3Buy for 10 Copper");
        }

        if (player.getInventory().containsAtLeast(ItemManager.diamond_pickaxe,1)) {
            utils.CreateDiamond_Pickaxe(inv,1,1,"&bDiamond  Pickaxe","&c&lYou have its");
        }



        if (!player.getInventory().containsAtLeast(ItemManager.wooden_axe,1)) {
            utils.CreateWooden_axe(inv, 1, 1, "&bWooden axe","&3Buy for 5 Aluminum");
        }

        if (player.getInventory().containsAtLeast(ItemManager.wooden_axe,1)) {
            utils.CreateStone_axe(inv,1,1,"&bStone axe","&3Buy for 10 Aluminum");
        }

        if (player.getInventory().containsAtLeast(ItemManager.stone_axe,1)) {
            utils.CreateAluminum_axe(inv,1,1,"&bAluminum axe","&3Buy for 4 Copper");
        }

        if (player.getInventory().containsAtLeast(ItemManager.aluminum_axe,1)) {
            utils.CreateDiamond_axe(inv,1,1,"&bDiamond axe","&3Buy for 10 Copper");
        }

        if (player.getInventory().containsAtLeast(ItemManager.diamond_axe,1)) {
            utils.CreateDiamond_axe(inv,1,1,"&bDiamond  axe","&c&lYou have its");
        }

        if (!player.getInventory().containsAtLeast(ItemManager.shears,1)) {
            utils.CreateShears(inv,1,1,"&bShears","&3Buy for 20 Aluminum");
        }

        if (player.getInventory().containsAtLeast(ItemManager.shears,1)) {
            utils.CreateShears(inv,1,1,"&b Shears","&c&lYou have its");
        }

        toReturn2.setContents(inv.getContents());
        return toReturn2;
    }


    public static void clicked(Player player, int slot, ItemStack clicked, Inventory inv) {

        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bMenu"))) {

            player.openInventory(ShopUI.Gui(player));
        }

        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBlocks"))) {

            player.openInventory(BlocksUI.Gui(player));
        }

        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bSwords"))) {

            player.openInventory(SwordUI.Gui(player));
        }
        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bArmor"))) {

            player.openInventory(ArmorsUI.Gui(player));
        }


        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBow"))) {

            player.openInventory(BowUI.Gui(player));
        }

        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBrewing"))) {

            player.openInventory(BrewingUI.Gui(player));
        }

        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bSpecial"))) {

            player.openInventory(SpecialUI.Gui(player));
        }

int i = 0;

        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bWooden Pickaxe"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum, 5)) {
                for (i = 0; i <=5; i++){
                    player.getInventory().removeItem(ItemManager.aluminum);
                }
                player.getInventory().addItem(ItemManager.wooden_pickaxe);
                player.openInventory(ToolsUI.Gui(player));

                player.updateInventory();

                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Wooden Pickaxe");

            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 5 Aluminum!" );
            }
        }


        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bStone Pickaxe"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum, 10)) {
                for (i = 0; i <=10; i++){
                    player.getInventory().removeItem(ItemManager.aluminum);
                }
                player.getInventory().removeItem(ItemManager.wooden_pickaxe);
                player.getInventory().addItem(ItemManager.stone_pickaxe);
                player.openInventory(ToolsUI.Gui(player));

                player.updateInventory();

                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Stone Pickaxe");

            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 10 Aluminum!" );
            }
        }

        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bAluminum Pickaxe"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper, 4)) {
                for (i = 0; i <=4; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                player.getInventory().removeItem(ItemManager.stone_pickaxe);
                player.getInventory().addItem(ItemManager.aluminum_pickaxe);
                player.openInventory(ToolsUI.Gui(player));

                player.updateInventory();

                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Aluminum Pickaxe");

            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 4 Copper!" );
            }
        }

        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bDiamond Pickaxe"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper, 10)) {
                for (i = 0; i <=10; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                player.getInventory().removeItem(ItemManager.aluminum_pickaxe);
                player.getInventory().addItem(ItemManager.diamond_pickaxe);
                player.openInventory(ToolsUI.Gui(player));

                player.updateInventory();

                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Diamond Pickaxe");

            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 10 Copper!" );
            }
        }



        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bWooden axe"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum, 5)) {
                for (i = 0; i <=5; i++){
                    player.getInventory().removeItem(ItemManager.aluminum);
                }
                player.getInventory().addItem(ItemManager.wooden_axe);
                player.openInventory(ToolsUI.Gui(player));

                player.updateInventory();

                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Wooden axe");

            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 5 Aluminum!" );
            }
        }


        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bStone axe"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum, 10)) {
                for (i = 0; i <=10; i++){
                    player.getInventory().removeItem(ItemManager.aluminum);
                }
                player.getInventory().removeItem(ItemManager.wooden_axe);
                player.getInventory().addItem(ItemManager.stone_axe);
                player.openInventory(ToolsUI.Gui(player));

                player.updateInventory();

                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Stone axe");

            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 10 Aluminum!" );
            }
        }

        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bAluminum axe"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper, 4)) {
                for (i = 0; i <=4; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                player.getInventory().removeItem(ItemManager.stone_axe);
                player.getInventory().addItem(ItemManager.aluminum_axe);
                player.openInventory(ToolsUI.Gui(player));

                player.updateInventory();

                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Aluminum axe");

            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 4 Copper!" );
            }
        }

        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bDiamond axe"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper, 10)) {
                for (i = 0; i <=10; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                player.getInventory().removeItem(ItemManager.aluminum_axe);
                player.getInventory().addItem(ItemManager.diamond_axe);
                player.openInventory(ToolsUI.Gui(player));

                player.updateInventory();

                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Diamond axe");

            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 10 Copper!" );
            }
        }



        if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bShears"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum, 20)) {
                for (i = 0; i <=20; i++){
                    player.getInventory().removeItem(ItemManager.aluminum);
                }
                player.getInventory().addItem(ItemManager.shears);
                player.openInventory(ToolsUI.Gui(player));

                player.updateInventory();

                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Shears");

            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 20 Aluminum!" );
            }
        }
    }
}
