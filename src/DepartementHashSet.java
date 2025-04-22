import java.util.HashSet;
import java.util.Iterator;

public class DepartementHashSet implements IDepartement<departement> {
    private HashSet<departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(departement dept) {
        departements.add(dept);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (departement dept : departements) {
            if (dept.getNomDepartement().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(departement dept) {
        return departements.contains(dept);
    }

    @Override
    public void supprimerDepartement(departement dept) {
        departements.remove(dept);
    }

    @Override
    public void displayDepartement() {
        for (departement dept : departements) {
            System.out.println(dept);
        }
    }
}