package server.Bedwars.ui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import server.Bedwars.utils.utils;

public class SpecialUI {
    public static Inventory inv;
    public static String inventory_name;
    public static int inv_rows = 6 * 9;


    public static void initialise(){
        inventory_name = utils.chat("&6&lShop Special");

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

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBow"))) {

            player.openInventory(BowUI.Gui(player));
        }

        if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(utils.chat("&bBrewing"))) {

            player.openInventory(BrewingUI.Gui(player));
        }


    }

}
