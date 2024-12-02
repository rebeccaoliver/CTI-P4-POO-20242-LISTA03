package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] X = new int[5];
        int[] Y = new int[5];
        int[] R = new int[10];
        int aux, j = 0;
        
        
        System.out.println("Digite os valores para o vetor X (5 elementos):");
        for (int i = 0; i < 5; i++) {
            X[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 4; i++) {  
            for (int j1 = 0; j1 < 4 - i; j1++) {
                if (X[j1] > X[j1 + 1]) {
                    aux = X[j1];
                    X[j1] = X[j1 + 1];
                    X[j1 + 1] = aux;
                }
            }
        }

        
        System.out.println("Digite os valores para o vetor Y (5 elementos):");
        for (int i = 0; i < 5; i++) {
            Y[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < 4; i++) {
            for (int j1 = 0; j1 < 4 - i; j1++) {
                if (Y[j1] > Y[j1 + 1]) {
                    aux = Y[j1];
                    Y[j1] = Y[j1 + 1];
                    Y[j1 + 1] = aux;
                }
            }
        }

        
        for (int i = 0; i < 5; i++) {
            R[j] = X[i];
            j++;
            R[j] = Y[i];
            j++;
        }

        
        for (int i = 0; i < 9; i++) {
            for (int j1 = 0; j1 < 9 - i; j1++) {
                if (R[j1] > R[j1 + 1]) {
                    aux = R[j1];
                    R[j1] = R[j1 + 1];
                    R[j1 + 1] = aux;
                }
            }
        }

        
        System.out.println("Vetor X ordenado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(X[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor Y ordenado:");
        for (int i = 0; i < 5; i++) {
            System.out.print(Y[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor R ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(R[i] + " ");
        }
        System.out.println();
        scanner.close();
	}

}
