package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Department implements Comparable<Department> {
    private int id;
    private String nomDepartement;
    private int nbEmployes;

    // Constructeur sans paramètre
    public Department() {}

    // Constructeur avec paramètres
    public Department(int id, String nomDepartement, int nbEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbEmployes = nbEmployes;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomDepartement() { return nomDepartement; }
    public void setNomDepartement(String nomDepartement) { this.nomDepartement = nomDepartement; }

    public int getNbEmployes() { return nbEmployes; }
    public void setNbEmployes(int nbEmployes) { this.nbEmployes = nbEmployes; }

    // Redéfinition de equals (égalité selon id et nom)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department d = (Department) o;
        return id == d.id && Objects.equals(nomDepartement, d.nomDepartement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomDepartement);
    }

    // Redéfinition de toString
    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbEmployes=" + nbEmployes +
                '}';
    }

    // Pour trier par ID
    @Override
    public int compareTo(Department d) {
        return Integer.compare(this.id, d.id);
    }
}
