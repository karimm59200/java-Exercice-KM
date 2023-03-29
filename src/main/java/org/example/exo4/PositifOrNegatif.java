package org.example.exo4;

import java.util.Scanner;

public class PositifOrNegatif {

    public static void askNomber(){


        int nbr;

        System.out.println("entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        nbr = sc.nextInt();

        if(  nbr > 0 ){
            System.out.println("le nnombre est positif");
        } else if (nbr < 0 ) {
            System.out.println("le nombre est négatif");
        } else {
            System.out.println("C'est surement égale à zéro !");
        }
    }


}
