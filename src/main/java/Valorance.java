import org.bukkit.plugin.java.JavaPlugin;

public class Valorance extends JavaPlugin {

    private static Valorance pl;
    public static Valorance getPlugin() {return pl;}

    public void onEnable() {
        pl = this;
        //TODO: Add event registration
    }

    public static void main(String[] args) {
        //Entry point for CLI tests
    }
}