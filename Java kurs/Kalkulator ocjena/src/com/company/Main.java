package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Unesi broj poena");
        Scanner tast = new Scanner(System.in);
        int poeni = tast.nextInt();

        int ocjena;

        if (poeni >= 91)
            ocjena = 10;
        else if (poeni >= 81)
            ocjena = 9;
        else if (poeni >= 71)
            ocjena = 8;
        else if (poeni >= 61)
            ocjena = 7;
        else if (poeni >= 51)
            ocjena = 6;
        else ocjena = 5;

        System.out.println("Ocjena je " + ocjena);

        switch (ocjena) {
            case 10:
                System.out.println("Cestitamo!");
                break;
            case 9:
                System.out.println("Dobro ste uradili ispit");
                break;
            case 8:
                System.out.println("Dobro!");
                break;
            case 7:
            case 6:
                System.out.println("Polozili ste!");
                break;
            default:
                System.out.println("Pali ste!");

        }
    }
}
