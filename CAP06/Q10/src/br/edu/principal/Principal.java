package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		 String[] gabarito = new String[8];
	        String[] resposta = new String[8];
	        int num, pontos, tot_ap = 0, perc_ap;
	        int i, j;

	        for (i = 0; i < 8; i++) {
	            System.out.println("Digite a resposta da questão " + (i + 1) + ": ");
	            gabarito[i] = scanner.nextLine();
	        }

	        for (i = 0; i < 10; i++) {
	            System.out.println("Digite o número do " + (i + 1) + "º aluno: ");
	            num = scanner.nextInt();
	            scanner.nextLine();

	            pontos = 0;
	            for (j = 0; j < 8; j++) {
	                System.out.println("Digite a resposta dada pelo aluno " + num + " à " + (j + 1) + "ª questão: ");
	                resposta[j] = scanner.nextLine();
	                if (resposta[j].equals(gabarito[j])) {
	                    pontos++;
	                }
	            }

	            System.out.println("A nota do aluno " + num + " foi " + pontos);

	            if (pontos >= 6) {
	                tot_ap++;
	            }
	        }

	        perc_ap = (tot_ap * 100) / 10;
	        System.out.println("O percentual de alunos aprovados é " + perc_ap + "%");

	        scanner.close();
		
	}

}
