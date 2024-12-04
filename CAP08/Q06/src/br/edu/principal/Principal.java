package br.edu.principal;
import br.edu.util.Funcao;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Digite um número entre 1 e 9: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 9); 

        Funcao.multiplicacao(num);
        scanner.close();
    }

    
}
