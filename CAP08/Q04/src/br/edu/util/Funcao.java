package br.edu.util;
public class Funcao {

	 public static void transformacao(int segundos) {
	        int hrs, min, seg, resto;

	        hrs = segundos / 3600;

	        resto = segundos % 3600;

	        min = resto / 60;

	        seg = resto % 60;

	        System.out.println(hrs + " horas, " + min + " minutos, " + seg + " segundos");
	    }
}
