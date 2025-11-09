public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // ✅ Ajout d’employés
        Employe e1 = new Employe(3, "Ali", "Ben Salem", "Informatique", 2);
        Employe e2 = new Employe(1, "Sara", "Trabelsi", "Comptabilité", 1);
        Employe e3 = new Employe(2, "Houssem", "Gharbi", "Informatique", 3);
        Employe e4 = new Employe(4, "Mouna", "Khelil", "Marketing", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println("📋 Liste initiale :");
        societe.displayEmploye();

        System.out.println("\n🔍 Recherche par nom 'Sara' : " + societe.rechercherEmploye("Sara"));

        System.out.println("\n🗂️ Tri naturel (par id) :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n📑 Tri personnalisé (Département → Grade → Nom) :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n🏢 Employés du département 'Informatique' :");
        for (Employe e : societe.rechercherParDepartement("Informatique")) {
            System.out.println(e);
        }
    }
}
