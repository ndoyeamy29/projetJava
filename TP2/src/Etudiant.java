class EtudiantImpl extends Personne implements Etudiant {
    String numeroEtudiant;
    Classe classe;
    public EtudiantImpl(String nom, String prenom, int anneeNaissance, String email, Classe classe) {
        super(nom, prenom, anneeNaissance, email);
        this.classe = classe;
        this.numeroEtudiant = genererNumeroEtudiant();
    }
    private String genererNumeroEtudiant() {
        return nom + (nom.length() + anneeNaissance + "000" + this.hashCode());
    }
    public void sInscrire() {
        System.out.println("L'étudiant " + prenom + " " + nom + " s'inscrit.");
    }
    public void suivreCours() {
        System.out.println("L'étudiant " + prenom + " " + nom + " suit des cours.");
    }
    public void passerExamen() {
        System.out.println("L'étudiant " + prenom + " " + nom + " passe un examen.");
    }
    public String toString() {
        return super.toString() + " Etudiant [numeroEtudiant=" + numeroEtudiant + ", classe=" + classe + "]";
    }
}
