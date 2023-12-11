
import java.util.*;

/**
 * 
 */
public class Admin extends Personne {

    private int id;
    private static int c=0;
    public Admin(String nom,String prenom,String email,String tel,String login,String pwd) {
        super(nom,prenom,email,tel,login,pwd);
        this.id=c++;
    }


    public void ConfirmerReclamation() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void RefuserReclamation() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void EnregistrerPaiement() {


    }

    /**
     * @return
     */
    public void ConsulterCommentaire() {
        // TODO implement here

    }

    /**
     * @return
     */
    public void ReponderCommentaire() {
        // TODO implement here

    }

}