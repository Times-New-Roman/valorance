package Agent;

import Agent.Utility.Utility;
import Agent.Utility.UtilityType;
import org.bukkit.entity.Player;

import java.lang.reflect.Method;
import java.util.List;
import static java.util.Arrays.asList;
import static java.util.Arrays.compare;

public class Vladimir implements Agent {

    public Vladimir(Player p) {
        this.player = p;
        this.scanArrow = new ScanArrow(2);
        this.shockArrow = new ShockArrow(2);
        this.reconDrone = new ReconDrone(1);
        this.shockBeam = new ShockBeam();
    }

    private final String name = "Vladimir";
    private final Player player;
    private final List<String> lore = asList("Born from the unforgiving Russian",
            "tundras and known only as Vladimir",
            "comes this mysterious hunter. With",
            "laser-like precision, Vladimir's",
            "useful assortment of arrows and",
            "equipment give him precise control",
            "and manipulation of the smallest",
            "angles in battle.");
    private final ScanArrow scanArrow;
    private final ShockArrow shockArrow;
    private final ReconDrone reconDrone;
    private final ShockBeam shockBeam;
    private int health;
    private int maxHealth;

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
            case ABILITY1 -> shockArrow;
            case ABILITY2 -> reconDrone;
            case SIGNATURE -> scanArrow;
            case ULTIMATE -> shockBeam;
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
        health =i;
    }

    @Override
    public void setMaxHealth(int i) {
        maxHealth = i;
    }

    class ScanArrow implements Utility {
        private ScanArrow(int i) {
            this.charges = i;
        }
        private final String name = "Scan Arrow";
        private final List<String> lore = asList("EQUIP Vladimir's bow and arrow.",
                "FIRE the bow to launch an arrow,",
                "upon landing it will reveal any",
                "player which is in its line of",
                "sight, allowing everyone to see",
                "them through walls.");
        private int charges;

        @Override
        public String getName() {
            return null;
        }

        @Override
        public List<String> getLore() {
            return null;
        }

        @Override
        public int getCharges() {
            return 0;
        }

        @Override
        public void use() {
            //TODO: code to run on use of scan arrow
        }
    }

    class ShockArrow implements Utility {
        private ShockArrow(int i) {
            this.charges = i;
        }
        private final String name = "Shock Arrow";
        private final List<String> lore = asList("EQUIP Vladimir's bow and arrow.",
                "FIRE the bow to launch an arrow,",
                "upon landing it will deal 90",
                "damage in an area around where",
                "it hit.");
        private int charges;

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
            //TODO: code to run on use of shock arrow
        }
    }

    class ReconDrone implements Utility {

        private ReconDrone(int i) {
            this.charges = i;
        }

        private final String name = "Recon Drone";
        private final List<String> lore = asList("EQUIP a recon drone. FIRE to",
                "launch it, taking control of",
                "it and allowing you to control",
                "it by looking around.");
        private int charges;

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
            //TODO: code to run on use of recon drone
        }
    }

    class ShockBeam implements Utility {

        private ShockBeam() {
        }

        private final String name = "Shock Beam";
        private final List<String> lore = asList("EQUIP Vladimir's super bow.",
                "FIRE to shoot a shock beam, which",
                "will go through walls and hit any",
                "player in its path for 90 damage,",
                "as well as revealing them for 1",
                "second.");

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
            return 7;
        }

        @Override
        public void use() {
            //TODO: code to run on use of shock beam
        }
    }
}