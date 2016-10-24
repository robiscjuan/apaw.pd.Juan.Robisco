package es.upm.miw.pd.command.calculator;

public class AddCommand extends ActionCommand {

	public AddCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Sumar";
	}

	@Override
	public void execute() {
		calculator.add(io.readInt());
	}

}
