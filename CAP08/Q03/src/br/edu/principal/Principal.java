package br.edu.principal;
import br.edu.util.Funcao;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, result;

		do {
			System.out.println("Digite o valor de a (deve ser maior que 1): ");
			a = scanner.nextInt();
		} while (a <= 1);

		System.out.println("Digite o valor de b: ");
		b = scanner.nextInt();
		System.out.println("Digite o valor de c: ");
		c = scanner.nextInt();

		result = Funcao.divisores(a, b, c);
		System.out.println("Soma dos inteiros divisíveis por " + a + " entre " + b + " e " + c + " = " + result);
		scanner.close();}
}

