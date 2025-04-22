public class Main {
    public static void main(String[] args) {
        // Test SocieteArrayList
        System.out.println("===== Taher's Companhy Ltd =====");
        SocieteArrayList societe = new SocieteArrayList();

        employe e1 = new employe(1, "Ayadi", "Taher", "Informatique", 3);
        employe e2 = new employe(2, "Ben Moussa", "Idriss", "RH", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);

        System.out.println("Liste des employés:");
        societe.displayEmploye();

        System.out.println("\nRecherche de 'Ayadi': " + societe.rechercherEmploye("Ayadi"));

        System.out.println("\nTri par département et grade:");
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();

        // Test DepartementHashSet
        System.out.println("\n===== Test DepartementHashSet =====");
        DepartementHashSet deptSet = new DepartementHashSet();

        departement d1 = new departement(1, "Informatique", 15);
        departement d2 = new departement(2, "RH", 8);

        deptSet.ajouterDepartement(d1);
        deptSet.ajouterDepartement(d2);

        System.out.println("Liste des départements:");
        deptSet.displayDepartement();

        System.out.println("\nRecherche de 'Informatique': " + deptSet.rechercherDepartement("Informatique"));
    }
}