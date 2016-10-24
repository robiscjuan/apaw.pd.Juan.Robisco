package es.upm.miw.pd.composite.expression;

public class Resta extends Operador {

	public Resta(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
		this.operador = '-';
	}

	@Override
	protected int operar() {
		return this.expresion1.operar() - this.expresion2.operar();
	}
}
