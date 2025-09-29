package tn.esprit.gestionzoo.entities;

public class Animal {
    // Attributs
    private  String family;
    private String name;
    private int age;
    private  boolean isMammal;

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;

    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String type) {
        this.family = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            this.age = 0; // âge par défaut si négatif
        } else {
            this.age = age;
        }
    }
    public boolean  isIsMammal () {
        return isMammal ;
    }

    public void setIsMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }

    // Redéfinition de la méthode toString()
    // @Override
    public String toString() {
        return "Animal [Nom: " + name + ", Famille: " + family + ", Age: " + age + ", Mammifère: " + isMammal + "]";
    }



}
