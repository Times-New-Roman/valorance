package Valorance;

import Event.EventListener;
import Managers.Player.AgentManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Valorance extends JavaPlugin {

    private static Valorance pl;
    public static Valorance  getPlugin() {return pl;}
    private AgentManager agentManager;

    public void onEnable() {
        pl = this;
        this.agentManager = new AgentManager();
        pl.getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    public AgentManager getAgentManager() {
        return agentManager;
    }
}