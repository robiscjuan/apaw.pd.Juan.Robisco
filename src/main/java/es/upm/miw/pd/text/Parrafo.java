package es.upm.miw.pd.text;

public class Parrafo extends Composite {

	@Override
	public void remove(Componente componente) {
		if (!componente.isComposite()) {
			componentes.remove(componente);
		}
	}

	@Override
	public void add(Componente componente) {
		if (!componente.isComposite()) {
			componentes.add(componente);
		} else {
			throw new UnsupportedOperationException("Operación no soportada");
		}
	}

	@Override
	public String dibujar(boolean mayuscula) {
		return super.dibujar(mayuscula) + "\n";
	}

}
