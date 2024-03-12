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
        this.numeroSecu = unNumeroSecu;
    }


}
