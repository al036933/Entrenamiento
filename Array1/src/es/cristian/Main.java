package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Te voy a pedir 10 números enteros ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.print("Estos son los números que me has dado: ");
        //1, 2 3 4 5 6 7 8 9 y 10
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + "");

        if (numero

        }

        System.out.println();

        entrada.close();

    }
}
