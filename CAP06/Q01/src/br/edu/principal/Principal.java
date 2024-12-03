package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[9];
        int cont;

        for (int i = 0; i < 9; i++) {
            System.out.print("Digite um número: ");
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            cont = 0;

            for (int j = 1; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    cont++;
                }
            }

            if (cont <= 2) {
                System.out.println("Número primo: " + num[i]);
                System.out.println("Índice: " + (i + 1));
            }
        }
    }
}
