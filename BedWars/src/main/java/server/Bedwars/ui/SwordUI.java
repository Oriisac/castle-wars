package server.Bedwars.ui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import server.Bedwars.items.ItemManager;
import server.Bedwars.utils.utils;

public class SwordUI {


    public static Inventory inv;
    public static String inventory_name;
    public static int inv_rows = 6 * 9;

    public static void initialise(){
        inventory_name = utils.chat("&6&lShop Swords");

        inv = Bukkit.createInventory(null , inv_rows);
    }


    public static Inventory Gui (Player player){
        Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventory_name);

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


        utils.CreateItemSwordWood(inv, 1, 1, "&bWooden Sword","&3Buy for 1 Aluminum");
        utils.CreateItemSwordStone(inv, 1, 1, "&bStone Sword","&3Buy for 10 Aluminum");
        utils.CreateItemSwordAluminum(inv, 1, 1, "&bAluminum Sword","&3Buy for 7 Copper");
        utils.CreateItemSwordDiamond(inv, 1, 1, "&bDiamond Sword","&3Buy for 4 Emerald");

        utils.CreateStick1(inv, 1, 1, "&bKnockback Stick 1","&3Buy for 4 Copper");
        utils.CreateStick2(inv, 1, 1, "&bKnockback Stick 2","&3Buy for 10 Copper");
        utils.CreateStick3(inv, 1, 1, "&bKnockback Stick 3","&3Buy for 15 Copper");


        toReturn.setContents(inv.getContents());
        return toReturn;
    }

    public static void clicked(Player player, int slot, ItemStack clicked, Inventory inv) {

            if (clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bMenu"))) {

                player.openInventory(ShopUI.Gui(player));
            }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBlocks"))) {

            player.openInventory(BlocksUI.Gui(player));
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


        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bWooden Sword"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,1)) {

                player.getInventory().removeItem(ItemManager.aluminum);


                player.getInventory().addItem(ItemManager.wooden_sword);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Wooden Sword");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 1 Aluminum!" );
            }
        }


        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bStone Sword"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,10)) {
                for (i = 1; i <= 10; i++){
                    player.getInventory().removeItem(ItemManager.aluminum);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.stone_sword);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Stone Sword");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 10 Aluminum!" );
            }
        }


        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bAluminum Sword"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper,7)) {
                for (i = 1; i <= 7; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.aluminum_sword);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Aluminum Sword");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 7 Copper!" );
            }
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bDiamond Sword"))) {

            if (player.getInventory().containsAtLeast(ItemManager.emerald,4)) {
                for (i = 1; i <= 4; i++){
                    player.getInventory().removeItem(ItemManager.emerald);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.diamond_sword);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Diamond Sword");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Emerald! Need 4 Emerald!" );
            }
        }


        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bKnockback stick 1"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper,4)) {
                for (i = 1; i <= 4; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.knockback_stick1);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Knockback stick 1");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 4 Copper!" );
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bKnockback stick 2"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper,10)) {
                for (i = 1; i <= 10; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.knockback_stick2);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Knockback stick 2");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 10 Copper!" );
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bKnockback stick 3"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper,15)) {
                for (i = 1; i <= 15; i++){
                    player.getInventory().removeItem(ItemManager.copper);
                }
                i = 0;

                player.getInventory().addItem(ItemManager.knockback_stick3);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Knockback stick 3");
            }
            else{
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 15 Copper!" );
            }
        }

        }
    }
