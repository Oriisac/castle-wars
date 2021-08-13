package server.Bedwars.ui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import server.Bedwars.items.ItemManager;
import server.Bedwars.utils.utils;

public class ArmorsUI {

    public static Inventory inv;
    public static String inventory_name;
    public static int inv_rows = 6 * 9;


    public static void initialise(){
        inventory_name = utils.chat("&6&lShop Armor");

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






        utils.CreateLeatherHelmet(inv, 1, 1, "&bLeather Helmet","&3Buy for 1 Aulminum", "&6Full Armor");
        utils.CreateChainHelmet(inv, 1, 1, "&bChain Helmet","&3Buy for 30 Aulminum", "&6Full Armor");
        utils.CreateAulminumHelmet(inv, 1, 1, "&bAulminum Helmet","&3Buy for 10 Copper", "&6Full Armor");
        utils.CreateDiamondHelmet(inv, 1, 1, "&bDiamond Helmet","&3Buy for 6 Emerald", "&6Full Armor");

        utils.CreateLeatherChestplate(inv, 1, 1, "&bLeather Chestplate","&3Buy for 1 Aulminum", "&6Full Armor");
        utils.CreateChainChestplate(inv, 1, 1, "&bChain Chestplate","&3Buy for 30 Aulminum", "&6Full Armor");
        utils.CreateAulminumChestplate(inv, 1, 1, "&bAulminum Chestplate","&3Buy for 10 Copper", "&6Full Armor");
        utils.CreateDiamondChestplate(inv, 1, 1, "&bDiamond Chestplate","&3Buy for 6 Emerald", "&6Full Armor");


        utils.CreateLeatherLegg(inv, 1, 1, "&bLeather Leggings","&3Buy for 1 Aulminum", "&6Full Armor");
        utils.CreateChainLegg(inv, 1, 1, "&bChain Leggings","&3Buy for 30 Aulminum", "&6Full Armor");
        utils.CreateAulminumLegg(inv, 1, 1, "&bAulminum Leggings","&3Buy for 10 Copper", "&6Full Armor");
        utils.CreateDiamondLegg(inv, 1, 1, "&bDiamond Leggings","&3Buy for 6 Emerald", "&6Full Armor");

        utils.CreateLeatherBoots(inv, 1, 1, "&bLeather Boots","&3Buy for 1 Aulminum", "&6Full Armor");
        utils.CreateChainBoots(inv, 1, 1, "&bChain Boots","&3Buy for 30 Aulminum", "&6Full Armor");
        utils.CreateAulminumBoots(inv, 1, 1, "&bAulminum Boots","&3Buy for 10 Copper", "&6Full Armor");
        utils.CreateDiamondBoots(inv, 1, 1, "&bDiamond Boots","&3Buy for 6 Emerald", "&6Full Armor");

        toReturn2.setContents(inv.getContents());
        return toReturn2;
    }


    public static void clicked(Player player, int slot, ItemStack clicked, Inventory inv){

        int i = 0;

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bMenu"))) {

            player.openInventory(ShopUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBlocks"))) {

            player.openInventory(BlocksUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bSwords"))) {

            player.openInventory(SwordUI.Gui(player));
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




        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bLeather Helmet"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,1)) {

                player.getInventory().removeItem(ItemManager.aluminum);


                player.getInventory().addItem(ItemManager.leather_helmet,ItemManager.leather_chestplate,ItemManager.leather_leggings,ItemManager.leather_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Leather Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 1 Aluminum!");
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bLeather Chestplate"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,1)) {

                player.getInventory().removeItem(ItemManager.aluminum);


                player.getInventory().addItem(ItemManager.leather_helmet,ItemManager.leather_chestplate,ItemManager.leather_leggings,ItemManager.leather_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Leather Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 1 Aluminum!");
            }
        }


        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bLeather Leggings"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,1)) {

                player.getInventory().removeItem(ItemManager.aluminum);


                player.getInventory().addItem(ItemManager.leather_helmet,ItemManager.leather_chestplate,ItemManager.leather_leggings,ItemManager.leather_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Leather Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 1 Aluminum!");
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bLeather boots"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,1)) {

                player.getInventory().removeItem(ItemManager.aluminum);


                player.getInventory().addItem(ItemManager.leather_helmet,ItemManager.leather_chestplate,ItemManager.leather_leggings,ItemManager.leather_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Leather Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Aluminum! Need 1 Aluminum!");
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bChain Helmet"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,10)) {

                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);




                player.getInventory().addItem(ItemManager.Chain_boots,ItemManager.Chain_leggings,ItemManager.Chain_chestplate,ItemManager.Chain_helmet);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Chain Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Aulminum! Need 30 Aulminum!");
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bChain Chestplate"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,10)) {


                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);



                player.getInventory().addItem(ItemManager.Chain_boots,ItemManager.Chain_leggings,ItemManager.Chain_chestplate,ItemManager.Chain_helmet);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Chain Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Aulminum! Need 30 Aulminum!");
            }
        }


        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bChain Leggings"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,10)) {

                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);


