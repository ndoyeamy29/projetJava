public class personne {
    private String nom;
    private String prenom;
    private String matricule;
    private int age;
    private String dateNaissance;
    private static final AtomicInteger count = new AtomicInteger(0);

    public personne(String nom, String prenom, int age, String dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateNaissance = dateNaissance;
        this.matricule = genererMatricule();
    }

    private String genererMatricule() {
        char premiereLettrePrenom = prenom.charAt(0);
        char premiereLettreNom = nom.charAt(0);
        int identifiant = count.incrementAndGet();

        return String.format("%c%c%04d", premiereLettrePrenom, premiereLettreNom, identifiant);
    }
    public void afficherInformations() {
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Matricule: " + matricule);
        System.out.println("Âge: " + age);
        System.out.println("Date de Naissance: " + dateNaissance);
    }
}