package br.edu.util;
public class Funcao {

	public static double calcula_media(double Num1, double Num2, double Num3, String l) {
        double media;

        if (l.equals("A")) {
            media = (Num1 + Num2 + Num3) / 3;  
        } else {
            media = (Num1 * 5 + Num2 * 3 + Num3 * 2) / (5 + 3 + 2);  
        }

        return media;
    }
}
