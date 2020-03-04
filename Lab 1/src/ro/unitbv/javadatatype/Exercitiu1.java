package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercitiu1 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner scanner = new Scanner(System.in);
		
		//afiseaza mesajul in consola
		System.out.println("Introdu nr 1: ");
		int nr1 = scanner.nextInt();
		System.out.println("Introdu nr 2: ");
		int nr2 = scanner.nextInt();
				
		//afiseaza output-ul
		System.out.println("Nr citit este: " +nr1);
		System.out.println("Nr citit este: "+nr2);
		
		System.out.println("Suma: " +(nr1+nr2));
		System.out.println("Diferenta: " +(nr1-nr2));
		System.out.println("Produsul: " +(nr1*nr2));
		System.out.println("Media: " +((nr1+nr2)/2));
		System.out.println("Maxim: " + Math.max(nr1, nr2));
		double impartire = (double)nr1/nr2;
		System.out.println("Impartirea: " +impartire);
	}

}
