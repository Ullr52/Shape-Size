package model;

/**
 * @author jword - jord CIS175 - Spring - 2022 Jan 22, 2022
 */
public class ShapeBusLogic {

	public double calculateShapeSize(Shape shape) {
		double shapeSize = 0;
		shapeSize = shape.getLengthOne() * shape.getLengthTwo() * shape.getLengthThree();
		return shapeSize;
	}

	public double calculateShapebyEqualSides(Shape shape) {
		double calculateShapebyEqualSides = 0;
		calculateShapebyEqualSides = shape.getLengthOne() * shape.getNumOfSides();
		return calculateShapebyEqualSides;
	}

	public boolean identifyShapeIsRectangle(Shape shape) {

		if (shape.getNumOfSides() == 4) {
			return true;
		} else {
			if (shape.getNumOfSides() != 4) {

			}
		}
		return false;
	}
}
