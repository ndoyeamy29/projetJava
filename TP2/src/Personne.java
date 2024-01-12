class Personne {
        String nom;
        String prenom;
        int anneeNaissance;
        String email;
        public Personne(String nom, String prenom, int anneeNaissance, String email) {
            this.nom = nom;
            this.prenom = prenom;
            this.anneeNaissance = anneeNaissance;
            this.email = email;
        }
        public String toString() {
            return "Personne [nom=" + nom + ", prenom=" + prenom + ", anneeNaissance=" + anneeNaissance + ", email=" + email + "]";
        }
    }


