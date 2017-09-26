package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {
//
//	@Test
//	public void testFactorielle() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testCalculer() {
//		fail("Not yet implemented");
		Factorielle fact = new Factorielle();
		long resultat = fact.calculer(1);
		assertEquals(3, resultat);
	}

}
