
public class Bibliotheque {

    // Liste des livres de la bibliothèque
    private List<Livre> livres = new ArrayList<>();

    // Méthode pour ajouter un livre à la bibliothèque
    public void ajouterLivre(Livre livre) throws IllegalArgumentException {
        if (livre == null) {
            throw new IllegalArgumentException("Le livre ne peut pas être null");
        }
        livres.add(livre);
    }

    // Méthode pour afficher les détails de tous les livres
    public void afficherLivres() {
        if (livres.isEmpty()) {
            System.out.println("La bibliothèque est vide");
        } else {
            for (Livre livre : livres) {
                livre.afficherDetails();
                System.out.println();
            }
        }
    }

    // Méthode pour rechercher un livre par son auteur
    public List<Livre> rechercherLivreParAuteur(String auteur) {
        List<Livre> livresTrouves = new ArrayList<>();
        for (Livre livre : livres) {
            if (livre.getAuteur().equals(auteur)) {
                livresTrouves.add(livre);
            }
        }
        return livresTrouves;
    }
}
