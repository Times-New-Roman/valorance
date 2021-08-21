package Agent;

import Agent.Utility.Utility;
import Agent.Utility.UtilityType;
import Gun.Gun;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public abstract class Agent {

    public abstract Player getPlayer();

    public abstract String getName();

    public abstract String[] getLore();

    public abstract Utility getUtility(UtilityType type);

    public abstract int getHealth();

    public abstract int getMaxHealth();

    public abstract void setHealth();

    public abstract void setMaxHealth();

    public abstract void getWeapon();
}

