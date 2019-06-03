package fr.exia.BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.RockfordModel;

public class RockfordModelTest {

	RockfordModel rockfordmodel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.rockfordmodel = new RockfordModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String exp_spritename = "rockford";
		assertEquals(exp_spritename, rockfordmodel.getSpriteName());
		
		boolean exp_isDestructible = true;
		assertEquals(exp_isDestructible, rockfordmodel.isDestructible());
		
		boolean exp_animate = true;
		assertEquals(exp_animate, rockfordmodel.isAnimate());
		
		boolean exp_canMove = true;
		assertEquals(exp_canMove, rockfordmodel.isMoving());
		
		boolean exp_impactExplosive = true;
		assertEquals(exp_impactExplosive, rockfordmodel.isImpactExplosive());
		
		int exp_propriety = 1;
		assertEquals(exp_propriety, rockfordmodel.getPriority());
		
		boolean exp_falling = false;
		assertEquals(exp_falling, rockfordmodel.isImpactExplosive());
		
		
		String exp_collideSound = null;
		assertEquals(exp_collideSound, rockfordmodel.getCollideSound());
		}

}
