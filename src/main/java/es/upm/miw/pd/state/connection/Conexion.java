package es.upm.miw.pd.state.connection;

public class Conexion {

	private EstadoAbstracto estado;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.setEstado(new Cerrado());
	}

	public Link getLink() {
		return link;
	}

	public Estado getEstado() {
		return this.estado.getEstado();
	}

	public void setEstado(EstadoAbstracto estado) {
		this.estado = estado;
	}

	public void abrir() {
		estado.abrir(this);
	}

	public void cerrar() {
		estado.cerrar(this);
	}

	public void parar() {
		estado.parar(this);
	}

	public void iniciar() {
		estado.iniciar(this);
	}

	public void enviar(String msg) {
		estado.enviar(msg, this);
	}

	public void recibir(int respuesta) {
		estado.recibir(respuesta, this);
	}

}
