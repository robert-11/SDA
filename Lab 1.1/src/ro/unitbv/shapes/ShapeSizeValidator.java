package ro.unitbv.shapes;

public class ShapeSizeValidator {

	Boolean validateSquare(int size) {

		Boolean ok = true;

		if (size < 0) {
			ok = false;
			throw new IllegalArgumentException("Dimensiunea trebuie sa fie mai mare ca 0.");
		}
		return ok;
	}

	Boolean validateRectangle(int width, int height) {
		Boolean ok = true;
		if (width < 0 || height < 0) {
			ok = false;
			throw new IllegalArgumentException("Lungimea/latimea trebuie sa fie mai mare ca 0.");
		}
		return ok;
	}

	Boolean validateCircle(int radius) {

		Boolean ok = true;
		if (radius < 0) {
			ok = false;
			throw new IllegalArgumentException("Raza trebuie sa fie mai mare ca 0.");
		}
		return ok;
	}
}