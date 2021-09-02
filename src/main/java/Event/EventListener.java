package Event;

import Agent.Utility.UtilityType;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import Valorance.Valorance;

public class EventListener implements Listener {

    @EventHandler
    public void onUtilityUse(PlayerInteractEvent e) {
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


            Valorance.getPlugin().getAgentManager().getPlayerAgent(e.getPlayer()).getUtility(type).use();
        }
    }

    @EventHandler
    public void onWeaponFire(PlayerInteractEvent e) {
        if (!e.getAction().equals(Action.RIGHT_CLICK_BLOCK) || !e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            //TODO: Add gunfire stuff here
        }
    }
}
