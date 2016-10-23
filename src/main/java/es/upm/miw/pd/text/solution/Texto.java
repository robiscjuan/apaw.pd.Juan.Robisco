package es.upm.miw.pd.text.solution;

public class Texto extends Composite {

	@Override
	public void remove(Componente componente) {
		if (componente.isComposite()) {
			componentes.remove(componente);
		}
	}

	@Override
	public void add(Componente componente) {
		if (componente.isComposite()) {
			componentes.add(componente);
		} else {
			throw new UnsupportedOperationException("Operación no soportada");
		}
	}

	@Override
	public String dibujar(boolean mayuscula) {
		return super.dibujar(mayuscula) + "---o---\n";
	}

}
