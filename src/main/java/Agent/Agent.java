package Agent;

import Agent.Utility.Utility;
import Agent.Utility.UtilityType;
import Gun.Gun;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public interface Agent {

    Player getPlayer();

    String getName();

    String[] getLore();

    Utility getUtility(UtilityType type);

    int getHealth();

    int getMaxHealth();

    void setHealth();

    void setMaxHealth();

    Gun getWeapon();

}