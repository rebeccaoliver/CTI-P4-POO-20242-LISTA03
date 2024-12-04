package br.edu.principal;
import br.edu.util.Funcao;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de segundos: ");
        int seg = scanner.nextInt();
        Funcao.transformacao(seg);

        scanner.close();
    }

   
}
