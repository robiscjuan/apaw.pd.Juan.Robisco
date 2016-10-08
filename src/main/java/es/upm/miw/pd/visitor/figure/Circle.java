package es.upm.miw.pd.visitor.figure;

public class Circle implements Figure {

	private double radius;

	public Circle(String description, double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	@Override
	public void aceptar(Visitor visitor) {
		// TODO Auto-generated method stub

	}

}
