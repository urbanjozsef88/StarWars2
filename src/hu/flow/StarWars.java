package hu.flow;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StarWars {

    public static void main(String[] args) {

            StarWars.urhajok("src/hu/flow/urhajok.txt");


        for (Urhajo i: hangar) {System.out.println(i);}

    }

    public static List<Urhajo> hangar = new ArrayList<>();

    public static void urhajok(String path) {

        File file = new File(path);
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(fileReader);


        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (line != null) {
            List<String> list;
            list = Arrays.asList(line.split(" ", 2));
            if (list.get(0).equals("MilleniumFalcon")) {
                MilleniumFalcon first = new MilleniumFalcon();

                for (int i = 0; i < Integer.parseInt(list.get(1)); i++) {
                    first.hiperUgras();
                }
                hangar.add(first);
            }

            if (list.get(0).equals("XWing")) {
                XWing second = new XWing();
                for (int i = 0; i < Integer.parseInt(list.get(1)); i++) {
                    second.hiperUgras();
                }
                hangar.add(second);

            }
            try {
                line = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}





/*

    Írj egy Urhajo interfészt, ami egy legyorsuljaE metódust tartalmaz.
    A metódus paramétere egy Urhajo objektum, és egy logikai értékkel tér vissza. Legyen egy milyenGyors
        metódusa is, ami nem kér paramétert, és az Urhajo gyorsaságát fogja visszaadni.
        • Írj Hiperhajtomu interfészt, ami egy visszatérés nélküli hiperUgras() metódust tartalmaz
        • Írj egy LazadoGep absztrakt osztályt, ami implementálja az Urhajo interfészt.

        A MilleniumFalcon objektumot csak akkor tudja legyőzni, ha gyorsasága kétszer nagyobb.
    akítható, kiírva az adattagok értékét.



        • Írj egy MilleniumFalcon osztályt, ami implementálja az Urhajo és Hiperhajtomu interfészeket.

        • Írj egy StarWars nevű futtatható osztályt. Az osztály rendelkezzen egy urhajok statikus függvénnyel,
         ami egy fájl elérési útját várja paraméterül, visszatérése pedig void. A
        metódus feladata, hogy a fájlból beolvasott sorokat feldolgozza, és létrehozzon belőlük
        XWing, vagy MilleniumFalcon objektumpéldányokat, majd ezekre meghívja a hiperUgras metódust annyiszor,
        ahányszor az aktuális sor írja. Ezeket egy közös kollekcióban
        tárold le.

        Készíts továbbá egy hangar statikus metódust, ami végigmegy a tárolóban
        tárolt objektumokon, és kiírja őket. Hívd meg a main függvényben sorban a fenti két
        metódust. Minden esetleges kivételt (főleg: IOException) kezelj le vagy kivétel specifikációval,
         vagy try blokkban!
        Egy minta fájl felépítése az alábbi:
        XWing 4
        MilleniumFalcon 18*/
