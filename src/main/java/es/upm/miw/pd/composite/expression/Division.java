package es.upm.miw.pd.composite.expression;

public class Division extends Operador {

	public Division(Expresion expresion1, Expresion expresion2) {
		super(expresion1, expresion2);
		this.operador = '/';
	}

	@Override
	public int operar() {
		return this.expresion1.operar() / this.expresion2.operar();
	}
}
