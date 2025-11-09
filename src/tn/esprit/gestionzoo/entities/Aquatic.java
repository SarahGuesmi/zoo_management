package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Carnivore;

public abstract class Aquatic extends Animal implements Carnivore<Food> {

    private String habitat;

    public Aquatic() {
        super();
        setFamily("Aquatic");
        setName("Unknown Aquatic");
        setAge(0);
        setMammal(false);
        setHabitat("unknown");
    }

    public Aquatic(String name, int age, boolean mammal, String habitat) {
        super("Aquatic", name, age, mammal);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.trim().isEmpty()) {
            throw new IllegalArgumentException("L'habitat ne peut pas être vide.");
        }
        this.habitat = habitat.trim();
    }

    // Méthode de l'interface Carnivore
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " is eating meat!");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }

    public abstract void swim();

    @Override
    public String toString() {
        return "Aquatic{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}
