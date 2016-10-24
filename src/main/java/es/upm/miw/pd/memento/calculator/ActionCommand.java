package es.upm.miw.pd.memento.calculator;

import es.upm.miw.pd.command.calculator.Comando;
import upm.jbb.IO;

public abstract class ActionCommand implements Comando {

	protected CalculadoraMementable calculadoraMementable;

	protected MementoManager<MementoCalculadora> mementoManager;

	protected IO io;

	public ActionCommand(CalculadoraMementable calculadoraMementable,
			MementoManager<MementoCalculadora> mementoManager) {
		this.calculadoraMementable = calculadoraMementable;
		this.mementoManager = mementoManager;
		this.io = IO.getIO();
	}

}
