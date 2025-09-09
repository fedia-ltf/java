import java.util.Scanner;
class ZooManagement {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println("Nom du zoo : " + zooName + ", Nombre de cages : " + nbrCages);

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        zooName = sc.nextLine();

        // nom non vide
        while (zooName.trim().isEmpty()) {
            System.out.print("Le nom ne peut pas être vide : ");
            zooName = sc.nextLine();
        }

        System.out.print("Entrez le nombre de cages : ");
        nbrCages = sc.nextInt();

        // nombre positif
        while (nbrCages <= 0) {
            System.out.print("Le nombre doit être positif : ");
            nbrCages = sc.nextInt();
        }

        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        sc.close();
    }
}