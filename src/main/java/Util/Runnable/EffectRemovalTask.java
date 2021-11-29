package Util.Runnable;

import Managers.Player.EffectManager;
import org.bukkit.scheduler.BukkitRunnable;

import static Valorance.Valorance.getPlugin;

public class EffectRemovalTask extends BukkitRunnable {

    public EffectRemovalTask(String player, EffectManager.Effect effectType) {
        this.player = player;
        this.effectType = effectType;
    }
    private final String player;
    private final EffectManager.Effect effectType;
    private EffectManager effectManager = getPlugin().getEffectManager();
    @Override
    public void run() {
        for (EffectManager.GenericEffect effect : effectManager.getEffects(player)) {
            if ( effect.getType() == effectType) {
                effectManager.removeEffect()
            }
        }
    }
}
