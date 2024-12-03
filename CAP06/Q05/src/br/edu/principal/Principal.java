package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] X = new int[10];
        int[] Y = new int[10];
        int[] uniao = new int[20];
        int[] diferenca = new int[10];
        int[] soma = new int[10];
        int[] produto = new int[10];
        int[] intersecao = new int[10];
        int contIntersecao = 0;
        int contDiferenca = 0;
        int contUniao = 0;

        System.out.println("Digite os valores para o vetor X (10 números):");
        for (int i = 0; i < 10; i++) {
            X[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores para o vetor Y (10 números):");
        for (int i = 0; i < 10; i++) {
            Y[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            boolean existe = false;
            for (int j = 0; j < contUniao; j++) {
                if (uniao[j] == X[i]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                uniao[contUniao++] = X[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            boolean existe = false;
            for (int j = 0; j < contUniao; j++) {
                if (uniao[j] == Y[i]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                uniao[contUniao++] = Y[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            boolean existeEmY = false;
            for (int j = 0; j < 10; j++) {
                if (X[i] == Y[j]) {
                    existeEmY = true;
                    break;
                }
            }
            if (!existeEmY) {
                boolean jaAdicionado = false;
                for (int k = 0; k < contDiferenca; k++) {
                    if (diferenca[k] == X[i]) {
                        jaAdicionado = true;
                        break;
                    }
                }
                if (!jaAdicionado) {
                    diferenca[contDiferenca++] = X[i];
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            soma[i] = X[i] + Y[i];
        }

        for (int i = 0; i < 10; i++) {
            produto[i] = X[i] * Y[i];
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (X[i] == Y[j]) {
                    boolean jaAdicionado = false;
                    for (int k = 0; k < contIntersecao; k++) {
                        if (intersecao[k] == X[i]) {
                            jaAdicionado = true;
                            break;
                        }
                    }
                    if (!jaAdicionado) {
                        intersecao[contIntersecao++] = X[i];
                    }
                }
            }
        }

        System.out.println("\nUnião:");
        for (int i = 0; i < contUniao; i++) {
            System.out.print(uniao[i] + " ");
        }
        System.out.println();

        System.out.println("\nDiferença:");
        for (int i = 0; i < contDiferenca; i++) {
            System.out.print(diferenca[i] + " ");
        }
        System.out.println();

        System.out.println("\nSoma:");
        for (int i = 0; i < 10; i++) {
            System.out.print(soma[i] + " ");
        }
        System.out.println();

        System.out.println("\nProduto:");
        for (int i = 0; i < 10; i++) {
            System.out.print(produto[i] + " ");
        }
        System.out.println();

        System.out.println("\nInterseção:");
        for (int i = 0; i < contIntersecao; i++) {
            System.out.print(intersecao[i] + " ");
        }
        System.out.println();
    }
}
