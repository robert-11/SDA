package ro.unitbv.shapes;

public class HexColorValidator {
	Boolean validate(String colorHex) {

		Boolean ok = true;

		if (colorHex.charAt(0) != '#') {
			ok = false;
			throw new IllegalArgumentException("Primul caracter din culoarea Hex trebuie sa fie '#'");

		}

		if (colorHex.length() != 7) {
			ok = false;
			throw new IllegalArgumentException("culoarea Hex trebuie sa contina 7 caractere");

		}

		int i = 1;
		while (i < 7)

		{
			if (colorHex.charAt(i) < 'a' && colorHex.charAt(i) < '0'
					|| colorHex.charAt(i) > 'f' && colorHex.charAt(i) > '9') {
				ok = false;
				throw new IllegalArgumentException(
						"Culoarea Hex trebuie sa contina doar caractere compuse din a-f, 0-9");
			}

			i++;

		}

		return ok;

	}
}