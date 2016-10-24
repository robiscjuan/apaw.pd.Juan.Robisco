package es.upm.miw.pd.composite.expression;

public class Numero extends Expresion {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int operar() {
		return this.numero;
	}

	public String toString() {
		return "" + this.numero;
	}

}
