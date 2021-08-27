package Agent;

import Agent.Utility.Utility;
import Agent.Utility.UtilityType;
import Gun.Gun;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.List;

public interface Agent {

    Player getPlayer();

    String getName();

    List<String> getLore();

    Utility getUtility(UtilityType type);

    int getHealth();

    int getMaxHealth();

    void setHealth(int i);

    void setMaxHealth(int i);
}

