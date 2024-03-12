public class Club {
    private String nomClub;
    private Personne[] adherents;
    public Club(){}
    public Club(Club c){
        this.nomClub = c.nomClub;
        this.adherents = c.adherents;
    }
    public Club(String unNomClub, Personne[] desAdherents){
        this.nomClub = unNomClub;
        this.adherents = desAdherents;
    }
}