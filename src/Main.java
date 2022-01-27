public class Main {

    public static void main(String[] args) {

        prostokat pro1 = new prostokat();
        kwadrat kwa1 = new kwadrat();

        pro1.setBok1(10);
        pro1.setBok2(7);
        System.out.println(pro1.pole());
        System.out.println(pro1.obwod());

        kwa1.setBok(11);
        System.out.println(kwa1.obwod());
        System.out.println(kwa1.pole());

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

    }
}
