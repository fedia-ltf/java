public class Zoo {
    // Attributs
    Animal[] animals; // maximum 25
    String name;
    String city;
    int nbrCages;

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25]; // initialisation du tableau
    }

    // Méthode pour afficher les infos du zoo
    public void displayZoo() {
        System.out.println("Zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);
    }

    // Redéfinition de toString
    @Override
    public String toString() {
        return "Zoo [Nom: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages + "]";
    }
}
