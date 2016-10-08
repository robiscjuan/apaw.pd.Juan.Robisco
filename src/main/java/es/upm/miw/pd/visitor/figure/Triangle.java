package es.upm.miw.pd.visitor.figure;

public class Triangle implements Figure {
	private double base;

	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return this.base;
	}

	public double getHeight() {
		return this.height;
	}

	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitElementTriangle(this);
	}

}
