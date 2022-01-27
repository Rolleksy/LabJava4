
public class Main {
    public static void main(String[] args) {

        Student stu1 = new Student();
        Student stu2 = new Student();
        Pracownik pra1 = new Pracownik();
        Pracownik pra2 = new Pracownik();

        stu1.setimie("Adam");
        stu1.setwiek(24);
        stu1.setindeks("32422");
        stu1.setuczelnia("Uniwersytet Polski");
        stu1.setZdal(false);
        stu1.tooString();

        stu2.setimie("Wanda");
        stu2.setwiek(25);
        stu2.setindeks("35433");
        stu2.setuczelnia("Uniwersytet Gdanski");
        stu2.setZdal(false);
        stu2.tooString();

        pra1.setimie("Michal");
        pra1.setwiek(32);
        pra1.setGodzPrac(45);
        pra1.setPraca("OknoPolEx Import/Export");
        pra1.setPensja(3400);
        pra1.tooString();

        pra2.setimie("Jonasz");
        pra2.setwiek(56);
        pra2.setGodzPrac(35);
        pra2.setPraca("OknoPolEx Import/Export");
        pra2.setPensja(12300);
        pra2.tooString();


        /* zad.1
        a) napisać interfejs CzlowiekI,
        b) zadeklarować 2 metody,

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI,
        d) zadeklarować 3 metody,

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI,
        f) zadeklarować 3 metody,
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI,
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI,
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować:
        --Code/Prawy myszy-->Generate-->getters/setters/toString),
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola,
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola,
        c) wypisać metody toString() wszystkich objektów,
        */

        /* zad.4* - Dla chętnych (bez dodatkowych punktów),
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5* - Dla chętnych (bez dodatkowych punktów),
        a) stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę,
        b) dokończyć implementację metod z interfejsów,
        c) stworzyć pola w metodzie main() i wywołać metody
        */
    }
}
