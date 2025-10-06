package tn.esprit.gestionzoo.main;
import java.util.Scanner;

import tn.esprit.gestionzoo.entities.*;

public class Main {
    public static void main(String[] args) {


      /*  // Création d'un animal
        Animal dog = new Animal("dddd", "gabi", 5, true);
        Animal cat = new Animal("ssss", "lili", 3, true);
        Animal a3 = new Animal("Oiseau", "Tweety", 1, false);


        Zoo myZoo = new Zoo("MyZoo", "Tunis");
        Zoo myZoo2 = new Zoo("MyZoo2", "Tunis");
        System.out.println(myZoo.addAnimal(dog));   // true
        System.out.println(myZoo.addAnimal(cat));
        System.out.println(myZoo2.addAnimal(a3));
        System.out.println(myZoo.addAnimal(dog));
        Zoo plusGrandZoo = Zoo.comparerZoo(myZoo, myZoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + plusGrandZoo.getName());




        //instr 11
       /* Scanner sc = new Scanner(System.in);
        System.out.print("Quel est le nom de l’animal que vous voulez chercherer ?");
        String m = sc.nextLine();
        int ind = myZoo.searchAnimal(m);
        sc.close();     */





        //instr 12
        /*
        Animal fish = new Animal("ll", "louli", 1, false);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(fish);
        */



        //instr 13
        //myZoo.removeAnimal(dog);



        /*   prosit 2
        myZoo.animals[0] = dog;
        myZoo.animals[1] = cat;
        System.out.println("\nAffichage direct de l'objet Zoo:");
        System.out.println(myZoo);
       // System.out.println(myZoo.tostring);

        System.out.println("\nAffichage des animaux:");
        System.out.println(dog);
        System.out.println(cat);*/




        Aquatic a2 = new Aquatic("Poisson", "Nemo", 2, false, "Océan");
        Dolphin d2 = new Dolphin("Mammifère marin", "Flipper", 6, true, "Bassin", 25.5f);
        Penguin p2 = new Penguin("Oiseau", "Pingu", 3, false, "Antarctique", 5.0f);
        Terrestrial t2 = new Terrestrial("Mammifère", "Léon", 4, true, 4);

        System.out.println("\nObjets paramétrés :");
        System.out.println(a2);
        System.out.println(d2);
        System.out.println(p2);
        System.out.println(t2);

        // swim test
        System.out.println("\nTests swim():");
        a2.swim();
        d2.swim();
        p2.swim();

        // Zoo test
        Zoo myZoo = new Zoo("MyZoo", "Tunis");
        myZoo.addAnimal(d2);
        myZoo.addAnimal(t2);
        myZoo.addAnimal(p2);
        myZoo.displayZoo();
        myZoo.displayAnimals();
    }
}

