package hu.flow;


import java.util.Random;

public class XWing extends Lazadogep implements Hiperhajtomu{


    public XWing() {
        super(150, true);
    }

    @Override
    public boolean elkapjaAVonosugar() {
        if(this.getSpeed() < 10000 && this.isCanBreakDown()){return true;}
        else { return false;}
    }

    @Override
    public void hiperUgras() {
        Random rmd = new Random();
        this.setSpeed(this.getSpeed() + rmd.nextInt(100) );
    }

    @Override
    public String toString() {
        return "XWing" + "speed= " + this.getSpeed();
    }
}


/*
 • Írj egy XWing osztályt, ami a LazadoGep leszármazottja, és megvalósítja az Hiperhajtomu interfészt.
         – Az osztálynak egy default konstruktora legyen, ami beállítja az X-Wing tulajdonságait.
        Az X-Wing sebessége 150, és meghibásodhat.
        – Ha az X-Wing hiperugrást végez, akkor sebessége egy 0-100 közötti véletlenszerű
        lebegőpontos számmal nő.
        – Az X-Wing et akkor kapja el a vonósugár, ha meghibásodhat, és sebessége kisebb,
        mint 10000.
        – Az osztály legyen továbbá szöveges formára alakítható. Az adattagok értékein kívül
        írja ki azt is, hogy egy X-Wingről van szó.*/
