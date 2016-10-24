package es.upm.miw.pd.memento.calculator;

import java.util.HashMap;
import java.util.Map;

public class MementoManager<T> {

	private Map<String, T> mementos = new HashMap<String, T>();

	public void addMemento(String clave, T memento) {
		this.mementos.put(clave, memento);
	}

	public T getMemento(String clave) {
		return this.mementos.get(clave);
	}

	public String[] claves() {
		return this.mementos.keySet().toArray(new String[0]);
	}

}
