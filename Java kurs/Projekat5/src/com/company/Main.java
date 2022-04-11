package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Unesi svoje godine:");

        Scanner tast = new Scanner(System.in);

        int godine = tast.nextInt();
        if (godine >= 18)  {
            System.out.println("Vi ste punoljetni!");

        }
        else System.out.println("Vi niste punoljetni!");


    }
}
