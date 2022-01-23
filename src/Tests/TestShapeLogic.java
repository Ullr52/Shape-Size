package Tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Shape;
import model.ShapeBusLogic;

/**
 * @author jword - jord CIS175 - Spring - 2022 Jan 22, 2022
 */
public class TestShapeLogic {

	ShapeBusLogic shapeBL = new ShapeBusLogic();
	Shape shape = new Shape();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateShapeSize() {
		shape.setLengthOne(6);
		shape.setLengthTwo(4);
		shape.setLengthThree(5);
		double size = shapeBL.calculateShapeSize(shape);
		assertEquals(120, size, 0);
	}

	@Test
	public void testCalculateShapebyEqualSides() {
		shape.setLengthOne(4);
		shape.setNumOfSides(4);
		double shapeBySides = shapeBL.calculateShapebyEqualSides(shape);
		assertEquals(16, shapeBySides, 0);
	}

	@Test
	public void testIdentifyShapeIsRectangle() {
		shape.setNumOfSides(4);
		assertTrue(shapeBL.identifyShapeIsRectangle(shape));

	}
	
	@Test
	public void testIdentifyShapeIsNotRectangle() {
		shape.setNumOfSides(6);
		assertFalse(shapeBL.identifyShapeIsRectangle(shape));
	}

}
