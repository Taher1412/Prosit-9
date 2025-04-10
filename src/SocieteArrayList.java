import java.util.ArrayList;

public class SocieteArrayList implements IGestion {
    private ArrayList<employe> employes;

    public SocieteArrayList() {
        employes = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(employe e) {
        employes.add(e);
    }

    @Override
    public void supprimerEmploye(int id) {
        employes.removeIf(e -> e.getId() == id);
    }

    @Override
    public employe rechercherEmploye(int id) {
        for (employe e : employes) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void afficherEmployes() {
        for (employe e : employes) {
            System.out.println(e);
        }
    }
}