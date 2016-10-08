package es.upm.miw.pd.visitor.figure;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

	private List<Figure> figures;

	public FiguresManager() {
		figures = new ArrayList<>();
	}

	public void add(Figure figure) {
		figures.add(figure);
	}

	public double totalArea() {
		VisitorArea visitorArea = new VisitorArea();
		for (Figure figure : figures) {
			figure.aceptar(visitorArea);
		}
		return visitorArea.getTotalArea();
	}

	public double totalNumberOfSides() {
		VisitorNumberOfSide visitorNumberOfSide = new VisitorNumberOfSide();
		for (Figure figure : figures) {
			figure.aceptar(visitorNumberOfSide);
		}
		return visitorNumberOfSide.getTotalSides();
	}

}
