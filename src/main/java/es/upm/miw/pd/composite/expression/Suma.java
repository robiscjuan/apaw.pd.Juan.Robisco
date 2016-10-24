package es.upm.miw.pd.composite.expression;

public class Suma extends Operador {

	public Suma(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
		this.operador = '+';
	}

	@Override
	public int operar() {
		return this.expresion1.operar() + this.expresion2.operar();
	}

}
