package BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.MagicWallModel;

public class MagicWallModelTest {

	MagicWallModel magicwallmodel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.magicwallmodel = new MagicWallModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String exp_spritename = "magicwall";
		assertEquals(exp_spritename, magicwallmodel.getSpriteName());
		
		boolean exp_isDestructible = false;
		assertEquals(exp_isDestructible, magicwallmodel.isDestructible());
		
		boolean exp_animate = false;
		assertEquals(exp_animate,magicwallmodel.isAnimate());
		
		boolean exp_canMove = false;
		assertEquals(exp_canMove, magicwallmodel.isMoving());
		
		boolean exp_impactExplosive = false;
		assertEquals(exp_impactExplosive,magicwallmodel.isImpactExplosive());
		
		int exp_propriety = 3;
		assertEquals(exp_propriety, magicwallmodel.getPriority());

		String exp_collideSound = "touch";
		assertEquals(exp_collideSound, magicwallmodel.getCollideSound());
		
	}

}
