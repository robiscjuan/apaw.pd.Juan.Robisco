package es.upm.miw.pd.memento.calculator;

import upm.jbb.IO;
import es.upm.miw.pd.command.calculator.Comando;

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
