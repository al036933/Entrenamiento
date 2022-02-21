package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un número: ");
        numero = entrada.nextInt();

        while (numero != 0) {
            System.out.print("Dame un número: ");
            numero = entrada.nextInt();

        }

        entrada.close();
    }
}
