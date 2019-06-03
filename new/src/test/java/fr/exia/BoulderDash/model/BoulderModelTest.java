package fr.exia.BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.BoulderModel;

public class BoulderModelTest {

	BoulderModel bouldermodel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.bouldermodel = new BoulderModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String exp_spritename = "boulder";
		assertEquals(exp_spritename, bouldermodel.getSpriteName());
		
		boolean exp_canMove = true;
		assertEquals(exp_canMove, bouldermodel.isMoving());
		
		boolean exp_animate = true;
		assertEquals(exp_animate, bouldermodel.isAnimate());
		
		
		int exp_propriety = 2;
		assertEquals(exp_propriety, bouldermodel.getPriority());

		
		String exp_collideSound = "die";
		assertEquals(exp_collideSound, bouldermodel.getCollideSound());
		
	}

}
