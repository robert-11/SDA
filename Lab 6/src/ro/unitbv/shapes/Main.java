package ro.unitbv.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Square("#a09542", 2, 4));
		shapes.add(new Rectangle("#f5f6f5", 3, 3, 5));
		shapes.add(new Circle("#f5f6f5", 4, 4));

		for (Shape s : shapes) {

			System.out.println("Name - " + s.getName());

			System.out.println("Area - " + s.getArea());

			System.out.println("Border width - " + s.getBorderWidth());

			System.out.println("Fill color- " + s.getHexFillColor());
			System.out.println();
			s.draw();

		}

	}

}