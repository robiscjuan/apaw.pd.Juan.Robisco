package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

	private static FactoriaCaracter factoriaCaracter = new FactoriaCaracter();

	private final Map<Character, Caracter> caracteres = new HashMap<>();

	public static FactoriaCaracter getFactoria() {
		return factoriaCaracter;
	}

	public Caracter get(char c) {

		if (!caracteres.containsKey(c)) {
			caracteres.put(c, new Caracter(c));
		}

		return caracteres.get(c);

	}

}
