package BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.ExpandingWallModel;

public class ExpandingWallModelTest {

	ExpandingWallModel expandingwallmodel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.expandingwallmodel = new ExpandingWallModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String exp_spritename = "expandingwall";
		assertEquals(exp_spritename, expandingwallmodel.getSpriteName());
		
		boolean exp_isDestructible = false;
		assertEquals(exp_isDestructible, expandingwallmodel.isDestructible());
		
		boolean exp_animate = false;
		assertEquals(exp_animate,expandingwallmodel.isAnimate());
		
		boolean exp_canMove = false;
		assertEquals(exp_canMove, expandingwallmodel.isMoving());
		
		boolean exp_impactExplosive = false;
		assertEquals(exp_impactExplosive,expandingwallmodel.isImpactExplosive());
		
		int exp_propriety = 10;
		assertEquals(exp_propriety, expandingwallmodel.getPriority());

		String exp_collideSound = null;
		assertEquals(exp_collideSound, expandingwallmodel.getCollideSound());
		
	}

}
