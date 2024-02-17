
public class Main {

    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        // Ajout deslivres à la bibliothèque
        try {
            bibliotheque.ajouterLivre(new Livre("Black night", "jeo Coelho", 2000));
            bibliotheque.ajouterLivre(new Livre("National geagraphic", "josif lotik", 1943));
        } catch (IllegalArgumentException e) {
            System.err.println("Erreur lors de l'ajout d'un livre : " + e.getMessage());
        }

        // Affichage de tous les livres
        System.out.println("Tous les livres :");
        bibliotheque.afficherLivres();

        // Recherche d'un livre par auteur
        System.out.println("Recherche par auteur : ");
        List<Livre> livresTrouves = bibliotheque.rechercherLivreParAuteur("jeo Coelho");
        if (livresTrouves.isEmpty()) {
            System.out.println("Aucun livre trouvé pour l'auteur");
        } else {
            for (Livre livre : livresTrouves) {
                livre.afficherDetails();
                System.out.println();
            }
        }
    }
}
