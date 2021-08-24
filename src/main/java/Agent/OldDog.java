package Agent;

import Agent.Utility.Utility;
import Agent.Utility.UtilityType;
import org.bukkit.entity.Player;
import static java.util.Arrays.asList;
import java.util.List;

public class OldDog implements Agent {

    public OldDog(Player p) {
        this.player = p;
        this.orbitalSmoke = new OrbitalSmoke(3);
        this.stimBeacon = new StimBeacon(2);
        this.incendiary = new Incendiary(1);
        this.laserStrike = new LaserStrike();
    }
    private final String name = "Old Dog";
    private final Player player;
    private final List<String> lore = asList(
            "The battle-hardened American",
            "general, George 'Old-Dog' Stevens",
            "is known on and off the field as",
            "a tactical powerhouse. Using",
            "his arsenal of readily available",
            "battlefield ordinances, he gives",
            "his team the on-the-fly advantage",
            "in almost any situation.");
    private final StimBeacon stimBeacon;
    private final OrbitalSmoke orbitalSmoke;
    private final Incendiary incendiary;
    private final LaserStrike laserStrike;
    private int maxHealth = 150;
    private int health = 100;

    @Override
    public Player getPlayer() {
        return player;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getLore() {
        return lore;
    }

    @Override
    public Utility getUtility(UtilityType type) {
        return switch (type) {
            case ABILITY1 -> stimBeacon;
            case ABILITY2 -> incendiary;
            case SIGNATURE -> orbitalSmoke;
            case ULTIMATE -> laserStrike;
            default -> null;
        };
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getMaxHealth() {
        return maxHealth;
    }

    @Override
    public void setHealth(int i) {
        health = i;
    }

    @Override
    public void setMaxHealth(int i) {
        maxHealth = i;
    }

    //Utility Subclasses

    class StimBeacon implements Utility {

        private StimBeacon(int s) {
            this.charges = s;
        }

        private int charges;
        private final String name = "Stim Beacon";
        private final List<String> lore = asList(
                "PLACE to deploy a portable",
                "stim beacon. When placed, the",
                "device will increase the fire",
                "rate and movement speed of any",
                "friendlies in range. Lasts 15",
                "seconds."
        );

        @Override
        public String getName() {
            return name;
        }

        @Override
        public List<String> getLore() {
            return lore;
        }

        @Override
        public int getCharges() {
            return charges;
        }

        @Override
        public void use() {
            //TODO: code to run on use of stim beacon
        }
    }

    class Incendiary implements Utility {

        private Incendiary(int s) {
            this.charges = s;
        }

        private int charges;
        private final String name = "Stim Beacon";
        private final List<String> lore = asList(
                "EQUIP a handheld grenade launcher.",
                "Use to launch an incendiary",
                "projectile, which will set alight",
                "the area around it upon landing.",
                "Lasts 10 seconds."
        );

        @Override
        public String getName() {
            return name;
        }

        @Override
        public List<String> getLore() {
            return lore;
        }

        @Override
        public int getCharges() {
            return charges;
        }

        @Override
        public void use() {
            //TODO: code to run on use of incendiary
        }
    }

    class OrbitalSmoke implements Utility {

        private OrbitalSmoke(int s) {
            this.charges = s;
        }

        private int charges;
        private final String name = "Orbital Smoke";
        private final List<String> lore = asList(
                "EQUIP a signal flare. FIRE to throw",
                "it"
        );

        @Override
        public String getName() {
            return name;
        }

        @Override
        public List<String> getLore() {
            return lore;
        }

        @Override
        public int getCharges() {
            return charges;
        }

        @Override
        public void use() {
            //TODO: code to run on use of orbital smoke
        }
    }

    class LaserStrike implements Utility {

        private LaserStrike() {

        }

        private int charges;
        private final String name = "Laser Strike";
        private final List<String> lore = asList(
                "EQUIP a homing beacon. USE to",
                "throw the beacon. When it lands,",
                "an orbital laser strike will be",
                "launched at that location, dealing",
                "massive Area of Effect damage to",
                "anyone caught in the blast."
        );

        @Override
        public String getName() {
            return name;
        }

        @Override
        public List<String> getLore() {
            return lore;
        }

        @Override
        public int getCharges() {
            return 1;
        }

        @Override
        public void use() {
            //TODO: code to run on use of laser strike
        }
    }
}