class ProfesseurImpl extends Personne implements Professeur {

    String specialite;

    public ProfesseurImpl(String nom, String prenom, int anneeNaissance, String email, String... specialites) {
        super(nom, prenom, anneeNaissance, email);
        for (String s: specialites) {
            this.specialite = genererSpecialite(s);
        }
    }
    public void enseigner() {
        System.out.println("Le professeur " + prenom + " " + nom + " enseigne.");
    }
    public void corrigerExamen() {
        System.out.println("Le professeur " + prenom + " " + nom + " corrige un examen.");
    }
    public String toString() {
        return super.toString() + " Professeur [specialite=" + specialite + "]";
    }
}