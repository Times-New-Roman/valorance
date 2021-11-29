package Valorance;

import Event.EventListener;
import Managers.Player.AgentManager;
import Managers.Player.EffectManager;
import Managers.Weapon.DamageManager;
import Managers.Weapon.WeaponManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Valorance extends JavaPlugin {

    private static Valorance pl;
    public static Valorance  getPlugin() {return pl;}
    private AgentManager agentManager;
    private WeaponManager weaponManager;
    private EffectManager effectManager;
    private DamageManager damageManager;

    public void onEnable() {
        pl = this;
        this.agentManager = new AgentManager();
        this.weaponManager = new WeaponManager();
        this.effectManager = new EffectManager();
        this.damageManager = new DamageManager();
        pl.getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    public AgentManager getAgentManager() {
        return agentManager;
    }

    public WeaponManager getWeaponManager() { return weaponManager; }

    public EffectManager getEffectManager() { return effectManager; }

    public DamageManager getDamageManager() { return damageManager; }
}