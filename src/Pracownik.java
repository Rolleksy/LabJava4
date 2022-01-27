public class Pracownik implements PracownikI{
    private String imie;
    private int wiek;
    private double godzinyPrac;
    private double pensja;
    private String praca;

    @Override
    public String setimie(String imie) {
        this.imie = imie;
        return null;
    }
    public String getImie(){
        return imie;
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
    public double setGodzPrac(double godziny) {
        this.godzinyPrac = godziny;
        return 0;
    }
    public double getGodzinyPrac(){
        return godzinyPrac;
    }

    @Override
    public double setPensja(double pensja) {
        this.pensja = pensja;
        return 0;
    }
    public double getPensja(){
        return pensja;
    }

    @Override
    public String setPraca(String praca) {
        this.praca = praca;
        return null;
    }
    public String getPraca(){
        return praca;
    }

    public void tooString(){
        System.out.println("Imie: "+imie+" wiek: "+wiek+" godziny pracy: "+godzinyPrac+" Pensja: "+pensja+" Gdzie pracuje: "+praca);
    }
}
