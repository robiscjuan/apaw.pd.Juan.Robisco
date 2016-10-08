package es.upm.miw.pd.visitor.figure;

public class VisitorArea implements Visitor {

	private double totalArea;

	public double getTotalArea() {
		return this.totalArea;
	}

	public void visitElementTriangle(Triangle triangle) {
		totalArea += triangle.getBase() * triangle.getHeight() * 0.5;
	}

	public void visitElementSquare(Square square) {
		totalArea += square.getSide() * square.getSide();
	}

	public void visitElementCircle(Circle circle) {
		totalArea += Math.PI * circle.getRadius() * circle.getRadius();
	}

}
