public class employe implements Comparable<employe> {
    int id;
    String nom;
    String prenom;
    String nomDept;
    int grade;

    employe() {
    }

    employe(int id, String nom, String prenom, String nomDept, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDept = nomDept;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNomDept() {
        return nomDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof employe))
            return false;
        employe employe = (employe) o;
        return id == employe.id && nom.equals(employe.nom);
    }

    @Override
    public String toString() {
        return "employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDept='" + nomDept + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(employe other) {
        return Integer.compare(this.id, other.id);
    }
}
