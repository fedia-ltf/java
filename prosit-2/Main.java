public class Main {
    public static void main(String[] args) {
        // Création d'un animal
        Animal dog = new Animal("dddd", "lili", 5, true);
        Animal cat = new Animal("ssss", "sousou", 3, true);

        // Création d'un zoo
        Zoo myZoo = new Zoo("MyZoo", "Tunis", 20);

        // Ajout des animaux dans le zoo
        myZoo.animals[0] = dog;
        myZoo.animals[1] = cat;

        // Affichage via displayZoo()
        myZoo.displayZoo();

        System.out.println("\nAffichage direct de l'objet Zoo:");
        System.out.println(myZoo); // appelle automatiquement toString()

        System.out.println("\nAffichage des animaux:");
        System.out.println(dog);
        System.out.println(cat);
    }
}
