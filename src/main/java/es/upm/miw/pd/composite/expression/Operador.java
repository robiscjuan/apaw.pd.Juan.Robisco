package es.upm.miw.pd.composite.expression;

public abstract class Operador extends Expresion {
	protected Expresion expresion1;
	protected Expresion expresion2;
	protected char operador;

	public Operador(Expresion expresion1, Expresion expresion2) {
		this.expresion1 = expresion1;
		this.expresion2 = expresion2;
	}

	public String toString() {
		return "(" + expresion1 + operador + expresion2 + ")";
	}
}
