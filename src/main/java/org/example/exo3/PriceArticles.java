package org.example.exo3;

import java.util.Scanner;

public class PriceArticles {

    public static void article() {
        int priceHT;
        int nbrArticles;
        float TVA;
        double totalPrice;


        System.out.println("le nombre  d'articles ? ");
        Scanner sc = new Scanner(System.in);
        nbrArticles = sc.nextInt();

        System.out.println("Le nombre  d'articles est : " + nbrArticles);


        System.out.println("le prix  HT? ");
        Scanner sc2 = new Scanner(System.in);
        priceHT = sc2.nextInt();

        System.out.println("Le prix HT est de : " + priceHT);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("TVA : ");
        TVA = sc3.nextInt();

        totalPrice = (nbrArticles * priceHT * (1 + TVA / 100));
        System.out.println(" le prix total est de  : " + totalPrice);


    }


}
