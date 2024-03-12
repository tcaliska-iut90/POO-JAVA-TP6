import java.util.Objects;
import java.util.Scanner;

public class Personne {
    private String nom;
    private int age;

    public Personne(){}

    public Personne(Personne p){
        this.nom = p.nom;
        this.age = p.age;
    }

    public Personne(java.lang.String n, int a){
        this.nom = n;
        this.age = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return age == personne.age && nom.equals(personne.nom);
    }

    public int getAge(){
        return this.age;
    }

    public String getNom() {
        return nom;
    }

    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de la personne : ");
        this.nom = scanner.nextLine();
        System.out.println("Entrez l'âge de la personne : ");
        this.age = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                '}';
    }
}
