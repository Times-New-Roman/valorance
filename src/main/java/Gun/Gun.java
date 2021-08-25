package Gun;

import java.util.List;

public interface Gun {

    int getDamage();

    int getHeadshotDamage();

    void setDamage();

    void setHeadshotDamage();

    default boolean canScope() {
        return false;
    }

    default boolean canAimDownSights() {
        return true;
    }

    default String getName() {
        return "Gun";
    }

    List<String> getLore();



}
