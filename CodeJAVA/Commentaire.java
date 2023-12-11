public class Commentaire {
    private int id;
    private String text;

    private static int c=0;
    public Commentaire(String text) {
        this.text = text;
        this.id=c++;
    }
}
