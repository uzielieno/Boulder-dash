package fr.exia.BoulderDash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.exia.BoulderDash.model.EmptyModel;

public class EmptyModelTest {

	EmptyModel emptymodel;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.emptymodel = new EmptyModel();
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String exp_spritename = "black";
		assertEquals(exp_spritename, emptymodel.getSpriteName());
		
		boolean exp_isDestructible = false;
		assertEquals(exp_isDestructible, emptymodel.isDestructible());
		
		boolean exp_animate = false;
		assertEquals(exp_animate, emptymodel.isAnimate());
		
		
		int exp_propriety = 0;
		assertEquals(exp_propriety, emptymodel.getPriority());

		String exp_collideSound = null;
		assertEquals(exp_collideSound, emptymodel.getCollideSound());
		
	}

}
