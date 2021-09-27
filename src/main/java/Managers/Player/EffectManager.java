package Managers.Player;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.HashMap;
import java.util.List;

import static Valorance.Valorance.getPlugin;

public class EffectManager {
    public enum Effect {
        BLINDNESS,
        COMBAT_STIM,
        DAMAGE_BUFF,
        DECAY,
        NEARSIGHT,
        REGENERATION,
        SLOWNESS,
        SPEED,
        WEAKNESS,
        DETAINED,
        CANCELLED
    }

    private HashMap<String, List<GenericEffect>> effectStorage = new HashMap<>();

    public void addEffect(Effect e, long time, Player p) {

        GenericEffect effect;

        switch ( e ) {
            case BLINDNESS: {
                effect = new Blindness();
            }
            break;
            case COMBAT_STIM: {
                effect = new CombatStim();
            }
            break;
            case DAMAGE_BUFF: {
                effect = new DamageBuff();
            }
            break;
            case DECAY: {
                effect = new Decay();
            }
            break;
            case NEARSIGHT: {
                effect = new Nearsight();
            }
            break;
            case REGENERATION: {
                effect = new Regeneration();
            }
            break;
            case SLOWNESS: {
                effect = new Slowness();
            }
            break;
            case SPEED: {
                effect = new Speed();
            }
            break;
            case WEAKNESS: {
                effect = new Weakness();
            }
            break;
            case DETAINED: {
                effect = new Detained();
            }
            break;
            case CANCELLED: {
                effect = new Cancelled();
            }
            break;
            default: {
                effect = null;
            }
            break;

        }

        effect.apply(p, time);

        if (!effectStorage.containsKey(p.getName())) {
            effectStorage.put(p.getName(), new List<GenericEffect>);
        }
            effectStorage.get(p.getName()).add(effect);
    }

    public boolean hasEffect(Player p, Effect e) {
        for ( GenericEffect effect : effectStorage.get(p.getName()) ) {
            if (effect.getType() == e) {
                return true;
            }
            else continue;
        }
        return false;
    }

    public List<GenericEffect> getEffects(String s) {
        if (!effectStorage.containsKey(s)) {
            return effectStorage.get(s);
        }


        else return null;
    }

    public interface GenericEffect {
        void apply(Player p, long time);
        String getName();
        Effect getType();
    }

    class Blindness implements GenericEffect {

        private final String name = "Blindness";
        private final Effect type = Effect.BLINDNESS;

        @Override
        public void apply(Player p, long time) {
            //TODO: Implement blindness functionality
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Effect getType() {
            return type;
        }
    }

    class CombatStim implements GenericEffect {

        private final String name = "Combat Stim";
        private final Effect type = Effect.COMBAT_STIM;

        @Override
        public void apply(Player p, long time) {
            //TODO: Implement combat stim functionality
        }

        @Override
        public String getName() {
            return name;
        }
        @Override
        public Effect getType() {
            return type;
        }
    }

    class DamageBuff implements GenericEffect {

        private final String name = "Damage Buff";
        private final Effect type = Effect.DAMAGE_BUFF;

        @Override
        public void apply(Player p, long time) {
            //TODO: Implement damage buff functionality
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Effect getType() {
            return type;
        }
    }

    class Decay implements GenericEffect {

        private final String name = "Decay";
        private final Effect type = Effect.DECAY;

        @Override
        public void apply(Player p, long time) {
            //TODO: Implement decay functionality
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Effect getType() {
            return type;
        }
    }

    class Nearsight implements GenericEffect {

        private final String name = "Nearsight";
        private final Effect type = Effect.NEARSIGHT;

        @Override
        public void apply(Player p, long time) {
            //TODO: Add nearsight functionality
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Effect getType() {
            return type;
        }


    }

    class Regeneration implements GenericEffect {

        private final String name = "Healing";
        private final Effect type = Effect.REGENERATION;

        @Override
        public void apply(Player p, long time) {
            //TODO: Implement heal functionality
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Effect getType() {
            return type;
        }
    }

    class Slowness implements GenericEffect {

        private final String name = "Slowness";
        private final Effect type = Effect.SLOWNESS;

        @Override
        public void apply(Player p, long time) {
            //TODO: Implement slowness
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Effect getType() {
            return type;
        }
    }

    class Speed implements GenericEffect {

        private final String name = "Speed Boost";
        private final Effect type = Effect.SPEED;

        @Override
        public void apply(Player p, long time) {
            //TODO: Implement speed boost
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Effect getType() {
            return type;
        }
    }

    class Weakness implements GenericEffect {

        private final String name = "Weakness";
        private final Effect type = Effect.WEAKNESS;

        @Override
        public void apply(Player p, long time) {
            //TODO: Implement weakness
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Effect getType() {
            return type;
        }
    }

    class Detained implements GenericEffect {

        private final String name = "Detained";
        private final Effect type = Effect.DETAINED;

        @Override
        public void apply(Player p, long time) {
            //TODO: Implement detainment with Lockdown's ability
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Effect getType() {
            return type;
        }
    }

    class Cancelled implements GenericEffect {

        private final String name = "Cancelled";
        private final Effect type = Effect.CANCELLED;

        @Override
        public void apply(Player p, long time) {
            //TODO: Implement utility cancellation
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Effect getType() {
            return type;
        }
    }

}
