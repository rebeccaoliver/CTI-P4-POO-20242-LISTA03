package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
        int[] voo = new int[12];
        String[] origem = new String[12];
        String[] destino = new String[12];
        int[] lugares = new int[12];
        int op, op2, num_voo, i;
        String local;
        
        for (i = 0; i < 12; i++) {
            System.out.print("Digite o número do voo: ");
            voo[i] = scanner.nextInt();
            System.out.print("Digite o local de origem: ");
            origem[i] = scanner.next();
            System.out.print("Digite o local de destino: ");
            destino[i] = scanner.next();
            System.out.print("Digite o número de lugares disponíveis: ");
            lugares[i] = scanner.nextInt();
        }

        
        while (true) {
            System.out.println("\n1- Consultar");
            System.out.println("2- Reservar");
            System.out.println("3- Finalizar");
            System.out.print("Digite sua opção: ");
            op = scanner.nextInt();

            if (op == 1) {
                System.out.println("\n1- Consulta por voo");
                System.out.println("2- Consulta por origem");
                System.out.println("3- Consulta por destino");
                System.out.print("Digite sua opção: ");
                op2 = scanner.nextInt();

                if (op2 == 1) {
                    System.out.print("Digite o número de voo: ");
                    num_voo = scanner.nextInt();
                    i = 0;
                    while (i < 12 && voo[i] != num_voo) {
                        i++;
                    }
                    if (i == 12) {
                        System.out.println("Voo inexistente");
                    } else {
                        System.out.println("Número do voo: " + voo[i]);
                        System.out.println("Local de origem: " + origem[i]);
                        System.out.println("Local de destino: " + destino[i]);
                        System.out.println("Lugares disponíveis: " + lugares[i]);
                    }
                }

                if (op2 == 2) {
                    System.out.print("Digite o local de origem: ");
                    local = scanner.next();
                    boolean found = false;
                    for (i = 0; i < 12; i++) {
                        if (origem[i].equals(local)) {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Local de origem: " + origem[i]);
                            System.out.println("Local de destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Nenhum voo encontrado para a origem especificada.");
                    }
                }

                if (op2 == 3) {
                    System.out.print("Digite o local de destino: ");
                    local = scanner.next();
                    boolean found = false;
                    for (i = 0; i < 12; i++) {
                        if (destino[i].equals(local)) {
                            System.out.println("Número do voo: " + voo[i]);
                            System.out.println("Local de origem: " + origem[i]);
                            System.out.println("Local de destino: " + destino[i]);
                            System.out.println("Lugares disponíveis: " + lugares[i]);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Nenhum voo encontrado para o destino especificado.");
                    }
                }
            }

            if (op == 2) {
                System.out.print("Digite o número do voo desejado: ");
                num_voo = scanner.nextInt();
                i = 0;
                while (i < 12 && voo[i] != num_voo) {
                    i++;
                }
                if (i == 12) {
                    System.out.println("Número de voo não encontrado");
                } else {
                    if (lugares[i] == 0) {
                        System.out.println("Voo lotado");
                    } else {
                        lugares[i]--;
                        System.out.println("Reserva confirmada!");
                    }
                }
            }

            if (op == 3) {
                System.out.println("Sistema finalizado.");
                break; 
            }
        }

        scanner.close();

	}

}
