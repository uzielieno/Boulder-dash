package fr.exia.BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.SteelWallModel;

public class SteelWallModelTest {

	SteelWallModel steelwallmodel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.steelwallmodel = new SteelWallModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String exp_spritename = "steelwall";
		assertEquals(exp_spritename, steelwallmodel.getSpriteName());
		
		boolean exp_isDestructible = false;
		assertEquals(exp_isDestructible, steelwallmodel.isDestructible());
		
		boolean exp_animate = false;
		assertEquals(exp_animate, steelwallmodel.isAnimate());
		
		boolean exp_canMove = false;
		assertEquals(exp_canMove, steelwallmodel.isMoving());
		
		boolean exp_impactExplosive = false;
		assertEquals(exp_impactExplosive, steelwallmodel.isImpactExplosive());
		
		int exp_propriety = 3;
		assertEquals(exp_propriety, steelwallmodel.getPriority());

		boolean exp_falling = false;
		assertEquals(exp_falling, steelwallmodel.isImpactExplosive());
		
		
		String exp_collideSound = "touch";
		assertEquals(exp_collideSound, steelwallmodel.getCollideSound());
		
	}

}
