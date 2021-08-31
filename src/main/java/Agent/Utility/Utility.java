package Agent.Utility;

import java.util.List;

public interface Utility {

    String getName();

    List<String> getLore();

    int getCharges();

    void use();

    int getModelID();
}