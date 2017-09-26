package co.simplon.factorielle;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FactorielleTest {
	private Factorielle fact; 
	

	@BeforeClass
	public static void setUpcLASS() throws Exception {
		System.out.println("------------------");
		System.out.println("--- Avant Class test =>  FactorielleTest  ---");
		System.out.println();
	}
	@Before
	public void setUp() throws Exception {
		System.out.println();
		System.out.println("--- Avant methode test ---");
		System.out.println();
		
		fact = new Factorielle();
	}
	
	@Ignore
	@Test
	public void testFactorielle() {
		fail("Not yet implemented");
	}


	@Test(expected=IllegalArgumentException.class)
	public void testCalculFaux () {
		fact.calculer(-1);
	}
	
	@Test 
	public void testResultatVaut0 () {
		assertEquals(0, fact.calculer(0));
		System.out.println("valeur 0 vaut 0 => OK");
	}
	
	@Test 
	public void testResultatVaut1 () {
		assertEquals(1, fact.calculer(1));
		System.out.println("valeur 1 vaut 1 => OK");
	}
	@Test 
	public void testResultatVal2A19 () {
		long[] expecteds = new long[]	{2, 6, 24, 120, 720, Long.parseLong("479001600"), Long.parseLong("87178291200"), Long.parseLong("121645100408832000")};
		long[] actuals = new long[]		{fact.calculer(2), fact.calculer(3), fact.calculer(4), fact.calculer(5), fact.calculer(6), fact.calculer(12), fact.calculer(14), fact.calculer(19)};
		assertArrayEquals(expecteds , actuals);
	}
	
	@Test (timeout=1000)
	public void testCalculRapide () {
		int cpt = 0;
		while (cpt <100) {
			fact.calculer(18);
			cpt++;
		}
	}

	@Test (timeout=1000)
	public void testCalculLent () throws InterruptedException {
		Thread.sleep(10000);
	}
	
	@Test 
	public void testIsCalculValide () {
		int val = 1;
		assertTrue(fact.calculer(val) == 1 ? true : false);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println();
		System.out.println("--- Après methode test ---");
		System.out.println();
	}
	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println();
		System.out.println("--- Après Classe test => FactorielleTest ---");
		System.out.println("------------------");
	}

}
