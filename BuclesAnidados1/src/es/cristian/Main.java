package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Dame número " + i + ": ");
            numero = entrada.nextInt();
        }



        entrada.close();
    }
}