package org.example.exo8;

import java.util.Scanner;

public class AskNbr1to3 {

    public static void askNbr() {

        float n = 0;

         do {
            System.out.println("entrer un nombre : ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
        } while( n < 1 || n > 3);

    }

}
