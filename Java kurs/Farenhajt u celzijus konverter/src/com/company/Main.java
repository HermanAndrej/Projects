package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Unesite vrijednost u F:");
        Scanner tast = new Scanner(System.in);

        int a = tast.nextInt();

        int b = (a - 32) * 5/9;

        System.out.println("Vrijednost u C: " + b);

    }
}
