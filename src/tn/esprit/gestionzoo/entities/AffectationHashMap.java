package tn.esprit.gestionzoo.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {

    // Instruction 1 : collection clé-valeur
    private HashMap<Employe, Department> affectations = new HashMap<>();

    // Instruction 2 : ajouter employé + département
    public void ajouterEmployeDepartement(Employe e, Department d) {
        affectations.put(e, d);
    }

    // Instruction 3 : afficher les employés et leurs départements
    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employe, Department> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }

    // Instruction 4 : supprimer un employé (clé)
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    // Instruction 5 : supprimer un employé qui travaille dans un département précis
    public void supprimerEmployeEtDepartement(Employe e, Department d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    // Instruction 6 : afficher seulement employés
    public void afficherEmployes() {
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    // Instruction 7 : afficher seulement départements
    public void afficherDepartements() {
        for (Department d : affectations.values()) {
            System.out.println(d);
        }
    }

    // Instruction 8 : rechercher employé
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // Instruction 9 : rechercher département
    public boolean rechercherDepartement(Department d) {
        return affectations.containsValue(d);
    }

    // Instruction 10 : trier les employés par ID (clé triée)
    public TreeMap<Employe, Department> trierMap() {
        return new TreeMap<>(affectations);
    }
}
