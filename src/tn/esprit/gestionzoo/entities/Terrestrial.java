package tn.esprit.gestionzoo.entities;

import tn.esprit.gestionzoo.enums.Food;
import tn.esprit.gestionzoo.interfaces.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {

    private int nbrLegs;

    public Terrestrial() {
        super();
        setFamily("Terrestrial");
        setName("Unknown Terrestrial");
        setAge(0);
        setMammal(true);
        setNbrLegs(4);
    }

    public Terrestrial(String name, int age, boolean mammal, int nbrLegs) {
        super("Terrestrial", name, age, mammal);
        setNbrLegs(nbrLegs);
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        if (nbrLegs < 0) {
            throw new IllegalArgumentException("Le nombre de pattes ne peut pas être négatif.");
        }
        this.nbrLegs = nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " is eating meat!");
        } else {
            System.out.println(getName() + " cannot eat meat.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " is eating plants!");
        } else {
            System.out.println(getName() + " cannot eat plants.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " is eating both plants and meat!");
        } else {
            System.out.println(getName() + " cannot eat this food.");
        }
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", nbrLegs=" + nbrLegs +
                '}';
    }
}
