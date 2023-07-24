package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Identificacion {

	public String checkTipo(String dni) {
		Pattern pattern = Pattern.compile("[0-9]{8}[A-Z]{1}");

		Matcher matcher = pattern.matcher(dni);
		if (matcher.matches()) {
			return "nif";
		}

		Pattern pattern1 = Pattern.compile("[A-Z]{1}[0-9]{8}");

		Matcher matcher1 = pattern1.matcher(dni);
		if (matcher1.matches()) {
			return "nie";
		}

		Pattern pattern2 = Pattern.compile("[A-Z]{3}[0-9]{6}");

		Matcher matcher2 = pattern2.matcher(dni);
		if (matcher2.matches()) {
			return "pasaporte";
		}
		return "nada";

	}

}
