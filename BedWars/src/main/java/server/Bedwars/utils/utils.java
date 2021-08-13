package server.Bedwars.utils;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class utils {

    public static String chat (String s){
        return ChatColor.translateAlternateColorCodes('&',s);
    }


    public static ItemStack CreateMenu(Inventory inv,int materialId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.NETHER_STAR, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 0, item);
        return item;
    }

    public static ItemStack CreateMenuByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 0, item);
        return item;
    }



    public static ItemStack CreateItemBlock(Inventory inv,int n,int materialId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = n, item);
        return item;
    }

    public static ItemStack CreateItemBlockByte(Inventory inv,int n,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = n, item);
        return item;
    }







    public static ItemStack CreateItemSword(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.GOLD_SWORD, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 2, item);
        return item;
    }

    public static ItemStack CreateItemSwordByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 2, item);
        return item;
    }


    public static ItemStack CreateStick(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STICK, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        meta.addEnchant(Enchantment.KNOCKBACK, 1,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 3, item);
        return item;
    }

    public static ItemStack CreateStickByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 3, item);
        return item;
    }


    public static ItemStack CreateArmor(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

    item = new ItemStack(Material.CHAINMAIL_BOOTS, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 3, item);
        return item;
    }

    public static ItemStack CreateArmorByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 3, item);
        return item;
    }



    public static ItemStack CreateTools(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STONE_PICKAXE, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 4, item);
        return item;
    }

    public static ItemStack CreateToolsByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 4, item);
        return item;
    }


    public static ItemStack CreateBow(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.BOW, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 5, item);
        return item;
    }

    public static ItemStack CreateBowByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 5, item);
        return item;
    }


    public static ItemStack CreateBrewing(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.BREWING_STAND_ITEM, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 6, item);
        return item;
    }

    public static ItemStack CreateBrewingByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 6, item);
        return item;
    }




    public static ItemStack CreateSpecial(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.TNT, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 7, item);
        return item;
    }

    public static ItemStack CreateSpecialByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 7, item);
        return item;
    }


    public static ItemStack CreateItemBlack0(Inventory inv,int Slot, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STAINED_GLASS_PANE, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = Slot, item);
        return item;
    }

    public static ItemStack CreateItemBlack0Byte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 8, item);
        return item;
    }



    //air 1
    public static ItemStack CreateItemBlack1(Inventory inv,int n, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STAINED_GLASS_PANE, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = n, item);
        return item;
    }

    public static ItemStack CreateItemBlack1Byte(Inventory inv,int n,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = n, item);
        return item;
    }


    public static ItemStack CreateItemBlack9Byte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 17, item);
        return item;
    }


    //wool
    public static ItemStack CreateItemBlackWool(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.WOOL, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }

    public static ItemStack CreateItemBlackWoolByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }


    //wood
    public static ItemStack CreateItemBlackWood(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.WOOD, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }

    public static ItemStack CreateItemBlackWoodByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }


    //End_Stone
    public static ItemStack CreateItemBlackEnd_Stone(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.ENDER_STONE, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 21, item);
        return item;
    }

    public static ItemStack CreateItemBlackEnd_StoneByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 21, item);
        return item;
    }

    //Obsidian
    public static ItemStack CreateItemBlackObsidian(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.OBSIDIAN, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 22, item);
        return item;
    }

    public static ItemStack CreateItemBlackObsidianByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 22, item);
        return item;
    }


    public static ItemStack CreateItemGlass(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.GLASS, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 23, item);
        return item;
    }

    public static ItemStack CreateItemGlassByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 23, item);
        return item;
    }



    public static ItemStack CreateItemTerracotta(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STAINED_CLAY, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 24, item);
        return item;
    }

    public static ItemStack CreateItemTerracottaByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 24, item);
        return item;
    }



    public static ItemStack CreateItemLadder(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.LADDER, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 25, item);
        return item;
    }

    public static ItemStack CreateItemLadderByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 25, item);
        return item;
    }




    //Sword wood
    public static ItemStack CreateItemSwordWood(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.WOOD_SWORD, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }

    public static ItemStack CreateItemSwordWoodByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }


    //Sword Stone
    public static ItemStack CreateItemSwordStone(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STONE_SWORD, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }

    public static ItemStack CreateItemSwordStoneByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }


    //Sword Aluminum
    public static ItemStack CreateItemSwordAluminum(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.IRON_SWORD, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 21, item);
        return item;
    }

    public static ItemStack CreateItemBlackSwordAluminumByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 21, item);
        return item;
    }


    //Sword Diamond
    public static ItemStack CreateItemSwordDiamond(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.DIAMOND_SWORD, amount);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 22, item);
        return item;
    }

    public static ItemStack CreateItemBlackSwordDiamondByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 22, item);
        return item;
    }



    public static ItemStack CreateStick1(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STICK, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Knockback Stick");
        meta.addEnchant(Enchantment.KNOCKBACK, 1,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 23, item);
        return item;
    }

    public static ItemStack CreateStick1Byte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 23, item);
        return item;
    }




    public static ItemStack CreateStick2(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STICK, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Knockback Stick");
        meta.addEnchant(Enchantment.KNOCKBACK, 1,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 24, item);
        return item;
    }

    public static ItemStack CreateStick2Byte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 24, item);
        return item;
    }




    public static ItemStack CreateStick3(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STICK, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Knockback Stick");
        meta.addEnchant(Enchantment.KNOCKBACK, 1,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 25, item);
        return item;
    }

    public static ItemStack CreateStick3Byte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 25, item);
        return item;
    }



    public static ItemStack CreateLeatherHelmet(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.LEATHER_HELMET, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Leather Helmet");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }

    public static ItemStack CreateLeatherHelmetByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }




    public static ItemStack CreateChainHelmet(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.CHAINMAIL_HELMET, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Chain Helmet");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 21, item);
        return item;
    }

    public static ItemStack CreateChainHelmetByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 21, item);
        return item;
    }


    public static ItemStack CreateAulminumHelmet(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.IRON_HELMET, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aluminum Helmet");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 23, item);
        return item;
    }

    public static ItemStack CreateAluminumHelmetByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 23, item);
        return item;
    }



    public static ItemStack CreateDiamondHelmet(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.DIAMOND_HELMET, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Helmet");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 25, item);
        return item;
    }

    public static ItemStack CreateDiamondHelmetByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 25, item);
        return item;
    }





    public static ItemStack CreateLeatherChestplate(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.LEATHER_CHESTPLATE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Leather Chestplate");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 28, item);
        return item;
    }

    public static ItemStack CreateLeatherChestplateByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 28, item);
        return item;
    }




    public static ItemStack CreateChainChestplate(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Chain Chestplate");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 30, item);
        return item;
    }

    public static ItemStack CreateChainChestplateByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 30, item);
        return item;
    }


    public static ItemStack CreateAulminumChestplate(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.IRON_CHESTPLATE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aluminum Chestplate");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 32, item);
        return item;
    }

    public static ItemStack CreateAluminumChestplateByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 32, item);
        return item;
    }



    public static ItemStack CreateDiamondChestplate(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.DIAMOND_CHESTPLATE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Chestplate");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 34, item);
        return item;
    }

    public static ItemStack CreateDiamondChestplateByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 34, item);
        return item;
    }






    public static ItemStack CreateLeatherLegg(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.LEATHER_LEGGINGS, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Leather Leggings");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 37, item);
        return item;
    }

    public static ItemStack CreateLeatherLeggByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 37, item);
        return item;
    }




    public static ItemStack CreateChainLegg(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.CHAINMAIL_LEGGINGS, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Chain Leggings");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 39, item);
        return item;
    }

    public static ItemStack CreateChainLeggByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 39, item);
        return item;
    }


    public static ItemStack CreateAulminumLegg(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.IRON_LEGGINGS, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aluminum Leggings");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 41, item);
        return item;
    }

    public static ItemStack CreateAluminumLeggByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 41, item);
        return item;
    }



    public static ItemStack CreateDiamondLegg(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.DIAMOND_LEGGINGS, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Chestplate");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 43, item);
        return item;
    }

    public static ItemStack CreateDiamondLeggByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 43, item);
        return item;
    }




    public static ItemStack CreateLeatherBoots(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.LEATHER_BOOTS, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Leather Boots");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 46, item);
        return item;
    }

    public static ItemStack CreateLeatherBootsByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 46, item);
        return item;
    }




    public static ItemStack CreateChainBoots(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.CHAINMAIL_BOOTS, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Chain Boots");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 48, item);
        return item;
    }

    public static ItemStack CreateChainBootsByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 48, item);
        return item;
    }


    public static ItemStack CreateAulminumBoots(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.IRON_BOOTS, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aluminum Boots");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 50, item);
        return item;
    }

    public static ItemStack CreateAluminumBootsByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 50, item);
        return item;
    }



    public static ItemStack CreateDiamondBoots(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.DIAMOND_BOOTS, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Boots");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 52, item);
        return item;
    }

    public static ItemStack CreateDiamondBootsByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 52, item);
        return item;
    }

    public static ItemStack CreateWooden_Pickaxe(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.WOOD_PICKAXE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Wooden Pickaxe");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }

    public static ItemStack CreateWoodenPickaxeByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }




    public static ItemStack CreateStone_Pickaxe(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STONE_PICKAXE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Stone Pickaxe");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }

    public static ItemStack CreateStonePickaxeByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }


    public static ItemStack CreateAluminum_Pickaxe(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.IRON_PICKAXE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aluminum Pickaxe");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }

    public static ItemStack CreateAluminumPickaxeByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }


    public static ItemStack CreateDiamond_Pickaxe(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.DIAMOND_PICKAXE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Pickaxe");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }

    public static ItemStack CreateDiamondPickaxeByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }



    public static ItemStack CreateWooden_axe(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.WOOD_AXE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Wooden axe");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }

    public static ItemStack CreateWoodenaxeByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }




    public static ItemStack CreateStone_axe(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.STONE_AXE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Stone axe");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }

    public static ItemStack CreateStoneaxeByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }


    public static ItemStack CreateAluminum_axe(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.IRON_AXE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aluminum axe");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }

    public static ItemStack CreateAluminumaxeByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }


    public static ItemStack CreateDiamond_axe(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.DIAMOND_AXE, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond axe");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }

    public static ItemStack CreateDiamondaxeByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }


    public static ItemStack CreateShears(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.SHEARS, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Shears");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 21, item);
        return item;
    }

    public static ItemStack CreateShearsByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 21, item);
        return item;
    }




    public static ItemStack CreateBowB(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.BOW, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Bow");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }

    public static ItemStack CreateBowBByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }

        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 19, item);
        return item;
    }


    public static ItemStack CreatePunch_Bow(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.BOW, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Punch Bow");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }

        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 21, item);
        return item;
    }

    public static ItemStack CreatePunch_BowByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }

        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 21, item);
        return item;
    }


    public static ItemStack CreatePower_Bow(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.BOW, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Power Bow");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }

        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }

    public static ItemStack CreatePower_BowByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }

        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 20, item);
        return item;
    }



    public static ItemStack CreateArrow(Inventory inv, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.ARROW, amount);


        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Arrow");

        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }

        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 22, item);
        return item;
    }

    public static ItemStack CreateArrowByte(Inventory inv,int materialId,int byteId, int amount, int invSlot, String displayName, String... loreString){
        ItemStack item;
        List<String> lore = new ArrayList<>();

        item = new ItemStack(Material.getMaterial(materialId), amount, (short) byteId);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(utils.chat(displayName));

        for (String s: loreString){
            lore.add(utils.chat(s));
        }
        meta.setLore(lore);
        item.setItemMeta(meta);

        inv.setItem(invSlot = 22, item);
        return item;
    }


}


