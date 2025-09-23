public class zooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("MyZoo", "Tunis", 30);
        Zoo otherZoo = new Zoo("OtherZoo", "Sousse", 30);

        Animal lion = new Animal("lion", "simba", 5, true);
        Animal elephant = new Animal("elephant", "dumbo", 10, false);
        Animal lion2 = new Animal("lion", "simba", 5, true); // identique au premier

        // instruction 10 et 12 : ajout
        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(lion2); // doit refuser car doublon

        // Instruction 11
        myZoo.displayAnimals();
        System.out.println("Recherche lion : " + myZoo.searchAnimal(lion));
        System.out.println("Recherche lion2 : " + myZoo.searchAnimal(lion2));

        // Instruction 13
        myZoo.removeAnimal(elephant);
        myZoo.displayAnimals();

        // Instruction 15
        for (int i = 0; i < 30; i++) {
            myZoo.addAnimal(new Animal("family" + i, "animal" + i, i, true));
        }
        System.out.println("Zoo plein ? " + myZoo.isZooFull());

        // Instruction 16
        otherZoo.addAnimal(new Animal("tigre", "tigrou", 7, true));
        Zoo bigger = Zoo.comparerZoo(myZoo, otherZoo);
        System.out.println("Le zoo avec le plus d’animaux est : " + bigger.name);
    }
}
