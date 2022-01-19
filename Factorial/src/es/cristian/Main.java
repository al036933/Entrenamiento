package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, factorial = 1;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dame un número: ");
        n = entrada.nextInt();

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);

    }
}


