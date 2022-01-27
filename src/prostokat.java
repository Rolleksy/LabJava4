public class prostokat extends Figura{
    private double bok1;
    private double bok2;
    private double pole;
    private double obwod;

    public double getBok1(){
        return bok1;
    }

    public void setBok1(double bok) {
        this.bok1 = bok;
    }
    public double getBok2(){
        return bok2;
    }

    public void setBok2(double bok) {
        this.bok2 = bok;
    }
    public double obwod(){
        obwod = (bok1+bok2)*2;
        return obwod;
    }
    public double pole(){
        pole= bok1*bok2;
        return pole;
    }
}
