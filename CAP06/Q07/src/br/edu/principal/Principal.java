package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Criando o vetor com 8 elementos
        int[] vet = new int[8];
        int i, j, z, aux;

        // Scanner para ler os valores de entrada
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores para o vetor
        for (i = 0; i < 8; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vet[i] = scanner.nextInt();
        }

        // Algoritmo de ordenação por inserção
        for (i = 1; i < 8; i++) {
            aux = vet[i]; // Pega o valor a ser inserido
            j = i - 1;

            // Encontra a posição correta para o valor de 'aux'
            while (j >= 0 && vet[j] > aux) {
                vet[j + 1] = vet[j]; // Desloca os elementos maiores para a direita
                j--;
            }

            // Insere o valor na posição correta
            vet[j + 1] = aux;
        }

        // Imprime o vetor ordenado
        System.out.println("Vetor ordenado:");
        for (i = 0; i < 8; i++) {
            System.out.print(vet[i] + " ");
        }

        // Fecha o scanner
        scanner.close();
    }
}
