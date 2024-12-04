package br.edu.principal;
import br.edu.util.Funcao;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1, num2, s;
        
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();
        
        s = Funcao.somar(num1, num2);
        System.out.println("Soma = " + s);
        scanner.close();
    }
    
   
}
