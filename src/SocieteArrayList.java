import java.util.*;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {

    private List<Employe> employes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) {
            if (e.getNom().equalsIgnoreCase(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes); // utilise compareTo()
    }

   /* @Override
    public void trierEmployeParNomDépartementEtGrade() {
        employes.sort(Comparator
                .comparing(Employe::getNomDepartement)
                .thenComparing(Employe::getGrade)
                .thenComparing(Employe::getNom));
    }

    */

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                //D’abord comparer par nom de département
                int res = e1.getNomDepartement().compareTo(e2.getNomDepartement());

                //le département est le même, comparer par grade
                if (res == 0) {
                    res = Integer.compare(e1.getGrade(), e2.getGrade());
                }

                // Si même département et même grade, comparer par nom
                if (res == 0) {
                    res = e1.getNom().compareTo(e2.getNom());
                }

                return res; // résultat du tri
            }
        });
    }

    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> result = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                result.add(e);
            }
        }
        return result;
    }
}
