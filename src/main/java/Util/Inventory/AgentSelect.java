package Util.Inventory;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class AgentSelect {
    public static Inventory createAgentSelectMenu() {

        Inventory inventory = Bukkit.createInventory(null, 54, ChatColor.BLUE + "Agent Selection");
        List<ItemStack> slots;

        return inventory;
    }
}
