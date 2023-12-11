
import java.util.*;

/**
 * 
 */
public class Reservation {



    public Reservation(float montant, java.util.Date date) {
        Montant = montant;
        Date = date;
        EtatPaiement = false;
        this.NumRes=c++;
        Statut=false;
    }

    /**
     * 
     */
    private static int c=0;
    private int NumRes;

    /**
     * 
     */
    public float Montant;

    /**
     * 
     */
    private Date Date;

    public Boolean getEtatPaiement() {
        return EtatPaiement;
    }

    public void setEtatPaiement(Boolean etatPaiement) {
        EtatPaiement = etatPaiement;
    }

    public boolean getStatut() {
        return Statut;
    }

    public float getMontant() {
        return Montant;
    }

    public void setMontant(float montant) {
        Montant = montant;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public void setStatut(boolean statut) {
        Statut = statut;
    }

    /**
     * 
     */
    public boolean EtatPaiement;
    private boolean Statut;
}