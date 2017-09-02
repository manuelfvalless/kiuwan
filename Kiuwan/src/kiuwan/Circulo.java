package kiuwan;

public class Circulo {

    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAreaRadio() {
        return areaRadio;
    }

    public void area() {
        areaRadio = pi * radio * radio;
    }
}
