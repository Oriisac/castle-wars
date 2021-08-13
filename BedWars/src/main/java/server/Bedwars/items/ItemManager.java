package server.Bedwars.items;

import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.material.Wool;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.graalvm.compiler.virtual.phases.ea.EffectList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ItemManager implements Listener {

    public static ItemStack aluminum;
    public static ItemStack copper;
    public static ItemStack diamond;
    public static ItemStack emerald;
    public static ItemStack knockback_stick1;
    public static ItemStack knockback_stick2;
    public static ItemStack knockback_stick3;
    public static ItemStack tntBoom;
    public static ItemStack wooden_sword;
    public static ItemStack stone_sword;
    public static ItemStack aluminum_sword;
    public static ItemStack diamond_sword;
    public static ItemStack Wool;
    public static ItemStack Wood;
    public static ItemStack EndStone;
    public static ItemStack Obsidian;
    public static ItemStack Glass;
    public static ItemStack Ladder;
    public static ItemStack leather_helmet;
    public static ItemStack Chain_helmet;
    public static ItemStack aluminum_helmet;
    public static ItemStack diamond_helmet;
    public static ItemStack leather_chestplate;
    public static ItemStack Chain_chestplate;
    public static ItemStack aluminum_chestplate;
    public static ItemStack diamond_chestplate;
    public static ItemStack leather_leggings;
    public static ItemStack Chain_leggings;
    public static ItemStack aluminum_leggings;
    public static ItemStack diamond_leggings;
    public static ItemStack leather_boots;
    public static ItemStack Chain_boots;
    public static ItemStack aluminum_boots;
    public static ItemStack diamond_boots;


    public static ItemStack wooden_pickaxe;
    public static ItemStack stone_pickaxe;
    public static ItemStack aluminum_pickaxe;
    public static ItemStack diamond_pickaxe;

    public static ItemStack wooden_axe;
    public static ItemStack stone_axe;
    public static ItemStack aluminum_axe;
    public static ItemStack diamond_axe;

    public static ItemStack shears;

    public static ItemStack Bow;
    public static ItemStack Punch_Bow;
    public static ItemStack Power_Bow;
    public static ItemStack Arrow;


    public static ItemStack Jump;



    public static ItemStack Terracotta;


    public static void init()
    {
        createAluminum();
        createCopper();
        createDiamond();
        createEmerald();
        createKnockback_Stick1();
        createKnockback_Stick2();
        createKnockback_Stick3();
        createtnt();
        createWool();
        createWood();
        createEnd_Stone();
        createGlass();
        createTerracotta();
        createLadder();
        createObsidian();
        createWooden_Sword();
        createStone_Sword();
        createAulminum_Sword();
        createDiamond_Sword();

        createLeather_Boots();
        createLeather_Leggings();
        createLeather_Chestplate();
        createLeather_Helmet();

        createChain_Boots();
        createChain_Leggings();
        createChain_Chestplate();
        createChain_Helmet();

        createAulminum_Boots();
        createAulminum_Leggings();
        createAulminum_Chestplate();
        createAulminum_Helmet();

        createDiamond_Boots();
        createDiamond_Leggings();
        createDiamond_Chestplate();
        createDiamond_Helmet();


        createWooden_Pickaxe();
        createWooden_axe();

        createStone_Pickaxe();
        createStone_axe();

        createAulminum_Pickaxe();
        createAulminum_axe();

        createDiamond_Pickaxe();
        createDiamond_axe();

        createShears();

        createBow();
        createPower_Bow();
        createPunch_Bow();
        createArrow();


        createJumpBoost();
    }

    public static void createAluminum()
    {
        ItemStack item = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aluminum");
        List<String> lore = new ArrayList<>();
        lore.add("You can use the store");
        meta.setLore(lore);
        item.setItemMeta(meta);
        aluminum = item;
    }

    public static void createCopper()
    {
        ItemStack item = new ItemStack(Material.GOLD_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Copper");
        List<String> lore = new ArrayList<>();
        lore.add("You can use the store");
        meta.setLore(lore);
        item.setItemMeta(meta);
        copper = item;
    }

    public static void createDiamond()
    {
        ItemStack item = new ItemStack(Material.DIAMOND, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond");
        List<String> lore = new ArrayList<>();
        lore.add("You can use the store");
        meta.setLore(lore);
        item.setItemMeta(meta);
        diamond = item;
    }

    public static void createEmerald()
    {
        ItemStack item = new ItemStack(Material.EMERALD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Emerald");
        List<String> lore = new ArrayList<>();
        lore.add("You can use the store");
        meta.setLore(lore);
        item.setItemMeta(meta);
        emerald = item;
    }

    public static void createKnockback_Stick1()
    {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Knockback Stick");
        List<String> lore = new ArrayList<>();
        lore.add("Knockback 1");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.KNOCKBACK, 1,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        knockback_stick1 = item;
    }

    public static void createKnockback_Stick2()
    {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Knockback Stick");
        List<String> lore = new ArrayList<>();
        lore.add("Knockback 2");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.KNOCKBACK, 2,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        knockback_stick2 = item;
    }

    public static void createKnockback_Stick3()
    {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Knockback Stick");
        List<String> lore = new ArrayList<>();
        lore.add("Knockback 3");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.KNOCKBACK, 1,false);
        meta.addEnchant(Enchantment.KNOCKBACK, 2,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        knockback_stick3 = item;
    }




    public static void createtnt()
    {
        ItemStack item = new ItemStack(Material.TNT, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("Tnt boom");
        meta.setLore(lore);
        item.setItemMeta(meta);
        tntBoom = item;
    }


    public static void createWool()
    {
        ItemStack item = new ItemStack(Material.WOOL, 16);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Wool = item;
    }

    public static void createWood()
    {
        ItemStack item = new ItemStack(Material.WOOD, 16);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Wood = item;
    }

    public static void createEnd_Stone()
    {
        ItemStack item = new ItemStack(Material.ENDER_STONE, 12);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        EndStone = item;
    }


    public static void createObsidian()
    {
        ItemStack item = new ItemStack(Material.OBSIDIAN, 4);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Obsidian = item;
    }

    public static void createGlass()
    {
        ItemStack item = new ItemStack(Material.GLASS, 4);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Glass = item;
    }


    public static void createTerracotta()
    {
        ItemStack item = new ItemStack(Material.STAINED_CLAY, 12);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Terracotta = item;
    }

    public static void createLadder()
    {
        ItemStack item = new ItemStack(Material.LADDER, 2);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Ladder = item;
    }

    public static void createWooden_Sword()
    {
        ItemStack item = new ItemStack(Material.WOOD_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Wooden Sword");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        wooden_sword = item;
    }

    public static void createStone_Sword()
    {
        ItemStack item = new ItemStack(Material.STONE_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Stone Sword");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        stone_sword = item;
    }

    public static void createAulminum_Sword()
    {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aulminum Sword");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        aluminum_sword = item;
    }

    public static void createDiamond_Sword()
    {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Sword");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        diamond_sword = item;
    }

    public static void createLeather_Helmet()
    {
        ItemStack item = new ItemStack(Material.LEATHER_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Leather Helmet");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        leather_helmet = item;
    }

    public static void createChain_Helmet()
    {
        ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Chain Helmet");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Chain_helmet = item;
    }


    public static void createAulminum_Helmet()
    {
        ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aulminum Helmet");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        aluminum_helmet = item;
    }

    public static void createDiamond_Helmet()
    {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Helmet");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        diamond_helmet = item;
    }





    public static void createLeather_Chestplate()
    {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Leather Chestplate");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        leather_chestplate = item;
    }

    public static void createChain_Chestplate()
    {
        ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Chain Chestplate");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Chain_chestplate = item;
    }


    public static void createAulminum_Chestplate()
    {
        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aulminum Chestplate");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        aluminum_chestplate = item;
    }

    public static void createDiamond_Chestplate()
    {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Chestplate");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        diamond_chestplate = item;
    }




    public static void createLeather_Leggings()
    {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Leather Leggings");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        leather_leggings = item;
    }

    public static void createChain_Leggings()
    {
        ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Chain Leggings");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Chain_leggings = item;
    }


    public static void createAulminum_Leggings()
    {
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aulminum Leggings");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        aluminum_leggings = item;
    }

    public static void createDiamond_Leggings()
    {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Leggings");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        diamond_leggings = item;
    }




    public static void createLeather_Boots()
    {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Leather Boots");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        leather_boots = item;
    }

    public static void createChain_Boots()
    {
        ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Chain Boots");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Chain_boots = item;
    }


    public static void createAulminum_Boots()
    {
        ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aulminum Helmet");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        aluminum_boots = item;
    }

    public static void createDiamond_Boots()
    {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Helmet");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        diamond_boots = item;
    }





    public static void createWooden_Pickaxe()
    {
        ItemStack item = new ItemStack(Material.WOOD_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Wooden Pickaxe");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.DIG_SPEED, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        wooden_pickaxe = item;
    }



    public static void createStone_Pickaxe()
    {
        ItemStack item = new ItemStack(Material.STONE_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Stone Pickaxe");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.DIG_SPEED, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        stone_pickaxe = item;
    }

    public static void createAulminum_Pickaxe()
    {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aulminum Pickaxe");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.DIG_SPEED, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        aluminum_pickaxe = item;
    }

    public static void createDiamond_Pickaxe()
    {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond Pickaxe");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.DIG_SPEED, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        diamond_pickaxe = item;
    }




    public static void createWooden_axe()
    {
        ItemStack item = new ItemStack(Material.WOOD_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Wooden Pickaxe");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.DIG_SPEED, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        wooden_axe = item;
    }



    public static void createStone_axe()
    {
        ItemStack item = new ItemStack(Material.STONE_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Stone axe");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.DIG_SPEED, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        stone_axe = item;
    }

    public static void createAulminum_axe()
    {
        ItemStack item = new ItemStack(Material.IRON_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Aulminum axe");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.DIG_SPEED, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        aluminum_axe = item;
    }

    public static void createDiamond_axe()
    {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Diamond axe");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.DIG_SPEED, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        diamond_axe = item;
    }



    public static void createShears()
    {
        ItemStack item = new ItemStack(Material.SHEARS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Shears");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.DIG_SPEED, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        shears = item;
    }


    public static void createBow()
    {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Bow");
        List<String> lore = new ArrayList<>();
        meta.setUnbreakable(true);
        item.setItemMeta(meta);
        Bow = item;
    }

    public static void createPower_Bow()
    {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Power Bow");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.ARROW_DAMAGE, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        lore.add("Power 1");
        meta.setLore(lore);
        item.setItemMeta(meta);
        Power_Bow = item;
    }

    public static void createPunch_Bow()
    {
        ItemStack item = new ItemStack(Material.BOW, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Punch Bow");
        List<String> lore = new ArrayList<>();
        meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1,false);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        lore.add("Power 1, Punch 1");
        meta.setLore(lore);
        item.setItemMeta(meta);
        Punch_Bow = item;
    }

    public static void createArrow()
    {
        ItemStack item = new ItemStack(Material.ARROW, 8);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Arrow");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Arrow = item;
    }



    public static void createJumpBoost()
    {
        ItemStack item = new ItemStack(Material.POTION, 1);

        new PotionEffect(PotionEffectType.JUMP,Integer.MAX_VALUE,900);



        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Jump Boost");
        List<String> lore = new ArrayList<>();
        item.setItemMeta(meta);
        Jump = item;
    }
}


