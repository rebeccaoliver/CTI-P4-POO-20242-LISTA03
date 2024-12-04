package br.edu.principal;
import br.edu.util.Funcao;
import java.util.Scanner;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        char letra;
        double media;

        do {
            System.out.println("Digite 'A' para média aritmética ou 'P' para média ponderada: ");
            letra = scanner.next();
        } while (letra != 'A' && letra != 'P');

        media = Funcao.calcula_media(nota1, nota2, nota3, letra);

        if (letra == 'A') {
            System.out.println("A média aritmética é: " + media);
        } else {
            System.out.println("A média ponderada é: " + media);
        }

        scanner.close();
    }

    
}
