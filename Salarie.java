import java.util.Scanner;

public class Salarie extends Personne{
    private String employeur;
    private String numeroSecu;

    public Salarie(){
        super();
    }
    public Salarie(Salarie s){
        super(s);
        this.employeur = s.employeur;
        this.numeroSecu = s.numeroSecu;
    }

    public Salarie(String unNom, int unAge, String unNumeroSecu, String unEmployeur){
        super(unNom, unAge);
        this.employeur = unEmployeur;
        this.numeroSecu = unNumeroSecu;}

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salarie salarie = (Salarie) o;
        return employeur.equals(salarie.employeur) && numeroSecu.equals(salarie.numeroSecu);
    }

    public String getEmployeur(){
        return this.employeur;
    }

    public String getNumeroSecu(){
        return this.numeroSecu;
    }

    public void init(){
        super.init();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nom de l'employeur");
        this.employeur = scanner.nextLine();

        System.out.println("Entrez le numeroSecu de l'employeur");
        this.numeroSecu = scanner.nextLine();
    }
    @Override
    public String toString(){
        return super.toString() + employeur + numeroSecu;
    }
}