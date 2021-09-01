package Event;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventListener implements Listener {

    @EventHandler
    public void onUtilityUse(PlayerInteractEvent e) {
        if (!e.getAction().equals(Action.RIGHT_CLICK_AIR) || !e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) { return; }
        else if (e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.EMERALD)) {

        }
    }

    @EventHandler
    public void onWeaponFire(PlayerInteractEvent e) {
        if (!e.getAction().equals(Action.RIGHT_CLICK_BLOCK) || !e.getAction().equals(Action.RIGHT_CLICK_AIR))
    }
}
