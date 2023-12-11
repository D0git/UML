
import java.util.*;

/**
 * 
 */
public class Conducteur extends Personne {

    /**
     * Default constructor
     */
    private int id;
    private static int c=0;
    public Conducteur() {
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


    public void ConsulterProfil() {

        System.out.println(super.toString());
    }

    /**
     * @return
     */
    public void ModifierProfil(String nom,String prenom,String email,String tel,String login,String pwd) {
        if (!Objects.equals(nom, ""))super.setNom(nom);
        if (!Objects.equals(email, ""))super.setEmail(email);
        if (!Objects.equals(login, ""))super.setLogin(login);
        if (!Objects.equals(pwd, ""))super.setPwd(pwd);
        if (!Objects.equals(tel, ""))super.setTel(tel);
        if (!Objects.equals(prenom, ""))super.setPrenom(prenom);

    }


    public void SupprimerProfil(String login ,String pwd) {
        /**
         * delete from table Personne in database where Login=login & Pwd=pwd
         */
    }


    public void SuivreLocalisationCl() {
        // TODO implement here

    }


    public void AccepterDemande(Reservation reservation) {
        // TODO implement here
        reservation.setStatut(true);
    }

    /**
     * @return
     */
    public void RefuserDemande(int numRes) {
        /**
         * delete from table Reservation where NumRes=numRes
         */

    }

    /**
     * @return
     */
    public void PasserReclamation(String objet,String sujet) {
        // TODO implement here
        Reclamation reclamation= new Reclamation(objet,sujet);
        /**
         * insert reclamation in table Reclamation in database
         */
    }

    public void AjouterTrajet(String depart,String arrivee,float prix){

        Trajet trajet=new Trajet(depart,arrivee,prix);
        /**
         * insert trajet in table Trajet
         */
    }

    public void ModifierTrajet(String depart,String arrivee,float prix,int numTr){

        /**
         * update table Trajet set PointDepart=depart, PointArrivee=arrivee, Prix=prix where NumTr=numTr
         */
    }

    public void AjouterVehicule(int matricule, String modele, String serie, int nbrplace, String couleur){

        Vehicule vehicule=new Vehicule(matricule, modele, serie, nbrplace, couleur);
        /**
         * insert vehicule in table Vehicule
         */
    }
    public void ModifierVehicule(int matricule, String modele, String serie, int nbrplace, String couleur,int numTr){

        /**
         * update table Vehicule set Modele=modele, Serie=serie, NbrPlace=nbrplace, Couleur=couleur where Matricule=matricule
         */
    }
    public void SupprimerTrajet(int numTr) {
        /**
         * delete from table Trajet in database where NumTr=numTr
         */
    }
    public void SupprimerVehicule(int matricule) {
        /**
         * delete from table Vehicule in database where Matricule=matricule
         */
    }
}