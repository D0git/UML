public class Evaluation {
    private int id;
    private int nbrEtoile;

    private static int c=0;
    public Evaluation(int nbrEtoile) {
        this.nbrEtoile = nbrEtoile;
        this.id=c++;
    }
}
