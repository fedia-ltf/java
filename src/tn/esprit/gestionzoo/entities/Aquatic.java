package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() { super(); }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public String getHabitat() { return habitat; }
    public void setHabitat(String habitat) { this.habitat = habitat; }

    @Override
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }


    public abstract void swim(); // Méthode abstraite : chaque classe fille doit la redéfinir

    @Override
    public boolean equals(Object obj) { // Redéfinition de equals()
        if (this == obj) return true; // Si même objet → identiques
        if (obj == null || getClass() != obj.getClass()) return false; // Si null ou pas même classe → pas identiques
        Aquatic other = (Aquatic) obj; // Conversion en Aquatic pour accéder aux attributs
        // Deux animaux aquatiques sont identiques si même name, age et habitat
        return this.name.equals(other.name) && this.age == other.age && this.habitat.equals(other.habitat);
    }
}
