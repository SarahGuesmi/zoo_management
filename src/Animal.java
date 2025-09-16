public class Animal {
    int age;
    String name;
    String family;
    boolean isMammal;

    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    Animal(){
    }
    public void displayAnimal() {
        System.out.println("Animal: " + name + ", Family: " + family + ", Age: " + age + ", Mammal: " + isMammal);
    }
}
