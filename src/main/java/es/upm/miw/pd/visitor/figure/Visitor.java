package es.upm.miw.pd.visitor.figure;

public interface Visitor {

	void visitElementTriangle(Triangle triangle);

	void visitElementSquare(Square square);

	void visitElementCircle(Circle circle);

}
