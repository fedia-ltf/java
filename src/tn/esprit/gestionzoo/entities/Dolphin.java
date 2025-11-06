package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic {
    //dolphin howa animal herite mel classe animal
    protected float swimmingSpeed;
    //3andou attribut e5ir doun ili fel animal ili howa swimming..

    public Dolphin() { super(); }
   // super() appelle le constructeur vide de la classe Animal.

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() { return swimmingSpeed; }
    public void setSwimmingSpeed(float swimmingSpeed) { this.swimmingSpeed = swimmingSpeed; }

    @Override
    public String toString() {
        return super.toString() + ", Vitesse: " + swimmingSpeed;
    } // Affiche dauphin avec vitesse

    @Override
    public void swim() {
        System.out.println(name + " le dauphin nage à " + swimmingSpeed + " km/h.");
    } // Affiche le comportement de nage
}

