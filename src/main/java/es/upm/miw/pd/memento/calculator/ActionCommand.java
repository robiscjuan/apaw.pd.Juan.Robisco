package es.upm.miw.pd.memento.calculator;

import upm.jbb.IO;

public abstract class ActionCommand implements Comando {

	protected Calculator calculator;

	protected IO io;

	public ActionCommand(Calculator calculator) {
		this.calculator = calculator;
		this.io = IO.getIO();
	}

}
