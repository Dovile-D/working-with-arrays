package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] skaiciai = {5.16, 8.99, -6.28, 11.04, -58.39, 17.99, -0.97};
        spausdintiMasyvoElementus(skaiciai);
        spausdinti("masyve yra: ", + skaiciai.length, " elementai");
        int neigiamiSkaiciai = skaiciuotiNeigiamusElementus(skaiciai);
        spausdinti("masyve yra: ", neigiamiSkaiciai, " neigiami skaiciai");
        double teigiamuSkaiciuSuma = skaiciuotiTeigiamuElementuSuma(skaiciai);
        spausdinti("masyve esanciu teigiamu skaiciu suma lygi: ", teigiamuSkaiciuSuma);
        double teigiamuSkaiciuSandauga = skaiciuotiTeigiamuElementuSandauga(skaiciai);
        spausdinti("masyve esanciu teigiamu skaiciu sandauga lygi: ", teigiamuSkaiciuSandauga);
        int teigiamuElementuSkaicius = skaiciuotiTeigiamusMasyvoElementus(skaiciai);
        double[] teigiamiSkaiciai = gautiTeigiamusMasyvoElementus(skaiciai, teigiamuElementuSkaicius);
        spausdinti("Naujasis teigiamu skaiciu masyvas: ", Arrays.toString(teigiamiSkaiciai));
    }


    /**
     * Funkcija terminale isvedanti pranesima vartotojui
     *
     * @param tekstas    tekstas
     * @param kintamasis kintamasis
     */
    public static void spausdinti(String tekstas, String kintamasis) {
        System.out.println(tekstas + kintamasis);
    }

    /**
     * Funkcija terminale isvedanti pranesima vartotojui.
     *
     * @param tekstas    tekstas
     * @param kintamasis skaicius
     */
    public static void spausdinti(String tekstas, double kintamasis) {
        System.out.println(tekstas + kintamasis);
    }

    /**
     * funkcija terminale isvedanti pranesima vartotojui
     *
     * @param tekstas1   pirma teksto dalis
     * @param kintamasis skaicius
     * @param tekstas2   antra teksto dalis
     */
    public static void spausdinti(String tekstas1, int kintamasis, String tekstas2) {
        System.out.println(tekstas1 + kintamasis + tekstas2);
    }

    /**
     * funkcija terminale isvedanti pranesima vartotojui
     *
     * @param kintamasis1 pirmasis skaicius
     * @param tekstas     tekstas
     * @param kintamasis2 antrasis skaicius
     */
    public static void spausdinti(int kintamasis1, String tekstas, double kintamasis2) {
        System.out.println(kintamasis1 + tekstas + kintamasis2);
    }

    /**
     * Funkcija isvedanti terminale masyvo elementus
     *
     * @param masyvas masyvas
     */
    public static void spausdintiMasyvoElementus(double[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            spausdinti(i, " elementas - ", masyvas[i]);
        }
    }

    /**
     * Funkcija suskaiciuojanti neigiamus skaicius, esancius masyve
     *
     * @param masyvas masyvas
     * @return neigiamu elementu kiekis
     */
    public static int skaiciuotiNeigiamusElementus(double[] masyvas) {
        int neigiamiSkaiciai = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < 0) {
                neigiamiSkaiciai++;
            }
        }
        return neigiamiSkaiciai;
    }

    /**
     * Funkcija skaiciuojanti teigiamu skaiciu, esanciu masyve, suma:
     *
     * @param masyvas masyvas
     * @return teigiamu skaiciu, esanciu masyve, suma
     */
    public static double skaiciuotiTeigiamuElementuSuma(double[] masyvas) {
        double teigiamuSkaiciuSuma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 0) {
                teigiamuSkaiciuSuma = teigiamuSkaiciuSuma + masyvas[i];
            }
        }
        return teigiamuSkaiciuSuma;
    }

    /**
     * Funkcija skaiciuojanti teigiamu skaiciu, esanciu masyve, sandauga:
     *
     * @param masyvas masyvas
     * @return teigiamu sandauga, esanciu masyve, suma
     */
    public static double skaiciuotiTeigiamuElementuSandauga(double[] masyvas) {
        double teigiamuSkaiciuSandauga = 1;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 0) {
                teigiamuSkaiciuSandauga = teigiamuSkaiciuSandauga * masyvas[i];
            }
        }
        return teigiamuSkaiciuSandauga;
    }

    /**
     * Funkcija skaiciuojanti teigiamu elementu skaiciu masyve
     *
     * @param masyvas masyvas
     * @return teigiamu masyvo elementu skaicius
     */
    public static int skaiciuotiTeigiamusMasyvoElementus(double[] masyvas) {
        int teigiamuElementuSkaicius = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 0) {
                teigiamuElementuSkaicius++;
            }
        }
        return teigiamuElementuSkaicius;
    }

    /**
     * Funkcija is pateikto skaiciu masyvo sukurianti teigiamu skaiciu masyva
     *
     * @param masyvas                  masyvas
     * @param teigiamuElementuSkaicius teigiamu elementu skaicius
     * @return teigiamu skaiciu masyvas
     */
    public static double[] gautiTeigiamusMasyvoElementus(double[] masyvas, int teigiamuElementuSkaicius) {
        int j = 0;
        double[] teigiamiSkaiciai = new double[teigiamuElementuSkaicius];
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] > 0) {
                teigiamiSkaiciai[j] = masyvas[i];
                j++;
            }
        }
        return teigiamiSkaiciai;
    }
}
