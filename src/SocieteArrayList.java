import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<employe> {
    private ArrayList<employe> employes;

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(employe e) {
        employes.add(e);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (employe e : employes) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(employe e) {
        return employes.contains(e);
    }

    @Override
    public void supprimerEmploye(employe e) {
        employes.remove(e);
    }

    @Override
    public void displayEmploye() {
        for (employe e : employes) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, new Comparator<employe>() {
            @Override
            public int compare(employe e1, employe e2) {
                int compareDept = e1.getNomDept().compareTo(e2.getNomDept());
                if (compareDept != 0) {
                    return compareDept;
                }
                return Integer.compare(e1.getGrade(), e2.getGrade());
            }
        });
    }
}