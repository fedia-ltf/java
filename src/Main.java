public class Main {
    public static void main(String[] args) {

//prosit 10
        AffectationHashMap ah = new AffectationHashMap();

        Employe e1 = new Employe(1, "Ali", "Karoui", "RH", 3);
        Employe e2 = new Employe(2, "Fedia", "Letaief", "Info", 2);
        Employe e3 = new Employe(3, "Rihem", "Ousleti", "Marketing", 1);

        Departement d1 = new Departement(10, "RH", 20);
        Departement d2 = new Departement(20, "Informatique", 50);

        ah.ajouterEmployeDepartement(e1, d1);
        ah.ajouterEmployeDepartement(e2, d2);

        // Tester doublon
        ah.ajouterEmployeDepartement(e1, d2);

        ah.afficherEmployesEtDepartements();
    }
}



     /* prosit 8
        SocieteArrayList societe = new SocieteArrayList();


        // Ajout d’employés
        Employe e1 = new Employe(3, "Ali", "Ben Salem", "Informatique", 2);
        Employe e2 = new Employe(1, "Sara", "Trabelsi", "Comptabilité", 1);
        Employe e3 = new Employe(2, "Houssem", "Gharbi", "Informatique", 3);
        Employe e4 = new Employe(4, "Mouna", "Khelil", "Marketing", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);

        System.out.println(" Liste initiale :");
        societe.displayEmploye();

        System.out.println("\n Recherche par nom 'Sara' : " + societe.rechercherEmploye("Sara"));

        System.out.println("\n Tri naturel (par id) :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\n Tri personnalisé (Département → Grade → Nom) :");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        System.out.println("\n Employés du département 'Informatique' :");
        for (Employe e : societe.rechercherParDepartement("Informatique")) {
            System.out.println(e);
        }
     */



        /*prosit 9
        DepartementHashSet depSet = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 12);
        Departement d2 = new Departement(2, "Marketing", 7);
        Departement d3 = new Departement(3, "Comptabilité", 5);

        depSet.ajouterDepartement(d1);
        depSet.ajouterDepartement(d2);
        depSet.ajouterDepartement(d3);

        System.out.println(" Liste des départements :");
        depSet.afficherDepartements();

        System.out.println("\nRecherche 'Marketing' : " + depSet.rechercherDepartement("Marketing"));

        System.out.println("\nTri par id :");
        depSet.trierDepartementsParId();

        System.out.println("\nTri par nom + nombre employés :");
        depSet.trierDepartementsParNomEtNombreEmployes();
    }*/





