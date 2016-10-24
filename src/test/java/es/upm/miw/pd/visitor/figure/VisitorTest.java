package es.upm.miw.pd.visitor.figure;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VisitorTest {
	private FiguresManager manager = new FiguresManager();
	private FiguresManager manager2 = new FiguresManager();

	@Before
	public void ini() {
		manager.add(new Square(3));
		manager.add(new Triangle(4, 2));
		manager.add(new Square(2));
		manager.add(new Circle(3));
		manager2.add(new Square(3));
		manager2.add(new Triangle(4, 2));
	}

	@Test
	public void testVisitorArea() {
		assertEquals(45.27, manager.totalArea(), 0.01);
		assertEquals(13, manager2.totalArea(), 0.01);
	}

	@Test
	public void testVisitorNumberOfSides() {
		assertEquals(Double.POSITIVE_INFINITY, manager.totalNumberOfSides(), 0.01);
		assertEquals(7, manager2.totalNumberOfSides(), 0.01);
	}

}
