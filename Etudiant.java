import java.util.Objects;
import java.util.Scanner;

public class Etudiant extends Personne{
    private String faculte;
    private String numeroEtudiant;

    public Etudiant(){}
    public Etudiant(Etudiant e){
        super(e);
        this.faculte = e.faculte;
        this.numeroEtudiant = e.numeroEtudiant;
    }
    public Etudiant(String unNom, int unAge, String unNumeroEtudiant, String uneFac){
        super(unNom, unAge);
        this.faculte = uneFac;
        this.numeroEtudiant = unNumeroEtudiant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Etudiant etudiant = (Etudiant) o;
        return faculte.equals(etudiant.faculte) && numeroEtudiant.equals(etudiant.numeroEtudiant);
    }

    public String getFaculte(){
        return this.faculte;
    }

    public String getNumeroEtudiant(){
        return this.numeroEtudiant;
    }

    public void init(){
        super.init();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de la faculte");
        this.faculte = scanner.nextLine();

        System.out.println("Entrez le numeroEtudiant");
        this.numeroEtudiant = scanner.nextLine();
    }

    public String toString(){
        return super.toString() + faculte + numeroEtudiant;
    }
}