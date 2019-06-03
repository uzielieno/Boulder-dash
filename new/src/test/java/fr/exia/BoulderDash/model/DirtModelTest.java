package fr.exia.BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.DirtModel;

public class DirtModelTest {
	
	DirtModel dirtmodel;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.dirtmodel = new DirtModel();
			
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String exp_spritename = "dirt";
		assertEquals(exp_spritename, dirtmodel.getSpriteName());
		
		boolean exp_isDestructible = true;
		assertEquals(exp_isDestructible, dirtmodel.isDestructible());
		
		int exp_propriety = 0;
		assertEquals(exp_propriety, dirtmodel.getPriority());

		String exp_collideSound = null;
		assertEquals(exp_collideSound, dirtmodel.getCollideSound());
		
	
	}

}
