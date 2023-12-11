
import java.util.*;

/**
 * 
 */
public class Vehicule {

    /**
     * Default constructor
     */
    public Vehicule() {
    }

    public Vehicule(int matricule, String modele, String serie, int nbrplace, String couleur) {
        Matricule = matricule;
        Modele = modele;
        Serie = serie;
        Nbrplace = nbrplace;
        Couleur = couleur;
    }

    /**
     * 
     */
    private int Matricule;

    /**
     * 
     */
    private String Modele;

    /**
     * 
     */
    private String Serie;

    /**
     * 
     */
    private int Nbrplace;

    /**
     * 
     */
    private String Couleur;

}