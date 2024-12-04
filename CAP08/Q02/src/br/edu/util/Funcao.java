package br.edu.util;
public class Funcao {

	public static int somar(int num1, int num2) {
		int i, s = 0;
    
		for (i = num1 + 1; i < num2; i++) {
			s += i;
		}
    
		return s;
	}
}
