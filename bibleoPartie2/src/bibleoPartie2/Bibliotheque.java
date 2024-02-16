

public class Bibliotheque {
    private List<Livre> listeDeLivres;

    public Bibliotheque() {
        this.listeDeLivres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        listeDeLivres.add(livre);
    }

    public void afficherLivres() {
        if (listeDeLivres.isEmpty()) {
            System.out.println("La bibliothèque est vide.");
        } else {
            System.out.println("Livres disponibles dans la bibliothèque :");
            for (Livre livre : listeDeLivres) {
                livre.afficherDetails();
            }
        }
    }
}
