package org.example.exo2;

import java.util.Scanner;

public class AskName {


    public static void ask() {

        String nom;

        System.out.println("votre nom ? ");
        Scanner sc = new Scanner(System.in);
        nom = sc.next();
        System.out.println("Bonjour  " + nom);

    }


}
