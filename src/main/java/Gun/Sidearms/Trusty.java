package Gun.Sidearms;

import Gun.Gun;
import java.util.List;

public class Trusty implements Gun, Sidearm {
    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public int getHeadshotDamage() {
        return 0;
    }

    @Override
    public void setDamage() {

    }

    @Override
    public void setHeadshotDamage() {

    }

    @Override
    public List<String> getLore() {
        return null;
    }
    //TODO: Finish implemenatation
}
