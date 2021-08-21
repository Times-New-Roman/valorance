package Agent.Utility;

import java.util.Collection;

public abstract class Utility {


    // ALL utility falls into one of the four categories below.

    abstract class Signature {

        // Returns the name
        abstract String getName();

        // Returns the type
        abstract UtilityType getType();

        // Returns the lore
        abstract String[] getLore();

        // Returns the CURRENT amount of charges
        abstract short getCharges();

        // Called when the player uses this utility
        abstract void use();

    }

}