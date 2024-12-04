package br.edu.util;
public class Funcao {

	public static double reajuste(double PA, double PN) {
        double result = (100 * PN - 100 * PA) / PA;

        return result;
    }
}
