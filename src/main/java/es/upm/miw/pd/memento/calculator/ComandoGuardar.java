package es.upm.miw.pd.memento.calculator;

public class ComandoGuardar extends ActionCommand {

	public ComandoGuardar(CalculadoraMementable calculadoraMementable,
			MementoManager<MementoCalculadora> mementoManager) {
		super(calculadoraMementable, mementoManager);
	}

	@Override
	public String name() {
		return "Guardar";
	}

	@Override
	public void execute() {
		mementoManager.addMemento(io.readString(), calculadoraMementable.createMemento());
	}

}
