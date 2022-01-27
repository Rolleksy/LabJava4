public class Figura {
    private double pole;
    private double obwod;

    public void nazwaFigura(String figura){
        System.out.println("Tojest figura: " + figura);
    }

    public double getObwod() {
        return obwod;
    }

    public void setObwod(double obwod) {
        this.obwod = obwod;
    }

    public double getPole() {
        return pole;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }
}
