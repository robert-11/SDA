package ro.unitbv.lab6maps;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class main {
	public static void main(String[] args) {
		double[] mate =  new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double[] istorie = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		info s1 = new info("Robert", "Andrei", istorie[0], mate[9]);
		info s2 = new info("Popescu", "Ion", istorie[1], mate[8]);
		info s3 = new info("George", "Mihai", istorie[2], mate[7]);
		info s4 = new info("Marian", "Marin", istorie[3], mate[6]);
		info s5 = new info("Catalin", "Nicolae", istorie[4], mate[5]);
		info s6 = new info("Mihai", "Ghiorghe", istorie[5], mate[4]);
		info s7 = new info("Liviu", "Toma", istorie[6], mate[3]);
		info s8 = new info("Andreea", "Dumitru", istorie[7], mate[2]);
		info s9 = new info("Ioana", "Popescu", istorie[8], mate[1]);
		info s10 = new info("Ana", "Maria", istorie[9], mate[0]);

		HashMap<String, info> catalog = new HashMap<String, info>();

		catalog.put("1a", s1);
		catalog.put("2b", s2);
		catalog.put("3c", s3);
		catalog.put("4d", s4);
		catalog.put("5a", s5);
		catalog.put("6a", s6);
		catalog.put("7c", s7);
		catalog.put("8f", s8);
		catalog.put("9z", s9);
		catalog.put("15", s10);

		System.out.println(catalog.get("15"));

		System.out.println("\n" + "LinkedHashMap!!!!!!!!!!!!!!!!!!" + "\n");

		LinkedHashMap<String, info> catalog1 = new LinkedHashMap<String, info>();
		catalog1.put("19f", s1);
		catalog1.put("1fjsdg", s2);
		catalog1.put("4ff", s3);
		catalog1.put("9z", s4);
		catalog1.put("adf", s5);
		catalog1.put("555", s6);
		catalog1.put("5547h", s7);
		catalog1.put("88", s8);
		catalog1.put("098", s9);
		catalog1.put("abcd", s10);

		System.out.println(catalog1.get("9z"));
	}
}
