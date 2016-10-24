package es.upm.miw.pd.memento.calculator;

import upm.jbb.IO;

public class ComandoDeshacer extends ActionCommand {

	public ComandoDeshacer(CalculadoraMementable calculadoraMementable,
			MementoManager<MementoCalculadora> mementoManager) {
		super(calculadoraMementable, mementoManager);
	}

	@Override
	public String name() {
		return "Deshacer";
	}

	@Override
	public void execute() {
		calculadoraMementable.restoreMemento(
				mementoManager.getMemento((String) IO.getIO().select(mementoManager.claves(), "Deshacer")));
	}

}
