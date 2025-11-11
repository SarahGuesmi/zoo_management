package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Department;
import tn.esprit.gestionzoo.entities.DepartmentHashSet;
import tn.esprit.gestionzoo.entities.Employe;
import tn.esprit.gestionzoo.entities.SocieteArrayList;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(1, "Guesmi", "Sarah", "RH", 3);
        Employe e2 = new Employe(2, "Zarrouk", "Aziz", "Finance", 2);
        Employe e3 = new Employe(3, "Menzli", "Omar", "Production", 1);
        Employe e4 = new Employe(4, "Ben Abdallah", "Malek", "IT", 4);

        // Ajout
        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("=== Liste initiale des employés ===");
        societe.afficherEmploye();

        // Recherche
        System.out.println("\nRecherche par nom 'Ayari' : " + societe.rechercherEmploye("Ayari"));
        System.out.println("Recherche par objet e3 : " + societe.rechercherEmploye(e3));

        // Tri par ID
        System.out.println("\n=== Tri des employés par ID ===");
        societe.trierEmployeParId();
        societe.afficherEmploye();

        // Tri par Département + Grade
        System.out.println("\n Tri des employés par Département et Grade ");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.afficherEmploye();

        // Suppression
        System.out.println("\nSuppression de e2...");
        societe.supprimerEmploye(e2);
        societe.afficherEmploye();

        //Gestion des départements

        System.out.println("\n Gestion des Départements");
        DepartmentHashSet gestionDepartement = new DepartmentHashSet();

        Department d1 = new Department(101, "IT", 12);
        Department d2 = new Department(102, "Finance", 8);
        Department d3 = new Department(103, "RH", 6);
        Department d4 = new Department(104, "Production", 20);

        // Ajout
        gestionDepartement.ajouterDepartement(d1);
        gestionDepartement.ajouterDepartement(d2);
        gestionDepartement.ajouterDepartement(d3);
        gestionDepartement.ajouterDepartement(d4);

        System.out.println("\n Liste des département");
        gestionDepartement.displayDepartement();

        // Recherche
        System.out.println("\nRecherche 'IT' : " + gestionDepartement.rechercherDepartement("IT"));
        System.out.println("Recherche d2 : " + gestionDepartement.rechercherDepartement(d2));

        // Tri par ID
        System.out.println("\n Tri des départements par ID ");
        TreeSet<Department> tries = gestionDepartement.trierDepartementById();
        for (Department d : tries)
            System.out.println(d);

        // Suppression
        System.out.println("\nSuppression de d3...");
        gestionDepartement.supprimerDepartement(d3);
        gestionDepartement.displayDepartement();

        System.out.println("\n Exécution terminée avec succès !");
    }
}
