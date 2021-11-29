package Event;

import Agent.Utility.UtilityType;
import Gun.Gun;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

import static Valorance.Valorance.getPlugin;

public class EventListener implements Listener {

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent e) {
        if (true /* need to add logic. this will call back to the individual methods below instead of having multiple listeners.*/) {
            utilityUse(e);
        }
        else {
            weaponFire(e);
        }
    }
    public void utilityUse(PlayerInteractEvent e) {
        if (!e.getAction().equals(Action.RIGHT_CLICK_AIR) || !e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) return;

        else if (e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.EMERALD)) {

            UtilityType type;

            switch (e.getPlayer().getInventory().getHeldItemSlot()) {
                case 0 -> type = UtilityType.ABILITY1;
                case 1 -> type = UtilityType.ABILITY2;
                case 2 -> type = UtilityType.SIGNATURE;
                case 3 -> type = UtilityType.ULTIMATE;
                default -> throw new IllegalArgumentException(
                        "The plugin cannot tell what utility to use if it isn't in slot 1, 2, or 3 of the hotbar."
                );
            }


            getPlugin().getAgentManager().getPlayerAgent(e.getPlayer()).getUtility(type).use();
        }
    }

    public void weaponFire(PlayerInteractEvent e) {
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {

            Vector v = e.getPlayer().getLocation().getDirection();
            double x = v.getX() * 5.00d;
            double y = v.getY() * 5.00d;
            double z = v.getZ() * 5.00d;

            v.setX(x);
            v.setY(y);
            v.setZ(z);
            e.getPlayer().launchProjectile(Snowball.class, v);
        }
    }
}
