package server.Bedwars;

import org.bukkit.plugin.java.JavaPlugin;
import server.Bedwars.Shop.ClickedOnNPC;
import server.Bedwars.Shop.NPC;
import server.Bedwars.commands.Commands;
import server.Bedwars.events.PlayerEvents;
import server.Bedwars.items.ItemManager;
import server.Bedwars.listeners.InventoryClickListener;
import server.Bedwars.ui.*;

public final class me extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new PlayerEvents(),this);
        getServer().getPluginManager().registerEvents( new ItemManager(),this);
        getServer().getPluginManager().registerEvents( new NPC(),this);
        getServer().getPluginManager().registerEvents( new ClickedOnNPC(),this);
        ItemManager.init();
        getCommand("GiveItems").setExecutor(new Commands());
        getCommand("Shop").setExecutor(new Commands());
        new InventoryClickListener(this);
        ShopUI.initialise();
        BlocksUI.initialise();
        SwordUI.initialise();
        ArmorsUI.initialise();
        ToolsUI.initialise();
        BowUI.initialise();
        BrewingUI.initialise();
        SpecialUI.initialise();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
