package Repaso1;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		int n = entrada.nextInt();
		double i = 1;
		double totalsuma = 0;
		while(i <= n) {
			totalsuma = totalsuma + (1/i);
			i++;
		}
		System.out.println("La serie desde 1 hasta " + n + " es: " + totalsuma);
	}
}