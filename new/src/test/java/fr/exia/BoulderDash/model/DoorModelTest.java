package fr.exia.BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.DoorModel;

public class DoorModelTest {

	DoorModel doormodel;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.doormodel = new DoorModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
	
		String exp_spritename = "door";
		assertEquals(exp_spritename, doormodel.getSpriteName());
	
		int exp_propriety = 0;
		assertEquals(exp_propriety, doormodel.getPriority());

		String exp_collideSound = null;
		assertEquals(exp_collideSound, doormodel.getCollideSound());
		
	
	}

}
