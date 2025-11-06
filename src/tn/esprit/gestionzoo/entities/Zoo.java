package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Animal;
public class Zoo {

    public static final int MAX_CAGES = 2;
    Animal[] animals; // maximum 25
    private String name;
    private String city;
    private int nbrAnimals =0;

    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
    }

    public String getName(){
        return name;
    }

    public void setName(String n) {
        if (n == null || n.trim().isEmpty()) {
            System.out.println("the zoo name connot be empty );");
        } else {
            this.name = n;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String n) {
        this.city  = n;

    }
    public int getNbrAnimals() {
        return nbrAnimals;
    }

    // Méthode pour afficher les infos du zoo
    public void displayZoo() {
        System.out.println("Zoo: " + name);
        System.out.println("Ville: " + city);
        // System.out.println("Nombre de cages: " + nbrCages);
    }
    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    /*public void displayAnimals() {
    for (Animal a : animals) {
        System.out.println(a);
    } */

    public boolean isZooFull() {
        return nbrAnimals >= MAX_CAGES;
    }















    /*public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("impossible d’ajouter " + animal.getName() + " :zoo plein");
            return false;
        }
        for (int i=0;i<nbrAnimals;i++) {
                if (animals[i].getName().equals(animal.getName())) {
                    System.out.println(animal.getName() +" existe déjà dans le zoo");
                    return false;
                }
            }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println(animal.getName() + " ajouté avec succes");
        return true;
    }*/


    //prosit 7
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        // Vérifier l'âge de l'animal
        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }

        // Vérifier si le zoo est plein
        if (isZooFull()) {
            throw new ZooFullException();
        }

        // Vérifier si l'animal existe déjà
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println(animal.getName() + " existe déjà dans le zoo");
                return;
            }
        }

        // Ajouter l'animal s’il est valide
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println(animal.getName() + " ajouté avec succès !");
    }
























    //inter 11
    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(name)) {
                System.out.println(name + " trouvé à l’indice " + i);
                return i;
            }
        }
        System.out.println( name + " n’existe pas dans le zoo.");
        return -1;
    }
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.getName());
        // Si l’animal n’existe pas
        if (index == -1) {
            System.out.println(animal.getName() + " n’existe pas dans le zoo.");
            return false;
        }
        for (int j = index; j < nbrAnimals - 1; j++) {
            animals[j] = animals[j + 1];
        }// La dernière case devient vide
        animals[nbrAnimals - 1] = null;
        nbrAnimals--;
        System.out.println(animal.getName() + " a été supprimé du zoo.");
        return true;
    }
    //instr 15
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals >= z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }


    @Override
    public String toString() {
        return "Zoo [Nom: " + name + ", Ville: " + city + ", Nombre de cages: " +  MAX_CAGES + "]";
    }
    Aquatic[] aquaticAnimals = new Aquatic[10]; // Crée un tableau pour stocker jusqu’à 10 animaux aquatiques
    private int nbrAq = 0;           // Compteur pour suivre combien d’animaux aquatiques ont été ajoutés

    // Méthode pour ajouter un animal aquatique dans le tableau
    public boolean addAquaticAnimal(Aquatic aquatic) {
        if (nbrAq >= aquaticAnimals.length) { // Vérifie si le tableau est déjà plein
            System.out.println(aquatic.getName() + " : tableau aquatique plein");
            return false;
        }
        aquaticAnimals[nbrAq] = aquatic; // Ajoute l’animal à la prochaine case disponible
        nbrAq++;
        System.out.println(aquatic.getName() + " ajouté au tableau aquatique"); // Message de succès
        return true;
    }
    // Méthode pour faire nager tous les animaux aquatiques
    public void makeAquaticsSwim() {
        for (int i = 0; i < nbrAq; i++) { // Parcourt toutes les cases du tableau
            aquaticAnimals[i].swim(); // Appelle la méthode swim() de chaque animal
        } }
    // Méthode pour obtenir la profondeur maximale des pingouins
    public float getMaxPenguinDepth() {
        float maxDepth = 0;
        for (int i = 0; i < nbrAq; i++) { // Parcourt tous les animaux aquatiques
            if (aquaticAnimals[i] instanceof Penguin) { // Vérifie si c’est un pingouin                              down cast
                Penguin p = (Penguin) aquaticAnimals[i]; // Convertit l’animal en type Penguin
                if (p.getSwimmingDepth() > maxDepth) maxDepth = p.getSwimmingDepth(); // Met à jour max si plus grand
            }
        }
        return maxDepth; // Retourne la profondeur maximale
    }
    // Méthode pour afficher le nombre de dauphins et de pingouins
    public void displayAquaticCounts() {
        int dolphins = 0, penguins = 0; // Initialise les compteurs
        for (int i = 0; i < nbrAq; i++) { // Parcourt tous les animaux aquatiques
            if (aquaticAnimals[i] instanceof Dolphin) dolphins++; // Incrémente dauphin si c’est un dauphin
            else if (aquaticAnimals[i] instanceof Penguin) penguins++; // Incrémente pingouin si c’est un pingouin
        }
        System.out.println("Dauphins: " + dolphins + ", Pingouins: " + penguins); // Affiche le résultat
    }

}
























