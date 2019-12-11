package hu.flow;

public class MilleniumFalcon implements Urhajo,Hiperhajtomu {

    double tapasztalat;

    public MilleniumFalcon() {
        this.tapasztalat = 100;
    }

    @Override
    public void hiperUgras() {
        tapasztalat += 500;
    }

    @Override
    public boolean legyorsuljaE(Urhajo urhajo) {
        if(urhajo.milyenGyors() < milyenGyors()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double milyenGyors() {
        return tapasztalat * 2;
    }

    @Override
    public String toString() {
        return "MilleniumFalcon" +
                " speed=" + milyenGyors();
    }
}
