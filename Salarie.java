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

}