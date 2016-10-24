package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class Composite extends Componente {

	protected List<Componente> componentes;

	public Composite() {
		this.componentes = new ArrayList<>();
	}

	@Override
	public String dibujar(boolean mayuscula) {

		String componentesValores = "";

		for (Componente componente : componentes) {
			componentesValores += componente.dibujar(mayuscula);
		}

		return componentesValores;
	}

	@Override
	public boolean isComposite() {
		return true;
	}
}
