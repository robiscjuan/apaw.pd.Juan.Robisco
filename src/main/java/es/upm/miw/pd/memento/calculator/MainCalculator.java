package es.upm.miw.pd.memento.calculator;

import es.upm.miw.pd.command.calculator.AddCommand;
import es.upm.miw.pd.command.calculator.CommandManager;
import es.upm.miw.pd.command.calculator.PrintCommand;
import es.upm.miw.pd.command.calculator.ResetCommand;
import es.upm.miw.pd.command.calculator.SubtractCommand;
import upm.jbb.IO;

public class MainCalculator {
	private CommandManager commandManager;
	private CalculadoraMementable calculadoraMementable;
	private MementoManager<MementoCalculadora> mementoManager;

	public MainCalculator() {
		mementoManager = new MementoManager<>();
		calculadoraMementable = new CalculadoraMementable();
		this.commandManager = new CommandManager();
		this.commandManager.add(new AddCommand(calculadoraMementable));
		this.commandManager.add(new SubtractCommand(calculadoraMementable));
		this.commandManager.add(new ResetCommand(calculadoraMementable));
		this.commandManager.add(new PrintCommand(calculadoraMementable));
		this.commandManager.add(new ComandoGuardar(calculadoraMementable, mementoManager));
		this.commandManager.add(new ComandoDeshacer(calculadoraMementable, mementoManager));
	}

	public void execute() {
		String key = (String) IO.getIO().select(this.commandManager.keys());
		this.commandManager.execute(key);
	}

	public static void main(String[] args) {
		IO.getIO().addView(new MainCalculator());
	}
}
