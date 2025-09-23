public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    final int nbrCages = 25;   // instruction 14 : constant
    int animalCount = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        // on ignore le paramètre nbrCages car un zoo a toujours 25 cages
    }

    // Instruction 10 + 12
    public boolean addAnimal(Animal a) {
        if (isZooFull()) {
            System.out.println("Zoo full");
            return false;
        }
        if (searchAnimal(a) != -1) {
            System.out.println("Animal déjà présent");
            return false;
        }
        animals[animalCount] = a;
        animalCount++;
        return true;
    }

    // Instruction 11
    public void displayAnimals() {
        System.out.println("Animaux du zoo " + name + " :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(" - " + animals[i]);
        }
    }
    public int searchAnimal(Animal a) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(a)) {
                return i;
            }
        }
        return -1;
    }

    // Instruction 13
    public boolean removeAnimal(Animal a) {
        int index = searchAnimal(a);
        if (index == -1) return false;

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    // Instruction 15
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }

    // Instruction 16
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount >= z2.animalCount) {
            return z1;
        } else {
            return z2;
        }
    }

    @Override
    public String toString() {
        return "Zoo{name='" + name + "', city='" + city + "', cages=" + nbrCages + ", animaux=" + animalCount + "}";
    }
}
