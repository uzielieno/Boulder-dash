package fr.exia.BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.CursorModel;

public class CursorModelTest {
	
	CursorModel cursormodel;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.cursormodel = new CursorModel();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		String exp_spritename = "cursor";
		assertEquals(exp_spritename, cursormodel.getSpriteName());
		
		
		String exp_collideSound = null;
		assertEquals(exp_collideSound, cursormodel.getCollideSound());
		
		
	}

}
