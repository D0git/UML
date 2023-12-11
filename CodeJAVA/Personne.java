
import java.util.*;


public class Personne {

    private static int c=0;

    private int Id;

    private String Nom;


    private String Prenom;


    private String Email;


    private String Tel;


    private String Login;


    private String Pwd;

    public Personne() {
        this.Id=c++;
    }

    public Personne(String nom, String prenom, String email, String tel, String login, String pwd) {
        this.Email=email;
        this.Id=c++;
        this.Login=login;
        this.Nom=nom;
        this.Prenom=prenom;
        this.Tel=tel;
        this.Pwd=pwd;
    }
    public boolean Sauthentifier(String login,String pwd) {
        return Objects.equals(this.Login, login) && Objects.equals(this.Pwd, pwd);
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getPwd() {
        return Pwd;
    }



    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Information:\n" +
                "Nom : " + Nom + '\t' +
                "Prenom : " + Prenom + '\n' +
                "Email : " + Email + '\t' +
                "Tel : " + Tel + '\n' +
                "Login : " + Login + '\t' +
                "Pwd : " + Pwd.hashCode();
    }
}