package hu.flow;

public abstract class Lazadogep implements Urhajo{

    private double speed;
    private boolean canBreakDown;

    public Lazadogep(double speed, boolean canBreakDown) {
        this.speed = speed;
        this.canBreakDown = canBreakDown;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public boolean isCanBreakDown() {
        return canBreakDown;
    }

    public void setCanBreakDown(boolean canBreakDown) {
        this.canBreakDown = canBreakDown;
    }

    public abstract boolean elkapjaAVonosugar();

    @Override
    public boolean legyorsuljaE(Urhajo urhajo) {
        if (this.speed > urhajo.milyenGyors() && ((Lazadogep)urhajo).canBreakDown)
        {return false;}
        else{return false;}
    }

    @Override
    public double milyenGyors() {
        return this.speed;
    }
}

/*

    Írj egy LazadoGep absztrakt osztályt, ami implementálja az Urhajo interfészt.
        – Az osztály a következő private láthatóságú adattagokkal rendelkezik: egy lebegőpontos sebesség,
        és egy logikai meghibasodhatE.
        – Az osztály rendelkezzen paraméteres konstruktorral, ami beállítja az adattagokat.
        Legyen egy public elkapjaAVonosugar absztrakt metódusa, ami egy logikai értékkel tér
        vissza. Valósítsd meg továbbá az interfész metódusait. A gyorsaság lekérdezésekor
        add vissza a LazadoGep sebességét. Egy LazadoGep egy másik LazadoGep objektumot akkor tud legyorsulni,
        ha az meghibásodhat, és a gyorsasága kisebb, mint az övé.*/
