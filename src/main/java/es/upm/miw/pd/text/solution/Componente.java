package es.upm.miw.pd.text.solution;

public abstract class Componente {

	public abstract void remove(Componente componente);

	public abstract void add(Componente componente);

	public abstract boolean isComposite();

	public abstract String dibujar(boolean mayuscula);

}
