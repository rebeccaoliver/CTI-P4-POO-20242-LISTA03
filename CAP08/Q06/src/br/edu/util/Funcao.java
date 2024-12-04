package br.edu.util;
public class Funcao {

	public static void multiplicacao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
