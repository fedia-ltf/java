package tn.esprit.gestionzoo.entities;

public class Animal {
    // Attributs protégés pour l'héritage
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    // Constructeur par défaut (utile pour l'instruction 21)
    public Animal() { }

    // Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public String getName() { return name; }
    public void setName(String n) { this.name = n; }

    public String getFamily() { return family; }
    public void setFamily(String type) { this.family = type; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("age cannot be negative");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isMammal() { return isMammal; }
    public void setMammal(boolean isMammal) { this.isMammal = isMammal; }

    @Override
    public String toString() {
        return "Animal [Nom: " + name + ", Famille: " + family + ", Age: " + age + ", Mammifère: " + isMammal + "]";
    }
}
