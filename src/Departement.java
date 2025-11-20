//prosit 9



public class Departement {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    // 🔹 Constructeur par défaut
    public Departement() {}

    // 🔹 Constructeur paramétré
    public Departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // 🔹 Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomDepartement() { return nomDepartement; }
    public void setNomDepartement(String nomDepartement) { this.nomDepartement = nomDepartement; }

    public int getNombreEmployes() { return nombreEmployes; }
    public void setNombreEmployes(int nombreEmployes) { this.nombreEmployes = nombreEmployes; }

    // 🔹 Redéfinition equals() → comparer id + nom
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Departement)) return false;
        Departement d = (Departement) obj;
        return this.id == d.id &&
                this.nomDepartement.equalsIgnoreCase(d.nomDepartement);
    }

    // 🔹 Indispensable si on utilise HashSet
    @Override
    public int hashCode() {
        return id + nomDepartement.toLowerCase().hashCode();
    }

    // 🔹 toString
    @Override
    public String toString() {
        return "Departement { id=" + id +
                ", nom='" + nomDepartement +
                "', nombreEmployes=" + nombreEmployes + " }";
    }
}
