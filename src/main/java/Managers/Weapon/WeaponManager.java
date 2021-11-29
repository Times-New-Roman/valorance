package Managers.Weapon;

import Gun.Gun;
import Gun.Sidearms.Sidearm;
import org.bukkit.entity.Player;

import java.util.HashMap;

public class WeaponManager {

    private HashMap<String, Gun> primaryWeaponStorage = new HashMap<>();

    private HashMap<String, Sidearm> secondaryWeaponStorage = new HashMap<>();

    public void setSecondary(Sidearm sidearm) {
        
    }

    public void setPrimary(Gun gun) {

    }
    public Gun getPrimary(Player p) {
        return primaryWeaponStorage.get(p.getName());
    }

    public Sidearm getSecondary(Player p) {
        return secondaryWeaponStorage.get(p.getName());
    }
}
