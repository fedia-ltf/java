package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() { super(); }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() { return swimmingDepth; }
    public void setSwimmingDepth(float swimmingDepth) { this.swimmingDepth = swimmingDepth; }

    @Override
    public String toString() {
        return super.toString() + ", Profondeur: " + swimmingDepth;
    } // Affiche pingouin avec profondeur

    @Override
    public void swim() {
        System.out.println(name + " le pingouin nage à " + swimmingDepth + " m.");
    } // Affiche le comportement de nage
}
