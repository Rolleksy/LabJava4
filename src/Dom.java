public class Dom implements Budynek{
    private int liczbaOkien;
    private int liczbaMieszkancow;
    private Budynek.KolorEnum KolorEnum;
    private Boolean jednorodz;


    @Override
    public double powierzchnia(double powBudynku, double powPodworka, double powParkingu){
        double wynik = powBudynku + powPodworka + powParkingu;
        return wynik;
    };
    @Override
    public String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy){
        String wynik = String.format("Budynek znajduje się w "+miejscowosc+" ,na ulicy "+ulica+", "+nrDomu+"/"+nrLokalu+", "+kodPocztowy);
        return wynik;
    }
    @Override
    public void setliczbaOkien(int value){
        this.liczbaOkien = value;
    } // użycie jak setter
    @Override
    public void setliczbaMieszkancow(int value){
        this.liczbaMieszkancow = value;
    } // użycie jak setter
    @Override
    public void setkolorDomu(KolorEnum kolor){
        this.KolorEnum = kolor;
    } // użycie jak setter
    @Override
    public double wyliczCene(double powierzchnia, double cena){
        double wynik = cena/powierzchnia;
        return wynik;
    }
    @Override
    public double ilenametr(double powierzchnia, double liczbamieszkancow){
        double wynik = powierzchnia/liczbamieszkancow;
        return  wynik;
    }
    public void setJedno(Boolean value){
        this.jednorodz = value;
    }
}
