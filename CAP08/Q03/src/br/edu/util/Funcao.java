package br.edu.util;
public class Funcao {

    public static int divisores(int a, int b, int c) {
        int s = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                s += i;
            }
        }

        return s;
    }
}
