
import java.util.*;

/**
 * 
 */
public class Reclamation {

    /**
     * Default constructor
     */

    private static int c=0;
    public Reclamation(String objet,String description) {
        this.NumRecl=c++;
        this.Objet=objet;
        this.Description=description;
    }

    public String getDescription() {
        return Description;
    }

    public String getObjet() {
        return Objet;
    }

    /**
     * 
     */
    private int NumRecl;

    /**
     * 
     */
    public String Description;
    public String Objet;

}