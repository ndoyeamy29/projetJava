// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
enum Classe {
    L3, L2, L1
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();

        personnes.add(new EtudiantImpl("Ndoye", "Amy", 1998, "ndoyeamy@gmail.com", Classe.L3));
        personnes.add(new EtudiantImpl("Mbaye", "Absa", 2000, "mbayeabsa@gmail.com", Classe.L2));
        personnes.add(new EtudiantImpl("Diallo", "Binta", 2003, "diallobinta@gmail.com", Classe.L1));

        personnes.add(new ProfesseurImpl("Lo", "Makhmadane", 1985, "lomakhmadane@gmail.com", "JAVA"));
        personnes.add(new ProfesseurImpl("Thiam", "Mbaye Sakhna", 1989, "thiammbaye@gmail.com", "C#"));
        personnes.add(new ProfesseurImpl("Gaye", "Abdoulaye", 1988, "gayelaye@gmail.com",  "PHP"));

        for (Personne personne : personnes) {
            System.out.println(personne);
            if (personne instanceof Etudiant) {
                ((Etudiant) personne).sInscrire();
            } else if (personne instanceof Professeur) {
                ((Professeur) personne).enseigner();
            }
            System.out.println(); // Ajout d'une ligne vide pour une meilleure lisibilité
        }
    }
}