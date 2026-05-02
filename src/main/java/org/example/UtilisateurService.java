package org.example;
import java.util.ArrayList;
import java.util.List;

    public class UtilisateurService {
        private List<Utilisateur> utilisateurs = new ArrayList<>();

        public String ajouter(Utilisateur u) {
            utilisateurs.add(u);
            return "Utilisateur ajouté avec succès.";
        }

        public List<Utilisateur> lister() {
            return utilisateurs;
        }

        public Utilisateur rechercher(String matricule) {
            return utilisateurs.stream()
                    .filter(u -> u.getMatricule().equalsIgnoreCase(matricule))
                    .findFirst()
                    .orElse(null);
        }

        public String supprimer(String matricule) {
            boolean retire = utilisateurs.removeIf(u -> u.getMatricule().equalsIgnoreCase(matricule));
            return retire ? "Supprimé." : "Non trouvé.";
        }
    }
}
