package es.upm.miw.pd.state.connection;

public class Esperando extends EstadoAbstracto {

	@Override
	public Estado getEstado() {
		return Estado.ESPERANDO;
	}

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(String msg, Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(int respuesta, Conexion conexion) {
		if (respuesta == 0) {
			conexion.setEstado(new Preparado());
		} else {
			conexion.setEstado(new Cerrado());
		}
	}

}
