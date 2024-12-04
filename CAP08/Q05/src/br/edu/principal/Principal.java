package br.edu.principal;
import br.edu.util.Funcao;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço antigo: ");
        double precoantigo = scanner.nextDouble();
        System.out.println("Digite o preço atual: ");
        double precoatual = scanner.nextDouble();

        double acrescimo = Funcao.reajuste(precoantigo, precoatual);
        System.out.println("O acréscimo percentual é: " + acrescimo + "%");

        scanner.close();
    }

    
}
