package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	System.out.println("Unesite 2 broja:");
    	Scanner tast = new Scanner(System.in);

	    int x = tast.nextInt();
	    int y = tast.nextInt();

	    int rezultat = x + y;
	    System.out.println("Zbir = " + rezultat);

	    System.out.println("Unesite 2 broja:");

	    double a = tast.nextDouble();
		double b = tast.nextDouble();
	    double rezultat2 = b - a;
	    System.out.println("Razlika = " + rezultat2);
    }
}
