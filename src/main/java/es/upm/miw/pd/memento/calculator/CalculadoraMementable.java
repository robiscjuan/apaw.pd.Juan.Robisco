package es.upm.miw.pd.memento.calculator;

import es.upm.miw.pd.command.calculator.Calculator;

public class CalculadoraMementable extends Calculator implements Mementable<MementoCalculadora> {

	@Override
	public MementoCalculadora createMemento() {
		return new MementoCalculadora(this.getTotal());
	}

	@Override
	public void restoreMemento(MementoCalculadora mementoCalculadora) {
		this.setTotal(mementoCalculadora.getValor());
	}

}
