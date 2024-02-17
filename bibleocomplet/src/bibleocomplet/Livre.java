
public class Livre {

    // Attributs du livre
    private String titre; // Le titre du livre
    private String auteur; // Le nom de l'auteur du livre
    private int anneePublication; // L'année de publication du livre

    // Constructeur du livre
    public Livre(String titre, String auteur, int anneePublication) throws IllegalArgumentException {
        // Validation des attributs
        if (titre == null || titre.isEmpty()) {
            throw new IllegalArgumentException("Le titre du livre ne peut pas être vide");
        }
        if (auteur == null || auteur.isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'auteur ne peut pas être vide");
        }
        if (anneePublication < 0) {
            throw new IllegalArgumentException("L'année de publication ne peut pas être négative");
        }

        // Initialisation des attributs
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    // Accesseurs aux attributs
    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    // Méthode pour afficher les détails du livre
    public void afficherDetails() {
        System.out.println("The Titre is: " + titre);
        System.out.println("The Auteur is: " + auteur);
        System.out.println("Année de publication : " + anneePublication);
    }
}
