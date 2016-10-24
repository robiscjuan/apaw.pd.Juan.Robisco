package es.upm.miw.pd.text;

public class Caracter extends Componente {
	private char valor;

	public Caracter(char valor) {
		super();
		this.valor = valor;
	}

	@Override
	public void add(Componente componente) {
		//
	}

	@Override
	public void remove(Componente componente) {
		//
	}

	@Override
	public String dibujar(boolean mayuscula) {
		if (mayuscula) {
			return (String.valueOf(this.valor)).toUpperCase();
		} else {
			return (String.valueOf(this.valor));
		}
	}

	@Override
	public boolean isComposite() {
		return false;
	}

}
