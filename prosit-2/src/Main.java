import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Animal dog = new Animal();
       // dog.name="lili";

        // Création d'un animal
        Animal dog = new Animal("dddd", "gabi", 5, true);
        Animal cat = new Animal("ssss", "lili", 3, true);
        Animal a3 = new Animal("Oiseau", "Tweety", 1, false);
 /*
        Zoo myZoo = new Zoo("MyZoo", "Tunis", 3);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(cat);*/



        //instr 10
       // Zoo myZoo = new Zoo("MyZoo", "Tunis", 3);
        Zoo myZoo = new Zoo("MyZoo", "Tunis");
        Zoo myZoo2 = new Zoo("MyZoo2", "Tunis");
        System.out.println(myZoo.addAnimal(dog));   // true
        System.out.println(myZoo.addAnimal(cat));
        System.out.println(myZoo2.addAnimal(a3));
        Zoo plusGrandZoo = Zoo.comparerZoo(myZoo, myZoo2);
        System.out.println("Le zoo avec le plus d'animaux est : " + plusGrandZoo.name);




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
    }
}
