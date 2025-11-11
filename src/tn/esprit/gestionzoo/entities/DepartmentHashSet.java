package tn.esprit.gestionzoo.entities;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartmentHashSet implements IDepartment<Department> {
    private HashSet<Department> departements = new HashSet<>();

    @Override
    public void ajouterDepartement(Department d) {
        departements.add(d);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Department d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Department d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Department d) {
        departements.remove(d);
    }

    @Override
    public void displayDepartement() {
        for (Department d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Department> trierDepartementById() {
        return new TreeSet<>(departements);
    }
}
