package br.edu.principal;
import java.util.Scanner;
import br.edu.util.Funcao;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double Num, x;		
		System.out.println("Digite número positivo ou negativo: ");
		Num = scanner.nextDouble();
		x = Funcao.ver(Num);
		if (x == 1) {
			System.out.println("Esse número é positivo");
		} else {
			System.out.println("Esse número é negativo");
		}
		
	}

}
