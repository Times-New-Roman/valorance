package Gun;

import java.util.List;

public interface Gun {

    public int getDamage();

    public int getHeadshotDamage();

    public void setDamage();

    public void setHeadshotDamage();

    public default boolean canScope() {
        return false;
    }

    public default boolean canAimDownSights() {
        return true;
    }

    public default String getName() {
        return "Gun";
    }

    public List<String> getLore();


}
