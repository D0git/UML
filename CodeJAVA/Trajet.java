
import java.util.*;

/**
 * 
 */
public class Trajet {

    /**
     * Default constructor
     */


    public Trajet(String pointDepart, String pointArrive, float prix) {
        PointDepart = pointDepart;
        PointArrive = pointArrive;
        Prix = prix;
        NumTr=c++;
    }

    /**
     * 
     */
    private static int c=0;
    private int NumTr;

    /**
     * 
     */
    public String PointDepart;

    public String Statut;
    /**
     * 
     */
    public String PointArrive;

    /**
     * 
     */
    public float Prix;

    /**
     * 
     */
    public String getPointDepart() {
        return PointDepart;
    }

    public void setPointDepart(String pointDepart) {
        PointDepart = pointDepart;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(String statut) {
        Statut = statut;
    }

    public String getPointArrive() {
        return PointArrive;
    }

    public void setPointArrive(String pointArrive) {
        PointArrive = pointArrive;
    }

    public float getPrix() {
        return Prix;
    }

    public void setPrix(float prix) {
        Prix = prix;
    }
}