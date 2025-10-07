package tn.esprit.gestionzoo.entities;


public class Penguin extends Aquatic {

    private float swimmingDepth; // mètres

    public Penguin() {
        super();
        setName("Penguin");
        setMammal(false);
        setSwimmingDepth(0.0f);
    }

    public Penguin(String name, int age, float swimmingDepth, String habitat) {
        super(name, age, false, habitat);
        setSwimmingDepth(swimmingDepth);
    }

    public float getSwimmingDepth() { return swimmingDepth; }

    public void setSwimmingDepth(float swimmingDepth) {
        if (swimmingDepth < 0f) {
            throw new IllegalArgumentException("La profondeur de nage ne peut pas être négative.");
        }
        this.swimmingDepth = swimmingDepth;
    }



    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", isMammal=" + isMammal() +
                ", habitat='" + getHabitat() + '\'' +
                ", swimmingDepth=" + swimmingDepth +
                '}';
    }
}