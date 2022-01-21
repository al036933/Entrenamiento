package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n;
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Hasta qué número quieres la lista de impares? ");
        n = entrada.nextInt();

        System.out.println("Los números impares entre 0 y " + n + " son:");

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        entrada.close();
    }
}
