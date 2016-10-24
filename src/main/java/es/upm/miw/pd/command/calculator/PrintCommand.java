package es.upm.miw.pd.command.calculator;

public class PrintCommand extends ActionCommand {

	public PrintCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public String name() {
		return "Resultado";
	}

	@Override
	public void execute() {
		io.println(calculator.getTotal());
	}

}
