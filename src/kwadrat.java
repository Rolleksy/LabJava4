public class kwadrat extends Figura{
    public double bok;
    public double pole;
    public double obwod;

    public double getBok() {
        return bok;
    }

    public void setBok(double bok) {
        this.bok = bok;
    }
    public double pole(){
        pole = bok*bok;
        return pole;
    }
    public double obwod(){
        obwod = bok*4;
        return obwod;
    }
}
