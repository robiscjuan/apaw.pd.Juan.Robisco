package es.upm.miw.pd.command.calculator;

public class SubtractCommand extends ActionCommand {

	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Restar";
	}

	@Override
	public void execute() {
		calculator.subtract(io.readInt());
	}

}
