package metier;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestCalcul {
	private ICreditMetier metier;
	@Before
	public void setUp() throws Exception {
		metier = new CreditMetierImp();
	}

	@Test
	public void testCalculeMensu() {
		double valeurAttendu = 1265.30;
		double resultatObtenu = metier.calculeMensu(200000, 4.5, 240);
		assertEquals(valeurAttendu,resultatObtenu,0.01);
	}

}