                player.getInventory().addItem(ItemManager.Chain_boots,ItemManager.Chain_leggings,ItemManager.Chain_chestplate,ItemManager.Chain_helmet);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Chain Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Aulminum! Need 30 Aulminum!");
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bChain boots"))) {

            if (player.getInventory().containsAtLeast(ItemManager.aluminum,10)) {

                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);
                player.getInventory().removeItem(ItemManager.aluminum);

                player.getInventory().addItem(ItemManager.Chain_boots,ItemManager.Chain_leggings,ItemManager.Chain_chestplate,ItemManager.Chain_helmet);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Chain Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Aulminum! Need 30 Aulminum!");
            }
        }




        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bAluminum Helmet"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper,10)) {
            for (i = 0; i < 11; i++) {
                player.getInventory().removeItem(ItemManager.copper);
            }
                player.getInventory().addItem(ItemManager.aluminum_helmet,ItemManager.aluminum_chestplate,ItemManager.aluminum_leggings,ItemManager.aluminum_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Aluminum Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 10 Copper!");
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bAulminum Chestplate"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper,10)) {
                for (i = 0; i < 11; i++) {
                    player.getInventory().removeItem(ItemManager.copper);
                }
                player.getInventory().addItem(ItemManager.aluminum_helmet,ItemManager.aluminum_chestplate,ItemManager.aluminum_leggings,ItemManager.aluminum_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Aluminum Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 10 Copper!");
            }
        }


        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bAulminum Leggings"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper,10)) {
                for (i = 0; i < 11; i++) {
                    player.getInventory().removeItem(ItemManager.copper);
                }
                player.getInventory().addItem(ItemManager.aluminum_helmet,ItemManager.aluminum_chestplate,ItemManager.aluminum_leggings,ItemManager.aluminum_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Aluminum Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 10 Copper!");
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bAulminum boots"))) {

            if (player.getInventory().containsAtLeast(ItemManager.copper,10)) {
                for (i = 0; i < 11; i++) {
                    player.getInventory().removeItem(ItemManager.copper);
                }
                player.getInventory().addItem(ItemManager.aluminum_helmet,ItemManager.aluminum_chestplate,ItemManager.aluminum_leggings,ItemManager.aluminum_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Aluminum Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Copper! Need 10 Copper!");
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bDiamond Helmet"))) {

            if (player.getInventory().containsAtLeast(ItemManager.emerald,6)) {

                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);

                player.getInventory().addItem(ItemManager.diamond_helmet,ItemManager.diamond_chestplate,ItemManager.diamond_leggings,ItemManager.diamond_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Diamond Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Emerald! Need 6 Emerald!");
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&Diamond Chestplate"))) {

            if (player.getInventory().containsAtLeast(ItemManager.emerald,6)) {

                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);

                player.getInventory().addItem(ItemManager.diamond_helmet,ItemManager.diamond_chestplate,ItemManager.diamond_leggings,ItemManager.diamond_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Diamond Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Emerald! Need 6 Emerald!");
            }
        }


        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&Diamond Leggings"))) {
            if (player.getInventory().containsAtLeast(ItemManager.emerald,6)) {

                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);

                player.getInventory().addItem(ItemManager.diamond_helmet,ItemManager.diamond_chestplate,ItemManager.diamond_leggings,ItemManager.diamond_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Diamond Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Emerald! Need 6 Emerald!");
            }
        }



        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&Diamond boots"))) {

            if (player.getInventory().containsAtLeast(ItemManager.emerald,6)) {

                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);
                player.getInventory().removeItem(ItemManager.emerald);

                player.getInventory().addItem(ItemManager.diamond_helmet,ItemManager.diamond_chestplate,ItemManager.diamond_leggings,ItemManager.diamond_boots);
                player.sendMessage(ChatColor.GREEN +"You purchased " + ChatColor.GOLD + "Diamond Armor");
            }
            else {
                player.sendMessage(ChatColor.RED + "You don't have enough Emerald! Need 6 Emerald!");
            }
        }

    }

}
