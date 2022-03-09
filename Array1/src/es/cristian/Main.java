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

        System.out.println(" ");
        for (int i = 0; i < otrosNumeros.length; i++) {
            otrosNumeros[i] = numeros[i] * (-1);
        }

        System.out.println("Array 1: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println();
        System.out.println("Array 2: ");
        for (int i = 0; i < otrosNumeros.length; i++) {
            System.out.print(otrosNumeros[i] + " ");
        }
        entrada.close();
    }
}
