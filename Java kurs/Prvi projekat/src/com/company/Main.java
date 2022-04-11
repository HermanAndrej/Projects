package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Unesite ime:");
        Scanner tastatura = new Scanner(System.in);
        String ime = tastatura.next();
        System.out.println("Dobar dan " + ime);
        System.out.println("Dobrodosli");
    }
}
