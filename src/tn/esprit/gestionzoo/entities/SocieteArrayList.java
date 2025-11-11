package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    private List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    @Override
    public void afficherEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // 🔹 Tri par ID (utilise Comparable défini dans Employe)
    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    // 🔹 Tri par Département PUIS Grade (utilise 2 comparateurs)
    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Comparator<Employe> NameCriteria = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getNomDepartement().compareToIgnoreCase(o2.getNomDepartement());
            }
        };

        Comparator<Employe> GradeCriteria = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGrade() - o2.getGrade();
            }
        };

        employes.sort(NameCriteria.thenComparing(GradeCriteria));
    }
}
