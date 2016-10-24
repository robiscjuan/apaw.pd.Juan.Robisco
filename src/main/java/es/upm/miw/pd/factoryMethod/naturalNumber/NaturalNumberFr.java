package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {

	private static final String[] textValue = { "zéro", "un", "deux", "trois", "quatre", "cinq" };

	public NaturalNumberFr(int value) {
		super(value);
	}

	@Override
	protected String[] getTextValues() {
		return NaturalNumberFr.textValue;
	}

}
