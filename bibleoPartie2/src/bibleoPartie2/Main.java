
public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        Livre livre1 = new Livre("algorithm avance", "hajar", 2000);
        bibliotheque.ajouterLivre(livre1);

        bibliotheque.afficherLivres();
    }
}
