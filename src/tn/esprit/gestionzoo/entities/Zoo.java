package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.entities.Animal;

public class Zoo {

    public static final int MAX_CAGES = 25;
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




    /*public boolean addAnimal(Animal animal) {

        if (nbrAnimals < nbrCages) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else {
            return false; // zoo plein
        }
    }*/








    //instr 14
    public boolean isZooFull() {
        return nbrAnimals >= MAX_CAGES;
    }

    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("impossible d’ajouter " + animal.getName() + " :zoo plein");
            return false;
        }

        // inst 18
        for (int i=0;i<nbrAnimals;i++) {
                if (animals[i].getName().equals(animal.getName())) {
                    System.out.println(animal.getName() +" existe déjà dans le zoo");
                    return false;
                }
            }
        // Sinon
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println(animal.getName() + " ajouté avec succes");
        return true;
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


    //intr 13
    public boolean removeAnimal(Animal animal) {
        // Chercher l’animal dans le tableau
        /*for (int i=0; i<nbrAnimals;i++) {
            if (animals[i].getName().equals(animal.getName())) {
                for (int j = i; j < nbrAnimals - 1; j++) {
                    animals[j] = animals[j+1];
                }
                animals[nbrAnimals - 1] = null; // dernière case devient vide
                nbrAnimals--;
                System.out.println (animal.getName() + " a été supprimé du zoo.");
                return true;
            }
        }*/

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
}
