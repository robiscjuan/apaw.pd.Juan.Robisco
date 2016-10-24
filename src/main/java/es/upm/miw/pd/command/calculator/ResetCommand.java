package es.upm.miw.pd.command.calculator;

public class ResetCommand extends ActionCommand {

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Resetear";
	}

	@Override
	public void execute() {
		calculator.reset();
	}

}
