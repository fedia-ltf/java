public class Zoo {
    public static final int MAX_CAGES = 25;
    Animal[] animals; // maximum 25
    String name;
    String city;
    int nbrAnimals =0;


    // Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[MAX_CAGES];
    }

    // Méthode pour afficher les infos du zoo
    public void displayZoo() {
        System.out.println("Zoo: " + name);
        System.out.println("Ville: " + city);
       // System.out.println("Nombre de cages: " + nbrCages);
    }

   /* public boolean addAnimal(Animal animal) {
        if (nbrAnimals < nbrCages) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
            return true;
        } else {
            return false; // zoo plein
        }
    }
    */



    //instr 12
   public boolean addAnimal(Animal animal) {
       //  si il est plein
       if (nbrAnimals >=  MAX_CAGES) {
           System.out.println("impossible d’ajouter " + animal.name + " :zoo plein");
           return false;
       }
       //si l'animal existe
       for (int i=0;i<nbrAnimals;i++) {
           if (animals[i].name.equals(animal.name)) {
               System.out.println(animal.name +" existe déjà dans le zoo");
               return false;
           }
       }
       // Sinon
       animals[nbrAnimals] = animal;
       nbrAnimals++;
       System.out.println(animal.name + " ajouté avec succes");
       return true;
   }


//inter 11
    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(name)) {
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
        for (int i=0; i<nbrAnimals;i++) {
            if (animals[i].name.equals(animal.name)) {
                for (int j = i; j < nbrAnimals - 1; j++) {
                    animals[j] = animals[j+1];
                }
                animals[nbrAnimals - 1] = null; // dernière case devient vide
                nbrAnimals--;
                System.out.println (animal.name + " a été supprimé du zoo.");
                return true;
            }
        }
        System.out.println(animal.name + " n’existe pas dans le zoo.");
        return false;
    }


    //instr 14
    public boolean isZooFull() {
        return nbrAnimals >= MAX_CAGES;
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
