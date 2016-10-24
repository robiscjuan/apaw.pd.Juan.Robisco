package es.upm.miw.pd.FactoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumber;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberCreator;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberEnCreator;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberEsCreator;
import es.upm.miw.pd.factoryMethod.naturalNumber.NaturalNumberFrCreator;

public class NaturalNumberTest {
	private NaturalNumber naturalNumber;
	private NaturalNumberCreator naturalNumberCreator;

	@Test
	public void testNaturalNumberEs() {
		this.naturalNumberCreator = new NaturalNumberEsCreator();
		this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(2);
		assertEquals("dos", naturalNumber.getTextValue());
		this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(3);
		assertEquals("tres", naturalNumber.getTextValue());
	}

	@Test
	public void testNaturalNumberEn() {
		this.naturalNumberCreator = new NaturalNumberEnCreator();
		this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(2);
		assertEquals("two", naturalNumber.getTextValue());
		this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(3);
		assertEquals("three", naturalNumber.getTextValue());
	}

	@Test
	public void testNaturalNumberFr() {
		this.naturalNumberCreator = new NaturalNumberFrCreator();
		this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(2);
		assertEquals("deux", naturalNumber.getTextValue());
		this.naturalNumber = this.naturalNumberCreator.createNaturalNumber(3);
		assertEquals("trois", naturalNumber.getTextValue());
	}

}
