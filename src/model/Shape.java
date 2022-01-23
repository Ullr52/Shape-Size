package model;

/**
 * @author jword - jord CIS175 - Spring - 2022 Jan 22, 2022
 */
public class Shape {

	private String shapeName;
	private double lengthOne;
	private double lengthTwo;
	private double lengthThree;
	private int numOfSides;

	/**
	 * 
	 */
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param shapeName
	 * @param lengthOne
	 * @param lengthTwo
	 * @param lengthThree
	 * @param numOfSides
	 */
	public Shape(String shapeName, double lengthOne, double lengthTwo, double lengthThree, int numOfSides) {
		super();
		this.shapeName = shapeName;
		this.lengthOne = lengthOne;
		this.lengthTwo = lengthTwo;
		this.lengthThree = lengthThree;
		this.numOfSides = numOfSides;
	}

	/**
	 * @return the shapeName
	 */
	public String getShapeName() {
		return shapeName;
	}

	/**
	 * @param shapeName the shapeName to set
	 */
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}

	/**
	 * @return the lengthOne
	 */
	public double getLengthOne() {
		return lengthOne;
	}

	/**
	 * @param lengthOne the lengthOne to set
	 */
	public void setLengthOne(double lengthOne) {
		this.lengthOne = lengthOne;
	}

	/**
	 * @return the lengthTwo
	 */
	public double getLengthTwo() {
		return lengthTwo;
	}

	/**
	 * @param lengthTwo the lengthTwo to set
	 */
	public void setLengthTwo(double lengthTwo) {
		this.lengthTwo = lengthTwo;
	}

	/**
	 * @return the lengthThree
	 */
	public double getLengthThree() {
		return lengthThree;
	}

	/**
	 * @param lengthThree the lengthThree to set
	 */
	public void setLengthThree(double lengthThree) {
		this.lengthThree = lengthThree;
	}

	/**
	 * @return the numOfSides
	 */
	public int getNumOfSides() {
		return numOfSides;
	}

	/**
	 * @param numOfSides the numOfSides to set
	 */
	public void setNumOfSides(int numOfSides) {
		this.numOfSides = numOfSides;
	}

}