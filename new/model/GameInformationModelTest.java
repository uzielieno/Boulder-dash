package BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.GameInformationModel;

public class GameInformationModelTest {

	GameInformationModel gameinformationmodel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.gameinformationmodel = new GameInformationModel(0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int exp_score = 0 ;
		assertEquals(exp_score, gameinformationmodel.getScore());
		
		@SuppressWarnings("unused")
		int exp_remainingsDiamonds = 1 ;
		assertEquals(exp_score, gameinformationmodel.getRemainingsDiamonds());
		
		int exp_timer = 0;
		assertEquals(exp_timer, gameinformationmodel.getTimer());

		
	}

}
