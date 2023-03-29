package org.example.exo5;

import java.util.Scanner;

public class ProduitNegatifOrNot {

    public static void askNbrProdNegOrNot() {

        int nbr1;
        int nbr2;

        System.out.println("entrez un nombre : ");
        Scanner sc = new Scanner(System.in);
        nbr1 = sc.nextInt();

        System.out.println("entrez un deuxième nombre : ");
        nbr2 = sc.nextInt();

        if ((nbr1 > 0 && nbr2 > 0) || (nbr1 < 0 && nbr2 < 0)) {
            System.out.println("le produit  des deux nombres est positif");
        } else {
            System.out.println("le produit des deux nombres est négatif");
        }
    }
}
