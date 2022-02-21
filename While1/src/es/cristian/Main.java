package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un número positivo: ");
        numero = entrada.nextInt();

        while (numero < 0) {
            System.out.println("ERROR: el número " + numero + " no es positivo.");
            System.out.print("Dame un número positivo: ");
            numero = entrada.nextInt();
        }

        System.out.println("Este es el número que me has dado: " + numero);
    }
}
