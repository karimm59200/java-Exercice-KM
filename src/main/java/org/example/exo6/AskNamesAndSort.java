package org.example.exo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AskNamesAndSort {

    public static void askNames() {
        String name1;
        String name2;
        String name3;


        String [] names = {};

        System.out.println("entrez un premier nom : ");
        Scanner sc = new Scanner(System.in);
        name1 = sc.next();


        System.out.println("entrez un deuxième nom : ");
        name2 = sc.next();


        System.out.println("entrez un troisième nom : ");
        name3 = sc.next();




        if( (name1.compareTo(name2)<0) && (name2.compareTo(name3)<0)) {

            System.out.println("les noms sont triés dans l'ordre alphabétique");
        } else {
            System.out.println("les noms ne sont pas triés dans l'ordre alphabétique");
        }
    }
}
