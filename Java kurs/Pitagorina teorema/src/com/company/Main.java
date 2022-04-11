package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Pitagora");
        System.out.println("Unesi vrijednost kateta trougla a i b:");
        Scanner tast = new Scanner(System.in);

        int a = tast.nextInt();
        int b = tast.nextInt();

        Double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Duzina hipotenuze je: " + c);
    }
}
