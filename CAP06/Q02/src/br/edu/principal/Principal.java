package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] qtd = new int[10];
        int[] preco = new int[10];
        int tot_geral = 0;
        int tot_vend;
        int comissao;
        int maior;
        int ind;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a quantidade: ");
            qtd[i] = scanner.nextInt();

            System.out.print("Digite o preço: ");
            preco[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            tot_vend = qtd[i] * preco[i];
            System.out.println("O item de quantidade " + qtd[i] + " e de preço " + preco[i] + 
                               " teve um total de vendas de " + tot_vend);
            tot_geral += tot_vend;
        }

        comissao = tot_geral * 5 / 100;
        System.out.println("O total geral foi de: " + tot_geral + " e a comissão foi de: " + comissao);

        maior = qtd[0];
        ind = 0;

        for (int i = 1; i < 10; i++) {
            if (qtd[i] > maior) {
                maior = qtd[i];
                ind = i;
            }
        }

        System.out.println("Preço do maior item: " + preco[ind] + " Índice: " + ind);
    }
}
