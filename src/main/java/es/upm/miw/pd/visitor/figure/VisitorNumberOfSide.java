package es.upm.miw.pd.visitor.figure;

public class VisitorNumberOfSide implements Visitor {

	private double totalSides;

	public double getTotalSides() {
		return this.totalSides;
	}

	public void visitElementTriangle(Triangle triangle) {
		totalSides += 3;
	}

	public void visitElementSquare(Square square) {
		totalSides += 4;
	}

	public void visitElementCircle(Circle circle) {
		totalSides += Double.POSITIVE_INFINITY;
	}

}
