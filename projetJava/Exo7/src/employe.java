public class employe extends Personne {
    private double salaire;
    private String poste;

    public employe(String nom, LocalDate dateNaissance, double taille, double salaire, String poste) {
        super(nom, dateNaissance, taille);
        this.salaire = salaire;
        this.poste = poste;
    }

    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("Salaire: " + salaire);
        System.out.println("Poste: " + poste);
    }
}
