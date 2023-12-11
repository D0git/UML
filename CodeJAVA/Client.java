
import java.util.*;

/**
 * 
 */
public class Client extends Personne {

    /**
     * Default constructor
     */
    private int id;
    private static int c=0;
    public Client() {
        super();
        this.id=c++;
    }


    public void Sinscrire(String nom,String prenom,String email,String tel,String login,String pwd) {
        super.setEmail(email);
        super.setNom(nom);
        super.setLogin(login);
        super.setPwd(pwd);
        super.setPrenom(prenom);
        super.setTel(tel);

    }

    /**
     * @return
     */
    public void ChercherTrajet(String depart, String arrivee,float prix) {
        /**
         * select * from Trajet where PointDepart=depart and PointArrivee=arrivee and Prix=prix
         */
    }


    public void ReserverTrajet(float montant ,java.util.Date date) {

        Reservation reservation=new Reservation(montant, date);
    }

    /**
     * @return
     */
    public void ModifierReservation(int numRes,float montant ,java.util.Date date) {
        /**
         * update table Reservation set Montant=montant, Date=date where NumRes=numRes
         */
    }

    /**
     * @return
     */
    public void AnnulerReservation(int numRes) {
        /**
         * delete from table Reservation where NumRes=numRes
         */
    }

    /**
     * @return
     */
    public String SuivreTrajet(Trajet trajet) {
        // TODO implement here
        return trajet.getStatut();
    }

    /**
     * @return
     */
    public void Evaluer(int nbrEtoile) {
        // TODO implement here

        Evaluation evaluation=new Evaluation(nbrEtoile);
        /**
         * insert into table Evaluation evaluation
         */
    }

    /**
     * @return
     */
    public void Commenter(String text) {
        // TODO implement here

        Commentaire commentaire=new Commentaire(text);
        /**
         * insert into table Commentaire commentaire
         */
    }

    /**
     * @return
     */
    public void Payer(Reservation reservation) {
        // TODO implement here
        reservation.setEtatPaiement(true);
    }

}