public class Student implements StudentI{
    private String uczelnia;
    private String indeks;
    private Boolean zdal;
    private int wiek;
    private String imie;
    @Override
    public String setuczelnia(String uczelnia) {
        this.uczelnia = uczelnia;

        return null;
    };
    public String getuczelnia(){
        return uczelnia;
    }

    @Override
    public String setindeks(String indeks) {
        this.indeks = indeks;
        return null;
    }
    public String getindeks(){
        return indeks;
    }

    @Override
    public Boolean setZdal(Boolean zdal) {
        this.zdal = zdal;
        return null;
    }
    public Boolean getZdal(){
        return zdal;
    }

    @Override
    public int setwiek(int wiek) {
        this.wiek = wiek;
        return 0;
    }
    public int getWiek(){
        return wiek;
    }


    @Override
    public String setimie(String imie) {
        this.imie = imie;
        return null;
    }
    public String getImie(){
        return imie;
    }
    public void tooString(){
        System.out.println("Imie: "+imie+" wiek: "+wiek+" numer indeksu: "+indeks+" Czy zdal: "+zdal+" Gdzie studiuje: "+uczelnia);
    }
}
