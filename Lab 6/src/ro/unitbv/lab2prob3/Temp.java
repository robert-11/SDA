package ro.unitbv.lab2prob3;

import java.util.Arrays;

public class Temp {


	public static void main(String[] args) {
		double[] sir1 = { 36.4, 37, 38.5, 37.7, 39.5, 40, 36, 39, 37.2, 36.2, 35 };
		double[] sir2 = new double[sir1.length];
		for (int j = 0; j < sir1.length; j++) {
			sir2[j] = sir1[j];
		}

		System.out.println("Temperaturi " + Arrays.toString(sir2));
		Arrays.sort(sir1);
		int i = 0;
		while (i < sir1.length && sir1[i] < 37) {
			i++;
		}
		double[] TempNormale = new double[i];
		double[] TempAnormale = new double[sir1.length - i];
		for (int j = 0; j < TempNormale.length; j++) {
			TempNormale[j] = sir1[j];
		}
		for (int j = 0; j < TempAnormale.length; j++) {
			TempAnormale[j] = sir1[j + i];
		}
		System.out.println("\n");
		System.out.println("Temperaturi normale " + Arrays.toString(TempNormale));

		for (int j = 0; j < TempNormale.length; j++) {
			for (int z = 0; z < sir2.length; z++) {

				if (sir2[z] == TempNormale[j])
					System.out.println("Temp: " + TempNormale[j] + "  id: " + z);
			}
		}
		System.out.println("\n");
		System.out.println("Temperaturi ridicate " + Arrays.toString(TempAnormale));
		for (int j = 0; j < TempAnormale.length; j++) {
			for (int z = 0; z < sir2.length; z++) {

				if (sir2[z] == TempAnormale[j])
					System.out.println("Temp: " + TempAnormale[j] + "  id: " + z);
			}
		}

	}

}