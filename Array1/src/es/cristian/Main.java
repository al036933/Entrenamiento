package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] otrosNumeros = new int[5];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Te voy a pedir 5 números enteros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

        }
        System.out.println("Dame otros 5 números: " );
        for (int i = 0; i < otrosNumeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            otrosNumeros[i] = entrada.nextInt();


        }

        System.out.println("Estos son los numeros: ");
        // 1, 2, 3 4 5 6 7 8 8 9 10
        for (int i = 0; i < otrosNumeros.length; i++) {
            System.out.print(otrosNumeros[i] + "");
        }

        entrada.close();
    }
}
