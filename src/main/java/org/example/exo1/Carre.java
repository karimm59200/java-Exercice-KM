package org.example.exo1;

import java.util.Scanner;

public class Carre {

    public static void demanderNombreAuCarre() {

        int nombre;

        System.out.println("le nombre ? ");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextInt();
        System.out.println("Le nombre est : " + nombre);

        System.out.println("Le nombre au carré est : " + (nombre * nombre));


    }

}
