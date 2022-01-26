public interface Budynek {
    double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
    String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
    void setliczbaOkien(int value); // użycie jak setter
    void setliczbaMieszkancow(int value); // użycie jak setter
    void setkolorDomu(KolorEnum kolor); // użycie jak setter
    double wyliczCene(double powierzchnia, double cena);
    double ilenametr(double powierzchnia, double liczbamieszkancow);

    enum KolorEnum{
        bialy, czarny, niebieski, zielony
    }
}
