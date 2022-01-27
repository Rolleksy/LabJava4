public class Main {
    public static void main(String[] args) {
        String space = " ";
        Dom dom1 = new Dom();
        Dom dom2 = new Dom();
        String adres1 = dom1.adresBudynku("Gdynia", "Bema", 29, "50", "81-456");
        double powierzchnia1 = dom1.powierzchnia(100,120,20);
        dom1.setliczbaOkien(10);
        int liczbaok1 = dom1.getLiczbaOkien();
        dom1.setliczbaMieszkancow(3);
        int liczbamiesz1 = dom1.getLiczbaMieszkancow();
        double wyliczcene1 = dom1.wyliczCene(100, 800000);
        double ilenametr1 = dom1.ilenametr(100, liczbamiesz1);
        dom1.setJedno(true);
        boolean jedno1 = dom1.getJedno();

        String adres2 = dom2.adresBudynku("Warszawa", "Chmielna", 1, "34", "54-456");
        double powierzchnia2 = dom2.powierzchnia(76,12,15);
        dom2.setliczbaOkien(4);
        int liczbaok2 = dom2.getLiczbaOkien();
        dom2.setliczbaMieszkancow(2);
        int liczbamiesz2 = dom2.getLiczbaMieszkancow();
        double wyliczcene2 = dom2.wyliczCene(76, 974500);
        double ilenametr2 = dom2.ilenametr(76, liczbamiesz1);
        dom2.setJedno(true);
        boolean jedno2 = dom2.getJedno();

        System.out.println(adres1);
        System.out.println("Powierzchnia: "+powierzchnia1);
        System.out.println("Liczba okien: "+liczbaok1);
        System.out.println("Liczba mieszkancow: "+liczbamiesz1);
        System.out.println("Cena za metr: "+wyliczcene1);
        System.out.println("Ilu mieszkancow na metr: "+ilenametr1);
        System.out.println("Czy dom jest jednorodzinny: "+jedno1);
        System.out.println(space);
        System.out.println(adres2);
        System.out.println("Powierzchnia: "+powierzchnia2);
        System.out.println("Liczba okien: "+liczbaok2);
        System.out.println("Liczba mieszkancow: "+liczbamiesz2);
        System.out.println("Cena za metr: "+wyliczcene2);
        System.out.println("Ilu mieszkancow na metr: "+ilenametr2);

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
            - String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
            - void liczbaOkien(int value); // użycie jak setter
            - void liczbaMieszkancow(int value); // użycie jak setter
            - void kolorDomu(KolorEnum kolor); // użycie jak setter
            - double wyliczCene(double powierzchnia, double cena);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól,
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,
        d) sprawdzić czy idzie wywołać z obu instancji objektu (deklaracja z interfejsu i z klasy)
        metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klassie Dom,
        */
    }
}
