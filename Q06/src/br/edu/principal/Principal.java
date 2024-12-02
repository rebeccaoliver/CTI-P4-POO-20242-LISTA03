package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int vet[], i, j, aux;
		vet = new int[10];
		
		for(i = 0; i < 10; i++) {
		System.out.print("Digite o valor para vetor[" + (i + 1) + "]: ");
		vet[i] = scanner.nextInt();
		}
		
		for ( i = 0; i < 10; i++ ) {
			for (j = 0; j < 9 - i; j++) {
				if (vet[j] < vet[j+1]) {
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		for(i = 0; i <10; i++) {
			System.out.println("Vetor " + vet[i] + "");
		}
		scanner.close();
	}

}
