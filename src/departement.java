public class departement {
    private int id;
    private String nomDepartement;
    private int nombreEmployes;

    // Constructeur sans paramètre
    public departement() {
    }

    // Constructeur avec paramètres
    public departement(int id, String nomDepartement, int nombreEmployes) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nombreEmployes = nombreEmployes;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }

    // Redéfinition de la méthode equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        departement other = (departement) obj;
        return id == other.id && (nomDepartement == null ? other.nomDepartement == null
                : nomDepartement.equals(other.nomDepartement));
    }

    // Redéfinition de la méthode hashCode
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((nomDepartement == null) ? 0 : nomDepartement.hashCode());
        return result;
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        return "departement [id=" + id + ", nomDepartement=" + nomDepartement + ", nombreEmployes=" + nombreEmployes
                + "]";
    }
}