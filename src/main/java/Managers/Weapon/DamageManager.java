package Managers.Weapon;

import Gun.Gun;
import Managers.Player.EffectManager;
import org.bukkit.entity.Player;
import java.util.HashMap;
import static Valorance.Valorance.getPlugin;

public class DamageManager {

    private HashMap<String, HashMap<String, Integer>> damageHistory = new HashMap<>();

    public int calculateDamage(Gun gun, Player damager, Player hit, boolean headshot) {
        float damage;
        if (headshot) {
            damage = gun.getHeadshotDamage();
        }
        else {
            damage = gun.getDamage();
        }
        if (getPlugin().getEffectManager().hasEffect(damager, EffectManager.Effect.DAMAGE_BUFF)) {
            damage = damage * 1.5f;
        }
        if (getPlugin().getEffectManager().hasEffect(hit, EffectManager.Effect.WEAKNESS)) {
            damage = damage * 2f;
        }
        int finalDamage = Math.round(damage);
        logDamage(damager, hit, finalDamage);
        return finalDamage;
    }

    public HashMap<String, Integer> getDamageHistory(Player p) {
        String name = p.getName();
        if (damageHistory.containsKey(name)) {
            return damageHistory.get(name);
        }
        else return null;
    }

    public void logDamage(Player p, Player hit, int damage) {
        String name = p.getName();
        String hitName = hit.getName();

        if(!damageHistory.containsKey(name)) {
            damageHistory.put(name, new HashMap<>());
            damageHistory.get(name).put(hitName, damage);
        }
        else {
            int oldDamage = damageHistory.get(name).get(hitName);
            int newDamage = oldDamage + damage;
            damageHistory.get(name).replace(hitName, newDamage);
        }
    }
}