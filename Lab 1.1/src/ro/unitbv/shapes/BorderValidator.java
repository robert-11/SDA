package ro.unitbv.shapes;

public class BorderValidator {
	Boolean validate(int borderWidth) {
		Boolean ok = true;

		if (borderWidth < 0) {
			ok = false;
			throw new IllegalArgumentException("Valoarea grosimii marginii nu poate fi mai mica ca 0.");
		}

		return ok;
	}

}
