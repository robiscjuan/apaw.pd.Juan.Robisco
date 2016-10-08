package es.upm.miw.pd.visitor.figure;

public class Square implements Figure {

	private double side;

	public Square(double side) {
		this.side = side;
	}

	public double getSide() {
		return this.side;
	}

	@Override
	public void aceptar(Visitor visitor) {
		visitor.visitElementSquare(this);
	}

}
