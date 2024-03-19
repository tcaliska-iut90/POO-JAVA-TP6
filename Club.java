import java.util.Scanner;

public class Club {
    private String nomClub;
    private Personne[] adherents;

    public Club() {}

    public Club(Club c) {
        this.nomClub = c.nomClub;
        this.adherents = c.adherents;
    }

    public Club(String unNomClub, Personne[] desAdherents) {
        this.nomClub = unNomClub;
        this.adherents = desAdherents;
    }

    public String getNomClub() {
        return nomClub;
    }

    public Personne[] getAdherents() {
        return adherents;
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom du club : ");
        this.nomClub = scanner.nextLine();

        System.out.println("Combien d'adhérents ajouter ?");
        int nbAdherents = scanner.nextInt();
        scanner.nextLine();

        adherents = new Personne[nbAdherents];
        for (int i = 0; i < nbAdherents; i++) {
            System.out.println("Type de l'adhérent " + (i + 1) + " (e pour étudiant, s pour salarié, autre pour personne normale) : ");
            String typeAdherent = scanner.nextLine();
            if (typeAdherent.equalsIgnoreCase("e")) {
                adherents[i] = new Etudiant();
            } else if (typeAdherent.equalsIgnoreCase("s")) {
                adherents[i] = new Salarie();
            } else {
                adherents[i] = new Personne();
            }
            adherents[i].init();
        }
    }

    @Override
    public String toString() {
        String res = "Club : " + nomClub + "\n";
        res += "Adhérents : \n";
        for (Personne adherent : adherents) {
            res += adherent.toString() + "\n";
        }
        return res;
    }
}
