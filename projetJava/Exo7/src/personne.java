public class personne {
    // Variables d'instance
    protected String nom;
    protected LocalDate dateNaissance;
    protected double taille;
    public personne(String nom, LocalDate dateNaissance, double taille) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.taille = taille;
    }
    public void afficherInformations() {
        System.out.println("Nom: " + nom);
        System.out.println("Date de Naissance: " + dateNaissance);
        System.out.println("Taille: " + taille);
    }
}
