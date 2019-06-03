package BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.DiamondModel;

public class DiamondModelTest {

	DiamondModel diamondmodel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	
		this.diamondmodel = new DiamondModel();
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	
		String exp_spritename = "diamond";
		assertEquals(exp_spritename, diamondmodel.getSpriteName());
		
		boolean exp_isDestructible = true;
		assertEquals(exp_isDestructible, diamondmodel.isDestructible());
		
		boolean exp_animate = true;
		assertEquals(exp_animate, diamondmodel.isAnimate());
		
		
		int exp_propriety = 0;
		assertEquals(exp_propriety, diamondmodel.getPriority());

		String exp_collideSound = "coin";
		assertEquals(exp_collideSound, diamondmodel.getCollideSound());
		
	}

}
